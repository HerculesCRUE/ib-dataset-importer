package es.um.asio.importer.dataset.config;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.ResourceAware;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.batch.item.support.AbstractItemStreamItemReader;
import org.springframework.core.io.Resource;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

public class CustomMultiResourceItemReader <T> extends AbstractItemStreamItemReader<T> {

	private static final Log logger = LogFactory.getLog(MultiResourceItemReader.class);

	private static final String RESOURCE_KEY = "resourceIndex";

	private ResourceAwareItemReaderItemStream<? extends T> delegate;

	private Resource[] resources;

	private boolean saveState = true;

	private int currentResource = -1;

	// signals there are no resources to read -> just return null on first read
	private boolean noInput;

	private boolean strict = false;

	/**
	 * In strict mode the reader will throw an exception on
	 * {@link #open(org.springframework.batch.item.ExecutionContext)} if there are no resources to read.
	 * @param strict false by default
	 */
	public void setStrict(boolean strict) {
		this.strict = strict;
	}

	private Comparator<Resource> comparator = new Comparator<Resource>() {

		/**
		 * Compares resource filenames.
		 */
		@Override
		public int compare(Resource r1, Resource r2) {
			return r1.getFilename().compareTo(r2.getFilename());
		}

	};

	public CustomMultiResourceItemReader() {
		this.setExecutionContextName(ClassUtils.getShortName(MultiResourceItemReader.class));
	}

	/**
	 * Reads the next item, jumping to next resource if necessary.
	 */
	@Nullable
	@Override
	public T read() throws Exception, UnexpectedInputException, ParseException {

		
		if (resources.length == 0) {
			if (strict) {
				throw new IllegalStateException(
						"No resources to read. Set strict=false if this is not an error condition.");
			}
			else {
				logger.warn("No resources to read. Set strict=true if this should be an error condition.");
				noInput = true;				
			}
		}
		
		if (noInput) {
			return null;
		}

		// If there is no resource, then this is the first item, set the current
		// resource to 0 and open the first delegate.
		if (currentResource == -1) {
			currentResource = 0;
			delegate.setResource(resources[currentResource]);
			delegate.open(new ExecutionContext());
		}

		return readNextItem();
	}

	/**
	 * Use the delegate to read the next item, jump to next resource if current one is exhausted. Items are appended to
	 * the buffer.
	 * 
	 * @return next item from input
	 */
	private T readNextItem() throws Exception {

		T item = readFromDelegate();

		while (item == null) {

			currentResource++;

			if (currentResource >= resources.length) {
				return null;
			}

			delegate.close();
			delegate.setResource(resources[currentResource]);
			delegate.open(new ExecutionContext());

			item = readFromDelegate();
		}

		return item;
	}

	private T readFromDelegate() throws Exception {
		T item = delegate.read();
		if(item instanceof ResourceAware){
			((ResourceAware) item).setResource(getCurrentResource());
		}
		return item;
	}

	/**
	 * Close the {@link #setDelegate(ResourceAwareItemReaderItemStream)} reader and reset instance variable values.
	 */
	@Override
	public void close() throws ItemStreamException {
		super.close();

		if(!this.noInput) {
			delegate.close();
		}

		noInput = false;
	}

	/**
	 * Figure out which resource to start with in case of restart, open the delegate and restore delegate's position in
	 * the resource.
	 */
	@Override
	public void open(ExecutionContext executionContext) throws ItemStreamException {
		super.open(executionContext);
		Assert.notNull(resources, "Resources must be set");

		noInput = false;
		if (resources.length == 0) {
			if (strict) {
				throw new IllegalStateException(
						"No resources to read. Set strict=false if this is not an error condition.");
			}
			else {
				logger.warn("No resources to read. Set strict=true if this should be an error condition.");
				noInput = true;
				return;
			}
		}

		Arrays.sort(resources, comparator);

		if (executionContext.containsKey(getExecutionContextKey(RESOURCE_KEY))) {
			currentResource = executionContext.getInt(getExecutionContextKey(RESOURCE_KEY));

			// context could have been saved before reading anything
			if (currentResource == -1) {
				currentResource = 0;
			}

			delegate.setResource(resources[currentResource]);
			delegate.open(executionContext);
		}
		else {
			currentResource = -1;
		}
	}

	/**
	 * Store the current resource index and position in the resource.
	 */
	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		super.update(executionContext);
		if (saveState) {
			executionContext.putInt(getExecutionContextKey(RESOURCE_KEY), currentResource);
			delegate.update(executionContext);
		}
	}

	/**
	 * @param delegate reads items from single {@link Resource}.
	 */
	public void setDelegate(ResourceAwareItemReaderItemStream<? extends T> delegate) {
		this.delegate = delegate;
	}

	/**
	 * Set the boolean indicating whether or not state should be saved in the provided {@link ExecutionContext} during
	 * the {@link ItemStream} call to update.
	 * 
	 * @param saveState true to update ExecutionContext. False do not update
	 * ExecutionContext.
	 */
	public void setSaveState(boolean saveState) {
		this.saveState = saveState;
	}

	/**
	 * @param comparator used to order the injected resources, by default compares {@link Resource#getFilename()}
	 * values.
	 */
	public void setComparator(Comparator<Resource> comparator) {
		this.comparator = comparator;
	}

	/**
	 * @param resources input resources
	 */
	public void setResources(Resource[] resources) {
		Assert.notNull(resources, "The resources must not be null");
		this.resources = Arrays.asList(resources).toArray(new Resource[resources.length]);
	}

	/**
	 * Getter for the current resource.
	 * @return the current resource or {@code null} if all resources have been
	 * processed or the first resource has not been assigned yet.
	 */
	@Nullable
	public Resource getCurrentResource() {
		if (currentResource >= resources.length || currentResource < 0) {
			return null;
		}
		return resources[currentResource];
	}

}


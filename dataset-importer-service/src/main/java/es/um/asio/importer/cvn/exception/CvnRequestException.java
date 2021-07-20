package es.um.asio.importer.cvn.exception;

import org.springframework.http.HttpStatus;

/**
 * The Class CvnRequestException.
 */
public class CvnRequestException extends RuntimeException {
    
    /**
     * Instantiates a new cvn request exception.
     */
    public CvnRequestException() {
        super();
    }
    /**
     * Instantiates a new cvn request exception.
     *
     * @param cause the cause
     */
    public CvnRequestException(String uri, Throwable cause) {
        super("Failed cvn request: " + uri, cause);
    }
    
    public CvnRequestException(String uri, HttpStatus status) {
        super("Failed cvn request: " + uri+ " status "+ status.name());
    }
}

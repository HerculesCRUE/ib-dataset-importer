package es.um.asio.importer.cerif.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Publication", namespace = "https://www.openaire.eu/cerif-profile/1.1/")
public class Publication {

	protected String id2;

	protected Date publicationDate;

	protected Long number;

	protected String volume;

	protected String issue;

	protected String edition;

	protected String startPage;

	protected String endPage;

	protected List<Person> authors;

	protected List<Person> editors;

	protected List<Person> publishers;

	/**
	 * @return the publicationDate
	 */
	public Date getPublicationDate() {
		return publicationDate;
	}

	/**
	 * @param publicationDate the publicationDate to set
	 */
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	/**
	 * @return the number
	 */
	public Long getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(Long number) {
		this.number = number;
	}

	/**
	 * @return the volume
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}

	/**
	 * @return the issue
	 */
	public String getIssue() {
		return issue;
	}

	/**
	 * @param issue the issue to set
	 */
	public void setIssue(String issue) {
		this.issue = issue;
	}

	/**
	 * @return the edition
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * @param edition the edition to set
	 */
	public void setEdition(String edition) {
		this.edition = edition;
	}

	/**
	 * @return the startPage
	 */
	public String getStartPage() {
		return startPage;
	}

	/**
	 * @param startPage the startPage to set
	 */
	public void setStartPage(String startPage) {
		this.startPage = startPage;
	}

	/**
	 * @return the endPage
	 */
	public String getEndPage() {
		return endPage;
	}

	/**
	 * @param endPage the endPage to set
	 */
	public void setEndPage(String endPage) {
		this.endPage = endPage;
	}

	/**
	 * @return the authors
	 */
	public List<Person> getAuthors() {
		return authors;
	}

	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(List<Person> authors) {
		this.authors = authors;
	}

	/**
	 * @return the editors
	 */
	public List<Person> getEditors() {
		return editors;
	}

	/**
	 * @param editors the editors to set
	 */
	public void setEditors(List<Person> editors) {
		this.editors = editors;
	}

	/**
	 * @return the publishers
	 */
	public List<Person> getPublishers() {
		return publishers;
	}

	/**
	 * @param publishers the publishers to set
	 */
	public void setPublishers(List<Person> publishers) {
		this.publishers = publishers;
	}

}

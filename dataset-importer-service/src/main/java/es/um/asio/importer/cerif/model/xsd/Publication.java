//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericDateTimeType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericLinkType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericURIClassificationType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonOrOrgUnitType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfMLangStringType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfStringType;
import es.um.asio.importer.cerif.model.xsd.vocabularies.accessrights.Access;
import es.um.asio.importer.cerif.model.xsd.vocabularies.publication.Type;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/1.1/}ResearchOutput__BaseType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{https://www.openaire.eu/cerif-profile/vocab/COAR_Publication_Types}Type"/&gt;
 *         &lt;element name="Language" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Subtitle" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PublishedIn" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Publication"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PartOf" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Publication"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PublicationDate" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericDateTime__Type" minOccurs="0"/&gt;
 *         &lt;element name="Number" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Volume" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Issue" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Edition" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="StartPage" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="EndPage" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;group ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Publication}PublicationIdentifiers__Group"/&gt;
 *         &lt;element name="Authors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Author" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Editors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Editor" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Publishers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Publisher" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="License" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Keyword" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Abstract" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OriginatesFrom" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}ProjectFunding__SubstitutionGroupHead"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PresentedAt" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Event"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OutputFrom" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Event"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Coverage" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Event"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="References" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}ResearchOutput__SubstitutionGroupHead"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://purl.org/coar/access_right}Access" minOccurs="0"/&gt;
 *         &lt;group ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}__TheRestGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "type",
    "language",
    "title",
    "subtitle",
    "publishedIn",
    "partOf",
    "publicationDate",
    "number",
    "volume",
    "issue",
    "edition",
    "startPage",
    "endPage",
    "doi",
    "handle",
    "pmcid",
    "isiNumber",
    "scpNumber",
    "issn",
    "isbn",
    "url",
    "urn",
    "authors",
    "editors",
    "publishers",
    "license",
    "subject",
    "keyword",
    "_abstract",
    "status",
    "originatesFrom",
    "presentedAt",
    "outputFrom",
    "coverage",
    "references",
    "access",
    "classification",
    "link"
})
public class Publication
    extends ResearchOutputBaseType
{

    @XmlElement(name = "Type", namespace = "https://www.openaire.eu/cerif-profile/vocab/COAR_Publication_Types")
    protected Type type;
    @XmlElement(name = "Language")
    protected CfStringType language;
    @XmlElement(name = "Title")
    protected List<CfMLangStringType> title;
    @XmlElement(name = "Subtitle")
    protected List<CfMLangStringType> subtitle;
    @XmlElement(name = "PublishedIn")
    protected Publication.PublishedIn publishedIn;
    @XmlElement(name = "PartOf")
    protected Publication.PartOf partOf;
    @XmlElement(name = "PublicationDate")
    protected CfGenericDateTimeType publicationDate;
    @XmlElement(name = "Number")
    protected CfStringType number;
    @XmlElement(name = "Volume")
    protected CfStringType volume;
    @XmlElement(name = "Issue")
    protected CfStringType issue;
    @XmlElement(name = "Edition")
    protected CfStringType edition;
    @XmlElement(name = "StartPage")
    protected CfStringType startPage;
    @XmlElement(name = "EndPage")
    protected CfStringType endPage;
    @XmlElement(name = "DOI", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Publication")
    protected Publication.DOI doi;
    @XmlElement(name = "Handle", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Publication")
    protected CfStringType handle;
    @XmlElement(name = "PMCID", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Publication")
    protected CfStringType pmcid;
    @XmlElement(name = "ISI-Number", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Publication")
    protected CfStringType isiNumber;
    @XmlElement(name = "SCP-Number", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Publication")
    protected CfStringType scpNumber;
    @XmlElement(name = "ISSN", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Publication")
    protected List<Publication.ISSN> issn;
    @XmlElement(name = "ISBN", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Publication")
    protected List<Publication.ISBN> isbn;
    @XmlElement(name = "URL", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Publication")
    protected CfStringType url;
    @XmlElement(name = "URN", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Publication")
    protected CfStringType urn;
    @XmlElement(name = "Authors")
    protected Publication.Authors authors;
    @XmlElement(name = "Editors")
    protected Publication.Editors editors;
    @XmlElement(name = "Publishers")
    protected Publication.Publishers publishers;
    @XmlElement(name = "License")
    protected List<CfGenericURIClassificationType> license;
    @XmlElement(name = "Subject")
    protected List<CfGenericURIClassificationType> subject;
    @XmlElement(name = "Keyword")
    protected List<CfMLangStringType> keyword;
    @XmlElement(name = "Abstract")
    protected List<CfMLangStringType> _abstract;
    @XmlElement(name = "Status")
    protected List<CfGenericURIClassificationType> status;
    @XmlElement(name = "OriginatesFrom")
    protected List<Publication.OriginatesFrom> originatesFrom;
    @XmlElement(name = "PresentedAt")
    protected List<Publication.PresentedAt> presentedAt;
    @XmlElement(name = "OutputFrom")
    protected List<Publication.OutputFrom> outputFrom;
    @XmlElement(name = "Coverage")
    protected List<Publication.Coverage> coverage;
    @XmlElement(name = "References")
    protected List<Publication.References> references;
    @XmlElement(name = "Access", namespace = "http://purl.org/coar/access_right")
    protected Access access;
    @XmlElement(name = "Classification", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericURIClassificationType> classification;
    @XmlElement(name = "Link", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericLinkType> link;

    /**
     * The type of the publication
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setLanguage(CfStringType value) {
        this.language = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getTitle() {
        if (title == null) {
            title = new ArrayList<CfMLangStringType>();
        }
        return this.title;
    }

    /**
     * Gets the value of the subtitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getSubtitle() {
        if (subtitle == null) {
            subtitle = new ArrayList<CfMLangStringType>();
        }
        return this.subtitle;
    }

    /**
     * Obtiene el valor de la propiedad publishedIn.
     * 
     * @return
     *     possible object is
     *     {@link Publication.PublishedIn }
     *     
     */
    public Publication.PublishedIn getPublishedIn() {
        return publishedIn;
    }

    /**
     * Define el valor de la propiedad publishedIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Publication.PublishedIn }
     *     
     */
    public void setPublishedIn(Publication.PublishedIn value) {
        this.publishedIn = value;
    }

    /**
     * Obtiene el valor de la propiedad partOf.
     * 
     * @return
     *     possible object is
     *     {@link Publication.PartOf }
     *     
     */
    public Publication.PartOf getPartOf() {
        return partOf;
    }

    /**
     * Define el valor de la propiedad partOf.
     * 
     * @param value
     *     allowed object is
     *     {@link Publication.PartOf }
     *     
     */
    public void setPartOf(Publication.PartOf value) {
        this.partOf = value;
    }

    /**
     * Obtiene el valor de la propiedad publicationDate.
     * 
     * @return
     *     possible object is
     *     {@link CfGenericDateTimeType }
     *     
     */
    public CfGenericDateTimeType getPublicationDate() {
        return publicationDate;
    }

    /**
     * Define el valor de la propiedad publicationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link CfGenericDateTimeType }
     *     
     */
    public void setPublicationDate(CfGenericDateTimeType value) {
        this.publicationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setNumber(CfStringType value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad volume.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getVolume() {
        return volume;
    }

    /**
     * Define el valor de la propiedad volume.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setVolume(CfStringType value) {
        this.volume = value;
    }

    /**
     * Obtiene el valor de la propiedad issue.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getIssue() {
        return issue;
    }

    /**
     * Define el valor de la propiedad issue.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setIssue(CfStringType value) {
        this.issue = value;
    }

    /**
     * Obtiene el valor de la propiedad edition.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getEdition() {
        return edition;
    }

    /**
     * Define el valor de la propiedad edition.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setEdition(CfStringType value) {
        this.edition = value;
    }

    /**
     * Obtiene el valor de la propiedad startPage.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getStartPage() {
        return startPage;
    }

    /**
     * Define el valor de la propiedad startPage.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setStartPage(CfStringType value) {
        this.startPage = value;
    }

    /**
     * Obtiene el valor de la propiedad endPage.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getEndPage() {
        return endPage;
    }

    /**
     * Define el valor de la propiedad endPage.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setEndPage(CfStringType value) {
        this.endPage = value;
    }

    /**
     * Obtiene el valor de la propiedad doi.
     * 
     * @return
     *     possible object is
     *     {@link Publication.DOI }
     *     
     */
    public Publication.DOI getDOI() {
        return doi;
    }

    /**
     * Define el valor de la propiedad doi.
     * 
     * @param value
     *     allowed object is
     *     {@link Publication.DOI }
     *     
     */
    public void setDOI(Publication.DOI value) {
        this.doi = value;
    }

    /**
     * Obtiene el valor de la propiedad handle.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getHandle() {
        return handle;
    }

    /**
     * Define el valor de la propiedad handle.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setHandle(CfStringType value) {
        this.handle = value;
    }

    /**
     * Obtiene el valor de la propiedad pmcid.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getPMCID() {
        return pmcid;
    }

    /**
     * Define el valor de la propiedad pmcid.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setPMCID(CfStringType value) {
        this.pmcid = value;
    }

    /**
     * Obtiene el valor de la propiedad isiNumber.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getISINumber() {
        return isiNumber;
    }

    /**
     * Define el valor de la propiedad isiNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setISINumber(CfStringType value) {
        this.isiNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad scpNumber.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getSCPNumber() {
        return scpNumber;
    }

    /**
     * Define el valor de la propiedad scpNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setSCPNumber(CfStringType value) {
        this.scpNumber = value;
    }

    /**
     * Gets the value of the issn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISSN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Publication.ISSN }
     * 
     * 
     */
    public List<Publication.ISSN> getISSN() {
        if (issn == null) {
            issn = new ArrayList<Publication.ISSN>();
        }
        return this.issn;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isbn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISBN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Publication.ISBN }
     * 
     * 
     */
    public List<Publication.ISBN> getISBN() {
        if (isbn == null) {
            isbn = new ArrayList<Publication.ISBN>();
        }
        return this.isbn;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getURL() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setURL(CfStringType value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad urn.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getURN() {
        return urn;
    }

    /**
     * Define el valor de la propiedad urn.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setURN(CfStringType value) {
        this.urn = value;
    }

    /**
     * Obtiene el valor de la propiedad authors.
     * 
     * @return
     *     possible object is
     *     {@link Publication.Authors }
     *     
     */
    public Publication.Authors getAuthors() {
        return authors;
    }

    /**
     * Define el valor de la propiedad authors.
     * 
     * @param value
     *     allowed object is
     *     {@link Publication.Authors }
     *     
     */
    public void setAuthors(Publication.Authors value) {
        this.authors = value;
    }

    /**
     * Obtiene el valor de la propiedad editors.
     * 
     * @return
     *     possible object is
     *     {@link Publication.Editors }
     *     
     */
    public Publication.Editors getEditors() {
        return editors;
    }

    /**
     * Define el valor de la propiedad editors.
     * 
     * @param value
     *     allowed object is
     *     {@link Publication.Editors }
     *     
     */
    public void setEditors(Publication.Editors value) {
        this.editors = value;
    }

    /**
     * Obtiene el valor de la propiedad publishers.
     * 
     * @return
     *     possible object is
     *     {@link Publication.Publishers }
     *     
     */
    public Publication.Publishers getPublishers() {
        return publishers;
    }

    /**
     * Define el valor de la propiedad publishers.
     * 
     * @param value
     *     allowed object is
     *     {@link Publication.Publishers }
     *     
     */
    public void setPublishers(Publication.Publishers value) {
        this.publishers = value;
    }

    /**
     * Gets the value of the license property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the license property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfGenericURIClassificationType }
     * 
     * 
     */
    public List<CfGenericURIClassificationType> getLicense() {
        if (license == null) {
            license = new ArrayList<CfGenericURIClassificationType>();
        }
        return this.license;
    }

    /**
     * Gets the value of the subject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfGenericURIClassificationType }
     * 
     * 
     */
    public List<CfGenericURIClassificationType> getSubject() {
        if (subject == null) {
            subject = new ArrayList<CfGenericURIClassificationType>();
        }
        return this.subject;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<CfMLangStringType>();
        }
        return this.keyword;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getAbstract() {
        if (_abstract == null) {
            _abstract = new ArrayList<CfMLangStringType>();
        }
        return this._abstract;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfGenericURIClassificationType }
     * 
     * 
     */
    public List<CfGenericURIClassificationType> getStatus() {
        if (status == null) {
            status = new ArrayList<CfGenericURIClassificationType>();
        }
        return this.status;
    }

    /**
     * Gets the value of the originatesFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originatesFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginatesFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Publication.OriginatesFrom }
     * 
     * 
     */
    public List<Publication.OriginatesFrom> getOriginatesFrom() {
        if (originatesFrom == null) {
            originatesFrom = new ArrayList<Publication.OriginatesFrom>();
        }
        return this.originatesFrom;
    }

    /**
     * Gets the value of the presentedAt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentedAt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentedAt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Publication.PresentedAt }
     * 
     * 
     */
    public List<Publication.PresentedAt> getPresentedAt() {
        if (presentedAt == null) {
            presentedAt = new ArrayList<Publication.PresentedAt>();
        }
        return this.presentedAt;
    }

    /**
     * Gets the value of the outputFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Publication.OutputFrom }
     * 
     * 
     */
    public List<Publication.OutputFrom> getOutputFrom() {
        if (outputFrom == null) {
            outputFrom = new ArrayList<Publication.OutputFrom>();
        }
        return this.outputFrom;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Publication.Coverage }
     * 
     * 
     */
    public List<Publication.Coverage> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<Publication.Coverage>();
        }
        return this.coverage;
    }

    /**
     * Gets the value of the references property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the references property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Publication.References }
     * 
     * 
     */
    public List<Publication.References> getReferences() {
        if (references == null) {
            references = new ArrayList<Publication.References>();
        }
        return this.references;
    }

    /**
     * The open access type of the publication
     * 								
     * 
     * @return
     *     possible object is
     *     {@link Access }
     *     
     */
    public Access getAccess() {
        return access;
    }

    /**
     * Define el valor de la propiedad access.
     * 
     * @param value
     *     allowed object is
     *     {@link Access }
     *     
     */
    public void setAccess(Access value) {
        this.access = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfGenericURIClassificationType }
     * 
     * 
     */
    public List<CfGenericURIClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<CfGenericURIClassificationType>();
        }
        return this.classification;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfGenericLinkType }
     * 
     * 
     */
    public List<CfGenericLinkType> getLink() {
        if (link == null) {
            link = new ArrayList<CfGenericLinkType>();
        }
        return this.link;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Author" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "author"
    })
    public static class Authors {

        @XmlElement(name = "Author")
        protected List<CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType> author;

        /**
         * Gets the value of the author property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the author property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType> getAuthor() {
            if (author == null) {
                author = new ArrayList<CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType>();
            }
            return this.author;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
     *       &lt;choice&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Event"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "event"
    })
    public static class Coverage
        extends CfLinkBaseType
    {

        @XmlElement(name = "Event")
        protected Event event;

        /**
         * Obtiene el valor de la propiedad event.
         * 
         * @return
         *     possible object is
         *     {@link Event }
         *     
         */
        public Event getEvent() {
            return event;
        }

        /**
         * Define el valor de la propiedad event.
         * 
         * @param value
         *     allowed object is
         *     {@link Event }
         *     
         */
        public void setEvent(Event value) {
            this.event = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;https://www.openaire.eu/cerif-profile/includes/Cerif_Base&gt;DOI__SimpleType"&gt;
     *       &lt;attGroup ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfExtension__AttributeGroup"/&gt;
     *       &lt;anyAttribute namespace='##other'/&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DOI {

        @XmlValue
        protected String value;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * The Digital Object Identifier
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Editor" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "editor"
    })
    public static class Editors {

        @XmlElement(name = "Editor")
        protected List<CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType> editor;

        /**
         * Gets the value of the editor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the editor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEditor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType> getEditor() {
            if (editor == null) {
                editor = new ArrayList<CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType>();
            }
            return this.editor;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;https://www.openaire.eu/cerif-profile/includes/Cerif_Base&gt;ISBN__SimpleType"&gt;
     *       &lt;attGroup ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfExtension__AttributeGroup"/&gt;
     *       &lt;attribute name="medium" type="{http://issn.org/vocabularies/Medium}Enum" /&gt;
     *       &lt;anyAttribute namespace='##other'/&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ISBN {

        @XmlValue
        protected List<String> value;
        @XmlAttribute(name = "medium")
        protected String medium;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * The International Standard Book Numbers Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getValue() {
            if (value == null) {
                value = new ArrayList<String>();
            }
            return this.value;
        }

        /**
         * Obtiene el valor de la propiedad medium.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMedium() {
            return medium;
        }

        /**
         * Define el valor de la propiedad medium.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMedium(String value) {
            this.medium = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;https://www.openaire.eu/cerif-profile/includes/Cerif_Base&gt;ISSN__SimpleType"&gt;
     *       &lt;attGroup ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfExtension__AttributeGroup"/&gt;
     *       &lt;attribute name="medium" type="{http://issn.org/vocabularies/Medium}Enum" /&gt;
     *       &lt;anyAttribute namespace='##other'/&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ISSN {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "medium")
        protected String medium;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtiene el valor de la propiedad medium.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMedium() {
            return medium;
        }

        /**
         * Define el valor de la propiedad medium.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMedium(String value) {
            this.medium = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}ProjectFunding__SubstitutionGroupHead"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "projectFundingSubstitutionGroupHead"
    })
    public static class OriginatesFrom
        extends CfLinkBaseType
    {

        @XmlElementRef(name = "ProjectFunding__SubstitutionGroupHead", namespace = "https://www.openaire.eu/cerif-profile/1.1/", type = JAXBElement.class)
        protected JAXBElement<? extends ProjectFundingBaseType> projectFundingSubstitutionGroupHead;

        /**
         * Obtiene el valor de la propiedad projectFundingSubstitutionGroupHead.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Project }{@code >}
         *     {@link JAXBElement }{@code <}{@link Funding }{@code >}
         *     {@link JAXBElement }{@code <}{@link ProjectFundingBaseType }{@code >}
         *     
         */
        public JAXBElement<? extends ProjectFundingBaseType> getProjectFundingSubstitutionGroupHead() {
            return projectFundingSubstitutionGroupHead;
        }

        /**
         * Define el valor de la propiedad projectFundingSubstitutionGroupHead.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Project }{@code >}
         *     {@link JAXBElement }{@code <}{@link Funding }{@code >}
         *     {@link JAXBElement }{@code <}{@link ProjectFundingBaseType }{@code >}
         *     
         */
        public void setProjectFundingSubstitutionGroupHead(JAXBElement<? extends ProjectFundingBaseType> value) {
            this.projectFundingSubstitutionGroupHead = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
     *       &lt;choice&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Event"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "event"
    })
    public static class OutputFrom
        extends CfLinkBaseType
    {

        @XmlElement(name = "Event")
        protected Event event;

        /**
         * Obtiene el valor de la propiedad event.
         * 
         * @return
         *     possible object is
         *     {@link Event }
         *     
         */
        public Event getEvent() {
            return event;
        }

        /**
         * Define el valor de la propiedad event.
         * 
         * @param value
         *     allowed object is
         *     {@link Event }
         *     
         */
        public void setEvent(Event value) {
            this.event = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Publication"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "publication"
    })
    public static class PartOf
        extends CfLinkWithDisplayNameBaseType
    {

        @XmlElement(name = "Publication", required = true)
        protected Publication publication;

        /**
         * Obtiene el valor de la propiedad publication.
         * 
         * @return
         *     possible object is
         *     {@link Publication }
         *     
         */
        public Publication getPublication() {
            return publication;
        }

        /**
         * Define el valor de la propiedad publication.
         * 
         * @param value
         *     allowed object is
         *     {@link Publication }
         *     
         */
        public void setPublication(Publication value) {
            this.publication = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
     *       &lt;choice&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Event"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "event"
    })
    public static class PresentedAt
        extends CfLinkBaseType
    {

        @XmlElement(name = "Event")
        protected Event event;

        /**
         * Obtiene el valor de la propiedad event.
         * 
         * @return
         *     possible object is
         *     {@link Event }
         *     
         */
        public Event getEvent() {
            return event;
        }

        /**
         * Define el valor de la propiedad event.
         * 
         * @param value
         *     allowed object is
         *     {@link Event }
         *     
         */
        public void setEvent(Event value) {
            this.event = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Publication"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "publication"
    })
    public static class PublishedIn
        extends CfLinkBaseType
    {

        @XmlElement(name = "Publication", required = true)
        protected Publication publication;

        /**
         * Obtiene el valor de la propiedad publication.
         * 
         * @return
         *     possible object is
         *     {@link Publication }
         *     
         */
        public Publication getPublication() {
            return publication;
        }

        /**
         * Define el valor de la propiedad publication.
         * 
         * @param value
         *     allowed object is
         *     {@link Publication }
         *     
         */
        public void setPublication(Publication value) {
            this.publication = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Publisher" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "publisher"
    })
    public static class Publishers {

        @XmlElement(name = "Publisher")
        protected List<CfLinkWithDisplayNameToPersonOrOrgUnitType> publisher;

        /**
         * Gets the value of the publisher property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the publisher property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPublisher().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonOrOrgUnitType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonOrOrgUnitType> getPublisher() {
            if (publisher == null) {
                publisher = new ArrayList<CfLinkWithDisplayNameToPersonOrOrgUnitType>();
            }
            return this.publisher;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
     *       &lt;choice&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}ResearchOutput__SubstitutionGroupHead"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "researchOutputSubstitutionGroupHead"
    })
    public static class References
        extends CfLinkBaseType
    {

        @XmlElementRef(name = "ResearchOutput__SubstitutionGroupHead", namespace = "https://www.openaire.eu/cerif-profile/1.1/", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends ResearchOutputBaseType> researchOutputSubstitutionGroupHead;

        /**
         * Obtiene el valor de la propiedad researchOutputSubstitutionGroupHead.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Product }{@code >}
         *     {@link JAXBElement }{@code <}{@link Publication }{@code >}
         *     {@link JAXBElement }{@code <}{@link Patent }{@code >}
         *     {@link JAXBElement }{@code <}{@link ResearchOutputBaseType }{@code >}
         *     
         */
        public JAXBElement<? extends ResearchOutputBaseType> getResearchOutputSubstitutionGroupHead() {
            return researchOutputSubstitutionGroupHead;
        }

        /**
         * Define el valor de la propiedad researchOutputSubstitutionGroupHead.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Product }{@code >}
         *     {@link JAXBElement }{@code <}{@link Publication }{@code >}
         *     {@link JAXBElement }{@code <}{@link Patent }{@code >}
         *     {@link JAXBElement }{@code <}{@link ResearchOutputBaseType }{@code >}
         *     
         */
        public void setResearchOutputSubstitutionGroupHead(JAXBElement<? extends ResearchOutputBaseType> value) {
            this.researchOutputSubstitutionGroupHead = value;
        }

    }

}

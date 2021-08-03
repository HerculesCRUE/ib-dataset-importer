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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericLinkType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericURIClassificationType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonOrOrgUnitType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfMLangStringType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfStringType;
import es.um.asio.importer.cerif.model.xsd.vocabularies.accessrights.Access;
import es.um.asio.importer.cerif.model.xsd.vocabularies.product.Type;


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
 *         &lt;element ref="{https://www.openaire.eu/cerif-profile/vocab/COAR_Product_Types}Type"/&gt;
 *         &lt;element name="Language" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VersionInfo" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Product}ProductIdentifiers__Group"/&gt;
 *         &lt;element name="Creators" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Creator" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *         &lt;element name="Description" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Keyword" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PartOf" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}ResearchOutput__SubstitutionGroupHead"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
 *         &lt;element name="GeneratedBy" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Equipment"/&gt;
 *                 &lt;/choice&gt;
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
    "name",
    "versionInfo",
    "ark",
    "doi",
    "handle",
    "url",
    "urn",
    "creators",
    "publishers",
    "license",
    "description",
    "subject",
    "keyword",
    "partOf",
    "originatesFrom",
    "generatedBy",
    "presentedAt",
    "coverage",
    "references",
    "access",
    "classification",
    "link"
})
public class Product
    extends ResearchOutputBaseType
{

    @XmlElement(name = "Type", namespace = "https://www.openaire.eu/cerif-profile/vocab/COAR_Product_Types")
    protected Type type;
    @XmlElement(name = "Language")
    protected List<CfStringType> language;
    @XmlElement(name = "Name")
    protected List<CfMLangStringType> name;
    @XmlElement(name = "VersionInfo")
    protected List<CfMLangStringType> versionInfo;
    @XmlElement(name = "ARK", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Product")
    protected CfStringType ark;
    @XmlElement(name = "DOI", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Product")
    protected Product.DOI doi;
    @XmlElement(name = "Handle", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Product")
    protected CfStringType handle;
    @XmlElement(name = "URL", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Product")
    protected CfStringType url;
    @XmlElement(name = "URN", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Product")
    protected CfStringType urn;
    @XmlElement(name = "Creators")
    protected Product.Creators creators;
    @XmlElement(name = "Publishers")
    protected Product.Publishers publishers;
    @XmlElement(name = "License")
    protected List<CfGenericURIClassificationType> license;
    @XmlElement(name = "Description")
    protected List<CfMLangStringType> description;
    @XmlElement(name = "Subject")
    protected List<CfGenericURIClassificationType> subject;
    @XmlElement(name = "Keyword")
    protected List<CfMLangStringType> keyword;
    @XmlElement(name = "PartOf")
    protected Product.PartOf partOf;
    @XmlElement(name = "OriginatesFrom")
    protected List<Product.OriginatesFrom> originatesFrom;
    @XmlElement(name = "GeneratedBy")
    protected List<Product.GeneratedBy> generatedBy;
    @XmlElement(name = "PresentedAt")
    protected List<Product.PresentedAt> presentedAt;
    @XmlElement(name = "Coverage")
    protected List<Product.Coverage> coverage;
    @XmlElement(name = "References")
    protected List<Product.References> references;
    @XmlElement(name = "Access", namespace = "http://purl.org/coar/access_right")
    protected Access access;
    @XmlElement(name = "Classification", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericURIClassificationType> classification;
    @XmlElement(name = "Link", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericLinkType> link;

    /**
     * The type of the resulting product (other than
     * 									publication or patent)
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
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfStringType }
     * 
     * 
     */
    public List<CfStringType> getLanguage() {
        if (language == null) {
            language = new ArrayList<CfStringType>();
        }
        return this.language;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getName() {
        if (name == null) {
            name = new ArrayList<CfMLangStringType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the versionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getVersionInfo() {
        if (versionInfo == null) {
            versionInfo = new ArrayList<CfMLangStringType>();
        }
        return this.versionInfo;
    }

    /**
     * Obtiene el valor de la propiedad ark.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getARK() {
        return ark;
    }

    /**
     * Define el valor de la propiedad ark.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setARK(CfStringType value) {
        this.ark = value;
    }

    /**
     * Obtiene el valor de la propiedad doi.
     * 
     * @return
     *     possible object is
     *     {@link Product.DOI }
     *     
     */
    public Product.DOI getDOI() {
        return doi;
    }

    /**
     * Define el valor de la propiedad doi.
     * 
     * @param value
     *     allowed object is
     *     {@link Product.DOI }
     *     
     */
    public void setDOI(Product.DOI value) {
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
     * Obtiene el valor de la propiedad creators.
     * 
     * @return
     *     possible object is
     *     {@link Product.Creators }
     *     
     */
    public Product.Creators getCreators() {
        return creators;
    }

    /**
     * Define el valor de la propiedad creators.
     * 
     * @param value
     *     allowed object is
     *     {@link Product.Creators }
     *     
     */
    public void setCreators(Product.Creators value) {
        this.creators = value;
    }

    /**
     * Obtiene el valor de la propiedad publishers.
     * 
     * @return
     *     possible object is
     *     {@link Product.Publishers }
     *     
     */
    public Product.Publishers getPublishers() {
        return publishers;
    }

    /**
     * Define el valor de la propiedad publishers.
     * 
     * @param value
     *     allowed object is
     *     {@link Product.Publishers }
     *     
     */
    public void setPublishers(Product.Publishers value) {
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
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getDescription() {
        if (description == null) {
            description = new ArrayList<CfMLangStringType>();
        }
        return this.description;
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
     * Obtiene el valor de la propiedad partOf.
     * 
     * @return
     *     possible object is
     *     {@link Product.PartOf }
     *     
     */
    public Product.PartOf getPartOf() {
        return partOf;
    }

    /**
     * Define el valor de la propiedad partOf.
     * 
     * @param value
     *     allowed object is
     *     {@link Product.PartOf }
     *     
     */
    public void setPartOf(Product.PartOf value) {
        this.partOf = value;
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
     * {@link Product.OriginatesFrom }
     * 
     * 
     */
    public List<Product.OriginatesFrom> getOriginatesFrom() {
        if (originatesFrom == null) {
            originatesFrom = new ArrayList<Product.OriginatesFrom>();
        }
        return this.originatesFrom;
    }

    /**
     * Gets the value of the generatedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generatedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneratedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product.GeneratedBy }
     * 
     * 
     */
    public List<Product.GeneratedBy> getGeneratedBy() {
        if (generatedBy == null) {
            generatedBy = new ArrayList<Product.GeneratedBy>();
        }
        return this.generatedBy;
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
     * {@link Product.PresentedAt }
     * 
     * 
     */
    public List<Product.PresentedAt> getPresentedAt() {
        if (presentedAt == null) {
            presentedAt = new ArrayList<Product.PresentedAt>();
        }
        return this.presentedAt;
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
     * {@link Product.Coverage }
     * 
     * 
     */
    public List<Product.Coverage> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<Product.Coverage>();
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
     * {@link Product.References }
     * 
     * 
     */
    public List<Product.References> getReferences() {
        if (references == null) {
            references = new ArrayList<Product.References>();
        }
        return this.references;
    }

    /**
     * The open access type of the product
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Creator" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "creator"
    })
    public static class Creators {

        @XmlElement(name = "Creator")
        protected List<CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType> creator;

        /**
         * Gets the value of the creator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the creator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCreator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType> getCreator() {
            if (creator == null) {
                creator = new ArrayList<CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType>();
            }
            return this.creator;
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
     *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
     *       &lt;choice&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Equipment"/&gt;
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
        "equipment"
    })
    public static class GeneratedBy
        extends CfLinkBaseType
    {

        @XmlElement(name = "Equipment")
        protected Equipment equipment;

        /**
         * Obtiene el valor de la propiedad equipment.
         * 
         * @return
         *     possible object is
         *     {@link Equipment }
         *     
         */
        public Equipment getEquipment() {
            return equipment;
        }

        /**
         * Define el valor de la propiedad equipment.
         * 
         * @param value
         *     allowed object is
         *     {@link Equipment }
         *     
         */
        public void setEquipment(Equipment value) {
            this.equipment = value;
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
     *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}ResearchOutput__SubstitutionGroupHead"/&gt;
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
        "researchOutputSubstitutionGroupHead"
    })
    public static class PartOf
        extends CfLinkWithDisplayNameBaseType
    {

        @XmlElementRef(name = "ResearchOutput__SubstitutionGroupHead", namespace = "https://www.openaire.eu/cerif-profile/1.1/", type = JAXBElement.class)
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

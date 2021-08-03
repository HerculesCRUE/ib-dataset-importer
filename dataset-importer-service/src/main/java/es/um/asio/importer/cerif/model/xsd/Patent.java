//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfDateType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericLinkType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericURIClassificationType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToOrgUnitType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonOrOrgUnitType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonWithAffiliationsType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfMLangStringType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfStringType;
import es.um.asio.importer.cerif.model.xsd.vocabularies.patent.Type;


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
 *         &lt;element ref="{https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types}Type"/&gt;
 *         &lt;element name="Title" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VersionInfo" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationDate" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfDate__Type" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalDate" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfDate__Type" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Issuer" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PatentNumber" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Inventors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Inventor" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliations__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Holders" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Holder" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Abstract" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Keyword" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *         &lt;element name="Predecessor" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Patent"/&gt;
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
    "title",
    "versionInfo",
    "registrationDate",
    "approvalDate",
    "countryCode",
    "issuer",
    "patentNumber",
    "inventors",
    "holders",
    "_abstract",
    "subject",
    "keyword",
    "originatesFrom",
    "predecessor",
    "references",
    "classification",
    "link"
})
public class Patent
    extends ResearchOutputBaseType
{

    @XmlElement(name = "Type", namespace = "https://www.openaire.eu/cerif-profile/vocab/COAR_Patent_Types")
    protected Type type;
    @XmlElement(name = "Title")
    protected List<CfMLangStringType> title;
    @XmlElement(name = "VersionInfo")
    protected List<CfMLangStringType> versionInfo;
    @XmlElement(name = "RegistrationDate")
    protected CfDateType registrationDate;
    @XmlElement(name = "ApprovalDate")
    protected CfDateType approvalDate;
    @XmlElement(name = "CountryCode")
    protected CfStringType countryCode;
    @XmlElement(name = "Issuer")
    protected List<CfLinkWithDisplayNameToOrgUnitType> issuer;
    @XmlElement(name = "PatentNumber")
    protected CfStringType patentNumber;
    @XmlElement(name = "Inventors")
    protected Patent.Inventors inventors;
    @XmlElement(name = "Holders")
    protected Patent.Holders holders;
    @XmlElement(name = "Abstract")
    protected List<CfMLangStringType> _abstract;
    @XmlElement(name = "Subject")
    protected List<CfGenericURIClassificationType> subject;
    @XmlElement(name = "Keyword")
    protected List<CfMLangStringType> keyword;
    @XmlElement(name = "OriginatesFrom")
    protected List<Patent.OriginatesFrom> originatesFrom;
    @XmlElement(name = "Predecessor")
    protected List<Patent.Predecessor> predecessor;
    @XmlElement(name = "References")
    protected List<Patent.References> references;
    @XmlElement(name = "Classification", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericURIClassificationType> classification;
    @XmlElement(name = "Link", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericLinkType> link;

    /**
     * The type of the patent (currently just one
     * 									option)
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
     * Obtiene el valor de la propiedad registrationDate.
     * 
     * @return
     *     possible object is
     *     {@link CfDateType }
     *     
     */
    public CfDateType getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Define el valor de la propiedad registrationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link CfDateType }
     *     
     */
    public void setRegistrationDate(CfDateType value) {
        this.registrationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad approvalDate.
     * 
     * @return
     *     possible object is
     *     {@link CfDateType }
     *     
     */
    public CfDateType getApprovalDate() {
        return approvalDate;
    }

    /**
     * Define el valor de la propiedad approvalDate.
     * 
     * @param value
     *     allowed object is
     *     {@link CfDateType }
     *     
     */
    public void setApprovalDate(CfDateType value) {
        this.approvalDate = value;
    }

    /**
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setCountryCode(CfStringType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfLinkWithDisplayNameToOrgUnitType }
     * 
     * 
     */
    public List<CfLinkWithDisplayNameToOrgUnitType> getIssuer() {
        if (issuer == null) {
            issuer = new ArrayList<CfLinkWithDisplayNameToOrgUnitType>();
        }
        return this.issuer;
    }

    /**
     * Obtiene el valor de la propiedad patentNumber.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getPatentNumber() {
        return patentNumber;
    }

    /**
     * Define el valor de la propiedad patentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setPatentNumber(CfStringType value) {
        this.patentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad inventors.
     * 
     * @return
     *     possible object is
     *     {@link Patent.Inventors }
     *     
     */
    public Patent.Inventors getInventors() {
        return inventors;
    }

    /**
     * Define el valor de la propiedad inventors.
     * 
     * @param value
     *     allowed object is
     *     {@link Patent.Inventors }
     *     
     */
    public void setInventors(Patent.Inventors value) {
        this.inventors = value;
    }

    /**
     * Obtiene el valor de la propiedad holders.
     * 
     * @return
     *     possible object is
     *     {@link Patent.Holders }
     *     
     */
    public Patent.Holders getHolders() {
        return holders;
    }

    /**
     * Define el valor de la propiedad holders.
     * 
     * @param value
     *     allowed object is
     *     {@link Patent.Holders }
     *     
     */
    public void setHolders(Patent.Holders value) {
        this.holders = value;
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
     * {@link Patent.OriginatesFrom }
     * 
     * 
     */
    public List<Patent.OriginatesFrom> getOriginatesFrom() {
        if (originatesFrom == null) {
            originatesFrom = new ArrayList<Patent.OriginatesFrom>();
        }
        return this.originatesFrom;
    }

    /**
     * Gets the value of the predecessor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predecessor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredecessor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Patent.Predecessor }
     * 
     * 
     */
    public List<Patent.Predecessor> getPredecessor() {
        if (predecessor == null) {
            predecessor = new ArrayList<Patent.Predecessor>();
        }
        return this.predecessor;
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
     * {@link Patent.References }
     * 
     * 
     */
    public List<Patent.References> getReferences() {
        if (references == null) {
            references = new ArrayList<Patent.References>();
        }
        return this.references;
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
     *         &lt;element name="Holder" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "holder"
    })
    public static class Holders {

        @XmlElement(name = "Holder")
        protected List<CfLinkWithDisplayNameToPersonOrOrgUnitType> holder;

        /**
         * Gets the value of the holder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the holder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHolder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonOrOrgUnitType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonOrOrgUnitType> getHolder() {
            if (holder == null) {
                holder = new ArrayList<CfLinkWithDisplayNameToPersonOrOrgUnitType>();
            }
            return this.holder;
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
     *         &lt;element name="Inventor" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliations__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "inventor"
    })
    public static class Inventors {

        @XmlElement(name = "Inventor")
        protected List<CfLinkWithDisplayNameToPersonWithAffiliationsType> inventor;

        /**
         * Gets the value of the inventor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inventor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInventor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonWithAffiliationsType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonWithAffiliationsType> getInventor() {
            if (inventor == null) {
                inventor = new ArrayList<CfLinkWithDisplayNameToPersonWithAffiliationsType>();
            }
            return this.inventor;
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
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Patent"/&gt;
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
        "patent"
    })
    public static class Predecessor
        extends CfLinkBaseType
    {

        @XmlElement(name = "Patent")
        protected Patent patent;

        /**
         * Obtiene el valor de la propiedad patent.
         * 
         * @return
         *     possible object is
         *     {@link Patent }
         *     
         */
        public Patent getPatent() {
            return patent;
        }

        /**
         * Define el valor de la propiedad patent.
         * 
         * @param value
         *     allowed object is
         *     {@link Patent }
         *     
         */
        public void setPatent(Patent value) {
            this.patent = value;
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

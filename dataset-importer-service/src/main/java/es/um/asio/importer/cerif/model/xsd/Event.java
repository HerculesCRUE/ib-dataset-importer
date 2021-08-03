//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfDateType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericLinkType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericURIClassificationType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfIdAttrBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfMLangStringType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfStringType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfIdAttr__BaseType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Type" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Acronym" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Place" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfDate__Type" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfDate__Type" minOccurs="0"/&gt;
 *         &lt;element name="Abstract" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Keyword" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Organizer" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}OrgUnit"/&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Project"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sponsor" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}OrgUnit"/&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Project"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Partner" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}OrgUnit"/&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Project"/&gt;
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
    "acronym",
    "name",
    "place",
    "country",
    "startDate",
    "endDate",
    "_abstract",
    "description",
    "subject",
    "keyword",
    "organizer",
    "sponsor",
    "partner",
    "classification",
    "link"
})
public class Event
    extends CfIdAttrBaseType
{

    @XmlElement(name = "Type")
    protected List<CfGenericURIClassificationType> type;
    @XmlElement(name = "Acronym")
    protected CfStringType acronym;
    @XmlElement(name = "Name")
    protected List<CfMLangStringType> name;
    @XmlElement(name = "Place")
    protected CfStringType place;
    @XmlElement(name = "Country")
    protected CfStringType country;
    @XmlElement(name = "StartDate")
    protected CfDateType startDate;
    @XmlElement(name = "EndDate")
    protected CfDateType endDate;
    @XmlElement(name = "Abstract")
    protected List<CfMLangStringType> _abstract;
    @XmlElement(name = "Description")
    protected List<CfMLangStringType> description;
    @XmlElement(name = "Subject")
    protected List<CfGenericURIClassificationType> subject;
    @XmlElement(name = "Keyword")
    protected List<CfMLangStringType> keyword;
    @XmlElement(name = "Organizer")
    protected List<Event.Organizer> organizer;
    @XmlElement(name = "Sponsor")
    protected List<Event.Sponsor> sponsor;
    @XmlElement(name = "Partner")
    protected List<Event.Partner> partner;
    @XmlElement(name = "Classification", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericURIClassificationType> classification;
    @XmlElement(name = "Link", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericLinkType> link;

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfGenericURIClassificationType }
     * 
     * 
     */
    public List<CfGenericURIClassificationType> getType() {
        if (type == null) {
            type = new ArrayList<CfGenericURIClassificationType>();
        }
        return this.type;
    }

    /**
     * Obtiene el valor de la propiedad acronym.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getAcronym() {
        return acronym;
    }

    /**
     * Define el valor de la propiedad acronym.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setAcronym(CfStringType value) {
        this.acronym = value;
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
     * Obtiene el valor de la propiedad place.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getPlace() {
        return place;
    }

    /**
     * Define el valor de la propiedad place.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setPlace(CfStringType value) {
        this.place = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setCountry(CfStringType value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link CfDateType }
     *     
     */
    public CfDateType getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link CfDateType }
     *     
     */
    public void setStartDate(CfDateType value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link CfDateType }
     *     
     */
    public CfDateType getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link CfDateType }
     *     
     */
    public void setEndDate(CfDateType value) {
        this.endDate = value;
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
     * Gets the value of the organizer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event.Organizer }
     * 
     * 
     */
    public List<Event.Organizer> getOrganizer() {
        if (organizer == null) {
            organizer = new ArrayList<Event.Organizer>();
        }
        return this.organizer;
    }

    /**
     * Gets the value of the sponsor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sponsor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSponsor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event.Sponsor }
     * 
     * 
     */
    public List<Event.Sponsor> getSponsor() {
        if (sponsor == null) {
            sponsor = new ArrayList<Event.Sponsor>();
        }
        return this.sponsor;
    }

    /**
     * Gets the value of the partner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event.Partner }
     * 
     * 
     */
    public List<Event.Partner> getPartner() {
        if (partner == null) {
            partner = new ArrayList<Event.Partner>();
        }
        return this.partner;
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
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}OrgUnit"/&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Project"/&gt;
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
        "orgUnit",
        "project"
    })
    public static class Organizer
        extends CfLinkBaseType
    {

        @XmlElement(name = "OrgUnit")
        protected OrgUnit orgUnit;
        @XmlElement(name = "Project")
        protected Project project;

        /**
         * Obtiene el valor de la propiedad orgUnit.
         * 
         * @return
         *     possible object is
         *     {@link OrgUnit }
         *     
         */
        public OrgUnit getOrgUnit() {
            return orgUnit;
        }

        /**
         * Define el valor de la propiedad orgUnit.
         * 
         * @param value
         *     allowed object is
         *     {@link OrgUnit }
         *     
         */
        public void setOrgUnit(OrgUnit value) {
            this.orgUnit = value;
        }

        /**
         * Obtiene el valor de la propiedad project.
         * 
         * @return
         *     possible object is
         *     {@link Project }
         *     
         */
        public Project getProject() {
            return project;
        }

        /**
         * Define el valor de la propiedad project.
         * 
         * @param value
         *     allowed object is
         *     {@link Project }
         *     
         */
        public void setProject(Project value) {
            this.project = value;
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
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}OrgUnit"/&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Project"/&gt;
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
        "orgUnit",
        "project"
    })
    public static class Partner
        extends CfLinkBaseType
    {

        @XmlElement(name = "OrgUnit")
        protected OrgUnit orgUnit;
        @XmlElement(name = "Project")
        protected Project project;

        /**
         * Obtiene el valor de la propiedad orgUnit.
         * 
         * @return
         *     possible object is
         *     {@link OrgUnit }
         *     
         */
        public OrgUnit getOrgUnit() {
            return orgUnit;
        }

        /**
         * Define el valor de la propiedad orgUnit.
         * 
         * @param value
         *     allowed object is
         *     {@link OrgUnit }
         *     
         */
        public void setOrgUnit(OrgUnit value) {
            this.orgUnit = value;
        }

        /**
         * Obtiene el valor de la propiedad project.
         * 
         * @return
         *     possible object is
         *     {@link Project }
         *     
         */
        public Project getProject() {
            return project;
        }

        /**
         * Define el valor de la propiedad project.
         * 
         * @param value
         *     allowed object is
         *     {@link Project }
         *     
         */
        public void setProject(Project value) {
            this.project = value;
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
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}OrgUnit"/&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Project"/&gt;
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
        "orgUnit",
        "project"
    })
    public static class Sponsor
        extends CfLinkBaseType
    {

        @XmlElement(name = "OrgUnit")
        protected OrgUnit orgUnit;
        @XmlElement(name = "Project")
        protected Project project;

        /**
         * Obtiene el valor de la propiedad orgUnit.
         * 
         * @return
         *     possible object is
         *     {@link OrgUnit }
         *     
         */
        public OrgUnit getOrgUnit() {
            return orgUnit;
        }

        /**
         * Define el valor de la propiedad orgUnit.
         * 
         * @param value
         *     allowed object is
         *     {@link OrgUnit }
         *     
         */
        public void setOrgUnit(OrgUnit value) {
            this.orgUnit = value;
        }

        /**
         * Obtiene el valor de la propiedad project.
         * 
         * @return
         *     possible object is
         *     {@link Project }
         *     
         */
        public Project getProject() {
            return project;
        }

        /**
         * Define el valor de la propiedad project.
         * 
         * @param value
         *     allowed object is
         *     {@link Project }
         *     
         */
        public void setProject(Project value) {
            this.project = value;
        }

    }

}

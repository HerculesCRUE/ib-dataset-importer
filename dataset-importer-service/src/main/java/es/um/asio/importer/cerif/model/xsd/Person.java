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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfDateType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericLinkType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericURIClassificationType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfIdAttrBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfStringType;
import es.um.asio.importer.cerif.model.xsd.include.commons.PersonBaseType;
import es.um.asio.importer.cerif.model.xsd.include.person.DAIType;
import es.um.asio.importer.cerif.model.xsd.include.person.ISNIType;
import es.um.asio.importer.cerif.model.xsd.include.person.ORCIDType;
import es.um.asio.importer.cerif.model.xsd.include.person.ResearcherIDType;
import es.um.asio.importer.cerif.model.xsd.include.person.ScopusAuthorIDType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}Person__BaseType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="PersonName" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfIdAttr__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FamilyNames" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *                   &lt;element name="FirstNames" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *                   &lt;element name="OtherNames" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *                   &lt;group ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}__TheRestGroup"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;anyAttribute namespace='##other'/&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Gender" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="m"/&gt;
 *               &lt;enumeration value="f"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Birthday" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfDate__Type" minOccurs="0"/&gt;
 *         &lt;element name="Degree" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Position" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Domain" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="License" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Persons}PersonIdentifiers__Group"/&gt;
 *         &lt;element name="ElectronicAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Affiliation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}OrgUnit"/&gt;
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
    "personName",
    "gender",
    "birthday",
    "degree",
    "position",
    "domain",
    "license",
    "identifier",
    "orcid",
    "alternativeORCID",
    "researcherID",
    "alternativeResearcherID",
    "scopusAuthorID",
    "alternativeScopusAuthorID",
    "isni",
    "alternativeISNI",
    "dai",
    "alternativeDAI",
    "electronicAddress",
    "affiliation",
    "classification",
    "link"
})
public class Person
    extends PersonBaseType
{

    @XmlElement(name = "PersonName")
    protected Person.PersonName personName;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "Birthday")
    protected CfDateType birthday;
    @XmlElement(name = "Degree")
    protected CfStringType degree;
    @XmlElement(name = "Position")
    protected CfStringType position;
    @XmlElement(name = "Domain")
    protected CfStringType domain;
    @XmlElement(name = "License")
    protected List<CfStringType> license;
    @XmlElement(name = "Identifier")
    protected List<CfStringType> identifier;
    @XmlElement(name = "ORCID", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Persons")
    protected ORCIDType orcid;
    @XmlElement(name = "AlternativeORCID", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Persons")
    protected List<ORCIDType> alternativeORCID;
    @XmlElement(name = "ResearcherID", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Persons")
    protected ResearcherIDType researcherID;
    @XmlElement(name = "AlternativeResearcherID", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Persons")
    protected List<ResearcherIDType> alternativeResearcherID;
    @XmlElement(name = "ScopusAuthorID", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Persons")
    protected ScopusAuthorIDType scopusAuthorID;
    @XmlElement(name = "AlternativeScopusAuthorID", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Persons")
    protected List<ScopusAuthorIDType> alternativeScopusAuthorID;
    @XmlElement(name = "ISNI", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Persons")
    protected ISNIType isni;
    @XmlElement(name = "AlternativeISNI", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Persons")
    protected List<ISNIType> alternativeISNI;
    @XmlElement(name = "DAI", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Persons")
    protected DAIType dai;
    @XmlElement(name = "AlternativeDAI", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Persons")
    protected List<DAIType> alternativeDAI;
    @XmlElement(name = "ElectronicAddress")
    @XmlSchemaType(name = "anyURI")
    protected List<String> electronicAddress;
    @XmlElement(name = "Affiliation")
    protected List<Person.Affiliation> affiliation;
    @XmlElement(name = "Classification", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericURIClassificationType> classification;
    @XmlElement(name = "Link", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericLinkType> link;

    /**
     * Obtiene el valor de la propiedad personName.
     * 
     * @return
     *     possible object is
     *     {@link Person.PersonName }
     *     
     */
    public Person.PersonName getPersonName() {
        return personName;
    }

    /**
     * Define el valor de la propiedad personName.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.PersonName }
     *     
     */
    public void setPersonName(Person.PersonName value) {
        this.personName = value;
    }

    /**
     * Obtiene el valor de la propiedad gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define el valor de la propiedad gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Obtiene el valor de la propiedad birthday.
     * 
     * @return
     *     possible object is
     *     {@link CfDateType }
     *     
     */
    public CfDateType getBirthday() {
        return birthday;
    }

    /**
     * Define el valor de la propiedad birthday.
     * 
     * @param value
     *     allowed object is
     *     {@link CfDateType }
     *     
     */
    public void setBirthday(CfDateType value) {
        this.birthday = value;
    }

    /**
     * Obtiene el valor de la propiedad degree.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getDegree() {
        return degree;
    }

    /**
     * Define el valor de la propiedad degree.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setDegree(CfStringType value) {
        this.degree = value;
    }

    /**
     * Obtiene el valor de la propiedad position.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getPosition() {
        return position;
    }

    /**
     * Define el valor de la propiedad position.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setPosition(CfStringType value) {
        this.position = value;
    }

    /**
     * Obtiene el valor de la propiedad domain.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getDomain() {
        return domain;
    }

    /**
     * Define el valor de la propiedad domain.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setDomain(CfStringType value) {
        this.domain = value;
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
     * {@link CfStringType }
     * 
     * 
     */
    public List<CfStringType> getLicense() {
        if (license == null) {
            license = new ArrayList<CfStringType>();
        }
        return this.license;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfStringType }
     * 
     * 
     */
    public List<CfStringType> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<CfStringType>();
        }
        return this.identifier;
    }

    /**
     * Obtiene el valor de la propiedad orcid.
     * 
     * @return
     *     possible object is
     *     {@link ORCIDType }
     *     
     */
    public ORCIDType getORCID() {
        return orcid;
    }

    /**
     * Define el valor de la propiedad orcid.
     * 
     * @param value
     *     allowed object is
     *     {@link ORCIDType }
     *     
     */
    public void setORCID(ORCIDType value) {
        this.orcid = value;
    }

    /**
     * Gets the value of the alternativeORCID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeORCID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeORCID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORCIDType }
     * 
     * 
     */
    public List<ORCIDType> getAlternativeORCID() {
        if (alternativeORCID == null) {
            alternativeORCID = new ArrayList<ORCIDType>();
        }
        return this.alternativeORCID;
    }

    /**
     * Obtiene el valor de la propiedad researcherID.
     * 
     * @return
     *     possible object is
     *     {@link ResearcherIDType }
     *     
     */
    public ResearcherIDType getResearcherID() {
        return researcherID;
    }

    /**
     * Define el valor de la propiedad researcherID.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearcherIDType }
     *     
     */
    public void setResearcherID(ResearcherIDType value) {
        this.researcherID = value;
    }

    /**
     * Gets the value of the alternativeResearcherID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeResearcherID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeResearcherID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResearcherIDType }
     * 
     * 
     */
    public List<ResearcherIDType> getAlternativeResearcherID() {
        if (alternativeResearcherID == null) {
            alternativeResearcherID = new ArrayList<ResearcherIDType>();
        }
        return this.alternativeResearcherID;
    }

    /**
     * Obtiene el valor de la propiedad scopusAuthorID.
     * 
     * @return
     *     possible object is
     *     {@link ScopusAuthorIDType }
     *     
     */
    public ScopusAuthorIDType getScopusAuthorID() {
        return scopusAuthorID;
    }

    /**
     * Define el valor de la propiedad scopusAuthorID.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopusAuthorIDType }
     *     
     */
    public void setScopusAuthorID(ScopusAuthorIDType value) {
        this.scopusAuthorID = value;
    }

    /**
     * Gets the value of the alternativeScopusAuthorID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeScopusAuthorID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeScopusAuthorID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScopusAuthorIDType }
     * 
     * 
     */
    public List<ScopusAuthorIDType> getAlternativeScopusAuthorID() {
        if (alternativeScopusAuthorID == null) {
            alternativeScopusAuthorID = new ArrayList<ScopusAuthorIDType>();
        }
        return this.alternativeScopusAuthorID;
    }

    /**
     * Obtiene el valor de la propiedad isni.
     * 
     * @return
     *     possible object is
     *     {@link ISNIType }
     *     
     */
    public ISNIType getISNI() {
        return isni;
    }

    /**
     * Define el valor de la propiedad isni.
     * 
     * @param value
     *     allowed object is
     *     {@link ISNIType }
     *     
     */
    public void setISNI(ISNIType value) {
        this.isni = value;
    }

    /**
     * Gets the value of the alternativeISNI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeISNI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeISNI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ISNIType }
     * 
     * 
     */
    public List<ISNIType> getAlternativeISNI() {
        if (alternativeISNI == null) {
            alternativeISNI = new ArrayList<ISNIType>();
        }
        return this.alternativeISNI;
    }

    /**
     * Obtiene el valor de la propiedad dai.
     * 
     * @return
     *     possible object is
     *     {@link DAIType }
     *     
     */
    public DAIType getDAI() {
        return dai;
    }

    /**
     * Define el valor de la propiedad dai.
     * 
     * @param value
     *     allowed object is
     *     {@link DAIType }
     *     
     */
    public void setDAI(DAIType value) {
        this.dai = value;
    }

    /**
     * Gets the value of the alternativeDAI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeDAI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeDAI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAIType }
     * 
     * 
     */
    public List<DAIType> getAlternativeDAI() {
        if (alternativeDAI == null) {
            alternativeDAI = new ArrayList<DAIType>();
        }
        return this.alternativeDAI;
    }

    /**
     * Gets the value of the electronicAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElectronicAddress() {
        if (electronicAddress == null) {
            electronicAddress = new ArrayList<String>();
        }
        return this.electronicAddress;
    }

    /**
     * Gets the value of the affiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person.Affiliation }
     * 
     * 
     */
    public List<Person.Affiliation> getAffiliation() {
        if (affiliation == null) {
            affiliation = new ArrayList<Person.Affiliation>();
        }
        return this.affiliation;
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
        "orgUnit"
    })
    public static class Affiliation
        extends CfLinkBaseType
    {

        @XmlElement(name = "OrgUnit")
        protected OrgUnit orgUnit;

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

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfIdAttr__BaseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="FamilyNames" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
     *         &lt;element name="FirstNames" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
     *         &lt;element name="OtherNames" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
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
        "familyNames",
        "firstNames",
        "otherNames",
        "classification",
        "link"
    })
    public static class PersonName
        extends CfIdAttrBaseType
    {

        @XmlElement(name = "FamilyNames")
        protected CfStringType familyNames;
        @XmlElement(name = "FirstNames")
        protected CfStringType firstNames;
        @XmlElement(name = "OtherNames")
        protected CfStringType otherNames;
        @XmlElement(name = "Classification", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
        protected List<CfGenericURIClassificationType> classification;
        @XmlElement(name = "Link", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
        protected List<CfGenericLinkType> link;

        /**
         * Obtiene el valor de la propiedad familyNames.
         * 
         * @return
         *     possible object is
         *     {@link CfStringType }
         *     
         */
        public CfStringType getFamilyNames() {
            return familyNames;
        }

        /**
         * Define el valor de la propiedad familyNames.
         * 
         * @param value
         *     allowed object is
         *     {@link CfStringType }
         *     
         */
        public void setFamilyNames(CfStringType value) {
            this.familyNames = value;
        }

        /**
         * Obtiene el valor de la propiedad firstNames.
         * 
         * @return
         *     possible object is
         *     {@link CfStringType }
         *     
         */
        public CfStringType getFirstNames() {
            return firstNames;
        }

        /**
         * Define el valor de la propiedad firstNames.
         * 
         * @param value
         *     allowed object is
         *     {@link CfStringType }
         *     
         */
        public void setFirstNames(CfStringType value) {
            this.firstNames = value;
        }

        /**
         * Obtiene el valor de la propiedad otherNames.
         * 
         * @return
         *     possible object is
         *     {@link CfStringType }
         *     
         */
        public CfStringType getOtherNames() {
            return otherNames;
        }

        /**
         * Define el valor de la propiedad otherNames.
         * 
         * @param value
         *     allowed object is
         *     {@link CfStringType }
         *     
         */
        public void setOtherNames(CfStringType value) {
            this.otherNames = value;
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

    }

}

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
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericIdentifierType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericLinkType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericURIClassificationType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfMLangStringType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfStringType;
import es.um.asio.importer.cerif.model.xsd.include.commons.OrgUnitBaseType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}OrgUnit__BaseType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Type" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Acronym" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EnglishName" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="License" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Domain" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Leader" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Person"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Identifier" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericIdentifier__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ElectronicAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PartOf" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}OrgUnit"/&gt;
 *                 &lt;/sequence&gt;
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
    "englishName",
    "province",
    "license",
    "domain",
    "address",
    "phone",
    "leader",
    "identifier",
    "electronicAddress",
    "partOf",
    "classification",
    "link"
})
public class OrgUnit
    extends OrgUnitBaseType
{

    @XmlElement(name = "Type")
    protected List<CfGenericURIClassificationType> type;
    @XmlElement(name = "Acronym")
    protected CfStringType acronym;
    @XmlElement(name = "Name")
    protected List<CfMLangStringType> name;
    @XmlElement(name = "EnglishName")
    protected CfMLangStringType englishName;
    @XmlElement(name = "Province")
    protected CfMLangStringType province;
    @XmlElement(name = "License")
    protected List<CfMLangStringType> license;
    @XmlElement(name = "Domain")
    protected CfMLangStringType domain;
    @XmlElement(name = "Address")
    protected CfMLangStringType address;
    @XmlElement(name = "Phone")
    protected List<CfMLangStringType> phone;
    @XmlElement(name = "Leader")
    protected List<OrgUnit.Leader> leader;
    @XmlElement(name = "Identifier")
    protected List<CfGenericIdentifierType> identifier;
    @XmlElement(name = "ElectronicAddress")
    @XmlSchemaType(name = "anyURI")
    protected List<String> electronicAddress;
    @XmlElement(name = "PartOf")
    protected List<OrgUnit.PartOf> partOf;
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
     * Obtiene el valor de la propiedad englishName.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getEnglishName() {
        return englishName;
    }

    /**
     * Define el valor de la propiedad englishName.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setEnglishName(CfMLangStringType value) {
        this.englishName = value;
    }

    /**
     * Obtiene el valor de la propiedad province.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getProvince() {
        return province;
    }

    /**
     * Define el valor de la propiedad province.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setProvince(CfMLangStringType value) {
        this.province = value;
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
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getLicense() {
        if (license == null) {
            license = new ArrayList<CfMLangStringType>();
        }
        return this.license;
    }

    /**
     * Obtiene el valor de la propiedad domain.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getDomain() {
        return domain;
    }

    /**
     * Define el valor de la propiedad domain.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setDomain(CfMLangStringType value) {
        this.domain = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setAddress(CfMLangStringType value) {
        this.address = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getPhone() {
        if (phone == null) {
            phone = new ArrayList<CfMLangStringType>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the leader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgUnit.Leader }
     * 
     * 
     */
    public List<OrgUnit.Leader> getLeader() {
        if (leader == null) {
            leader = new ArrayList<OrgUnit.Leader>();
        }
        return this.leader;
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
     * {@link CfGenericIdentifierType }
     * 
     * 
     */
    public List<CfGenericIdentifierType> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<CfGenericIdentifierType>();
        }
        return this.identifier;
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
     * Gets the value of the partOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgUnit.PartOf }
     * 
     * 
     */
    public List<OrgUnit.PartOf> getPartOf() {
        if (partOf == null) {
            partOf = new ArrayList<OrgUnit.PartOf>();
        }
        return this.partOf;
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
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Person"/&gt;
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
        "person"
    })
    public static class Leader
        extends CfLinkBaseType
    {

        @XmlElement(name = "Person")
        protected Person person;

        /**
         * Obtiene el valor de la propiedad person.
         * 
         * @return
         *     possible object is
         *     {@link Person }
         *     
         */
        public Person getPerson() {
            return person;
        }

        /**
         * Define el valor de la propiedad person.
         * 
         * @param value
         *     allowed object is
         *     {@link Person }
         *     
         */
        public void setPerson(Person value) {
            this.person = value;
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
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}OrgUnit"/&gt;
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
        "orgUnit"
    })
    public static class PartOf
        extends CfLinkWithDisplayNameBaseType
    {

        @XmlElement(name = "OrgUnit", required = true)
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

}

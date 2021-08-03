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
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericIdentifierType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericLinkType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericURIClassificationType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonOrOrgUnitType;
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
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/1.1/}Infrastructure__BaseType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Type" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Acronym" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Domain" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Scope" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Keyword" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Technicalspec" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Features" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Process" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericIdentifier__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Owner" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "domain",
    "scope",
    "keyword",
    "subject",
    "contact",
    "technicalspec",
    "features",
    "process",
    "status",
    "identifier",
    "description",
    "owner",
    "classification",
    "link"
})
public class Tech
    extends InfrastructureBaseType
{

    @XmlElement(name = "Type")
    protected List<CfGenericURIClassificationType> type;
    @XmlElement(name = "Acronym")
    protected CfStringType acronym;
    @XmlElement(name = "Name")
    protected List<CfMLangStringType> name;
    @XmlElement(name = "Domain")
    protected CfMLangStringType domain;
    @XmlElement(name = "Scope")
    protected List<CfMLangStringType> scope;
    @XmlElement(name = "Keyword")
    protected List<CfMLangStringType> keyword;
    @XmlElement(name = "Subject")
    protected List<CfMLangStringType> subject;
    @XmlElement(name = "Contact")
    protected CfMLangStringType contact;
    @XmlElement(name = "Technicalspec")
    protected CfMLangStringType technicalspec;
    @XmlElement(name = "Features")
    protected CfMLangStringType features;
    @XmlElement(name = "Process")
    protected CfMLangStringType process;
    @XmlElement(name = "Status")
    protected CfMLangStringType status;
    @XmlElement(name = "Identifier")
    protected List<CfGenericIdentifierType> identifier;
    @XmlElement(name = "Description")
    protected List<CfMLangStringType> description;
    @XmlElement(name = "Owner")
    protected List<CfLinkWithDisplayNameToPersonOrOrgUnitType> owner;
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
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getScope() {
        if (scope == null) {
            scope = new ArrayList<CfMLangStringType>();
        }
        return this.scope;
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
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getSubject() {
        if (subject == null) {
            subject = new ArrayList<CfMLangStringType>();
        }
        return this.subject;
    }

    /**
     * Obtiene el valor de la propiedad contact.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getContact() {
        return contact;
    }

    /**
     * Define el valor de la propiedad contact.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setContact(CfMLangStringType value) {
        this.contact = value;
    }

    /**
     * Obtiene el valor de la propiedad technicalspec.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getTechnicalspec() {
        return technicalspec;
    }

    /**
     * Define el valor de la propiedad technicalspec.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setTechnicalspec(CfMLangStringType value) {
        this.technicalspec = value;
    }

    /**
     * Obtiene el valor de la propiedad features.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getFeatures() {
        return features;
    }

    /**
     * Define el valor de la propiedad features.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setFeatures(CfMLangStringType value) {
        this.features = value;
    }

    /**
     * Obtiene el valor de la propiedad process.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getProcess() {
        return process;
    }

    /**
     * Define el valor de la propiedad process.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setProcess(CfMLangStringType value) {
        this.process = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setStatus(CfMLangStringType value) {
        this.status = value;
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
     * Gets the value of the owner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the owner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfLinkWithDisplayNameToPersonOrOrgUnitType }
     * 
     * 
     */
    public List<CfLinkWithDisplayNameToPersonOrOrgUnitType> getOwner() {
        if (owner == null) {
            owner = new ArrayList<CfLinkWithDisplayNameToPersonOrOrgUnitType>();
        }
        return this.owner;
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

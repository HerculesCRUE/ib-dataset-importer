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
import es.um.asio.importer.cerif.model.xsd.vocabularies.servicecompatibilities.Compatibility;


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
 *         &lt;element ref="{https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility}Compatibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Acronym" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericIdentifier__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WebsiteURL" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="OAIPMHBaseURL" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="SubjectHeadingsURL" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "compatibility",
    "acronym",
    "name",
    "identifier",
    "description",
    "websiteURL",
    "oaipmhBaseURL",
    "subjectHeadingsURL",
    "owner",
    "classification",
    "link"
})
public class Service
    extends InfrastructureBaseType
{

    @XmlElement(name = "Compatibility", namespace = "https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Service_Compatibility")
    protected List<Compatibility> compatibility;
    @XmlElement(name = "Acronym")
    protected CfStringType acronym;
    @XmlElement(name = "Name")
    protected List<CfMLangStringType> name;
    @XmlElement(name = "Identifier")
    protected List<CfGenericIdentifierType> identifier;
    @XmlElement(name = "Description")
    protected List<CfMLangStringType> description;
    @XmlElement(name = "WebsiteURL")
    protected CfStringType websiteURL;
    @XmlElement(name = "OAIPMHBaseURL")
    protected CfStringType oaipmhBaseURL;
    @XmlElement(name = "SubjectHeadingsURL")
    protected List<CfStringType> subjectHeadingsURL;
    @XmlElement(name = "Owner")
    protected List<CfLinkWithDisplayNameToPersonOrOrgUnitType> owner;
    @XmlElement(name = "Classification", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericURIClassificationType> classification;
    @XmlElement(name = "Link", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericLinkType> link;

    /**
     * OpenAIRE compatibility of the CRIS
     * 								Gets the value of the compatibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Compatibility }
     * 
     * 
     */
    public List<Compatibility> getCompatibility() {
        if (compatibility == null) {
            compatibility = new ArrayList<Compatibility>();
        }
        return this.compatibility;
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
     * Obtiene el valor de la propiedad websiteURL.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getWebsiteURL() {
        return websiteURL;
    }

    /**
     * Define el valor de la propiedad websiteURL.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setWebsiteURL(CfStringType value) {
        this.websiteURL = value;
    }

    /**
     * Obtiene el valor de la propiedad oaipmhBaseURL.
     * 
     * @return
     *     possible object is
     *     {@link CfStringType }
     *     
     */
    public CfStringType getOAIPMHBaseURL() {
        return oaipmhBaseURL;
    }

    /**
     * Define el valor de la propiedad oaipmhBaseURL.
     * 
     * @param value
     *     allowed object is
     *     {@link CfStringType }
     *     
     */
    public void setOAIPMHBaseURL(CfStringType value) {
        this.oaipmhBaseURL = value;
    }

    /**
     * Gets the value of the subjectHeadingsURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectHeadingsURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectHeadingsURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfStringType }
     * 
     * 
     */
    public List<CfStringType> getSubjectHeadingsURL() {
        if (subjectHeadingsURL == null) {
            subjectHeadingsURL = new ArrayList<CfStringType>();
        }
        return this.subjectHeadingsURL;
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

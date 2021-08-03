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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfDateType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericIdentifierType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericLinkType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericURIClassificationType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonOrOrgUnitType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonWithAffiliationsType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfMLangAnyMixedType;
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
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/1.1/}ProjectFunding__BaseType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Type" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Acronym" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericIdentifier__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfDate__Type" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfDate__Type" minOccurs="0"/&gt;
 *         &lt;element name="Consortium" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Coordinator" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Partner" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Contractor" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="InKindContributor" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;sequence&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;element name="Member" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Team" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PrincipalInvestigator" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliations__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Contact" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliations__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;sequence&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;element name="Member" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliations__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Funded" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="By" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" minOccurs="0"/&gt;
 *                   &lt;element name="As" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Funding"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfExtension__AttributeGroup"/&gt;
 *                 &lt;anyAttribute namespace='##other'/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;sequence&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Subject" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Keyword" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Domain" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="PartOf" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Project"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Abstract" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangAnyMixed__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Uses" maxOccurs="unbounded" minOccurs="0"&gt;
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
 *         &lt;element name="OAMandate" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfExtension__AttributeGroup"/&gt;
 *                 &lt;attGroup ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfStartDateEndDate__AttributeGroup"/&gt;
 *                 &lt;attribute name="mandated" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                 &lt;anyAttribute namespace='##other'/&gt;
 *               &lt;/restriction&gt;
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
    "title",
    "identifier",
    "startDate",
    "endDate",
    "consortium",
    "team",
    "funded",
    "subject",
    "keyword",
    "level",
    "domain",
    "partOf",
    "_abstract",
    "status",
    "uses",
    "oaMandate",
    "classification",
    "link"
})
public class Project
    extends ProjectFundingBaseType
{

    @XmlElement(name = "Type")
    protected List<CfGenericURIClassificationType> type;
    @XmlElement(name = "Acronym")
    protected CfStringType acronym;
    @XmlElement(name = "Title")
    protected List<CfMLangStringType> title;
    @XmlElement(name = "Identifier")
    protected List<CfGenericIdentifierType> identifier;
    @XmlElement(name = "StartDate")
    protected CfDateType startDate;
    @XmlElement(name = "EndDate")
    protected CfDateType endDate;
    @XmlElement(name = "Consortium")
    protected Project.Consortium consortium;
    @XmlElement(name = "Team")
    protected Project.Team team;
    @XmlElement(name = "Funded")
    protected List<Project.Funded> funded;
    @XmlElement(name = "Subject")
    protected List<CfGenericURIClassificationType> subject;
    @XmlElement(name = "Keyword")
    protected List<CfMLangStringType> keyword;
    @XmlElement(name = "Level")
    protected CfMLangStringType level;
    @XmlElement(name = "Domain")
    protected CfMLangStringType domain;
    @XmlElement(name = "PartOf")
    protected Project.PartOf partOf;
    @XmlElement(name = "Abstract")
    protected List<CfMLangAnyMixedType> _abstract;
    @XmlElement(name = "Status")
    protected List<CfGenericURIClassificationType> status;
    @XmlElement(name = "Uses")
    protected List<Project.Uses> uses;
    @XmlElement(name = "OAMandate")
    protected List<Project.OAMandate> oaMandate;
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
     * Obtiene el valor de la propiedad consortium.
     * 
     * @return
     *     possible object is
     *     {@link Project.Consortium }
     *     
     */
    public Project.Consortium getConsortium() {
        return consortium;
    }

    /**
     * Define el valor de la propiedad consortium.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Consortium }
     *     
     */
    public void setConsortium(Project.Consortium value) {
        this.consortium = value;
    }

    /**
     * Obtiene el valor de la propiedad team.
     * 
     * @return
     *     possible object is
     *     {@link Project.Team }
     *     
     */
    public Project.Team getTeam() {
        return team;
    }

    /**
     * Define el valor de la propiedad team.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Team }
     *     
     */
    public void setTeam(Project.Team value) {
        this.team = value;
    }

    /**
     * Gets the value of the funded property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the funded property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunded().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Project.Funded }
     * 
     * 
     */
    public List<Project.Funded> getFunded() {
        if (funded == null) {
            funded = new ArrayList<Project.Funded>();
        }
        return this.funded;
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
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setLevel(CfMLangStringType value) {
        this.level = value;
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
     * Obtiene el valor de la propiedad partOf.
     * 
     * @return
     *     possible object is
     *     {@link Project.PartOf }
     *     
     */
    public Project.PartOf getPartOf() {
        return partOf;
    }

    /**
     * Define el valor de la propiedad partOf.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.PartOf }
     *     
     */
    public void setPartOf(Project.PartOf value) {
        this.partOf = value;
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
     * {@link CfMLangAnyMixedType }
     * 
     * 
     */
    public List<CfMLangAnyMixedType> getAbstract() {
        if (_abstract == null) {
            _abstract = new ArrayList<CfMLangAnyMixedType>();
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
     * Gets the value of the uses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Project.Uses }
     * 
     * 
     */
    public List<Project.Uses> getUses() {
        if (uses == null) {
            uses = new ArrayList<Project.Uses>();
        }
        return this.uses;
    }

    /**
     * Gets the value of the oaMandate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oaMandate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOAMandate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Project.OAMandate }
     * 
     * 
     */
    public List<Project.OAMandate> getOAMandate() {
        if (oaMandate == null) {
            oaMandate = new ArrayList<Project.OAMandate>();
        }
        return this.oaMandate;
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
     *         &lt;element name="Coordinator" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Partner" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Contractor" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="InKindContributor" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;sequence&gt;
     *         &lt;/sequence&gt;
     *         &lt;element name="Member" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "coordinator",
        "partner",
        "contractor",
        "inKindContributor",
        "member"
    })
    public static class Consortium {

        @XmlElement(name = "Coordinator")
        protected List<CfLinkWithDisplayNameToPersonOrOrgUnitType> coordinator;
        @XmlElement(name = "Partner")
        protected List<CfLinkWithDisplayNameToPersonOrOrgUnitType> partner;
        @XmlElement(name = "Contractor")
        protected List<CfLinkWithDisplayNameToPersonOrOrgUnitType> contractor;
        @XmlElement(name = "InKindContributor")
        protected List<CfLinkWithDisplayNameToPersonOrOrgUnitType> inKindContributor;
        @XmlElement(name = "Member")
        protected List<CfLinkWithDisplayNameToPersonOrOrgUnitType> member;

        /**
         * Gets the value of the coordinator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coordinator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoordinator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonOrOrgUnitType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonOrOrgUnitType> getCoordinator() {
            if (coordinator == null) {
                coordinator = new ArrayList<CfLinkWithDisplayNameToPersonOrOrgUnitType>();
            }
            return this.coordinator;
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
         * {@link CfLinkWithDisplayNameToPersonOrOrgUnitType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonOrOrgUnitType> getPartner() {
            if (partner == null) {
                partner = new ArrayList<CfLinkWithDisplayNameToPersonOrOrgUnitType>();
            }
            return this.partner;
        }

        /**
         * Gets the value of the contractor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contractor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContractor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonOrOrgUnitType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonOrOrgUnitType> getContractor() {
            if (contractor == null) {
                contractor = new ArrayList<CfLinkWithDisplayNameToPersonOrOrgUnitType>();
            }
            return this.contractor;
        }

        /**
         * Gets the value of the inKindContributor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inKindContributor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInKindContributor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonOrOrgUnitType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonOrOrgUnitType> getInKindContributor() {
            if (inKindContributor == null) {
                inKindContributor = new ArrayList<CfLinkWithDisplayNameToPersonOrOrgUnitType>();
            }
            return this.inKindContributor;
        }

        /**
         * Gets the value of the member property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the member property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonOrOrgUnitType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonOrOrgUnitType> getMember() {
            if (member == null) {
                member = new ArrayList<CfLinkWithDisplayNameToPersonOrOrgUnitType>();
            }
            return this.member;
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
     *         &lt;element name="By" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" minOccurs="0"/&gt;
     *         &lt;element name="As" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Funding"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfExtension__AttributeGroup"/&gt;
     *       &lt;anyAttribute namespace='##other'/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "by",
        "as"
    })
    public static class Funded {

        @XmlElement(name = "By")
        protected CfLinkWithDisplayNameToPersonOrOrgUnitType by;
        @XmlElement(name = "As")
        protected Project.Funded.As as;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Obtiene el valor de la propiedad by.
         * 
         * @return
         *     possible object is
         *     {@link CfLinkWithDisplayNameToPersonOrOrgUnitType }
         *     
         */
        public CfLinkWithDisplayNameToPersonOrOrgUnitType getBy() {
            return by;
        }

        /**
         * Define el valor de la propiedad by.
         * 
         * @param value
         *     allowed object is
         *     {@link CfLinkWithDisplayNameToPersonOrOrgUnitType }
         *     
         */
        public void setBy(CfLinkWithDisplayNameToPersonOrOrgUnitType value) {
            this.by = value;
        }

        /**
         * Obtiene el valor de la propiedad as.
         * 
         * @return
         *     possible object is
         *     {@link Project.Funded.As }
         *     
         */
        public Project.Funded.As getAs() {
            return as;
        }

        /**
         * Define el valor de la propiedad as.
         * 
         * @param value
         *     allowed object is
         *     {@link Project.Funded.As }
         *     
         */
        public void setAs(Project.Funded.As value) {
            this.as = value;
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
         *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Funding"/&gt;
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
            "funding"
        })
        public static class As
            extends CfLinkBaseType
        {

            @XmlElement(name = "Funding", required = true)
            protected Funding funding;

            /**
             * Obtiene el valor de la propiedad funding.
             * 
             * @return
             *     possible object is
             *     {@link Funding }
             *     
             */
            public Funding getFunding() {
                return funding;
            }

            /**
             * Define el valor de la propiedad funding.
             * 
             * @param value
             *     allowed object is
             *     {@link Funding }
             *     
             */
            public void setFunding(Funding value) {
                this.funding = value;
            }

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
     *       &lt;attGroup ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfExtension__AttributeGroup"/&gt;
     *       &lt;attGroup ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfStartDateEndDate__AttributeGroup"/&gt;
     *       &lt;attribute name="mandated" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *       &lt;anyAttribute namespace='##other'/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OAMandate {

        @XmlAttribute(name = "mandated", required = true)
        protected boolean mandated;
        @XmlAttribute(name = "uri")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "startDate")
        protected List<String> startDate;
        @XmlAttribute(name = "endDate")
        protected List<String> endDate;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Obtiene el valor de la propiedad mandated.
         * 
         */
        public boolean isMandated() {
            return mandated;
        }

        /**
         * Define el valor de la propiedad mandated.
         * 
         */
        public void setMandated(boolean value) {
            this.mandated = value;
        }

        /**
         * Obtiene el valor de la propiedad uri.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUri() {
            return uri;
        }

        /**
         * Define el valor de la propiedad uri.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUri(String value) {
            this.uri = value;
        }

        /**
         * Gets the value of the startDate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the startDate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStartDate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStartDate() {
            if (startDate == null) {
                startDate = new ArrayList<String>();
            }
            return this.startDate;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endDate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEndDate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEndDate() {
            if (endDate == null) {
                endDate = new ArrayList<String>();
            }
            return this.endDate;
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
     *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Project"/&gt;
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
        "project"
    })
    public static class PartOf
        extends CfLinkWithDisplayNameBaseType
    {

        @XmlElement(name = "Project", required = true)
        protected Project project;

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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PrincipalInvestigator" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliations__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Contact" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliations__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;sequence&gt;
     *         &lt;/sequence&gt;
     *         &lt;element name="Member" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonWithAffiliations__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "principalInvestigator",
        "contact",
        "member"
    })
    public static class Team {

        @XmlElement(name = "PrincipalInvestigator")
        protected List<CfLinkWithDisplayNameToPersonWithAffiliationsType> principalInvestigator;
        @XmlElement(name = "Contact")
        protected List<CfLinkWithDisplayNameToPersonWithAffiliationsType> contact;
        @XmlElement(name = "Member")
        protected List<CfLinkWithDisplayNameToPersonWithAffiliationsType> member;

        /**
         * Gets the value of the principalInvestigator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the principalInvestigator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrincipalInvestigator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonWithAffiliationsType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonWithAffiliationsType> getPrincipalInvestigator() {
            if (principalInvestigator == null) {
                principalInvestigator = new ArrayList<CfLinkWithDisplayNameToPersonWithAffiliationsType>();
            }
            return this.principalInvestigator;
        }

        /**
         * Gets the value of the contact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonWithAffiliationsType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonWithAffiliationsType> getContact() {
            if (contact == null) {
                contact = new ArrayList<CfLinkWithDisplayNameToPersonWithAffiliationsType>();
            }
            return this.contact;
        }

        /**
         * Gets the value of the member property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the member property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CfLinkWithDisplayNameToPersonWithAffiliationsType }
         * 
         * 
         */
        public List<CfLinkWithDisplayNameToPersonWithAffiliationsType> getMember() {
            if (member == null) {
                member = new ArrayList<CfLinkWithDisplayNameToPersonWithAffiliationsType>();
            }
            return this.member;
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
    public static class Uses
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

}

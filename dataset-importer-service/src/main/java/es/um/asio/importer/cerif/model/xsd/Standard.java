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
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericURIClassificationType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfIdAttrBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameBaseType;
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
 *         &lt;element name="Standard" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TitleVietnamese" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TitleEnglish" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Number" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="PublicationDate" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfDate__Type" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Page" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Scope" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DecisionNumber" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="ReplacedBy" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element name="NomativeReferences" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" minOccurs="0"/&gt;
 *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}OrgUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EquivalentTo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Standard"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "standard",
    "titleVietnamese",
    "titleEnglish",
    "type",
    "number",
    "publicationDate",
    "status",
    "subject",
    "page",
    "price",
    "scope",
    "decisionNumber",
    "replacedBy",
    "nomativeReferences",
    "orgUnit",
    "equivalentTo"
})
public class Standard
    extends CfIdAttrBaseType
{

    @XmlElement(name = "Standard")
    protected List<CfGenericURIClassificationType> standard;
    @XmlElement(name = "TitleVietnamese")
    protected List<CfMLangStringType> titleVietnamese;
    @XmlElement(name = "TitleEnglish")
    protected List<CfStringType> titleEnglish;
    @XmlElement(name = "Type")
    protected List<CfStringType> type;
    @XmlElement(name = "Number")
    protected CfStringType number;
    @XmlElement(name = "PublicationDate")
    protected CfDateType publicationDate;
    @XmlElement(name = "Status")
    protected CfMLangStringType status;
    @XmlElement(name = "Subject")
    protected List<CfGenericURIClassificationType> subject;
    @XmlElement(name = "Page")
    protected CfMLangStringType page;
    @XmlElement(name = "Price")
    protected CfMLangStringType price;
    @XmlElement(name = "Scope")
    protected List<CfMLangStringType> scope;
    @XmlElement(name = "DecisionNumber")
    protected CfMLangStringType decisionNumber;
    @XmlElement(name = "ReplacedBy")
    protected CfMLangStringType replacedBy;
    @XmlElement(name = "NomativeReferences")
    protected CfMLangStringType nomativeReferences;
    @XmlElement(name = "OrgUnit")
    protected List<OrgUnit> orgUnit;
    @XmlElement(name = "EquivalentTo")
    protected List<Standard.EquivalentTo> equivalentTo;

    /**
     * Gets the value of the standard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfGenericURIClassificationType }
     * 
     * 
     */
    public List<CfGenericURIClassificationType> getStandard() {
        if (standard == null) {
            standard = new ArrayList<CfGenericURIClassificationType>();
        }
        return this.standard;
    }

    /**
     * Gets the value of the titleVietnamese property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleVietnamese property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitleVietnamese().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getTitleVietnamese() {
        if (titleVietnamese == null) {
            titleVietnamese = new ArrayList<CfMLangStringType>();
        }
        return this.titleVietnamese;
    }

    /**
     * Gets the value of the titleEnglish property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleEnglish property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitleEnglish().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfStringType }
     * 
     * 
     */
    public List<CfStringType> getTitleEnglish() {
        if (titleEnglish == null) {
            titleEnglish = new ArrayList<CfStringType>();
        }
        return this.titleEnglish;
    }

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
     * {@link CfStringType }
     * 
     * 
     */
    public List<CfStringType> getType() {
        if (type == null) {
            type = new ArrayList<CfStringType>();
        }
        return this.type;
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
     * Obtiene el valor de la propiedad publicationDate.
     * 
     * @return
     *     possible object is
     *     {@link CfDateType }
     *     
     */
    public CfDateType getPublicationDate() {
        return publicationDate;
    }

    /**
     * Define el valor de la propiedad publicationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link CfDateType }
     *     
     */
    public void setPublicationDate(CfDateType value) {
        this.publicationDate = value;
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
     * Obtiene el valor de la propiedad page.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getPage() {
        return page;
    }

    /**
     * Define el valor de la propiedad page.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setPage(CfMLangStringType value) {
        this.page = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setPrice(CfMLangStringType value) {
        this.price = value;
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
     * Obtiene el valor de la propiedad decisionNumber.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getDecisionNumber() {
        return decisionNumber;
    }

    /**
     * Define el valor de la propiedad decisionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setDecisionNumber(CfMLangStringType value) {
        this.decisionNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad replacedBy.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getReplacedBy() {
        return replacedBy;
    }

    /**
     * Define el valor de la propiedad replacedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setReplacedBy(CfMLangStringType value) {
        this.replacedBy = value;
    }

    /**
     * Obtiene el valor de la propiedad nomativeReferences.
     * 
     * @return
     *     possible object is
     *     {@link CfMLangStringType }
     *     
     */
    public CfMLangStringType getNomativeReferences() {
        return nomativeReferences;
    }

    /**
     * Define el valor de la propiedad nomativeReferences.
     * 
     * @param value
     *     allowed object is
     *     {@link CfMLangStringType }
     *     
     */
    public void setNomativeReferences(CfMLangStringType value) {
        this.nomativeReferences = value;
    }

    /**
     * Gets the value of the orgUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgUnit }
     * 
     * 
     */
    public List<OrgUnit> getOrgUnit() {
        if (orgUnit == null) {
            orgUnit = new ArrayList<OrgUnit>();
        }
        return this.orgUnit;
    }

    /**
     * Gets the value of the equivalentTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equivalentTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquivalentTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Standard.EquivalentTo }
     * 
     * 
     */
    public List<Standard.EquivalentTo> getEquivalentTo() {
        if (equivalentTo == null) {
            equivalentTo = new ArrayList<Standard.EquivalentTo>();
        }
        return this.equivalentTo;
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
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Standard"/&gt;
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
        "standard"
    })
    public static class EquivalentTo
        extends CfLinkWithDisplayNameBaseType
    {

        @XmlElement(name = "Standard", required = true)
        protected Standard standard;

        /**
         * Obtiene el valor de la propiedad standard.
         * 
         * @return
         *     possible object is
         *     {@link Standard }
         *     
         */
        public Standard getStandard() {
            return standard;
        }

        /**
         * Define el valor de la propiedad standard.
         * 
         * @param value
         *     allowed object is
         *     {@link Standard }
         *     
         */
        public void setStandard(Standard value) {
            this.standard = value;
        }

    }

}

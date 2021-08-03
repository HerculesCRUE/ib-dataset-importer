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
import es.um.asio.importer.cerif.model.xsd.include.commons.CfAmountType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericIdentifierType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericLinkType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericURIClassificationType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonOrOrgUnitType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfMLangStringType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfStringType;
import es.um.asio.importer.cerif.model.xsd.vocabularies.funding.Type;


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
 *         &lt;element ref="{https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types}Type"/&gt;
 *         &lt;element name="Acronym" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfString__Type" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfAmount__Type" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericIdentifier__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Subject" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericURIClassification__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Keyword" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Funder" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayNameToPersonOrOrgUnit__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PartOf" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Funding"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Duration" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType" minOccurs="0"/&gt;
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
    "name",
    "amount",
    "identifier",
    "description",
    "subject",
    "keyword",
    "funder",
    "partOf",
    "duration",
    "oaMandate",
    "classification",
    "link"
})
public class Funding
    extends ProjectFundingBaseType
{

    @XmlElement(name = "Type", namespace = "https://www.openaire.eu/cerif-profile/vocab/OpenAIRE_Funding_Types")
    protected Type type;
    @XmlElement(name = "Acronym")
    protected CfStringType acronym;
    @XmlElement(name = "Name")
    protected List<CfMLangStringType> name;
    @XmlElement(name = "Amount")
    protected CfAmountType amount;
    @XmlElement(name = "Identifier")
    protected List<CfGenericIdentifierType> identifier;
    @XmlElement(name = "Description")
    protected List<CfMLangStringType> description;
    @XmlElement(name = "Subject")
    protected List<CfGenericURIClassificationType> subject;
    @XmlElement(name = "Keyword")
    protected List<CfMLangStringType> keyword;
    @XmlElement(name = "Funder")
    protected List<CfLinkWithDisplayNameToPersonOrOrgUnitType> funder;
    @XmlElement(name = "PartOf")
    protected Funding.PartOf partOf;
    @XmlElement(name = "Duration")
    protected CfLinkBaseType duration;
    @XmlElement(name = "OAMandate")
    protected List<Funding.OAMandate> oaMandate;
    @XmlElement(name = "Classification", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericURIClassificationType> classification;
    @XmlElement(name = "Link", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons")
    protected List<CfGenericLinkType> link;

    /**
     * The type of the funding
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
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link CfAmountType }
     *     
     */
    public CfAmountType getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link CfAmountType }
     *     
     */
    public void setAmount(CfAmountType value) {
        this.amount = value;
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
     * Gets the value of the funder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the funder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfLinkWithDisplayNameToPersonOrOrgUnitType }
     * 
     * 
     */
    public List<CfLinkWithDisplayNameToPersonOrOrgUnitType> getFunder() {
        if (funder == null) {
            funder = new ArrayList<CfLinkWithDisplayNameToPersonOrOrgUnitType>();
        }
        return this.funder;
    }

    /**
     * Obtiene el valor de la propiedad partOf.
     * 
     * @return
     *     possible object is
     *     {@link Funding.PartOf }
     *     
     */
    public Funding.PartOf getPartOf() {
        return partOf;
    }

    /**
     * Define el valor de la propiedad partOf.
     * 
     * @param value
     *     allowed object is
     *     {@link Funding.PartOf }
     *     
     */
    public void setPartOf(Funding.PartOf value) {
        this.partOf = value;
    }

    /**
     * Obtiene el valor de la propiedad duration.
     * 
     * @return
     *     possible object is
     *     {@link CfLinkBaseType }
     *     
     */
    public CfLinkBaseType getDuration() {
        return duration;
    }

    /**
     * Define el valor de la propiedad duration.
     * 
     * @param value
     *     allowed object is
     *     {@link CfLinkBaseType }
     *     
     */
    public void setDuration(CfLinkBaseType value) {
        this.duration = value;
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
     * {@link Funding.OAMandate }
     * 
     * 
     */
    public List<Funding.OAMandate> getOAMandate() {
        if (oaMandate == null) {
            oaMandate = new ArrayList<Funding.OAMandate>();
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
    public static class PartOf
        extends CfLinkWithDisplayNameBaseType
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

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericIdentifierType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfMLangStringType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfMLangStringWithOptionalSourceType;


/**
 * The base type for a CERIF classification
 * 			
 * 
 * <p>Clase Java para cfClass__BaseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cfClass__BaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/1.1/}SemanticLayer__BaseType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Term" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangStringWithOptionalSource__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="RoleExpression" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded"/&gt;
 *           &lt;element name="RoleExpressionOpposite" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangString__Type" maxOccurs="unbounded"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Definition" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangStringWithOptionalSource__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangStringWithOptionalSource__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Example" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangStringWithOptionalSource__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericIdentifier__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Broader" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Class"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Narrower" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Class"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Related" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Class"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Link" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}SemanticLayer__SubstitutionGroupHead"/&gt;
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
@XmlType(name = "cfClass__BaseType", propOrder = {
    "term",
    "roleExpression",
    "roleExpressionOpposite",
    "definition",
    "description",
    "example",
    "identifier",
    "broader",
    "narrower",
    "related",
    "link"
})
@XmlSeeAlso({
    Class.class
})
public class CfClassBaseType
    extends SemanticLayerBaseType
{

    @XmlElement(name = "Term")
    protected List<CfMLangStringWithOptionalSourceType> term;
    @XmlElement(name = "RoleExpression")
    protected List<CfMLangStringType> roleExpression;
    @XmlElement(name = "RoleExpressionOpposite")
    protected List<CfMLangStringType> roleExpressionOpposite;
    @XmlElement(name = "Definition")
    protected List<CfMLangStringWithOptionalSourceType> definition;
    @XmlElement(name = "Description")
    protected List<CfMLangStringWithOptionalSourceType> description;
    @XmlElement(name = "Example")
    protected List<CfMLangStringWithOptionalSourceType> example;
    @XmlElement(name = "Identifier")
    protected List<CfGenericIdentifierType> identifier;
    @XmlElement(name = "Broader")
    protected List<CfClassBaseType.Broader> broader;
    @XmlElement(name = "Narrower")
    protected List<CfClassBaseType.Narrower> narrower;
    @XmlElement(name = "Related")
    protected List<CfClassBaseType.Related> related;
    @XmlElement(name = "Link")
    protected List<CfClassBaseType.Link> link;

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringWithOptionalSourceType }
     * 
     * 
     */
    public List<CfMLangStringWithOptionalSourceType> getTerm() {
        if (term == null) {
            term = new ArrayList<CfMLangStringWithOptionalSourceType>();
        }
        return this.term;
    }

    /**
     * Gets the value of the roleExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getRoleExpression() {
        if (roleExpression == null) {
            roleExpression = new ArrayList<CfMLangStringType>();
        }
        return this.roleExpression;
    }

    /**
     * Gets the value of the roleExpressionOpposite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleExpressionOpposite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleExpressionOpposite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringType }
     * 
     * 
     */
    public List<CfMLangStringType> getRoleExpressionOpposite() {
        if (roleExpressionOpposite == null) {
            roleExpressionOpposite = new ArrayList<CfMLangStringType>();
        }
        return this.roleExpressionOpposite;
    }

    /**
     * Gets the value of the definition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringWithOptionalSourceType }
     * 
     * 
     */
    public List<CfMLangStringWithOptionalSourceType> getDefinition() {
        if (definition == null) {
            definition = new ArrayList<CfMLangStringWithOptionalSourceType>();
        }
        return this.definition;
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
     * {@link CfMLangStringWithOptionalSourceType }
     * 
     * 
     */
    public List<CfMLangStringWithOptionalSourceType> getDescription() {
        if (description == null) {
            description = new ArrayList<CfMLangStringWithOptionalSourceType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the example property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the example property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfMLangStringWithOptionalSourceType }
     * 
     * 
     */
    public List<CfMLangStringWithOptionalSourceType> getExample() {
        if (example == null) {
            example = new ArrayList<CfMLangStringWithOptionalSourceType>();
        }
        return this.example;
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
     * Gets the value of the broader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the broader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBroader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfClassBaseType.Broader }
     * 
     * 
     */
    public List<CfClassBaseType.Broader> getBroader() {
        if (broader == null) {
            broader = new ArrayList<CfClassBaseType.Broader>();
        }
        return this.broader;
    }

    /**
     * Gets the value of the narrower property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the narrower property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNarrower().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfClassBaseType.Narrower }
     * 
     * 
     */
    public List<CfClassBaseType.Narrower> getNarrower() {
        if (narrower == null) {
            narrower = new ArrayList<CfClassBaseType.Narrower>();
        }
        return this.narrower;
    }

    /**
     * Gets the value of the related property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the related property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfClassBaseType.Related }
     * 
     * 
     */
    public List<CfClassBaseType.Related> getRelated() {
        if (related == null) {
            related = new ArrayList<CfClassBaseType.Related>();
        }
        return this.related;
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
     * {@link CfClassBaseType.Link }
     * 
     * 
     */
    public List<CfClassBaseType.Link> getLink() {
        if (link == null) {
            link = new ArrayList<CfClassBaseType.Link>();
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Class"/&gt;
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
        "clazz"
    })
    public static class Broader
        extends CfLinkBaseType
    {

        @XmlElement(name = "Class", required = true)
        protected Class clazz;

        /**
         * Obtiene el valor de la propiedad clazz.
         * 
         * @return
         *     possible object is
         *     {@link Class }
         *     
         */
        public Class getClazz() {
            return clazz;
        }

        /**
         * Define el valor de la propiedad clazz.
         * 
         * @param value
         *     allowed object is
         *     {@link Class }
         *     
         */
        public void setClazz(Class value) {
            this.clazz = value;
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
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}SemanticLayer__SubstitutionGroupHead"/&gt;
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
        "semanticLayerSubstitutionGroupHead"
    })
    public static class Link
        extends CfLinkBaseType
    {

        @XmlElementRef(name = "SemanticLayer__SubstitutionGroupHead", namespace = "https://www.openaire.eu/cerif-profile/1.1/", type = JAXBElement.class)
        protected JAXBElement<? extends SemanticLayerBaseType> semanticLayerSubstitutionGroupHead;

        /**
         * Obtiene el valor de la propiedad semanticLayerSubstitutionGroupHead.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link ClassScheme }{@code >}
         *     {@link JAXBElement }{@code <}{@link Class }{@code >}
         *     {@link JAXBElement }{@code <}{@link SemanticLayerBaseType }{@code >}
         *     
         */
        public JAXBElement<? extends SemanticLayerBaseType> getSemanticLayerSubstitutionGroupHead() {
            return semanticLayerSubstitutionGroupHead;
        }

        /**
         * Define el valor de la propiedad semanticLayerSubstitutionGroupHead.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link ClassScheme }{@code >}
         *     {@link JAXBElement }{@code <}{@link Class }{@code >}
         *     {@link JAXBElement }{@code <}{@link SemanticLayerBaseType }{@code >}
         *     
         */
        public void setSemanticLayerSubstitutionGroupHead(JAXBElement<? extends SemanticLayerBaseType> value) {
            this.semanticLayerSubstitutionGroupHead = value;
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
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Class"/&gt;
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
        "clazz"
    })
    public static class Narrower
        extends CfLinkBaseType
    {

        @XmlElement(name = "Class", required = true)
        protected Class clazz;

        /**
         * Obtiene el valor de la propiedad clazz.
         * 
         * @return
         *     possible object is
         *     {@link Class }
         *     
         */
        public Class getClazz() {
            return clazz;
        }

        /**
         * Define el valor de la propiedad clazz.
         * 
         * @param value
         *     allowed object is
         *     {@link Class }
         *     
         */
        public void setClazz(Class value) {
            this.clazz = value;
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
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/1.1/}Class"/&gt;
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
        "clazz"
    })
    public static class Related
        extends CfLinkBaseType
    {

        @XmlElement(name = "Class", required = true)
        protected Class clazz;

        /**
         * Obtiene el valor de la propiedad clazz.
         * 
         * @return
         *     possible object is
         *     {@link Class }
         *     
         */
        public Class getClazz() {
            return clazz;
        }

        /**
         * Define el valor de la propiedad clazz.
         * 
         * @param value
         *     allowed object is
         *     {@link Class }
         *     
         */
        public void setClazz(Class value) {
            this.clazz = value;
        }

    }

}

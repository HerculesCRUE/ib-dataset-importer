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
import es.um.asio.importer.cerif.model.xsd.include.commons.CfGenericIdentifierType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkBaseType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfMLangStringWithOptionalSourceType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/1.1/}SemanticLayer__BaseType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Name" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangStringWithOptionalSource__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfMLangStringWithOptionalSource__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfGenericIdentifier__Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Class" type="{https://www.openaire.eu/cerif-profile/1.1/}cfClass__BaseType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "name",
    "description",
    "identifier",
    "clazz",
    "link"
})
public class ClassScheme
    extends SemanticLayerBaseType
{

    @XmlElement(name = "Name")
    protected List<CfMLangStringWithOptionalSourceType> name;
    @XmlElement(name = "Description")
    protected List<CfMLangStringWithOptionalSourceType> description;
    @XmlElement(name = "Identifier")
    protected List<CfGenericIdentifierType> identifier;
    @XmlElement(name = "Class")
    protected List<CfClassBaseType> clazz;
    @XmlElement(name = "Link")
    protected List<ClassScheme.Link> link;

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
     * {@link CfMLangStringWithOptionalSourceType }
     * 
     * 
     */
    public List<CfMLangStringWithOptionalSourceType> getName() {
        if (name == null) {
            name = new ArrayList<CfMLangStringWithOptionalSourceType>();
        }
        return this.name;
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
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfClassBaseType }
     * 
     * 
     */
    public List<CfClassBaseType> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<CfClassBaseType>();
        }
        return this.clazz;
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
     * {@link ClassScheme.Link }
     * 
     * 
     */
    public List<ClassScheme.Link> getLink() {
        if (link == null) {
            link = new ArrayList<ClassScheme.Link>();
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

}

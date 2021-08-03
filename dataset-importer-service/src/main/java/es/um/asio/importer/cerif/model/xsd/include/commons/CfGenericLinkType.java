//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd.include.commons;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import es.um.asio.importer.cerif.model.xsd.Award;
import es.um.asio.importer.cerif.model.xsd.Equipment;
import es.um.asio.importer.cerif.model.xsd.Event;
import es.um.asio.importer.cerif.model.xsd.Funding;
import es.um.asio.importer.cerif.model.xsd.InfrastructureBaseType;
import es.um.asio.importer.cerif.model.xsd.OrgUnit;
import es.um.asio.importer.cerif.model.xsd.Patent;
import es.um.asio.importer.cerif.model.xsd.Person;
import es.um.asio.importer.cerif.model.xsd.Product;
import es.um.asio.importer.cerif.model.xsd.Project;
import es.um.asio.importer.cerif.model.xsd.ProjectFundingBaseType;
import es.um.asio.importer.cerif.model.xsd.Publication;
import es.um.asio.importer.cerif.model.xsd.ResearchOutputBaseType;
import es.um.asio.importer.cerif.model.xsd.Service;
import es.um.asio.importer.cerif.model.xsd.Standard;
import es.um.asio.importer.cerif.model.xsd.Tech;


/**
 * <p>Clase Java para cfGenericLink__Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cfGenericLink__Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}Individual__SubstitutionGroupHead"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfGenericLink__Type", propOrder = {
    "individualSubstitutionGroupHead"
})
public class CfGenericLinkType
    extends CfLinkBaseType
{

    @XmlElementRef(name = "Individual__SubstitutionGroupHead", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", type = JAXBElement.class)
    protected JAXBElement<? extends CfIdAttrBaseType> individualSubstitutionGroupHead;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Obtiene el valor de la propiedad individualSubstitutionGroupHead.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Standard }{@code >}
     *     {@link JAXBElement }{@code <}{@link Person }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrgUnit }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrgUnitBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonOrOrgUnitBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Event }{@code >}
     *     {@link JAXBElement }{@code <}{@link Service }{@code >}
     *     {@link JAXBElement }{@code <}{@link Equipment }{@code >}
     *     {@link JAXBElement }{@code <}{@link Tech }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Award }{@code >}
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     {@link JAXBElement }{@code <}{@link Publication }{@code >}
     *     {@link JAXBElement }{@code <}{@link Patent }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResearchOutputBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Project }{@code >}
     *     {@link JAXBElement }{@code <}{@link Funding }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProjectFundingBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CfIdAttrBaseType }{@code >}
     *     
     */
    public JAXBElement<? extends CfIdAttrBaseType> getIndividualSubstitutionGroupHead() {
        return individualSubstitutionGroupHead;
    }

    /**
     * Define el valor de la propiedad individualSubstitutionGroupHead.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Standard }{@code >}
     *     {@link JAXBElement }{@code <}{@link Person }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrgUnit }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrgUnitBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonOrOrgUnitBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Event }{@code >}
     *     {@link JAXBElement }{@code <}{@link Service }{@code >}
     *     {@link JAXBElement }{@code <}{@link Equipment }{@code >}
     *     {@link JAXBElement }{@code <}{@link Tech }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Award }{@code >}
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     {@link JAXBElement }{@code <}{@link Publication }{@code >}
     *     {@link JAXBElement }{@code <}{@link Patent }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResearchOutputBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Project }{@code >}
     *     {@link JAXBElement }{@code <}{@link Funding }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProjectFundingBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CfIdAttrBaseType }{@code >}
     *     
     */
    public void setIndividualSubstitutionGroupHead(JAXBElement<? extends CfIdAttrBaseType> value) {
        this.individualSubstitutionGroupHead = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}

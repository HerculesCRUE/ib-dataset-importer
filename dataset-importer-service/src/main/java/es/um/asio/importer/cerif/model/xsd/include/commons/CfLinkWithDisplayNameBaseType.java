//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd.include.commons;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cfLinkWithDisplayName__BaseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cfLinkWithDisplayName__BaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLink__BaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfLinkWithDisplayName__BaseType", propOrder = {
    "displayName"
})
@XmlSeeAlso({
    CfLinkWithDisplayNameToPersonWithAffiliationsType.class,
    CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.class,
    CfLinkWithDisplayNameToPersonOrOrgUnitType.class,
    CfLinkWithDisplayNameToOrgUnitType.class,
    es.um.asio.importer.cerif.model.xsd.OrgUnit.PartOf.class,
    es.um.asio.importer.cerif.model.xsd.Project.PartOf.class,
    es.um.asio.importer.cerif.model.xsd.Funding.PartOf.class,
    es.um.asio.importer.cerif.model.xsd.Publication.PartOf.class,
    es.um.asio.importer.cerif.model.xsd.Product.PartOf.class,
    es.um.asio.importer.cerif.model.xsd.Standard.EquivalentTo.class
})
public class CfLinkWithDisplayNameBaseType
    extends CfLinkBaseType
{

    @XmlElement(name = "DisplayName")
    protected String displayName;

    /**
     * Obtiene el valor de la propiedad displayName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Define el valor de la propiedad displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

}

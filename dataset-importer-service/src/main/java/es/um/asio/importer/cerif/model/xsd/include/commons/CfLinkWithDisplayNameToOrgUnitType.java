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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import es.um.asio.importer.cerif.model.xsd.OrgUnit;


/**
 * <p>Clase Java para cfLinkWithDisplayNameToOrgUnit__Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cfLinkWithDisplayNameToOrgUnit__Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}OrgUnit__SubstitutionGroupHead"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfLinkWithDisplayNameToOrgUnit__Type", propOrder = {
    "orgUnitSubstitutionGroupHead"
})
public class CfLinkWithDisplayNameToOrgUnitType
    extends CfLinkWithDisplayNameBaseType
{

    @XmlElementRef(name = "OrgUnit__SubstitutionGroupHead", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", type = JAXBElement.class)
    protected JAXBElement<? extends OrgUnitBaseType> orgUnitSubstitutionGroupHead;

    /**
     * Obtiene el valor de la propiedad orgUnitSubstitutionGroupHead.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrgUnit }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrgUnitBaseType }{@code >}
     *     
     */
    public JAXBElement<? extends OrgUnitBaseType> getOrgUnitSubstitutionGroupHead() {
        return orgUnitSubstitutionGroupHead;
    }

    /**
     * Define el valor de la propiedad orgUnitSubstitutionGroupHead.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrgUnit }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrgUnitBaseType }{@code >}
     *     
     */
    public void setOrgUnitSubstitutionGroupHead(JAXBElement<? extends OrgUnitBaseType> value) {
        this.orgUnitSubstitutionGroupHead = value;
    }

}

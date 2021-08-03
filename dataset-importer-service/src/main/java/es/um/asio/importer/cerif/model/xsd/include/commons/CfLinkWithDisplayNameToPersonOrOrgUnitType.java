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
import es.um.asio.importer.cerif.model.xsd.Person;


/**
 * <p>Clase Java para cfLinkWithDisplayNameToPersonOrOrgUnit__Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cfLinkWithDisplayNameToPersonOrOrgUnit__Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}PersonOrOrgUnit__SubstitutionGroupHead"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfLinkWithDisplayNameToPersonOrOrgUnit__Type", propOrder = {
    "personOrOrgUnitSubstitutionGroupHead"
})
public class CfLinkWithDisplayNameToPersonOrOrgUnitType
    extends CfLinkWithDisplayNameBaseType
{

    @XmlElementRef(name = "PersonOrOrgUnit__SubstitutionGroupHead", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", type = JAXBElement.class)
    protected JAXBElement<? extends PersonOrOrgUnitBaseType> personOrOrgUnitSubstitutionGroupHead;

    /**
     * Obtiene el valor de la propiedad personOrOrgUnitSubstitutionGroupHead.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Person }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrgUnit }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrgUnitBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonOrOrgUnitBaseType }{@code >}
     *     
     */
    public JAXBElement<? extends PersonOrOrgUnitBaseType> getPersonOrOrgUnitSubstitutionGroupHead() {
        return personOrOrgUnitSubstitutionGroupHead;
    }

    /**
     * Define el valor de la propiedad personOrOrgUnitSubstitutionGroupHead.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Person }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrgUnit }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrgUnitBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonOrOrgUnitBaseType }{@code >}
     *     
     */
    public void setPersonOrOrgUnitSubstitutionGroupHead(JAXBElement<? extends PersonOrOrgUnitBaseType> value) {
        this.personOrOrgUnitSubstitutionGroupHead = value;
    }

}

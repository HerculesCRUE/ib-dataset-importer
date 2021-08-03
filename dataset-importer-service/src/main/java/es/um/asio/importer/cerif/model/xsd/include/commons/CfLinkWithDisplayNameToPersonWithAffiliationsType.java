//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd.include.commons;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import es.um.asio.importer.cerif.model.xsd.Person;


/**
 * <p>Clase Java para cfLinkWithDisplayNameToPersonWithAffiliations__Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cfLinkWithDisplayNameToPersonWithAffiliations__Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}PersonWithAffiliations__Group"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfLinkWithDisplayNameToPersonWithAffiliations__Type", propOrder = {
    "personSubstitutionGroupHead",
    "affiliation"
})
public class CfLinkWithDisplayNameToPersonWithAffiliationsType
    extends CfLinkWithDisplayNameBaseType
{

    @XmlElementRef(name = "Person__SubstitutionGroupHead", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", type = JAXBElement.class)
    protected JAXBElement<? extends PersonBaseType> personSubstitutionGroupHead;
    @XmlElement(name = "Affiliation")
    protected List<es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation> affiliation;

    /**
     * Obtiene el valor de la propiedad personSubstitutionGroupHead.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Person }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonBaseType }{@code >}
     *     
     */
    public JAXBElement<? extends PersonBaseType> getPersonSubstitutionGroupHead() {
        return personSubstitutionGroupHead;
    }

    /**
     * Define el valor de la propiedad personSubstitutionGroupHead.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Person }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonBaseType }{@code >}
     *     
     */
    public void setPersonSubstitutionGroupHead(JAXBElement<? extends PersonBaseType> value) {
        this.personSubstitutionGroupHead = value;
    }

    /**
     * Gets the value of the affiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation }
     * 
     * 
     */
    public List<es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation> getAffiliation() {
        if (affiliation == null) {
            affiliation = new ArrayList<es.um.asio.importer.cerif.model.xsd.include.commons.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation>();
        }
        return this.affiliation;
    }

}

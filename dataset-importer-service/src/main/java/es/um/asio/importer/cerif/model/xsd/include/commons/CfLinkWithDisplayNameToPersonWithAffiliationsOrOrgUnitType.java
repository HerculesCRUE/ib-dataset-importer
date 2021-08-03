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
import es.um.asio.importer.cerif.model.xsd.OrgUnit;
import es.um.asio.importer.cerif.model.xsd.Person;


/**
 * <p>Clase Java para cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfLinkWithDisplayName__BaseType"&gt;
 *       &lt;choice&gt;
 *         &lt;group ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}PersonWithAffiliations__Group"/&gt;
 *         &lt;element ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}OrgUnit__SubstitutionGroupHead"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnit__Type", propOrder = {
    "personSubstitutionGroupHead",
    "affiliation",
    "orgUnitSubstitutionGroupHead"
})
public class CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType
    extends CfLinkWithDisplayNameBaseType
{

    @XmlElementRef(name = "Person__SubstitutionGroupHead", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PersonBaseType> personSubstitutionGroupHead;
    @XmlElement(name = "Affiliation")
    protected List<CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation> affiliation;
    @XmlElementRef(name = "OrgUnit__SubstitutionGroupHead", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrgUnitBaseType> orgUnitSubstitutionGroupHead;

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
     * {@link CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation }
     * 
     * 
     */
    public List<CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation> getAffiliation() {
        if (affiliation == null) {
            affiliation = new ArrayList<CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType.Affiliation>();
        }
        return this.affiliation;
    }

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
     *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}OrgUnit__SubstitutionGroupHead"/&gt;
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
        "displayName",
        "orgUnitSubstitutionGroupHead"
    })
    public static class Affiliation {

        @XmlElement(name = "DisplayName")
        protected String displayName;
        @XmlElementRef(name = "OrgUnit__SubstitutionGroupHead", namespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", type = JAXBElement.class)
        protected JAXBElement<? extends OrgUnitBaseType> orgUnitSubstitutionGroupHead;

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

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd.include.commons;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cfLink__BaseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cfLink__BaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfStartDateEndDate__AttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfLink__BaseType")
@XmlSeeAlso({
    CfGenericLinkType.class,
    es.um.asio.importer.cerif.model.xsd.Person.Affiliation.class,
    es.um.asio.importer.cerif.model.xsd.OrgUnit.Leader.class,
    es.um.asio.importer.cerif.model.xsd.Project.Funded.As.class,
    es.um.asio.importer.cerif.model.xsd.Project.Uses.class,
    es.um.asio.importer.cerif.model.xsd.Publication.PublishedIn.class,
    es.um.asio.importer.cerif.model.xsd.Publication.OriginatesFrom.class,
    es.um.asio.importer.cerif.model.xsd.Publication.PresentedAt.class,
    es.um.asio.importer.cerif.model.xsd.Publication.OutputFrom.class,
    es.um.asio.importer.cerif.model.xsd.Publication.Coverage.class,
    es.um.asio.importer.cerif.model.xsd.Publication.References.class,
    es.um.asio.importer.cerif.model.xsd.Patent.OriginatesFrom.class,
    es.um.asio.importer.cerif.model.xsd.Patent.Predecessor.class,
    es.um.asio.importer.cerif.model.xsd.Patent.References.class,
    es.um.asio.importer.cerif.model.xsd.Product.OriginatesFrom.class,
    es.um.asio.importer.cerif.model.xsd.Product.GeneratedBy.class,
    es.um.asio.importer.cerif.model.xsd.Product.PresentedAt.class,
    es.um.asio.importer.cerif.model.xsd.Product.Coverage.class,
    es.um.asio.importer.cerif.model.xsd.Product.References.class,
    es.um.asio.importer.cerif.model.xsd.Event.Organizer.class,
    es.um.asio.importer.cerif.model.xsd.Event.Sponsor.class,
    es.um.asio.importer.cerif.model.xsd.Event.Partner.class,
    CfLinkWithDisplayNameBaseType.class,
    es.um.asio.importer.cerif.model.xsd.ClassScheme.Link.class,
    es.um.asio.importer.cerif.model.xsd.CfClassBaseType.Broader.class,
    es.um.asio.importer.cerif.model.xsd.CfClassBaseType.Narrower.class,
    es.um.asio.importer.cerif.model.xsd.CfClassBaseType.Related.class,
    es.um.asio.importer.cerif.model.xsd.CfClassBaseType.Link.class
})
public class CfLinkBaseType {

    @XmlAttribute(name = "startDate")
    protected List<String> startDate;
    @XmlAttribute(name = "endDate")
    protected List<String> endDate;

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

}

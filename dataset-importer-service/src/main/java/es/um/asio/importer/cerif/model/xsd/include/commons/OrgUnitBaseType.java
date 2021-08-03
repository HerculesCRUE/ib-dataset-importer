//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd.include.commons;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import es.um.asio.importer.cerif.model.xsd.OrgUnit;


/**
 * An abstract organisation unit type
 * 
 * <p>Clase Java para OrgUnit__BaseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrgUnit__BaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}PersonOrOrgUnit__BaseType"&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgUnit__BaseType")
@XmlSeeAlso({
    OrgUnit.class
})
public class OrgUnitBaseType
    extends PersonOrOrgUnitBaseType
{


}

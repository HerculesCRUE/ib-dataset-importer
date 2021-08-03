//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import es.um.asio.importer.cerif.model.xsd.include.commons.CfIdAttrBaseType;


/**
 * A common supertype for research infrastructures:
 * 				facilities, equipment, and services
 * 
 * <p>Clase Java para Infrastructure__BaseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Infrastructure__BaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfIdAttr__BaseType"&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Infrastructure__BaseType")
@XmlSeeAlso({
    Equipment.class,
    Tech.class,
    Service.class
})
public class InfrastructureBaseType
    extends CfIdAttrBaseType
{


}

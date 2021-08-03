//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.openaire.eu/cerif-profile/1.1/}cfClass__BaseType"&gt;
 *       &lt;attribute name="classSchemeId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Class
    extends CfClassBaseType
{

    @XmlAttribute(name = "classSchemeId")
    protected String classSchemeId;

    /**
     * Obtiene el valor de la propiedad classSchemeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassSchemeId() {
        return classSchemeId;
    }

    /**
     * Define el valor de la propiedad classSchemeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassSchemeId(String value) {
        this.classSchemeId = value;
    }

}

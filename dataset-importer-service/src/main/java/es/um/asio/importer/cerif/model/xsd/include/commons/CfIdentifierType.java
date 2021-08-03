//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd.include.commons;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A federated identifier of a specific type: the type is expressed in the type of the XML Element.
 * 
 * <p>Clase Java para cfIdentifier__Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cfIdentifier__Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;https://www.openaire.eu/cerif-profile/includes/Cerif_Commons&gt;cfString__Type"&gt;
 *       &lt;attribute name="issuerServiceId" type="{https://www.openaire.eu/cerif-profile/includes/Cerif_Commons}cfId__SimpleType" /&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfIdentifier__Type")
@XmlSeeAlso({
    CfGenericIdentifierType.class
})
public class CfIdentifierType
    extends CfStringType
{

    @XmlAttribute(name = "issuerServiceId")
    protected String issuerServiceId;

    /**
     * Obtiene el valor de la propiedad issuerServiceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerServiceId() {
        return issuerServiceId;
    }

    /**
     * Define el valor de la propiedad issuerServiceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerServiceId(String value) {
        this.issuerServiceId = value;
    }

}

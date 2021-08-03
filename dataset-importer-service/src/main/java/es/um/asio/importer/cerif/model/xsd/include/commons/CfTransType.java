//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd.include.commons;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cfTrans__Type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="cfTrans__Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="o"/&gt;
 *     &lt;enumeration value="h"/&gt;
 *     &lt;enumeration value="m"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "cfTrans__Type")
@XmlEnum
public enum CfTransType {


    /**
     * Value in the original language
     * 
     */
    @XmlEnumValue("o")
    O("o"),

    /**
     * Human-translated value
     * 
     */
    @XmlEnumValue("h")
    H("h"),

    /**
     * Machine-translated value
     * 
     */
    @XmlEnumValue("m")
    M("m");
    private final String value;

    CfTransType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CfTransType fromValue(String v) {
        for (CfTransType c: CfTransType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

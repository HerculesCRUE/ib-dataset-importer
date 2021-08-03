//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd.oaipmh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para metadataFormatType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="metadataFormatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metadataPrefix" type="{http://www.openarchives.org/OAI/2.0/}metadataPrefixType"/&gt;
 *         &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="metadataNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadataFormatType", propOrder = {
    "metadataPrefix",
    "schema",
    "metadataNamespace"
})
public class MetadataFormatType {

    @XmlElement(required = true)
    protected String metadataPrefix;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String schema;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String metadataNamespace;

    /**
     * Obtiene el valor de la propiedad metadataPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataPrefix() {
        return metadataPrefix;
    }

    /**
     * Define el valor de la propiedad metadataPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataPrefix(String value) {
        this.metadataPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad schema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Define el valor de la propiedad schema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Obtiene el valor de la propiedad metadataNamespace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataNamespace() {
        return metadataNamespace;
    }

    /**
     * Define el valor de la propiedad metadataNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataNamespace(String value) {
        this.metadataNamespace = value;
    }

}

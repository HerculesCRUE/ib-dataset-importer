//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.01 a las 10:35:31 AM CET 
//

package es.um.asio.importer.oaipmh.model.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eissn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="editor" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="oclcnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organizacionCorrespondiente" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "RevistaPeriodica", namespace = "http://www.openarchives.org/OAI/2.0/")
public class RevistaPeriodica {

	protected String id;
	protected String issn;
	protected String eissn;
	protected RevistaPeriodica.Editor editor;
	protected String oclcnum;
	protected RevistaPeriodica.OrganizacionCorrespondiente organizacionCorrespondiente;

	/**
	 * Obtiene el valor de la propiedad id.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Define el valor de la propiedad id.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Obtiene el valor de la propiedad issn.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIssn() {
		return issn;
	}

	/**
	 * Define el valor de la propiedad issn.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setIssn(String value) {
		this.issn = value;
	}

	/**
	 * Obtiene el valor de la propiedad eissn.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEissn() {
		return eissn;
	}

	/**
	 * Define el valor de la propiedad eissn.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEissn(String value) {
		this.eissn = value;
	}

	/**
	 * Obtiene el valor de la propiedad editor.
	 * 
	 * @return possible object is {@link RevistaPeriodica.Editor }
	 * 
	 */
	public RevistaPeriodica.Editor getEditor() {
		return editor;
	}

	/**
	 * Define el valor de la propiedad editor.
	 * 
	 * @param value allowed object is {@link RevistaPeriodica.Editor }
	 * 
	 */
	public void setEditor(RevistaPeriodica.Editor value) {
		this.editor = value;
	}

	/**
	 * Obtiene el valor de la propiedad oclcnum.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOclcnum() {
		return oclcnum;
	}

	/**
	 * Define el valor de la propiedad oclcnum.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOclcnum(String value) {
		this.oclcnum = value;
	}

	/**
	 * Obtiene el valor de la propiedad organizacionCorrespondiente.
	 * 
	 * @return possible object is
	 *         {@link RevistaPeriodica.OrganizacionCorrespondiente }
	 * 
	 */
	public RevistaPeriodica.OrganizacionCorrespondiente getOrganizacionCorrespondiente() {
		return organizacionCorrespondiente;
	}

	/**
	 * Define el valor de la propiedad organizacionCorrespondiente.
	 * 
	 * @param value allowed object is
	 *              {@link RevistaPeriodica.OrganizacionCorrespondiente }
	 * 
	 */
	public void setOrganizacionCorrespondiente(RevistaPeriodica.OrganizacionCorrespondiente value) {
		this.organizacionCorrespondiente = value;
	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class Editor {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class OrganizacionCorrespondiente {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

}

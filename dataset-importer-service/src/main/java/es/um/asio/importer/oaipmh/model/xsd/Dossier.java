//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.01 a las 10:35:31 AM CET 
//

package es.um.asio.importer.oaipmh.model.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

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
 *         &lt;element name="intervaloDeTiempo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="seRelacionaConContratoProyecto" minOccurs="0"&gt;
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
 *         &lt;element name="seRelacionaConReporte" minOccurs="0"&gt;
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
 *         &lt;element name="seRelacionaConProyecto" minOccurs="0"&gt;
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
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlRootElement(name = "Dossier", namespace = "http://www.openarchives.org/OAI/2.0/")
public class Dossier {

	protected String id;
	protected Dossier.IntervaloDeTiempo intervaloDeTiempo;
	protected Dossier.SeRelacionaConContratoProyecto seRelacionaConContratoProyecto;
	protected Dossier.SeRelacionaConReporte seRelacionaConReporte;
	protected Dossier.SeRelacionaConProyecto seRelacionaConProyecto;
	@XmlElement(required = true)
	protected String descripcion;
	@XmlElement(required = true)
	protected String identificador;
	@XmlElement(required = true)
	protected String titulo;
	protected String oclcnum;
	protected Dossier.OrganizacionCorrespondiente organizacionCorrespondiente;

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
	 * Obtiene el valor de la propiedad intervaloDeTiempo.
	 * 
	 * @return possible object is {@link Dossier.IntervaloDeTiempo }
	 * 
	 */
	public Dossier.IntervaloDeTiempo getIntervaloDeTiempo() {
		return intervaloDeTiempo;
	}

	/**
	 * Define el valor de la propiedad intervaloDeTiempo.
	 * 
	 * @param value allowed object is {@link Dossier.IntervaloDeTiempo }
	 * 
	 */
	public void setIntervaloDeTiempo(Dossier.IntervaloDeTiempo value) {
		this.intervaloDeTiempo = value;
	}

	/**
	 * Obtiene el valor de la propiedad seRelacionaConContratoProyecto.
	 * 
	 * @return possible object is {@link Dossier.SeRelacionaConContratoProyecto }
	 * 
	 */
	public Dossier.SeRelacionaConContratoProyecto getSeRelacionaConContratoProyecto() {
		return seRelacionaConContratoProyecto;
	}

	/**
	 * Define el valor de la propiedad seRelacionaConContratoProyecto.
	 * 
	 * @param value allowed object is
	 *              {@link Dossier.SeRelacionaConContratoProyecto }
	 * 
	 */
	public void setSeRelacionaConContratoProyecto(Dossier.SeRelacionaConContratoProyecto value) {
		this.seRelacionaConContratoProyecto = value;
	}

	/**
	 * Obtiene el valor de la propiedad seRelacionaConReporte.
	 * 
	 * @return possible object is {@link Dossier.SeRelacionaConReporte }
	 * 
	 */
	public Dossier.SeRelacionaConReporte getSeRelacionaConReporte() {
		return seRelacionaConReporte;
	}

	/**
	 * Define el valor de la propiedad seRelacionaConReporte.
	 * 
	 * @param value allowed object is {@link Dossier.SeRelacionaConReporte }
	 * 
	 */
	public void setSeRelacionaConReporte(Dossier.SeRelacionaConReporte value) {
		this.seRelacionaConReporte = value;
	}

	/**
	 * Obtiene el valor de la propiedad seRelacionaConProyecto.
	 * 
	 * @return possible object is {@link Dossier.SeRelacionaConProyecto }
	 * 
	 */
	public Dossier.SeRelacionaConProyecto getSeRelacionaConProyecto() {
		return seRelacionaConProyecto;
	}

	/**
	 * Define el valor de la propiedad seRelacionaConProyecto.
	 * 
	 * @param value allowed object is {@link Dossier.SeRelacionaConProyecto }
	 * 
	 */
	public void setSeRelacionaConProyecto(Dossier.SeRelacionaConProyecto value) {
		this.seRelacionaConProyecto = value;
	}

	/**
	 * Obtiene el valor de la propiedad descripcion.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Define el valor de la propiedad descripcion.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDescripcion(String value) {
		this.descripcion = value;
	}

	/**
	 * Obtiene el valor de la propiedad identificador.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * Define el valor de la propiedad identificador.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setIdentificador(String value) {
		this.identificador = value;
	}

	/**
	 * Obtiene el valor de la propiedad titulo.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Define el valor de la propiedad titulo.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTitulo(String value) {
		this.titulo = value;
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
	 * @return possible object is {@link Dossier.OrganizacionCorrespondiente }
	 * 
	 */
	public Dossier.OrganizacionCorrespondiente getOrganizacionCorrespondiente() {
		return organizacionCorrespondiente;
	}

	/**
	 * Define el valor de la propiedad organizacionCorrespondiente.
	 * 
	 * @param value allowed object is {@link Dossier.OrganizacionCorrespondiente }
	 * 
	 */
	public void setOrganizacionCorrespondiente(Dossier.OrganizacionCorrespondiente value) {
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
	 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
	 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
	public static class IntervaloDeTiempo {

		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar fechaInicio;
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar fechaFin;

		/**
		 * Obtiene el valor de la propiedad fechaInicio.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getFechaInicio() {
			return fechaInicio;
		}

		/**
		 * Define el valor de la propiedad fechaInicio.
		 * 
		 * @param value allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setFechaInicio(XMLGregorianCalendar value) {
			this.fechaInicio = value;
		}

		/**
		 * Obtiene el valor de la propiedad fechaFin.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getFechaFin() {
			return fechaFin;
		}

		/**
		 * Define el valor de la propiedad fechaFin.
		 * 
		 * @param value allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setFechaFin(XMLGregorianCalendar value) {
			this.fechaFin = value;
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
	public static class SeRelacionaConContratoProyecto {

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
	public static class SeRelacionaConProyecto {

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
	public static class SeRelacionaConReporte {

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

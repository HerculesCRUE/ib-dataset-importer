//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.01 a las 10:35:31 AM CET 
//

package es.um.asio.importer.oaipmh.model.xsd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="presentaDocumento" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="Tema" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="participaOrganizacion" minOccurs="0"&gt;
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
 *         &lt;element name="participaPersona" minOccurs="0"&gt;
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
 *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ubicadoEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tieneMateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seRelacionaGasto" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="modalidadGasto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="tieneClassificacion" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="cantidadMonetaria" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="seRelacionaRol" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="dedicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="tieneAreaConocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="relacionadoConPatentAplication" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="relacionadoConProyecto" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="relacionadoConRelacion" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="intervaloDeTiempo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                             &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="heredaEnPersona"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="porcentajeDeDedicacion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="palabraClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localizadoEn" minOccurs="0"&gt;
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
 *         &lt;element name="informacionDeContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlRootElement(name = "Competicion", namespace = "http://www.openarchives.org/OAI/2.0/")
public class Competicion {

	protected String id;
	@XmlElement(required = true)
	protected String titulo;
	protected Competicion.PresentaDocumento presentaDocumento;
	protected Competicion.ParticipaOrganizacion participaOrganizacion;
	protected Competicion.ParticipaPersona participaPersona;
	protected String localidad;
	protected String identificador;
	protected String descripcion;
	protected String ubicadoEn;
	protected String tieneMateria;
	protected Competicion.SeRelacionaGasto seRelacionaGasto;
	protected Competicion.SeRelacionaRol seRelacionaRol;
	protected String palabraClave;
	protected Competicion.LocalizadoEn localizadoEn;
	protected Competicion.IntervaloDeTiempo intervaloDeTiempo;
	protected String informacionDeContacto;

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
	 * Obtiene el valor de la propiedad presentaDocumento.
	 * 
	 * @return possible object is {@link Competicion.PresentaDocumento }
	 * 
	 */
	public Competicion.PresentaDocumento getPresentaDocumento() {
		return presentaDocumento;
	}

	/**
	 * Define el valor de la propiedad presentaDocumento.
	 * 
	 * @param value allowed object is {@link Competicion.PresentaDocumento }
	 * 
	 */
	public void setPresentaDocumento(Competicion.PresentaDocumento value) {
		this.presentaDocumento = value;
	}

	/**
	 * Obtiene el valor de la propiedad participaOrganizacion.
	 * 
	 * @return possible object is {@link Competicion.ParticipaOrganizacion }
	 * 
	 */
	public Competicion.ParticipaOrganizacion getParticipaOrganizacion() {
		return participaOrganizacion;
	}

	/**
	 * Define el valor de la propiedad participaOrganizacion.
	 * 
	 * @param value allowed object is {@link Competicion.ParticipaOrganizacion }
	 * 
	 */
	public void setParticipaOrganizacion(Competicion.ParticipaOrganizacion value) {
		this.participaOrganizacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad participaPersona.
	 * 
	 * @return possible object is {@link Competicion.ParticipaPersona }
	 * 
	 */
	public Competicion.ParticipaPersona getParticipaPersona() {
		return participaPersona;
	}

	/**
	 * Define el valor de la propiedad participaPersona.
	 * 
	 * @param value allowed object is {@link Competicion.ParticipaPersona }
	 * 
	 */
	public void setParticipaPersona(Competicion.ParticipaPersona value) {
		this.participaPersona = value;
	}

	/**
	 * Obtiene el valor de la propiedad localidad.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * Define el valor de la propiedad localidad.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLocalidad(String value) {
		this.localidad = value;
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
	 * Obtiene el valor de la propiedad ubicadoEn.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUbicadoEn() {
		return ubicadoEn;
	}

	/**
	 * Define el valor de la propiedad ubicadoEn.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setUbicadoEn(String value) {
		this.ubicadoEn = value;
	}

	/**
	 * Obtiene el valor de la propiedad tieneMateria.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTieneMateria() {
		return tieneMateria;
	}

	/**
	 * Define el valor de la propiedad tieneMateria.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTieneMateria(String value) {
		this.tieneMateria = value;
	}

	/**
	 * Obtiene el valor de la propiedad seRelacionaGasto.
	 * 
	 * @return possible object is {@link Competicion.SeRelacionaGasto }
	 * 
	 */
	public Competicion.SeRelacionaGasto getSeRelacionaGasto() {
		return seRelacionaGasto;
	}

	/**
	 * Define el valor de la propiedad seRelacionaGasto.
	 * 
	 * @param value allowed object is {@link Competicion.SeRelacionaGasto }
	 * 
	 */
	public void setSeRelacionaGasto(Competicion.SeRelacionaGasto value) {
		this.seRelacionaGasto = value;
	}

	/**
	 * Obtiene el valor de la propiedad seRelacionaRol.
	 * 
	 * @return possible object is {@link Competicion.SeRelacionaRol }
	 * 
	 */
	public Competicion.SeRelacionaRol getSeRelacionaRol() {
		return seRelacionaRol;
	}

	/**
	 * Define el valor de la propiedad seRelacionaRol.
	 * 
	 * @param value allowed object is {@link Competicion.SeRelacionaRol }
	 * 
	 */
	public void setSeRelacionaRol(Competicion.SeRelacionaRol value) {
		this.seRelacionaRol = value;
	}

	/**
	 * Obtiene el valor de la propiedad palabraClave.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPalabraClave() {
		return palabraClave;
	}

	/**
	 * Define el valor de la propiedad palabraClave.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPalabraClave(String value) {
		this.palabraClave = value;
	}

	/**
	 * Obtiene el valor de la propiedad localizadoEn.
	 * 
	 * @return possible object is {@link Competicion.LocalizadoEn }
	 * 
	 */
	public Competicion.LocalizadoEn getLocalizadoEn() {
		return localizadoEn;
	}

	/**
	 * Define el valor de la propiedad localizadoEn.
	 * 
	 * @param value allowed object is {@link Competicion.LocalizadoEn }
	 * 
	 */
	public void setLocalizadoEn(Competicion.LocalizadoEn value) {
		this.localizadoEn = value;
	}

	/**
	 * Obtiene el valor de la propiedad intervaloDeTiempo.
	 * 
	 * @return possible object is {@link Competicion.IntervaloDeTiempo }
	 * 
	 */
	public Competicion.IntervaloDeTiempo getIntervaloDeTiempo() {
		return intervaloDeTiempo;
	}

	/**
	 * Define el valor de la propiedad intervaloDeTiempo.
	 * 
	 * @param value allowed object is {@link Competicion.IntervaloDeTiempo }
	 * 
	 */
	public void setIntervaloDeTiempo(Competicion.IntervaloDeTiempo value) {
		this.intervaloDeTiempo = value;
	}

	/**
	 * Obtiene el valor de la propiedad informacionDeContacto.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInformacionDeContacto() {
		return informacionDeContacto;
	}

	/**
	 * Define el valor de la propiedad informacionDeContacto.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setInformacionDeContacto(String value) {
		this.informacionDeContacto = value;
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
	public static class LocalizadoEn {

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
	public static class ParticipaOrganizacion {

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
	public static class ParticipaPersona {

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
	 *       &lt;choice maxOccurs="unbounded"&gt;
	 *         &lt;element name="Tema" minOccurs="0"&gt;
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
	 *       &lt;/choice&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "tema" })
	public static class PresentaDocumento {

		@XmlElement(name = "Tema")
		protected List<Competicion.PresentaDocumento.Tema> tema;

		/**
		 * Gets the value of the tema property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot.
		 * Therefore any modification you make to the returned list will be present
		 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
		 * for the tema property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getTema().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link Competicion.PresentaDocumento.Tema }
		 * 
		 * 
		 */
		public List<Competicion.PresentaDocumento.Tema> getTema() {
			if (tema == null) {
				tema = new ArrayList<Competicion.PresentaDocumento.Tema>();
			}
			return this.tema;
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
		public static class Tema {

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
	 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
	 *         &lt;element name="modalidadGasto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="tieneClassificacion" minOccurs="0"&gt;
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
	 *         &lt;element name="cantidadMonetaria" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
	public static class SeRelacionaGasto {

		protected String id;
		protected String titulo;
		protected String moneda;
		protected String descripcion;
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar fecha;
		protected String modalidadGasto;
		protected Competicion.SeRelacionaGasto.TieneClassificacion tieneClassificacion;
		protected BigDecimal cantidadMonetaria;

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
		 * Obtiene el valor de la propiedad moneda.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMoneda() {
			return moneda;
		}

		/**
		 * Define el valor de la propiedad moneda.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setMoneda(String value) {
			this.moneda = value;
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
		 * Obtiene el valor de la propiedad fecha.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getFecha() {
			return fecha;
		}

		/**
		 * Define el valor de la propiedad fecha.
		 * 
		 * @param value allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setFecha(XMLGregorianCalendar value) {
			this.fecha = value;
		}

		/**
		 * Obtiene el valor de la propiedad modalidadGasto.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getModalidadGasto() {
			return modalidadGasto;
		}

		/**
		 * Define el valor de la propiedad modalidadGasto.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setModalidadGasto(String value) {
			this.modalidadGasto = value;
		}

		/**
		 * Obtiene el valor de la propiedad tieneClassificacion.
		 * 
		 * @return possible object is
		 *         {@link Competicion.SeRelacionaGasto.TieneClassificacion }
		 * 
		 */
		public Competicion.SeRelacionaGasto.TieneClassificacion getTieneClassificacion() {
			return tieneClassificacion;
		}

		/**
		 * Define el valor de la propiedad tieneClassificacion.
		 * 
		 * @param value allowed object is
		 *              {@link Competicion.SeRelacionaGasto.TieneClassificacion }
		 * 
		 */
		public void setTieneClassificacion(Competicion.SeRelacionaGasto.TieneClassificacion value) {
			this.tieneClassificacion = value;
		}

		/**
		 * Obtiene el valor de la propiedad cantidadMonetaria.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getCantidadMonetaria() {
			return cantidadMonetaria;
		}

		/**
		 * Define el valor de la propiedad cantidadMonetaria.
		 * 
		 * @param value allowed object is {@link BigDecimal }
		 * 
		 */
		public void setCantidadMonetaria(BigDecimal value) {
			this.cantidadMonetaria = value;
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
		public static class TieneClassificacion {

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
	 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="dedicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="tieneAreaConocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="relacionadoConPatentAplication" minOccurs="0"&gt;
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
	 *         &lt;element name="relacionadoConProyecto" minOccurs="0"&gt;
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
	 *         &lt;element name="relacionadoConRelacion" minOccurs="0"&gt;
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
	 *         &lt;element name="heredaEnPersona"&gt;
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
	 *         &lt;element name="porcentajeDeDedicacion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
	public static class SeRelacionaRol {

		protected String id;
		protected String descripcion;
		protected String dedicacion;
		protected String tieneAreaConocimiento;
		protected Competicion.SeRelacionaRol.RelacionadoConPatentAplication relacionadoConPatentAplication;
		protected Competicion.SeRelacionaRol.RelacionadoConProyecto relacionadoConProyecto;
		protected Competicion.SeRelacionaRol.RelacionadoConRelacion relacionadoConRelacion;
		protected Competicion.SeRelacionaRol.IntervaloDeTiempo intervaloDeTiempo;
		@XmlElement(required = true)
		protected Competicion.SeRelacionaRol.HeredaEnPersona heredaEnPersona;
		protected Double porcentajeDeDedicacion;

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
		 * Obtiene el valor de la propiedad dedicacion.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDedicacion() {
			return dedicacion;
		}

		/**
		 * Define el valor de la propiedad dedicacion.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setDedicacion(String value) {
			this.dedicacion = value;
		}

		/**
		 * Obtiene el valor de la propiedad tieneAreaConocimiento.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTieneAreaConocimiento() {
			return tieneAreaConocimiento;
		}

		/**
		 * Define el valor de la propiedad tieneAreaConocimiento.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setTieneAreaConocimiento(String value) {
			this.tieneAreaConocimiento = value;
		}

		/**
		 * Obtiene el valor de la propiedad relacionadoConPatentAplication.
		 * 
		 * @return possible object is
		 *         {@link Competicion.SeRelacionaRol.RelacionadoConPatentAplication }
		 * 
		 */
		public Competicion.SeRelacionaRol.RelacionadoConPatentAplication getRelacionadoConPatentAplication() {
			return relacionadoConPatentAplication;
		}

		/**
		 * Define el valor de la propiedad relacionadoConPatentAplication.
		 * 
		 * @param value allowed object is
		 *              {@link Competicion.SeRelacionaRol.RelacionadoConPatentAplication }
		 * 
		 */
		public void setRelacionadoConPatentAplication(Competicion.SeRelacionaRol.RelacionadoConPatentAplication value) {
			this.relacionadoConPatentAplication = value;
		}

		/**
		 * Obtiene el valor de la propiedad relacionadoConProyecto.
		 * 
		 * @return possible object is
		 *         {@link Competicion.SeRelacionaRol.RelacionadoConProyecto }
		 * 
		 */
		public Competicion.SeRelacionaRol.RelacionadoConProyecto getRelacionadoConProyecto() {
			return relacionadoConProyecto;
		}

		/**
		 * Define el valor de la propiedad relacionadoConProyecto.
		 * 
		 * @param value allowed object is
		 *              {@link Competicion.SeRelacionaRol.RelacionadoConProyecto }
		 * 
		 */
		public void setRelacionadoConProyecto(Competicion.SeRelacionaRol.RelacionadoConProyecto value) {
			this.relacionadoConProyecto = value;
		}

		/**
		 * Obtiene el valor de la propiedad relacionadoConRelacion.
		 * 
		 * @return possible object is
		 *         {@link Competicion.SeRelacionaRol.RelacionadoConRelacion }
		 * 
		 */
		public Competicion.SeRelacionaRol.RelacionadoConRelacion getRelacionadoConRelacion() {
			return relacionadoConRelacion;
		}

		/**
		 * Define el valor de la propiedad relacionadoConRelacion.
		 * 
		 * @param value allowed object is
		 *              {@link Competicion.SeRelacionaRol.RelacionadoConRelacion }
		 * 
		 */
		public void setRelacionadoConRelacion(Competicion.SeRelacionaRol.RelacionadoConRelacion value) {
			this.relacionadoConRelacion = value;
		}

		/**
		 * Obtiene el valor de la propiedad intervaloDeTiempo.
		 * 
		 * @return possible object is
		 *         {@link Competicion.SeRelacionaRol.IntervaloDeTiempo }
		 * 
		 */
		public Competicion.SeRelacionaRol.IntervaloDeTiempo getIntervaloDeTiempo() {
			return intervaloDeTiempo;
		}

		/**
		 * Define el valor de la propiedad intervaloDeTiempo.
		 * 
		 * @param value allowed object is
		 *              {@link Competicion.SeRelacionaRol.IntervaloDeTiempo }
		 * 
		 */
		public void setIntervaloDeTiempo(Competicion.SeRelacionaRol.IntervaloDeTiempo value) {
			this.intervaloDeTiempo = value;
		}

		/**
		 * Obtiene el valor de la propiedad heredaEnPersona.
		 * 
		 * @return possible object is
		 *         {@link Competicion.SeRelacionaRol.HeredaEnPersona }
		 * 
		 */
		public Competicion.SeRelacionaRol.HeredaEnPersona getHeredaEnPersona() {
			return heredaEnPersona;
		}

		/**
		 * Define el valor de la propiedad heredaEnPersona.
		 * 
		 * @param value allowed object is
		 *              {@link Competicion.SeRelacionaRol.HeredaEnPersona }
		 * 
		 */
		public void setHeredaEnPersona(Competicion.SeRelacionaRol.HeredaEnPersona value) {
			this.heredaEnPersona = value;
		}

		/**
		 * Obtiene el valor de la propiedad porcentajeDeDedicacion.
		 * 
		 * @return possible object is {@link Double }
		 * 
		 */
		public Double getPorcentajeDeDedicacion() {
			return porcentajeDeDedicacion;
		}

		/**
		 * Define el valor de la propiedad porcentajeDeDedicacion.
		 * 
		 * @param value allowed object is {@link Double }
		 * 
		 */
		public void setPorcentajeDeDedicacion(Double value) {
			this.porcentajeDeDedicacion = value;
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
		public static class HeredaEnPersona {

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
		public static class RelacionadoConPatentAplication {

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
		public static class RelacionadoConProyecto {

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
		public static class RelacionadoConRelacion {

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

}

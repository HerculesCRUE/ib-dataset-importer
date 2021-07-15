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
 *         &lt;element name="selloDeExcelencia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
 *         &lt;element name="palabraClaveOrganizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="palabraClaveAgente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organicacionSucesora" minOccurs="0"&gt;
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
 *         &lt;element name="organicacionPredecesora" minOccurs="0"&gt;
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
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="participaEnActividad" minOccurs="0"&gt;
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
 *         &lt;element name="contieneOrganizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="abreviatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tieneRol" minOccurs="0"&gt;
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
 *         &lt;element name="tieneInfrastructuraReservable" minOccurs="0"&gt;
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
 *         &lt;element name="paginaWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localizadoEn" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="geonamesID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="codigoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="popularidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="claseCaracteristica" minOccurs="0"&gt;
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
 *                   &lt;element name="codigoCaracteristica" minOccurs="0"&gt;
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
 *                   &lt;element name="parentAMD1" minOccurs="0"&gt;
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
 *                   &lt;element name="parentAMD2" minOccurs="0"&gt;
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
 *                   &lt;element name="parentAMD3" minOccurs="0"&gt;
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
 *                   &lt;element name="parentAMD4" minOccurs="0"&gt;
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
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tieneAcreditacion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="tituloPersonal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="tieneMateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="fechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="autoridadGobernante" minOccurs="0"&gt;
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
 *                   &lt;element name="acreditadoPorOrganizacion" minOccurs="0"&gt;
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
 *                   &lt;element name="acreditadoPorPersona" minOccurs="0"&gt;
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
 *                   &lt;element name="emitidoPor" minOccurs="0"&gt;
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
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="proveeServicio" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="produceReporte" minOccurs="0"&gt;
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
 *                   &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="provistoPorOrganizacion" minOccurs="0"&gt;
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
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tieneAreaDeConocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tieneInformacionContactoOrganizacion" minOccurs="0"&gt;
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
 *         &lt;element name="tituloPersonal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlRootElement(name = "GrupoDeInvestigacion", namespace = "http://www.openarchives.org/OAI/2.0/")
public class GrupoDeInvestigacion {

	protected String id;
	protected Boolean selloDeExcelencia;
	protected GrupoDeInvestigacion.RelacionadoConRelacion relacionadoConRelacion;
	protected String palabraClaveOrganizacion;
	protected String palabraClaveAgente;
	protected GrupoDeInvestigacion.OrganicacionSucesora organicacionSucesora;
	protected GrupoDeInvestigacion.OrganicacionPredecesora organicacionPredecesora;
	protected String identificador;
	protected GrupoDeInvestigacion.ParticipaEnActividad participaEnActividad;
	protected GrupoDeInvestigacion.IntervaloDeTiempo intervaloDeTiempo;
	protected String contieneOrganizacion;
	protected String abreviatura;
	protected String titulo;
	protected GrupoDeInvestigacion.TieneRol tieneRol;
	protected GrupoDeInvestigacion.TieneInfrastructuraReservable tieneInfrastructuraReservable;
	protected String paginaWeb;
	protected String descripcion;
	protected GrupoDeInvestigacion.LocalizadoEn localizadoEn;
	protected GrupoDeInvestigacion.TieneAcreditacion tieneAcreditacion;
	protected GrupoDeInvestigacion.ProveeServicio proveeServicio;
	protected String tieneAreaDeConocimiento;
	protected GrupoDeInvestigacion.TieneInformacionContactoOrganizacion tieneInformacionContactoOrganizacion;
	protected String tituloPersonal;

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
	 * Obtiene el valor de la propiedad selloDeExcelencia.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isSelloDeExcelencia() {
		return selloDeExcelencia;
	}

	/**
	 * Define el valor de la propiedad selloDeExcelencia.
	 * 
	 * @param value allowed object is {@link Boolean }
	 * 
	 */
	public void setSelloDeExcelencia(Boolean value) {
		this.selloDeExcelencia = value;
	}

	/**
	 * Obtiene el valor de la propiedad relacionadoConRelacion.
	 * 
	 * @return possible object is
	 *         {@link GrupoDeInvestigacion.RelacionadoConRelacion }
	 * 
	 */
	public GrupoDeInvestigacion.RelacionadoConRelacion getRelacionadoConRelacion() {
		return relacionadoConRelacion;
	}

	/**
	 * Define el valor de la propiedad relacionadoConRelacion.
	 * 
	 * @param value allowed object is
	 *              {@link GrupoDeInvestigacion.RelacionadoConRelacion }
	 * 
	 */
	public void setRelacionadoConRelacion(GrupoDeInvestigacion.RelacionadoConRelacion value) {
		this.relacionadoConRelacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad palabraClaveOrganizacion.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPalabraClaveOrganizacion() {
		return palabraClaveOrganizacion;
	}

	/**
	 * Define el valor de la propiedad palabraClaveOrganizacion.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPalabraClaveOrganizacion(String value) {
		this.palabraClaveOrganizacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad palabraClaveAgente.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPalabraClaveAgente() {
		return palabraClaveAgente;
	}

	/**
	 * Define el valor de la propiedad palabraClaveAgente.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPalabraClaveAgente(String value) {
		this.palabraClaveAgente = value;
	}

	/**
	 * Obtiene el valor de la propiedad organicacionSucesora.
	 * 
	 * @return possible object is {@link GrupoDeInvestigacion.OrganicacionSucesora }
	 * 
	 */
	public GrupoDeInvestigacion.OrganicacionSucesora getOrganicacionSucesora() {
		return organicacionSucesora;
	}

	/**
	 * Define el valor de la propiedad organicacionSucesora.
	 * 
	 * @param value allowed object is
	 *              {@link GrupoDeInvestigacion.OrganicacionSucesora }
	 * 
	 */
	public void setOrganicacionSucesora(GrupoDeInvestigacion.OrganicacionSucesora value) {
		this.organicacionSucesora = value;
	}

	/**
	 * Obtiene el valor de la propiedad organicacionPredecesora.
	 * 
	 * @return possible object is
	 *         {@link GrupoDeInvestigacion.OrganicacionPredecesora }
	 * 
	 */
	public GrupoDeInvestigacion.OrganicacionPredecesora getOrganicacionPredecesora() {
		return organicacionPredecesora;
	}

	/**
	 * Define el valor de la propiedad organicacionPredecesora.
	 * 
	 * @param value allowed object is
	 *              {@link GrupoDeInvestigacion.OrganicacionPredecesora }
	 * 
	 */
	public void setOrganicacionPredecesora(GrupoDeInvestigacion.OrganicacionPredecesora value) {
		this.organicacionPredecesora = value;
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
	 * Obtiene el valor de la propiedad participaEnActividad.
	 * 
	 * @return possible object is {@link GrupoDeInvestigacion.ParticipaEnActividad }
	 * 
	 */
	public GrupoDeInvestigacion.ParticipaEnActividad getParticipaEnActividad() {
		return participaEnActividad;
	}

	/**
	 * Define el valor de la propiedad participaEnActividad.
	 * 
	 * @param value allowed object is
	 *              {@link GrupoDeInvestigacion.ParticipaEnActividad }
	 * 
	 */
	public void setParticipaEnActividad(GrupoDeInvestigacion.ParticipaEnActividad value) {
		this.participaEnActividad = value;
	}

	/**
	 * Obtiene el valor de la propiedad intervaloDeTiempo.
	 * 
	 * @return possible object is {@link GrupoDeInvestigacion.IntervaloDeTiempo }
	 * 
	 */
	public GrupoDeInvestigacion.IntervaloDeTiempo getIntervaloDeTiempo() {
		return intervaloDeTiempo;
	}

	/**
	 * Define el valor de la propiedad intervaloDeTiempo.
	 * 
	 * @param value allowed object is
	 *              {@link GrupoDeInvestigacion.IntervaloDeTiempo }
	 * 
	 */
	public void setIntervaloDeTiempo(GrupoDeInvestigacion.IntervaloDeTiempo value) {
		this.intervaloDeTiempo = value;
	}

	/**
	 * Obtiene el valor de la propiedad contieneOrganizacion.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContieneOrganizacion() {
		return contieneOrganizacion;
	}

	/**
	 * Define el valor de la propiedad contieneOrganizacion.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setContieneOrganizacion(String value) {
		this.contieneOrganizacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad abreviatura.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAbreviatura() {
		return abreviatura;
	}

	/**
	 * Define el valor de la propiedad abreviatura.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAbreviatura(String value) {
		this.abreviatura = value;
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
	 * Obtiene el valor de la propiedad tieneRol.
	 * 
	 * @return possible object is {@link GrupoDeInvestigacion.TieneRol }
	 * 
	 */
	public GrupoDeInvestigacion.TieneRol getTieneRol() {
		return tieneRol;
	}

	/**
	 * Define el valor de la propiedad tieneRol.
	 * 
	 * @param value allowed object is {@link GrupoDeInvestigacion.TieneRol }
	 * 
	 */
	public void setTieneRol(GrupoDeInvestigacion.TieneRol value) {
		this.tieneRol = value;
	}

	/**
	 * Obtiene el valor de la propiedad tieneInfrastructuraReservable.
	 * 
	 * @return possible object is
	 *         {@link GrupoDeInvestigacion.TieneInfrastructuraReservable }
	 * 
	 */
	public GrupoDeInvestigacion.TieneInfrastructuraReservable getTieneInfrastructuraReservable() {
		return tieneInfrastructuraReservable;
	}

	/**
	 * Define el valor de la propiedad tieneInfrastructuraReservable.
	 * 
	 * @param value allowed object is
	 *              {@link GrupoDeInvestigacion.TieneInfrastructuraReservable }
	 * 
	 */
	public void setTieneInfrastructuraReservable(GrupoDeInvestigacion.TieneInfrastructuraReservable value) {
		this.tieneInfrastructuraReservable = value;
	}

	/**
	 * Obtiene el valor de la propiedad paginaWeb.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPaginaWeb() {
		return paginaWeb;
	}

	/**
	 * Define el valor de la propiedad paginaWeb.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPaginaWeb(String value) {
		this.paginaWeb = value;
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
	 * Obtiene el valor de la propiedad localizadoEn.
	 * 
	 * @return possible object is {@link GrupoDeInvestigacion.LocalizadoEn }
	 * 
	 */
	public GrupoDeInvestigacion.LocalizadoEn getLocalizadoEn() {
		return localizadoEn;
	}

	/**
	 * Define el valor de la propiedad localizadoEn.
	 * 
	 * @param value allowed object is {@link GrupoDeInvestigacion.LocalizadoEn }
	 * 
	 */
	public void setLocalizadoEn(GrupoDeInvestigacion.LocalizadoEn value) {
		this.localizadoEn = value;
	}

	/**
	 * Obtiene el valor de la propiedad tieneAcreditacion.
	 * 
	 * @return possible object is {@link GrupoDeInvestigacion.TieneAcreditacion }
	 * 
	 */
	public GrupoDeInvestigacion.TieneAcreditacion getTieneAcreditacion() {
		return tieneAcreditacion;
	}

	/**
	 * Define el valor de la propiedad tieneAcreditacion.
	 * 
	 * @param value allowed object is
	 *              {@link GrupoDeInvestigacion.TieneAcreditacion }
	 * 
	 */
	public void setTieneAcreditacion(GrupoDeInvestigacion.TieneAcreditacion value) {
		this.tieneAcreditacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad proveeServicio.
	 * 
	 * @return possible object is {@link GrupoDeInvestigacion.ProveeServicio }
	 * 
	 */
	public GrupoDeInvestigacion.ProveeServicio getProveeServicio() {
		return proveeServicio;
	}

	/**
	 * Define el valor de la propiedad proveeServicio.
	 * 
	 * @param value allowed object is {@link GrupoDeInvestigacion.ProveeServicio }
	 * 
	 */
	public void setProveeServicio(GrupoDeInvestigacion.ProveeServicio value) {
		this.proveeServicio = value;
	}

	/**
	 * Obtiene el valor de la propiedad tieneAreaDeConocimiento.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTieneAreaDeConocimiento() {
		return tieneAreaDeConocimiento;
	}

	/**
	 * Define el valor de la propiedad tieneAreaDeConocimiento.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTieneAreaDeConocimiento(String value) {
		this.tieneAreaDeConocimiento = value;
	}

	/**
	 * Obtiene el valor de la propiedad tieneInformacionContactoOrganizacion.
	 * 
	 * @return possible object is
	 *         {@link GrupoDeInvestigacion.TieneInformacionContactoOrganizacion }
	 * 
	 */
	public GrupoDeInvestigacion.TieneInformacionContactoOrganizacion getTieneInformacionContactoOrganizacion() {
		return tieneInformacionContactoOrganizacion;
	}

	/**
	 * Define el valor de la propiedad tieneInformacionContactoOrganizacion.
	 * 
	 * @param value allowed object is
	 *              {@link GrupoDeInvestigacion.TieneInformacionContactoOrganizacion }
	 * 
	 */
	public void setTieneInformacionContactoOrganizacion(
			GrupoDeInvestigacion.TieneInformacionContactoOrganizacion value) {
		this.tieneInformacionContactoOrganizacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad tituloPersonal.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTituloPersonal() {
		return tituloPersonal;
	}

	/**
	 * Define el valor de la propiedad tituloPersonal.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTituloPersonal(String value) {
		this.tituloPersonal = value;
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
	 *         &lt;element name="geonamesID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="codigoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="popularidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="claseCaracteristica" minOccurs="0"&gt;
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
	 *         &lt;element name="codigoCaracteristica" minOccurs="0"&gt;
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
	 *         &lt;element name="parentAMD1" minOccurs="0"&gt;
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
	 *         &lt;element name="parentAMD2" minOccurs="0"&gt;
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
	 *         &lt;element name="parentAMD3" minOccurs="0"&gt;
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
	 *         &lt;element name="parentAMD4" minOccurs="0"&gt;
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
	public static class LocalizadoEn {

		protected String id;
		protected String geonamesID;
		protected String codigoPais;
		protected String nombre;
		protected String popularidad;
		protected GrupoDeInvestigacion.LocalizadoEn.ClaseCaracteristica claseCaracteristica;
		protected GrupoDeInvestigacion.LocalizadoEn.CodigoCaracteristica codigoCaracteristica;
		protected GrupoDeInvestigacion.LocalizadoEn.ParentAMD1 parentAMD1;
		protected GrupoDeInvestigacion.LocalizadoEn.ParentAMD2 parentAMD2;
		protected GrupoDeInvestigacion.LocalizadoEn.ParentAMD3 parentAMD3;
		protected GrupoDeInvestigacion.LocalizadoEn.ParentAMD4 parentAMD4;

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
		 * Obtiene el valor de la propiedad geonamesID.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getGeonamesID() {
			return geonamesID;
		}

		/**
		 * Define el valor de la propiedad geonamesID.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setGeonamesID(String value) {
			this.geonamesID = value;
		}

		/**
		 * Obtiene el valor de la propiedad codigoPais.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCodigoPais() {
			return codigoPais;
		}

		/**
		 * Define el valor de la propiedad codigoPais.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setCodigoPais(String value) {
			this.codigoPais = value;
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

		/**
		 * Obtiene el valor de la propiedad popularidad.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPopularidad() {
			return popularidad;
		}

		/**
		 * Define el valor de la propiedad popularidad.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setPopularidad(String value) {
			this.popularidad = value;
		}

		/**
		 * Obtiene el valor de la propiedad claseCaracteristica.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.LocalizadoEn.ClaseCaracteristica }
		 * 
		 */
		public GrupoDeInvestigacion.LocalizadoEn.ClaseCaracteristica getClaseCaracteristica() {
			return claseCaracteristica;
		}

		/**
		 * Define el valor de la propiedad claseCaracteristica.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.LocalizadoEn.ClaseCaracteristica }
		 * 
		 */
		public void setClaseCaracteristica(GrupoDeInvestigacion.LocalizadoEn.ClaseCaracteristica value) {
			this.claseCaracteristica = value;
		}

		/**
		 * Obtiene el valor de la propiedad codigoCaracteristica.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.LocalizadoEn.CodigoCaracteristica }
		 * 
		 */
		public GrupoDeInvestigacion.LocalizadoEn.CodigoCaracteristica getCodigoCaracteristica() {
			return codigoCaracteristica;
		}

		/**
		 * Define el valor de la propiedad codigoCaracteristica.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.LocalizadoEn.CodigoCaracteristica }
		 * 
		 */
		public void setCodigoCaracteristica(GrupoDeInvestigacion.LocalizadoEn.CodigoCaracteristica value) {
			this.codigoCaracteristica = value;
		}

		/**
		 * Obtiene el valor de la propiedad parentAMD1.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.LocalizadoEn.ParentAMD1 }
		 * 
		 */
		public GrupoDeInvestigacion.LocalizadoEn.ParentAMD1 getParentAMD1() {
			return parentAMD1;
		}

		/**
		 * Define el valor de la propiedad parentAMD1.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.LocalizadoEn.ParentAMD1 }
		 * 
		 */
		public void setParentAMD1(GrupoDeInvestigacion.LocalizadoEn.ParentAMD1 value) {
			this.parentAMD1 = value;
		}

		/**
		 * Obtiene el valor de la propiedad parentAMD2.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.LocalizadoEn.ParentAMD2 }
		 * 
		 */
		public GrupoDeInvestigacion.LocalizadoEn.ParentAMD2 getParentAMD2() {
			return parentAMD2;
		}

		/**
		 * Define el valor de la propiedad parentAMD2.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.LocalizadoEn.ParentAMD2 }
		 * 
		 */
		public void setParentAMD2(GrupoDeInvestigacion.LocalizadoEn.ParentAMD2 value) {
			this.parentAMD2 = value;
		}

		/**
		 * Obtiene el valor de la propiedad parentAMD3.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.LocalizadoEn.ParentAMD3 }
		 * 
		 */
		public GrupoDeInvestigacion.LocalizadoEn.ParentAMD3 getParentAMD3() {
			return parentAMD3;
		}

		/**
		 * Define el valor de la propiedad parentAMD3.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.LocalizadoEn.ParentAMD3 }
		 * 
		 */
		public void setParentAMD3(GrupoDeInvestigacion.LocalizadoEn.ParentAMD3 value) {
			this.parentAMD3 = value;
		}

		/**
		 * Obtiene el valor de la propiedad parentAMD4.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.LocalizadoEn.ParentAMD4 }
		 * 
		 */
		public GrupoDeInvestigacion.LocalizadoEn.ParentAMD4 getParentAMD4() {
			return parentAMD4;
		}

		/**
		 * Define el valor de la propiedad parentAMD4.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.LocalizadoEn.ParentAMD4 }
		 * 
		 */
		public void setParentAMD4(GrupoDeInvestigacion.LocalizadoEn.ParentAMD4 value) {
			this.parentAMD4 = value;
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
		public static class ClaseCaracteristica {

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
		public static class CodigoCaracteristica {

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
		public static class ParentAMD1 {

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
		public static class ParentAMD2 {

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
		public static class ParentAMD3 {

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
		public static class ParentAMD4 {

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
	public static class OrganicacionPredecesora {

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
	public static class OrganicacionSucesora {

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
	public static class ParticipaEnActividad {

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
	 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="produceReporte" minOccurs="0"&gt;
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
	 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="provistoPorOrganizacion" minOccurs="0"&gt;
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
	public static class ProveeServicio {

		protected String id;
		protected String titulo;
		protected GrupoDeInvestigacion.ProveeServicio.ProduceReporte produceReporte;
		protected String identificador;
		protected String descripcion;
		protected GrupoDeInvestigacion.ProveeServicio.ProvistoPorOrganizacion provistoPorOrganizacion;

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
		 * Obtiene el valor de la propiedad produceReporte.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.ProveeServicio.ProduceReporte }
		 * 
		 */
		public GrupoDeInvestigacion.ProveeServicio.ProduceReporte getProduceReporte() {
			return produceReporte;
		}

		/**
		 * Define el valor de la propiedad produceReporte.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.ProveeServicio.ProduceReporte }
		 * 
		 */
		public void setProduceReporte(GrupoDeInvestigacion.ProveeServicio.ProduceReporte value) {
			this.produceReporte = value;
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
		 * Obtiene el valor de la propiedad provistoPorOrganizacion.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.ProveeServicio.ProvistoPorOrganizacion }
		 * 
		 */
		public GrupoDeInvestigacion.ProveeServicio.ProvistoPorOrganizacion getProvistoPorOrganizacion() {
			return provistoPorOrganizacion;
		}

		/**
		 * Define el valor de la propiedad provistoPorOrganizacion.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.ProveeServicio.ProvistoPorOrganizacion }
		 * 
		 */
		public void setProvistoPorOrganizacion(GrupoDeInvestigacion.ProveeServicio.ProvistoPorOrganizacion value) {
			this.provistoPorOrganizacion = value;
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
		public static class ProduceReporte {

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
		public static class ProvistoPorOrganizacion {

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
	 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="tituloPersonal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *         &lt;element name="tieneMateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="fechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
	 *         &lt;element name="autoridadGobernante" minOccurs="0"&gt;
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
	 *         &lt;element name="acreditadoPorOrganizacion" minOccurs="0"&gt;
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
	 *         &lt;element name="acreditadoPorPersona" minOccurs="0"&gt;
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
	 *         &lt;element name="emitidoPor" minOccurs="0"&gt;
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
	public static class TieneAcreditacion {

		protected String id;
		protected String titulo;
		protected String descripcion;
		@XmlElement(required = true)
		protected String tituloPersonal;
		protected String tieneMateria;
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar fechaPublicacion;
		protected GrupoDeInvestigacion.TieneAcreditacion.AutoridadGobernante autoridadGobernante;
		protected GrupoDeInvestigacion.TieneAcreditacion.AcreditadoPorOrganizacion acreditadoPorOrganizacion;
		protected GrupoDeInvestigacion.TieneAcreditacion.AcreditadoPorPersona acreditadoPorPersona;
		protected GrupoDeInvestigacion.TieneAcreditacion.EmitidoPor emitidoPor;

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
		 * Obtiene el valor de la propiedad tituloPersonal.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTituloPersonal() {
			return tituloPersonal;
		}

		/**
		 * Define el valor de la propiedad tituloPersonal.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setTituloPersonal(String value) {
			this.tituloPersonal = value;
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
		 * Obtiene el valor de la propiedad fechaPublicacion.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getFechaPublicacion() {
			return fechaPublicacion;
		}

		/**
		 * Define el valor de la propiedad fechaPublicacion.
		 * 
		 * @param value allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setFechaPublicacion(XMLGregorianCalendar value) {
			this.fechaPublicacion = value;
		}

		/**
		 * Obtiene el valor de la propiedad autoridadGobernante.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.TieneAcreditacion.AutoridadGobernante }
		 * 
		 */
		public GrupoDeInvestigacion.TieneAcreditacion.AutoridadGobernante getAutoridadGobernante() {
			return autoridadGobernante;
		}

		/**
		 * Define el valor de la propiedad autoridadGobernante.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.TieneAcreditacion.AutoridadGobernante }
		 * 
		 */
		public void setAutoridadGobernante(GrupoDeInvestigacion.TieneAcreditacion.AutoridadGobernante value) {
			this.autoridadGobernante = value;
		}

		/**
		 * Obtiene el valor de la propiedad acreditadoPorOrganizacion.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.TieneAcreditacion.AcreditadoPorOrganizacion }
		 * 
		 */
		public GrupoDeInvestigacion.TieneAcreditacion.AcreditadoPorOrganizacion getAcreditadoPorOrganizacion() {
			return acreditadoPorOrganizacion;
		}

		/**
		 * Define el valor de la propiedad acreditadoPorOrganizacion.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.TieneAcreditacion.AcreditadoPorOrganizacion }
		 * 
		 */
		public void setAcreditadoPorOrganizacion(
				GrupoDeInvestigacion.TieneAcreditacion.AcreditadoPorOrganizacion value) {
			this.acreditadoPorOrganizacion = value;
		}

		/**
		 * Obtiene el valor de la propiedad acreditadoPorPersona.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.TieneAcreditacion.AcreditadoPorPersona }
		 * 
		 */
		public GrupoDeInvestigacion.TieneAcreditacion.AcreditadoPorPersona getAcreditadoPorPersona() {
			return acreditadoPorPersona;
		}

		/**
		 * Define el valor de la propiedad acreditadoPorPersona.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.TieneAcreditacion.AcreditadoPorPersona }
		 * 
		 */
		public void setAcreditadoPorPersona(GrupoDeInvestigacion.TieneAcreditacion.AcreditadoPorPersona value) {
			this.acreditadoPorPersona = value;
		}

		/**
		 * Obtiene el valor de la propiedad emitidoPor.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.TieneAcreditacion.EmitidoPor }
		 * 
		 */
		public GrupoDeInvestigacion.TieneAcreditacion.EmitidoPor getEmitidoPor() {
			return emitidoPor;
		}

		/**
		 * Define el valor de la propiedad emitidoPor.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.TieneAcreditacion.EmitidoPor }
		 * 
		 */
		public void setEmitidoPor(GrupoDeInvestigacion.TieneAcreditacion.EmitidoPor value) {
			this.emitidoPor = value;
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
		public static class AcreditadoPorOrganizacion {

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
		public static class AcreditadoPorPersona {

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
		public static class AutoridadGobernante {

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
		public static class EmitidoPor {

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
	public static class TieneInformacionContactoOrganizacion {

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
	public static class TieneInfrastructuraReservable {

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
	public static class TieneRol {

		protected String id;
		protected String descripcion;
		protected String dedicacion;
		protected String tieneAreaConocimiento;
		protected GrupoDeInvestigacion.TieneRol.RelacionadoConPatentAplication relacionadoConPatentAplication;
		protected GrupoDeInvestigacion.TieneRol.RelacionadoConProyecto relacionadoConProyecto;
		protected GrupoDeInvestigacion.TieneRol.RelacionadoConRelacion relacionadoConRelacion;
		protected GrupoDeInvestigacion.TieneRol.IntervaloDeTiempo intervaloDeTiempo;
		@XmlElement(required = true)
		protected GrupoDeInvestigacion.TieneRol.HeredaEnPersona heredaEnPersona;
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
		 *         {@link GrupoDeInvestigacion.TieneRol.RelacionadoConPatentAplication }
		 * 
		 */
		public GrupoDeInvestigacion.TieneRol.RelacionadoConPatentAplication getRelacionadoConPatentAplication() {
			return relacionadoConPatentAplication;
		}

		/**
		 * Define el valor de la propiedad relacionadoConPatentAplication.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.TieneRol.RelacionadoConPatentAplication }
		 * 
		 */
		public void setRelacionadoConPatentAplication(
				GrupoDeInvestigacion.TieneRol.RelacionadoConPatentAplication value) {
			this.relacionadoConPatentAplication = value;
		}

		/**
		 * Obtiene el valor de la propiedad relacionadoConProyecto.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.TieneRol.RelacionadoConProyecto }
		 * 
		 */
		public GrupoDeInvestigacion.TieneRol.RelacionadoConProyecto getRelacionadoConProyecto() {
			return relacionadoConProyecto;
		}

		/**
		 * Define el valor de la propiedad relacionadoConProyecto.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.TieneRol.RelacionadoConProyecto }
		 * 
		 */
		public void setRelacionadoConProyecto(GrupoDeInvestigacion.TieneRol.RelacionadoConProyecto value) {
			this.relacionadoConProyecto = value;
		}

		/**
		 * Obtiene el valor de la propiedad relacionadoConRelacion.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.TieneRol.RelacionadoConRelacion }
		 * 
		 */
		public GrupoDeInvestigacion.TieneRol.RelacionadoConRelacion getRelacionadoConRelacion() {
			return relacionadoConRelacion;
		}

		/**
		 * Define el valor de la propiedad relacionadoConRelacion.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.TieneRol.RelacionadoConRelacion }
		 * 
		 */
		public void setRelacionadoConRelacion(GrupoDeInvestigacion.TieneRol.RelacionadoConRelacion value) {
			this.relacionadoConRelacion = value;
		}

		/**
		 * Obtiene el valor de la propiedad intervaloDeTiempo.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.TieneRol.IntervaloDeTiempo }
		 * 
		 */
		public GrupoDeInvestigacion.TieneRol.IntervaloDeTiempo getIntervaloDeTiempo() {
			return intervaloDeTiempo;
		}

		/**
		 * Define el valor de la propiedad intervaloDeTiempo.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.TieneRol.IntervaloDeTiempo }
		 * 
		 */
		public void setIntervaloDeTiempo(GrupoDeInvestigacion.TieneRol.IntervaloDeTiempo value) {
			this.intervaloDeTiempo = value;
		}

		/**
		 * Obtiene el valor de la propiedad heredaEnPersona.
		 * 
		 * @return possible object is
		 *         {@link GrupoDeInvestigacion.TieneRol.HeredaEnPersona }
		 * 
		 */
		public GrupoDeInvestigacion.TieneRol.HeredaEnPersona getHeredaEnPersona() {
			return heredaEnPersona;
		}

		/**
		 * Define el valor de la propiedad heredaEnPersona.
		 * 
		 * @param value allowed object is
		 *              {@link GrupoDeInvestigacion.TieneRol.HeredaEnPersona }
		 * 
		 */
		public void setHeredaEnPersona(GrupoDeInvestigacion.TieneRol.HeredaEnPersona value) {
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

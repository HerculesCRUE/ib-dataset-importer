//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.01 a las 10:35:31 AM CET 
//

package es.um.asio.importer.oaipmh.model.xsd;

import java.math.BigDecimal;

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
 *         &lt;element name="produceObjetoInvestigacion" minOccurs="0"&gt;
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
 *         &lt;element name="modalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gastoProyecto" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="fechaTiempo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="modalidadGasto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="tieneClasificacion" minOccurs="0"&gt;
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
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contieneProyecto" minOccurs="0"&gt;
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
 *         &lt;element name="abreviatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tieneContratoProyecto" minOccurs="0"&gt;
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
 *         &lt;element name="tieneCategorizacionProyecto" minOccurs="0"&gt;
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
 *         &lt;element name="tieneAreaConocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relacionadoConDossier" minOccurs="0"&gt;
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
 *         &lt;element name="relacionadoConReporteEtico" minOccurs="0"&gt;
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
 *         &lt;element name="relacionadoConJustificacion" minOccurs="0"&gt;
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
 *         &lt;element name="relacionadoConRol" minOccurs="0"&gt;
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
 *         &lt;element name="palabraClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="necesitaValidacionEtica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
 *         &lt;element name="financiadoPor" minOccurs="0"&gt;
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
 *         &lt;element name="fechaDeJustificacionPrevista" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="estadoDelProyecto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tieneClasificacionRRHH" minOccurs="0"&gt;
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
 *         &lt;element name="apoyadoPorFinanciacion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="contieneMontoFinanciacion" minOccurs="0"&gt;
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
 *                   &lt;element name="apoyaContratoTrabajo" minOccurs="0"&gt;
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
 *                   &lt;element name="apoyaContratoProyecto" minOccurs="0"&gt;
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
 *                   &lt;element name="tieneContrato" minOccurs="0"&gt;
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
 *                   &lt;element name="tieneAreaConocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *                   &lt;element name="financiadoPor" minOccurs="0"&gt;
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
 *                   &lt;element name="financiacionPublica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="relacionConAuditoria" minOccurs="0"&gt;
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
@XmlRootElement(name = "Proyecto", namespace = "http://www.openarchives.org/OAI/2.0/")
public class Proyecto {

	protected String id;
	@XmlElement(required = true)
	protected String titulo;
	protected Proyecto.ProduceObjetoInvestigacion produceObjetoInvestigacion;
	protected String modalidad;
	protected String identificador;
	protected Proyecto.GastoProyecto gastoProyecto;
	protected String descripcion;
	protected Proyecto.ContieneProyecto contieneProyecto;
	protected String abreviatura;
	protected Proyecto.TieneContratoProyecto tieneContratoProyecto;
	protected Proyecto.TieneCategorizacionProyecto tieneCategorizacionProyecto;
	protected String tieneAreaConocimiento;
	protected Proyecto.RelacionadoConDossier relacionadoConDossier;
	protected Proyecto.RelacionadoConReporteEtico relacionadoConReporteEtico;
	protected Proyecto.RelacionadoConJustificacion relacionadoConJustificacion;
	protected Proyecto.RelacionadoConRol relacionadoConRol;
	protected Proyecto.ParticipaEnActividad participaEnActividad;
	protected String palabraClave;
	protected Boolean necesitaValidacionEtica;
	protected Proyecto.LocalizadoEn localizadoEn;
	protected Proyecto.IntervaloDeTiempo intervaloDeTiempo;
	protected Proyecto.FinanciadoPor financiadoPor;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar fechaDeJustificacionPrevista;
	protected String estadoDelProyecto;
	protected Proyecto.TieneClasificacionRRHH tieneClasificacionRRHH;
	protected Proyecto.ApoyadoPorFinanciacion apoyadoPorFinanciacion;
	protected Proyecto.RelacionConAuditoria relacionConAuditoria;

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
	 * Obtiene el valor de la propiedad produceObjetoInvestigacion.
	 * 
	 * @return possible object is {@link Proyecto.ProduceObjetoInvestigacion }
	 * 
	 */
	public Proyecto.ProduceObjetoInvestigacion getProduceObjetoInvestigacion() {
		return produceObjetoInvestigacion;
	}

	/**
	 * Define el valor de la propiedad produceObjetoInvestigacion.
	 * 
	 * @param value allowed object is {@link Proyecto.ProduceObjetoInvestigacion }
	 * 
	 */
	public void setProduceObjetoInvestigacion(Proyecto.ProduceObjetoInvestigacion value) {
		this.produceObjetoInvestigacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad modalidad.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModalidad() {
		return modalidad;
	}

	/**
	 * Define el valor de la propiedad modalidad.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setModalidad(String value) {
		this.modalidad = value;
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
	 * Obtiene el valor de la propiedad gastoProyecto.
	 * 
	 * @return possible object is {@link Proyecto.GastoProyecto }
	 * 
	 */
	public Proyecto.GastoProyecto getGastoProyecto() {
		return gastoProyecto;
	}

	/**
	 * Define el valor de la propiedad gastoProyecto.
	 * 
	 * @param value allowed object is {@link Proyecto.GastoProyecto }
	 * 
	 */
	public void setGastoProyecto(Proyecto.GastoProyecto value) {
		this.gastoProyecto = value;
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
	 * Obtiene el valor de la propiedad contieneProyecto.
	 * 
	 * @return possible object is {@link Proyecto.ContieneProyecto }
	 * 
	 */
	public Proyecto.ContieneProyecto getContieneProyecto() {
		return contieneProyecto;
	}

	/**
	 * Define el valor de la propiedad contieneProyecto.
	 * 
	 * @param value allowed object is {@link Proyecto.ContieneProyecto }
	 * 
	 */
	public void setContieneProyecto(Proyecto.ContieneProyecto value) {
		this.contieneProyecto = value;
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
	 * Obtiene el valor de la propiedad tieneContratoProyecto.
	 * 
	 * @return possible object is {@link Proyecto.TieneContratoProyecto }
	 * 
	 */
	public Proyecto.TieneContratoProyecto getTieneContratoProyecto() {
		return tieneContratoProyecto;
	}

	/**
	 * Define el valor de la propiedad tieneContratoProyecto.
	 * 
	 * @param value allowed object is {@link Proyecto.TieneContratoProyecto }
	 * 
	 */
	public void setTieneContratoProyecto(Proyecto.TieneContratoProyecto value) {
		this.tieneContratoProyecto = value;
	}

	/**
	 * Obtiene el valor de la propiedad tieneCategorizacionProyecto.
	 * 
	 * @return possible object is {@link Proyecto.TieneCategorizacionProyecto }
	 * 
	 */
	public Proyecto.TieneCategorizacionProyecto getTieneCategorizacionProyecto() {
		return tieneCategorizacionProyecto;
	}

	/**
	 * Define el valor de la propiedad tieneCategorizacionProyecto.
	 * 
	 * @param value allowed object is {@link Proyecto.TieneCategorizacionProyecto }
	 * 
	 */
	public void setTieneCategorizacionProyecto(Proyecto.TieneCategorizacionProyecto value) {
		this.tieneCategorizacionProyecto = value;
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
	 * Obtiene el valor de la propiedad relacionadoConDossier.
	 * 
	 * @return possible object is {@link Proyecto.RelacionadoConDossier }
	 * 
	 */
	public Proyecto.RelacionadoConDossier getRelacionadoConDossier() {
		return relacionadoConDossier;
	}

	/**
	 * Define el valor de la propiedad relacionadoConDossier.
	 * 
	 * @param value allowed object is {@link Proyecto.RelacionadoConDossier }
	 * 
	 */
	public void setRelacionadoConDossier(Proyecto.RelacionadoConDossier value) {
		this.relacionadoConDossier = value;
	}

	/**
	 * Obtiene el valor de la propiedad relacionadoConReporteEtico.
	 * 
	 * @return possible object is {@link Proyecto.RelacionadoConReporteEtico }
	 * 
	 */
	public Proyecto.RelacionadoConReporteEtico getRelacionadoConReporteEtico() {
		return relacionadoConReporteEtico;
	}

	/**
	 * Define el valor de la propiedad relacionadoConReporteEtico.
	 * 
	 * @param value allowed object is {@link Proyecto.RelacionadoConReporteEtico }
	 * 
	 */
	public void setRelacionadoConReporteEtico(Proyecto.RelacionadoConReporteEtico value) {
		this.relacionadoConReporteEtico = value;
	}

	/**
	 * Obtiene el valor de la propiedad relacionadoConJustificacion.
	 * 
	 * @return possible object is {@link Proyecto.RelacionadoConJustificacion }
	 * 
	 */
	public Proyecto.RelacionadoConJustificacion getRelacionadoConJustificacion() {
		return relacionadoConJustificacion;
	}

	/**
	 * Define el valor de la propiedad relacionadoConJustificacion.
	 * 
	 * @param value allowed object is {@link Proyecto.RelacionadoConJustificacion }
	 * 
	 */
	public void setRelacionadoConJustificacion(Proyecto.RelacionadoConJustificacion value) {
		this.relacionadoConJustificacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad relacionadoConRol.
	 * 
	 * @return possible object is {@link Proyecto.RelacionadoConRol }
	 * 
	 */
	public Proyecto.RelacionadoConRol getRelacionadoConRol() {
		return relacionadoConRol;
	}

	/**
	 * Define el valor de la propiedad relacionadoConRol.
	 * 
	 * @param value allowed object is {@link Proyecto.RelacionadoConRol }
	 * 
	 */
	public void setRelacionadoConRol(Proyecto.RelacionadoConRol value) {
		this.relacionadoConRol = value;
	}

	/**
	 * Obtiene el valor de la propiedad participaEnActividad.
	 * 
	 * @return possible object is {@link Proyecto.ParticipaEnActividad }
	 * 
	 */
	public Proyecto.ParticipaEnActividad getParticipaEnActividad() {
		return participaEnActividad;
	}

	/**
	 * Define el valor de la propiedad participaEnActividad.
	 * 
	 * @param value allowed object is {@link Proyecto.ParticipaEnActividad }
	 * 
	 */
	public void setParticipaEnActividad(Proyecto.ParticipaEnActividad value) {
		this.participaEnActividad = value;
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
	 * Obtiene el valor de la propiedad necesitaValidacionEtica.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isNecesitaValidacionEtica() {
		return necesitaValidacionEtica;
	}

	/**
	 * Define el valor de la propiedad necesitaValidacionEtica.
	 * 
	 * @param value allowed object is {@link Boolean }
	 * 
	 */
	public void setNecesitaValidacionEtica(Boolean value) {
		this.necesitaValidacionEtica = value;
	}

	/**
	 * Obtiene el valor de la propiedad localizadoEn.
	 * 
	 * @return possible object is {@link Proyecto.LocalizadoEn }
	 * 
	 */
	public Proyecto.LocalizadoEn getLocalizadoEn() {
		return localizadoEn;
	}

	/**
	 * Define el valor de la propiedad localizadoEn.
	 * 
	 * @param value allowed object is {@link Proyecto.LocalizadoEn }
	 * 
	 */
	public void setLocalizadoEn(Proyecto.LocalizadoEn value) {
		this.localizadoEn = value;
	}

	/**
	 * Obtiene el valor de la propiedad intervaloDeTiempo.
	 * 
	 * @return possible object is {@link Proyecto.IntervaloDeTiempo }
	 * 
	 */
	public Proyecto.IntervaloDeTiempo getIntervaloDeTiempo() {
		return intervaloDeTiempo;
	}

	/**
	 * Define el valor de la propiedad intervaloDeTiempo.
	 * 
	 * @param value allowed object is {@link Proyecto.IntervaloDeTiempo }
	 * 
	 */
	public void setIntervaloDeTiempo(Proyecto.IntervaloDeTiempo value) {
		this.intervaloDeTiempo = value;
	}

	/**
	 * Obtiene el valor de la propiedad financiadoPor.
	 * 
	 * @return possible object is {@link Proyecto.FinanciadoPor }
	 * 
	 */
	public Proyecto.FinanciadoPor getFinanciadoPor() {
		return financiadoPor;
	}

	/**
	 * Define el valor de la propiedad financiadoPor.
	 * 
	 * @param value allowed object is {@link Proyecto.FinanciadoPor }
	 * 
	 */
	public void setFinanciadoPor(Proyecto.FinanciadoPor value) {
		this.financiadoPor = value;
	}

	/**
	 * Obtiene el valor de la propiedad fechaDeJustificacionPrevista.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getFechaDeJustificacionPrevista() {
		return fechaDeJustificacionPrevista;
	}

	/**
	 * Define el valor de la propiedad fechaDeJustificacionPrevista.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setFechaDeJustificacionPrevista(XMLGregorianCalendar value) {
		this.fechaDeJustificacionPrevista = value;
	}

	/**
	 * Obtiene el valor de la propiedad estadoDelProyecto.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEstadoDelProyecto() {
		return estadoDelProyecto;
	}

	/**
	 * Define el valor de la propiedad estadoDelProyecto.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEstadoDelProyecto(String value) {
		this.estadoDelProyecto = value;
	}

	/**
	 * Obtiene el valor de la propiedad tieneClasificacionRRHH.
	 * 
	 * @return possible object is {@link Proyecto.TieneClasificacionRRHH }
	 * 
	 */
	public Proyecto.TieneClasificacionRRHH getTieneClasificacionRRHH() {
		return tieneClasificacionRRHH;
	}

	/**
	 * Define el valor de la propiedad tieneClasificacionRRHH.
	 * 
	 * @param value allowed object is {@link Proyecto.TieneClasificacionRRHH }
	 * 
	 */
	public void setTieneClasificacionRRHH(Proyecto.TieneClasificacionRRHH value) {
		this.tieneClasificacionRRHH = value;
	}

	/**
	 * Obtiene el valor de la propiedad apoyadoPorFinanciacion.
	 * 
	 * @return possible object is {@link Proyecto.ApoyadoPorFinanciacion }
	 * 
	 */
	public Proyecto.ApoyadoPorFinanciacion getApoyadoPorFinanciacion() {
		return apoyadoPorFinanciacion;
	}

	/**
	 * Define el valor de la propiedad apoyadoPorFinanciacion.
	 * 
	 * @param value allowed object is {@link Proyecto.ApoyadoPorFinanciacion }
	 * 
	 */
	public void setApoyadoPorFinanciacion(Proyecto.ApoyadoPorFinanciacion value) {
		this.apoyadoPorFinanciacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad relacionConAuditoria.
	 * 
	 * @return possible object is {@link Proyecto.RelacionConAuditoria }
	 * 
	 */
	public Proyecto.RelacionConAuditoria getRelacionConAuditoria() {
		return relacionConAuditoria;
	}

	/**
	 * Define el valor de la propiedad relacionConAuditoria.
	 * 
	 * @param value allowed object is {@link Proyecto.RelacionConAuditoria }
	 * 
	 */
	public void setRelacionConAuditoria(Proyecto.RelacionConAuditoria value) {
		this.relacionConAuditoria = value;
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
	 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *         &lt;element name="contieneMontoFinanciacion" minOccurs="0"&gt;
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
	 *         &lt;element name="apoyaContratoTrabajo" minOccurs="0"&gt;
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
	 *         &lt;element name="apoyaContratoProyecto" minOccurs="0"&gt;
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
	 *         &lt;element name="tieneContrato" minOccurs="0"&gt;
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
	 *         &lt;element name="tieneAreaConocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
	 *         &lt;element name="financiadoPor" minOccurs="0"&gt;
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
	 *         &lt;element name="financiacionPublica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
	public static class ApoyadoPorFinanciacion {

		protected String id;
		@XmlElement(required = true)
		protected String identificador;
		protected Proyecto.ApoyadoPorFinanciacion.ContieneMontoFinanciacion contieneMontoFinanciacion;
		protected Proyecto.ApoyadoPorFinanciacion.ApoyaContratoTrabajo apoyaContratoTrabajo;
		protected Proyecto.ApoyadoPorFinanciacion.ApoyaContratoProyecto apoyaContratoProyecto;
		protected Proyecto.ApoyadoPorFinanciacion.TieneContrato tieneContrato;
		protected String tieneAreaConocimiento;
		protected Proyecto.ApoyadoPorFinanciacion.IntervaloDeTiempo intervaloDeTiempo;
		protected Proyecto.ApoyadoPorFinanciacion.FinanciadoPor financiadoPor;
		protected Boolean financiacionPublica;

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
		 * Obtiene el valor de la propiedad contieneMontoFinanciacion.
		 * 
		 * @return possible object is
		 *         {@link Proyecto.ApoyadoPorFinanciacion.ContieneMontoFinanciacion }
		 * 
		 */
		public Proyecto.ApoyadoPorFinanciacion.ContieneMontoFinanciacion getContieneMontoFinanciacion() {
			return contieneMontoFinanciacion;
		}

		/**
		 * Define el valor de la propiedad contieneMontoFinanciacion.
		 * 
		 * @param value allowed object is
		 *              {@link Proyecto.ApoyadoPorFinanciacion.ContieneMontoFinanciacion }
		 * 
		 */
		public void setContieneMontoFinanciacion(Proyecto.ApoyadoPorFinanciacion.ContieneMontoFinanciacion value) {
			this.contieneMontoFinanciacion = value;
		}

		/**
		 * Obtiene el valor de la propiedad apoyaContratoTrabajo.
		 * 
		 * @return possible object is
		 *         {@link Proyecto.ApoyadoPorFinanciacion.ApoyaContratoTrabajo }
		 * 
		 */
		public Proyecto.ApoyadoPorFinanciacion.ApoyaContratoTrabajo getApoyaContratoTrabajo() {
			return apoyaContratoTrabajo;
		}

		/**
		 * Define el valor de la propiedad apoyaContratoTrabajo.
		 * 
		 * @param value allowed object is
		 *              {@link Proyecto.ApoyadoPorFinanciacion.ApoyaContratoTrabajo }
		 * 
		 */
		public void setApoyaContratoTrabajo(Proyecto.ApoyadoPorFinanciacion.ApoyaContratoTrabajo value) {
			this.apoyaContratoTrabajo = value;
		}

		/**
		 * Obtiene el valor de la propiedad apoyaContratoProyecto.
		 * 
		 * @return possible object is
		 *         {@link Proyecto.ApoyadoPorFinanciacion.ApoyaContratoProyecto }
		 * 
		 */
		public Proyecto.ApoyadoPorFinanciacion.ApoyaContratoProyecto getApoyaContratoProyecto() {
			return apoyaContratoProyecto;
		}

		/**
		 * Define el valor de la propiedad apoyaContratoProyecto.
		 * 
		 * @param value allowed object is
		 *              {@link Proyecto.ApoyadoPorFinanciacion.ApoyaContratoProyecto }
		 * 
		 */
		public void setApoyaContratoProyecto(Proyecto.ApoyadoPorFinanciacion.ApoyaContratoProyecto value) {
			this.apoyaContratoProyecto = value;
		}

		/**
		 * Obtiene el valor de la propiedad tieneContrato.
		 * 
		 * @return possible object is
		 *         {@link Proyecto.ApoyadoPorFinanciacion.TieneContrato }
		 * 
		 */
		public Proyecto.ApoyadoPorFinanciacion.TieneContrato getTieneContrato() {
			return tieneContrato;
		}

		/**
		 * Define el valor de la propiedad tieneContrato.
		 * 
		 * @param value allowed object is
		 *              {@link Proyecto.ApoyadoPorFinanciacion.TieneContrato }
		 * 
		 */
		public void setTieneContrato(Proyecto.ApoyadoPorFinanciacion.TieneContrato value) {
			this.tieneContrato = value;
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
		 * Obtiene el valor de la propiedad intervaloDeTiempo.
		 * 
		 * @return possible object is
		 *         {@link Proyecto.ApoyadoPorFinanciacion.IntervaloDeTiempo }
		 * 
		 */
		public Proyecto.ApoyadoPorFinanciacion.IntervaloDeTiempo getIntervaloDeTiempo() {
			return intervaloDeTiempo;
		}

		/**
		 * Define el valor de la propiedad intervaloDeTiempo.
		 * 
		 * @param value allowed object is
		 *              {@link Proyecto.ApoyadoPorFinanciacion.IntervaloDeTiempo }
		 * 
		 */
		public void setIntervaloDeTiempo(Proyecto.ApoyadoPorFinanciacion.IntervaloDeTiempo value) {
			this.intervaloDeTiempo = value;
		}

		/**
		 * Obtiene el valor de la propiedad financiadoPor.
		 * 
		 * @return possible object is
		 *         {@link Proyecto.ApoyadoPorFinanciacion.FinanciadoPor }
		 * 
		 */
		public Proyecto.ApoyadoPorFinanciacion.FinanciadoPor getFinanciadoPor() {
			return financiadoPor;
		}

		/**
		 * Define el valor de la propiedad financiadoPor.
		 * 
		 * @param value allowed object is
		 *              {@link Proyecto.ApoyadoPorFinanciacion.FinanciadoPor }
		 * 
		 */
		public void setFinanciadoPor(Proyecto.ApoyadoPorFinanciacion.FinanciadoPor value) {
			this.financiadoPor = value;
		}

		/**
		 * Obtiene el valor de la propiedad financiacionPublica.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isFinanciacionPublica() {
			return financiacionPublica;
		}

		/**
		 * Define el valor de la propiedad financiacionPublica.
		 * 
		 * @param value allowed object is {@link Boolean }
		 * 
		 */
		public void setFinanciacionPublica(Boolean value) {
			this.financiacionPublica = value;
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
		public static class ApoyaContratoProyecto {

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
		public static class ApoyaContratoTrabajo {

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
		public static class ContieneMontoFinanciacion {

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
		public static class FinanciadoPor {

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
		public static class TieneContrato {

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
	public static class ContieneProyecto {

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
	public static class FinanciadoPor {

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
	 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="fechaTiempo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
	 *         &lt;element name="modalidadGasto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="tieneClasificacion" minOccurs="0"&gt;
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
	public static class GastoProyecto {

		protected String id;
		protected String titulo;
		protected String moneda;
		protected String descripcion;
		@XmlSchemaType(name = "dateTime")
		protected XMLGregorianCalendar fechaTiempo;
		protected String modalidadGasto;
		protected Proyecto.GastoProyecto.TieneClasificacion tieneClasificacion;
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
		 * Obtiene el valor de la propiedad fechaTiempo.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getFechaTiempo() {
			return fechaTiempo;
		}

		/**
		 * Define el valor de la propiedad fechaTiempo.
		 * 
		 * @param value allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setFechaTiempo(XMLGregorianCalendar value) {
			this.fechaTiempo = value;
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
		 * Obtiene el valor de la propiedad tieneClasificacion.
		 * 
		 * @return possible object is {@link Proyecto.GastoProyecto.TieneClasificacion }
		 * 
		 */
		public Proyecto.GastoProyecto.TieneClasificacion getTieneClasificacion() {
			return tieneClasificacion;
		}

		/**
		 * Define el valor de la propiedad tieneClasificacion.
		 * 
		 * @param value allowed object is
		 *              {@link Proyecto.GastoProyecto.TieneClasificacion }
		 * 
		 */
		public void setTieneClasificacion(Proyecto.GastoProyecto.TieneClasificacion value) {
			this.tieneClasificacion = value;
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
		public static class TieneClasificacion {

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
	public static class ProduceObjetoInvestigacion {

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
	public static class RelacionConAuditoria {

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
	public static class RelacionadoConDossier {

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
	public static class RelacionadoConJustificacion {

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
	public static class RelacionadoConReporteEtico {

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
	public static class RelacionadoConRol {

		protected String id;
		protected String descripcion;
		protected String dedicacion;
		protected String tieneAreaConocimiento;
		protected Proyecto.RelacionadoConRol.RelacionadoConPatentAplication relacionadoConPatentAplication;
		protected Proyecto.RelacionadoConRol.RelacionadoConProyecto relacionadoConProyecto;
		protected Proyecto.RelacionadoConRol.RelacionadoConRelacion relacionadoConRelacion;
		protected Proyecto.RelacionadoConRol.IntervaloDeTiempo intervaloDeTiempo;
		@XmlElement(required = true)
		protected Proyecto.RelacionadoConRol.HeredaEnPersona heredaEnPersona;
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
		 *         {@link Proyecto.RelacionadoConRol.RelacionadoConPatentAplication }
		 * 
		 */
		public Proyecto.RelacionadoConRol.RelacionadoConPatentAplication getRelacionadoConPatentAplication() {
			return relacionadoConPatentAplication;
		}

		/**
		 * Define el valor de la propiedad relacionadoConPatentAplication.
		 * 
		 * @param value allowed object is
		 *              {@link Proyecto.RelacionadoConRol.RelacionadoConPatentAplication }
		 * 
		 */
		public void setRelacionadoConPatentAplication(Proyecto.RelacionadoConRol.RelacionadoConPatentAplication value) {
			this.relacionadoConPatentAplication = value;
		}

		/**
		 * Obtiene el valor de la propiedad relacionadoConProyecto.
		 * 
		 * @return possible object is
		 *         {@link Proyecto.RelacionadoConRol.RelacionadoConProyecto }
		 * 
		 */
		public Proyecto.RelacionadoConRol.RelacionadoConProyecto getRelacionadoConProyecto() {
			return relacionadoConProyecto;
		}

		/**
		 * Define el valor de la propiedad relacionadoConProyecto.
		 * 
		 * @param value allowed object is
		 *              {@link Proyecto.RelacionadoConRol.RelacionadoConProyecto }
		 * 
		 */
		public void setRelacionadoConProyecto(Proyecto.RelacionadoConRol.RelacionadoConProyecto value) {
			this.relacionadoConProyecto = value;
		}

		/**
		 * Obtiene el valor de la propiedad relacionadoConRelacion.
		 * 
		 * @return possible object is
		 *         {@link Proyecto.RelacionadoConRol.RelacionadoConRelacion }
		 * 
		 */
		public Proyecto.RelacionadoConRol.RelacionadoConRelacion getRelacionadoConRelacion() {
			return relacionadoConRelacion;
		}

		/**
		 * Define el valor de la propiedad relacionadoConRelacion.
		 * 
		 * @param value allowed object is
		 *              {@link Proyecto.RelacionadoConRol.RelacionadoConRelacion }
		 * 
		 */
		public void setRelacionadoConRelacion(Proyecto.RelacionadoConRol.RelacionadoConRelacion value) {
			this.relacionadoConRelacion = value;
		}

		/**
		 * Obtiene el valor de la propiedad intervaloDeTiempo.
		 * 
		 * @return possible object is
		 *         {@link Proyecto.RelacionadoConRol.IntervaloDeTiempo }
		 * 
		 */
		public Proyecto.RelacionadoConRol.IntervaloDeTiempo getIntervaloDeTiempo() {
			return intervaloDeTiempo;
		}

		/**
		 * Define el valor de la propiedad intervaloDeTiempo.
		 * 
		 * @param value allowed object is
		 *              {@link Proyecto.RelacionadoConRol.IntervaloDeTiempo }
		 * 
		 */
		public void setIntervaloDeTiempo(Proyecto.RelacionadoConRol.IntervaloDeTiempo value) {
			this.intervaloDeTiempo = value;
		}

		/**
		 * Obtiene el valor de la propiedad heredaEnPersona.
		 * 
		 * @return possible object is
		 *         {@link Proyecto.RelacionadoConRol.HeredaEnPersona }
		 * 
		 */
		public Proyecto.RelacionadoConRol.HeredaEnPersona getHeredaEnPersona() {
			return heredaEnPersona;
		}

		/**
		 * Define el valor de la propiedad heredaEnPersona.
		 * 
		 * @param value allowed object is
		 *              {@link Proyecto.RelacionadoConRol.HeredaEnPersona }
		 * 
		 */
		public void setHeredaEnPersona(Proyecto.RelacionadoConRol.HeredaEnPersona value) {
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
	public static class TieneCategorizacionProyecto {

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
	public static class TieneClasificacionRRHH {

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
	public static class TieneContratoProyecto {

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

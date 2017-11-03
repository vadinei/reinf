//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.11.03 às 03:05:53 PM GFT 
//

package com.vadinei.reinf.batch.operacao.schema.evento.tomadorservico;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import com.vadinei.reinf.batch.operacao.schema.comum.SignatureType;

/**
 * <p>
 * Classe Java de anonymous complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evtServTom">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="indRetif">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                                   &lt;minInclusive value="1"/>
 *                                   &lt;maxInclusive value="2"/>
 *                                   &lt;pattern value="[1|2]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrRecibo" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="16"/>
 *                                   &lt;maxLength value="52"/>
 *                                   &lt;pattern value="[0-9]{1,18}[-][0-9]{2}[-][0-9]{4}[-][0-9]{4}[-][0-9]{1,18}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="perApur">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}gYearMonth">
 *                                   &lt;pattern value="2{1}0{1}[0-9]{2}-[0-1]{1}[0-9]{1}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpAmb">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                                   &lt;minInclusive value="1"/>
 *                                   &lt;maxInclusive value="3"/>
 *                                   &lt;pattern value="[1-3]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="procEmi">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                                   &lt;minInclusive value="1"/>
 *                                   &lt;maxInclusive value="2"/>
 *                                   &lt;pattern value="[1|2]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="verProc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ideContri">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpInsc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                                   &lt;minInclusive value="1"/>
 *                                   &lt;maxInclusive value="2"/>
 *                                   &lt;pattern value="[1|2]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrInsc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[0-9]{8}|[0-9]{14}|[0-9]{11}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoServTom">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ideEstabObra">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpInscEstab">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                                             &lt;minInclusive value="1"/>
 *                                             &lt;maxInclusive value="4"/>
 *                                             &lt;pattern value="[1|4]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nrInscEstab">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="14"/>
 *                                             &lt;pattern value="[0-9]{3,14}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="indObra">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                                             &lt;minInclusive value="0"/>
 *                                             &lt;maxInclusive value="2"/>
 *                                             &lt;pattern value="[0-2]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="idePrestServ">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cnpjPrestador">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="3"/>
 *                                                       &lt;maxLength value="14"/>
 *                                                       &lt;pattern value="[0-9]{3,14}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vlrTotalBruto">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="4"/>
 *                                                       &lt;maxLength value="17"/>
 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vlrTotalBaseRet">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="4"/>
 *                                                       &lt;maxLength value="17"/>
 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vlrTotalRetPrinc">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="4"/>
 *                                                       &lt;maxLength value="17"/>
 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vlrTotalRetAdic" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="4"/>
 *                                                       &lt;maxLength value="17"/>
 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vlrTotalNRetPrinc" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="4"/>
 *                                                       &lt;maxLength value="17"/>
 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vlrTotalNRetAdic" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="4"/>
 *                                                       &lt;maxLength value="17"/>
 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="indCPRB">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                                                       &lt;minInclusive value="0"/>
 *                                                       &lt;maxInclusive value="1"/>
 *                                                       &lt;pattern value="[0|1]"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nfs" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="serie">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="5"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="numDocto">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="15"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="dtEmissaoNF">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vlrBruto">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="4"/>
 *                                                                 &lt;maxLength value="17"/>
 *                                                                 &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="obs" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="250"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="infoTpServ" maxOccurs="9">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="tpServico">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;length value="9"/>
 *                                                                           &lt;pattern value="[0-9]{9}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="vlrBaseRet">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="4"/>
 *                                                                           &lt;maxLength value="17"/>
 *                                                                           &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="vlrRetencao">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="4"/>
 *                                                                           &lt;maxLength value="17"/>
 *                                                                           &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="vlrRetSub" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="4"/>
 *                                                                           &lt;maxLength value="17"/>
 *                                                                           &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="vlrNRetPrinc" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="4"/>
 *                                                                           &lt;maxLength value="17"/>
 *                                                                           &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="vlrServicos15" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="4"/>
 *                                                                           &lt;maxLength value="17"/>
 *                                                                           &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="vlrServicos20" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="4"/>
 *                                                                           &lt;maxLength value="17"/>
 *                                                                           &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="vlrServicos25" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="4"/>
 *                                                                           &lt;maxLength value="17"/>
 *                                                                           &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="vlrAdicional" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="4"/>
 *                                                                           &lt;maxLength value="17"/>
 *                                                                           &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="vlrNRetAdic" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="4"/>
 *                                                                           &lt;maxLength value="17"/>
 *                                                                           &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoProcRetPr" maxOccurs="50" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpProcRetPrinc">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                                                                 &lt;minInclusive value="1"/>
 *                                                                 &lt;maxInclusive value="2"/>
 *                                                                 &lt;pattern value="[1-2]{1}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nrProcRetPrinc">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="21"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="codSuspPrinc" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                                 &lt;maxInclusive value="99999999999999"/>
 *                                                                 &lt;pattern value="[0-9]{1,14}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="valorPrinc">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="4"/>
 *                                                                 &lt;maxLength value="17"/>
 *                                                                 &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoProcRetAd" maxOccurs="50" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpProcRetAdic">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *                                                                 &lt;minInclusive value="1"/>
 *                                                                 &lt;maxInclusive value="2"/>
 *                                                                 &lt;pattern value="[1-2]{1}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nrProcRetAdic">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="21"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="codSuspAdic" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *                                                                 &lt;maxInclusive value="99999999999999"/>
 *                                                                 &lt;pattern value="[0-9]{1,14}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="valorAdic">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="4"/>
 *                                                                 &lt;maxLength value="17"/>
 *                                                                 &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *                       &lt;length value="36"/>
 *                       &lt;pattern value="I{1}D{1}[0-9]{34}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "evtServTom", "signature" })
@XmlRootElement(name = "Reinf", namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
public class Reinf {

	@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
	protected Reinf.EvtServTom evtServTom;
	@XmlElement(name = "Signature", required = true)
	protected SignatureType signature;

	/**
	 * Obtém o valor da propriedade evtServTom.
	 * 
	 * @return possible object is {@link Reinf.EvtServTom }
	 * 
	 */
	public Reinf.EvtServTom getEvtServTom() {
		return evtServTom;
	}

	/**
	 * Define o valor da propriedade evtServTom.
	 * 
	 * @param value
	 *            allowed object is {@link Reinf.EvtServTom }
	 * 
	 */
	public void setEvtServTom(final Reinf.EvtServTom value) {
		evtServTom = value;
	}

	/**
	 * Obtém o valor da propriedade signature.
	 * 
	 * @return possible object is {@link SignatureType }
	 * 
	 */
	public SignatureType getSignature() {
		return signature;
	}

	/**
	 * Define o valor da propriedade signature.
	 * 
	 * @param value
	 *            allowed object is {@link SignatureType }
	 * 
	 */
	public void setSignature(final SignatureType value) {
		signature = value;
	}

	/**
	 * <p>
	 * Classe Java de anonymous complex type.
	 * 
	 * <p>
	 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
	 * desta classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="ideEvento">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="indRetif">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
	 *                         &lt;minInclusive value="1"/>
	 *                         &lt;maxInclusive value="2"/>
	 *                         &lt;pattern value="[1|2]"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="nrRecibo" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;minLength value="16"/>
	 *                         &lt;maxLength value="52"/>
	 *                         &lt;pattern value="[0-9]{1,18}[-][0-9]{2}[-][0-9]{4}[-][0-9]{4}[-][0-9]{1,18}"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="perApur">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}gYearMonth">
	 *                         &lt;pattern value="2{1}0{1}[0-9]{2}-[0-1]{1}[0-9]{1}"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="tpAmb">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
	 *                         &lt;minInclusive value="1"/>
	 *                         &lt;maxInclusive value="3"/>
	 *                         &lt;pattern value="[1-3]"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="procEmi">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
	 *                         &lt;minInclusive value="1"/>
	 *                         &lt;maxInclusive value="2"/>
	 *                         &lt;pattern value="[1|2]"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="verProc">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;minLength value="1"/>
	 *                         &lt;maxLength value="20"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ideContri">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="tpInsc">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
	 *                         &lt;minInclusive value="1"/>
	 *                         &lt;maxInclusive value="2"/>
	 *                         &lt;pattern value="[1|2]"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="nrInsc">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;pattern value="[0-9]{8}|[0-9]{14}|[0-9]{11}"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="infoServTom">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="ideEstabObra">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="tpInscEstab">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
	 *                                   &lt;minInclusive value="1"/>
	 *                                   &lt;maxInclusive value="4"/>
	 *                                   &lt;pattern value="[1|4]"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="nrInscEstab">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;minLength value="3"/>
	 *                                   &lt;maxLength value="14"/>
	 *                                   &lt;pattern value="[0-9]{3,14}"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="indObra">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
	 *                                   &lt;minInclusive value="0"/>
	 *                                   &lt;maxInclusive value="2"/>
	 *                                   &lt;pattern value="[0-2]"/>
	 *                                 &lt;/restriction>
	 *                               &lt;/simpleType>
	 *                             &lt;/element>
	 *                             &lt;element name="idePrestServ">
	 *                               &lt;complexType>
	 *                                 &lt;complexContent>
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                     &lt;sequence>
	 *                                       &lt;element name="cnpjPrestador">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;minLength value="3"/>
	 *                                             &lt;maxLength value="14"/>
	 *                                             &lt;pattern value="[0-9]{3,14}"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="vlrTotalBruto">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;minLength value="4"/>
	 *                                             &lt;maxLength value="17"/>
	 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="vlrTotalBaseRet">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;minLength value="4"/>
	 *                                             &lt;maxLength value="17"/>
	 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="vlrTotalRetPrinc">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;minLength value="4"/>
	 *                                             &lt;maxLength value="17"/>
	 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="vlrTotalRetAdic" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;minLength value="4"/>
	 *                                             &lt;maxLength value="17"/>
	 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="vlrTotalNRetPrinc" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;minLength value="4"/>
	 *                                             &lt;maxLength value="17"/>
	 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="vlrTotalNRetAdic" minOccurs="0">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                             &lt;minLength value="4"/>
	 *                                             &lt;maxLength value="17"/>
	 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="indCPRB">
	 *                                         &lt;simpleType>
	 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
	 *                                             &lt;minInclusive value="0"/>
	 *                                             &lt;maxInclusive value="1"/>
	 *                                             &lt;pattern value="[0|1]"/>
	 *                                           &lt;/restriction>
	 *                                         &lt;/simpleType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="nfs" maxOccurs="unbounded">
	 *                                         &lt;complexType>
	 *                                           &lt;complexContent>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                               &lt;sequence>
	 *                                                 &lt;element name="serie">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;minLength value="1"/>
	 *                                                       &lt;maxLength value="5"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="numDocto">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;minLength value="1"/>
	 *                                                       &lt;maxLength value="15"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="dtEmissaoNF">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="vlrBruto">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;minLength value="4"/>
	 *                                                       &lt;maxLength value="17"/>
	 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="obs" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;minLength value="1"/>
	 *                                                       &lt;maxLength value="250"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="infoTpServ" maxOccurs="9">
	 *                                                   &lt;complexType>
	 *                                                     &lt;complexContent>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                                         &lt;sequence>
	 *                                                           &lt;element name="tpServico">
	 *                                                             &lt;simpleType>
	 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                                 &lt;length value="9"/>
	 *                                                                 &lt;pattern value="[0-9]{9}"/>
	 *                                                               &lt;/restriction>
	 *                                                             &lt;/simpleType>
	 *                                                           &lt;/element>
	 *                                                           &lt;element name="vlrBaseRet">
	 *                                                             &lt;simpleType>
	 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                                 &lt;minLength value="4"/>
	 *                                                                 &lt;maxLength value="17"/>
	 *                                                                 &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                                               &lt;/restriction>
	 *                                                             &lt;/simpleType>
	 *                                                           &lt;/element>
	 *                                                           &lt;element name="vlrRetencao">
	 *                                                             &lt;simpleType>
	 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                                 &lt;minLength value="4"/>
	 *                                                                 &lt;maxLength value="17"/>
	 *                                                                 &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                                               &lt;/restriction>
	 *                                                             &lt;/simpleType>
	 *                                                           &lt;/element>
	 *                                                           &lt;element name="vlrRetSub" minOccurs="0">
	 *                                                             &lt;simpleType>
	 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                                 &lt;minLength value="4"/>
	 *                                                                 &lt;maxLength value="17"/>
	 *                                                                 &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                                               &lt;/restriction>
	 *                                                             &lt;/simpleType>
	 *                                                           &lt;/element>
	 *                                                           &lt;element name="vlrNRetPrinc" minOccurs="0">
	 *                                                             &lt;simpleType>
	 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                                 &lt;minLength value="4"/>
	 *                                                                 &lt;maxLength value="17"/>
	 *                                                                 &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                                               &lt;/restriction>
	 *                                                             &lt;/simpleType>
	 *                                                           &lt;/element>
	 *                                                           &lt;element name="vlrServicos15" minOccurs="0">
	 *                                                             &lt;simpleType>
	 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                                 &lt;minLength value="4"/>
	 *                                                                 &lt;maxLength value="17"/>
	 *                                                                 &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                                               &lt;/restriction>
	 *                                                             &lt;/simpleType>
	 *                                                           &lt;/element>
	 *                                                           &lt;element name="vlrServicos20" minOccurs="0">
	 *                                                             &lt;simpleType>
	 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                                 &lt;minLength value="4"/>
	 *                                                                 &lt;maxLength value="17"/>
	 *                                                                 &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                                               &lt;/restriction>
	 *                                                             &lt;/simpleType>
	 *                                                           &lt;/element>
	 *                                                           &lt;element name="vlrServicos25" minOccurs="0">
	 *                                                             &lt;simpleType>
	 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                                 &lt;minLength value="4"/>
	 *                                                                 &lt;maxLength value="17"/>
	 *                                                                 &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                                               &lt;/restriction>
	 *                                                             &lt;/simpleType>
	 *                                                           &lt;/element>
	 *                                                           &lt;element name="vlrAdicional" minOccurs="0">
	 *                                                             &lt;simpleType>
	 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                                 &lt;minLength value="4"/>
	 *                                                                 &lt;maxLength value="17"/>
	 *                                                                 &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                                               &lt;/restriction>
	 *                                                             &lt;/simpleType>
	 *                                                           &lt;/element>
	 *                                                           &lt;element name="vlrNRetAdic" minOccurs="0">
	 *                                                             &lt;simpleType>
	 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                                 &lt;minLength value="4"/>
	 *                                                                 &lt;maxLength value="17"/>
	 *                                                                 &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                                               &lt;/restriction>
	 *                                                             &lt;/simpleType>
	 *                                                           &lt;/element>
	 *                                                         &lt;/sequence>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/complexContent>
	 *                                                   &lt;/complexType>
	 *                                                 &lt;/element>
	 *                                               &lt;/sequence>
	 *                                             &lt;/restriction>
	 *                                           &lt;/complexContent>
	 *                                         &lt;/complexType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="infoProcRetPr" maxOccurs="50" minOccurs="0">
	 *                                         &lt;complexType>
	 *                                           &lt;complexContent>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                               &lt;sequence>
	 *                                                 &lt;element name="tpProcRetPrinc">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
	 *                                                       &lt;minInclusive value="1"/>
	 *                                                       &lt;maxInclusive value="2"/>
	 *                                                       &lt;pattern value="[1-2]{1}"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="nrProcRetPrinc">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;minLength value="1"/>
	 *                                                       &lt;maxLength value="21"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="codSuspPrinc" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
	 *                                                       &lt;maxInclusive value="99999999999999"/>
	 *                                                       &lt;pattern value="[0-9]{1,14}"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="valorPrinc">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;minLength value="4"/>
	 *                                                       &lt;maxLength value="17"/>
	 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                               &lt;/sequence>
	 *                                             &lt;/restriction>
	 *                                           &lt;/complexContent>
	 *                                         &lt;/complexType>
	 *                                       &lt;/element>
	 *                                       &lt;element name="infoProcRetAd" maxOccurs="50" minOccurs="0">
	 *                                         &lt;complexType>
	 *                                           &lt;complexContent>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                               &lt;sequence>
	 *                                                 &lt;element name="tpProcRetAdic">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
	 *                                                       &lt;minInclusive value="1"/>
	 *                                                       &lt;maxInclusive value="2"/>
	 *                                                       &lt;pattern value="[1-2]{1}"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="nrProcRetAdic">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;minLength value="1"/>
	 *                                                       &lt;maxLength value="21"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="codSuspAdic" minOccurs="0">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
	 *                                                       &lt;maxInclusive value="99999999999999"/>
	 *                                                       &lt;pattern value="[0-9]{1,14}"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                                 &lt;element name="valorAdic">
	 *                                                   &lt;simpleType>
	 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                       &lt;minLength value="4"/>
	 *                                                       &lt;maxLength value="17"/>
	 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
	 *                                                     &lt;/restriction>
	 *                                                   &lt;/simpleType>
	 *                                                 &lt;/element>
	 *                                               &lt;/sequence>
	 *                                             &lt;/restriction>
	 *                                           &lt;/complexContent>
	 *                                         &lt;/complexType>
	 *                                       &lt;/element>
	 *                                     &lt;/sequence>
	 *                                   &lt;/restriction>
	 *                                 &lt;/complexContent>
	 *                               &lt;/complexType>
	 *                             &lt;/element>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *       &lt;attribute name="id" use="required">
	 *         &lt;simpleType>
	 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
	 *             &lt;length value="36"/>
	 *             &lt;pattern value="I{1}D{1}[0-9]{34}"/>
	 *           &lt;/restriction>
	 *         &lt;/simpleType>
	 *       &lt;/attribute>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "ideEvento", "ideContri", "infoServTom" })
	public static class EvtServTom {

		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
		protected Reinf.EvtServTom.IdeEvento ideEvento;
		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
		protected Reinf.EvtServTom.IdeContri ideContri;
		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
		protected Reinf.EvtServTom.InfoServTom infoServTom;
		@XmlAttribute(name = "id", required = true)
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		protected String id;

		/**
		 * Obtém o valor da propriedade ideEvento.
		 * 
		 * @return possible object is {@link Reinf.EvtServTom.IdeEvento }
		 * 
		 */
		public Reinf.EvtServTom.IdeEvento getIdeEvento() {
			return ideEvento;
		}

		/**
		 * Define o valor da propriedade ideEvento.
		 * 
		 * @param value
		 *            allowed object is {@link Reinf.EvtServTom.IdeEvento }
		 * 
		 */
		public void setIdeEvento(final Reinf.EvtServTom.IdeEvento value) {
			ideEvento = value;
		}

		/**
		 * Obtém o valor da propriedade ideContri.
		 * 
		 * @return possible object is {@link Reinf.EvtServTom.IdeContri }
		 * 
		 */
		public Reinf.EvtServTom.IdeContri getIdeContri() {
			return ideContri;
		}

		/**
		 * Define o valor da propriedade ideContri.
		 * 
		 * @param value
		 *            allowed object is {@link Reinf.EvtServTom.IdeContri }
		 * 
		 */
		public void setIdeContri(final Reinf.EvtServTom.IdeContri value) {
			ideContri = value;
		}

		/**
		 * Obtém o valor da propriedade infoServTom.
		 * 
		 * @return possible object is {@link Reinf.EvtServTom.InfoServTom }
		 * 
		 */
		public Reinf.EvtServTom.InfoServTom getInfoServTom() {
			return infoServTom;
		}

		/**
		 * Define o valor da propriedade infoServTom.
		 * 
		 * @param value
		 *            allowed object is {@link Reinf.EvtServTom.InfoServTom }
		 * 
		 */
		public void setInfoServTom(final Reinf.EvtServTom.InfoServTom value) {
			infoServTom = value;
		}

		/**
		 * Obtém o valor da propriedade id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define o valor da propriedade id.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setId(final String value) {
			id = value;
		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
		 * desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="tpInsc">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
		 *               &lt;minInclusive value="1"/>
		 *               &lt;maxInclusive value="2"/>
		 *               &lt;pattern value="[1|2]"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="nrInsc">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;pattern value="[0-9]{8}|[0-9]{14}|[0-9]{11}"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "tpInsc", "nrInsc" })
		public static class IdeContri {

			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
			protected short tpInsc;
			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
			protected String nrInsc;

			/**
			 * Obtém o valor da propriedade tpInsc.
			 * 
			 */
			public short getTpInsc() {
				return tpInsc;
			}

			/**
			 * Define o valor da propriedade tpInsc.
			 * 
			 */
			public void setTpInsc(final short value) {
				tpInsc = value;
			}

			/**
			 * Obtém o valor da propriedade nrInsc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNrInsc() {
				return nrInsc;
			}

			/**
			 * Define o valor da propriedade nrInsc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNrInsc(final String value) {
				nrInsc = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
		 * desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="indRetif">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
		 *               &lt;minInclusive value="1"/>
		 *               &lt;maxInclusive value="2"/>
		 *               &lt;pattern value="[1|2]"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="nrRecibo" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;minLength value="16"/>
		 *               &lt;maxLength value="52"/>
		 *               &lt;pattern value="[0-9]{1,18}[-][0-9]{2}[-][0-9]{4}[-][0-9]{4}[-][0-9]{1,18}"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="perApur">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}gYearMonth">
		 *               &lt;pattern value="2{1}0{1}[0-9]{2}-[0-1]{1}[0-9]{1}"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="tpAmb">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
		 *               &lt;minInclusive value="1"/>
		 *               &lt;maxInclusive value="3"/>
		 *               &lt;pattern value="[1-3]"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="procEmi">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
		 *               &lt;minInclusive value="1"/>
		 *               &lt;maxInclusive value="2"/>
		 *               &lt;pattern value="[1|2]"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="verProc">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;minLength value="1"/>
		 *               &lt;maxLength value="20"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "indRetif", "nrRecibo", "perApur", "tpAmb", "procEmi", "verProc" })
		public static class IdeEvento {

			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
			protected short indRetif;
			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
			protected String nrRecibo;
			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
			protected XMLGregorianCalendar perApur;
			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
			protected short tpAmb;
			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
			protected short procEmi;
			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
			protected String verProc;

			/**
			 * Obtém o valor da propriedade indRetif.
			 * 
			 */
			public short getIndRetif() {
				return indRetif;
			}

			/**
			 * Define o valor da propriedade indRetif.
			 * 
			 */
			public void setIndRetif(final short value) {
				indRetif = value;
			}

			/**
			 * Obtém o valor da propriedade nrRecibo.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNrRecibo() {
				return nrRecibo;
			}

			/**
			 * Define o valor da propriedade nrRecibo.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNrRecibo(final String value) {
				nrRecibo = value;
			}

			/**
			 * Obtém o valor da propriedade perApur.
			 * 
			 * @return possible object is {@link XMLGregorianCalendar }
			 * 
			 */
			public XMLGregorianCalendar getPerApur() {
				return perApur;
			}

			/**
			 * Define o valor da propriedade perApur.
			 * 
			 * @param value
			 *            allowed object is {@link XMLGregorianCalendar }
			 * 
			 */
			public void setPerApur(final XMLGregorianCalendar value) {
				perApur = value;
			}

			/**
			 * Obtém o valor da propriedade tpAmb.
			 * 
			 */
			public short getTpAmb() {
				return tpAmb;
			}

			/**
			 * Define o valor da propriedade tpAmb.
			 * 
			 */
			public void setTpAmb(final short value) {
				tpAmb = value;
			}

			/**
			 * Obtém o valor da propriedade procEmi.
			 * 
			 */
			public short getProcEmi() {
				return procEmi;
			}

			/**
			 * Define o valor da propriedade procEmi.
			 * 
			 */
			public void setProcEmi(final short value) {
				procEmi = value;
			}

			/**
			 * Obtém o valor da propriedade verProc.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVerProc() {
				return verProc;
			}

			/**
			 * Define o valor da propriedade verProc.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVerProc(final String value) {
				verProc = value;
			}

		}

		/**
		 * <p>
		 * Classe Java de anonymous complex type.
		 * 
		 * <p>
		 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
		 * desta classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="ideEstabObra">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="tpInscEstab">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
		 *                         &lt;minInclusive value="1"/>
		 *                         &lt;maxInclusive value="4"/>
		 *                         &lt;pattern value="[1|4]"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="nrInscEstab">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;minLength value="3"/>
		 *                         &lt;maxLength value="14"/>
		 *                         &lt;pattern value="[0-9]{3,14}"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="indObra">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
		 *                         &lt;minInclusive value="0"/>
		 *                         &lt;maxInclusive value="2"/>
		 *                         &lt;pattern value="[0-2]"/>
		 *                       &lt;/restriction>
		 *                     &lt;/simpleType>
		 *                   &lt;/element>
		 *                   &lt;element name="idePrestServ">
		 *                     &lt;complexType>
		 *                       &lt;complexContent>
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                           &lt;sequence>
		 *                             &lt;element name="cnpjPrestador">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;minLength value="3"/>
		 *                                   &lt;maxLength value="14"/>
		 *                                   &lt;pattern value="[0-9]{3,14}"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="vlrTotalBruto">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;minLength value="4"/>
		 *                                   &lt;maxLength value="17"/>
		 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="vlrTotalBaseRet">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;minLength value="4"/>
		 *                                   &lt;maxLength value="17"/>
		 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="vlrTotalRetPrinc">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;minLength value="4"/>
		 *                                   &lt;maxLength value="17"/>
		 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="vlrTotalRetAdic" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;minLength value="4"/>
		 *                                   &lt;maxLength value="17"/>
		 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="vlrTotalNRetPrinc" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;minLength value="4"/>
		 *                                   &lt;maxLength value="17"/>
		 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="vlrTotalNRetAdic" minOccurs="0">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                   &lt;minLength value="4"/>
		 *                                   &lt;maxLength value="17"/>
		 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="indCPRB">
		 *                               &lt;simpleType>
		 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
		 *                                   &lt;minInclusive value="0"/>
		 *                                   &lt;maxInclusive value="1"/>
		 *                                   &lt;pattern value="[0|1]"/>
		 *                                 &lt;/restriction>
		 *                               &lt;/simpleType>
		 *                             &lt;/element>
		 *                             &lt;element name="nfs" maxOccurs="unbounded">
		 *                               &lt;complexType>
		 *                                 &lt;complexContent>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                     &lt;sequence>
		 *                                       &lt;element name="serie">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                             &lt;minLength value="1"/>
		 *                                             &lt;maxLength value="5"/>
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                       &lt;element name="numDocto">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                             &lt;minLength value="1"/>
		 *                                             &lt;maxLength value="15"/>
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                       &lt;element name="dtEmissaoNF">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                       &lt;element name="vlrBruto">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                             &lt;minLength value="4"/>
		 *                                             &lt;maxLength value="17"/>
		 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                       &lt;element name="obs" minOccurs="0">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                             &lt;minLength value="1"/>
		 *                                             &lt;maxLength value="250"/>
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                       &lt;element name="infoTpServ" maxOccurs="9">
		 *                                         &lt;complexType>
		 *                                           &lt;complexContent>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                               &lt;sequence>
		 *                                                 &lt;element name="tpServico">
		 *                                                   &lt;simpleType>
		 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                                       &lt;length value="9"/>
		 *                                                       &lt;pattern value="[0-9]{9}"/>
		 *                                                     &lt;/restriction>
		 *                                                   &lt;/simpleType>
		 *                                                 &lt;/element>
		 *                                                 &lt;element name="vlrBaseRet">
		 *                                                   &lt;simpleType>
		 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                                       &lt;minLength value="4"/>
		 *                                                       &lt;maxLength value="17"/>
		 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                                     &lt;/restriction>
		 *                                                   &lt;/simpleType>
		 *                                                 &lt;/element>
		 *                                                 &lt;element name="vlrRetencao">
		 *                                                   &lt;simpleType>
		 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                                       &lt;minLength value="4"/>
		 *                                                       &lt;maxLength value="17"/>
		 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                                     &lt;/restriction>
		 *                                                   &lt;/simpleType>
		 *                                                 &lt;/element>
		 *                                                 &lt;element name="vlrRetSub" minOccurs="0">
		 *                                                   &lt;simpleType>
		 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                                       &lt;minLength value="4"/>
		 *                                                       &lt;maxLength value="17"/>
		 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                                     &lt;/restriction>
		 *                                                   &lt;/simpleType>
		 *                                                 &lt;/element>
		 *                                                 &lt;element name="vlrNRetPrinc" minOccurs="0">
		 *                                                   &lt;simpleType>
		 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                                       &lt;minLength value="4"/>
		 *                                                       &lt;maxLength value="17"/>
		 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                                     &lt;/restriction>
		 *                                                   &lt;/simpleType>
		 *                                                 &lt;/element>
		 *                                                 &lt;element name="vlrServicos15" minOccurs="0">
		 *                                                   &lt;simpleType>
		 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                                       &lt;minLength value="4"/>
		 *                                                       &lt;maxLength value="17"/>
		 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                                     &lt;/restriction>
		 *                                                   &lt;/simpleType>
		 *                                                 &lt;/element>
		 *                                                 &lt;element name="vlrServicos20" minOccurs="0">
		 *                                                   &lt;simpleType>
		 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                                       &lt;minLength value="4"/>
		 *                                                       &lt;maxLength value="17"/>
		 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                                     &lt;/restriction>
		 *                                                   &lt;/simpleType>
		 *                                                 &lt;/element>
		 *                                                 &lt;element name="vlrServicos25" minOccurs="0">
		 *                                                   &lt;simpleType>
		 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                                       &lt;minLength value="4"/>
		 *                                                       &lt;maxLength value="17"/>
		 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                                     &lt;/restriction>
		 *                                                   &lt;/simpleType>
		 *                                                 &lt;/element>
		 *                                                 &lt;element name="vlrAdicional" minOccurs="0">
		 *                                                   &lt;simpleType>
		 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                                       &lt;minLength value="4"/>
		 *                                                       &lt;maxLength value="17"/>
		 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                                     &lt;/restriction>
		 *                                                   &lt;/simpleType>
		 *                                                 &lt;/element>
		 *                                                 &lt;element name="vlrNRetAdic" minOccurs="0">
		 *                                                   &lt;simpleType>
		 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                                       &lt;minLength value="4"/>
		 *                                                       &lt;maxLength value="17"/>
		 *                                                       &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                                     &lt;/restriction>
		 *                                                   &lt;/simpleType>
		 *                                                 &lt;/element>
		 *                                               &lt;/sequence>
		 *                                             &lt;/restriction>
		 *                                           &lt;/complexContent>
		 *                                         &lt;/complexType>
		 *                                       &lt;/element>
		 *                                     &lt;/sequence>
		 *                                   &lt;/restriction>
		 *                                 &lt;/complexContent>
		 *                               &lt;/complexType>
		 *                             &lt;/element>
		 *                             &lt;element name="infoProcRetPr" maxOccurs="50" minOccurs="0">
		 *                               &lt;complexType>
		 *                                 &lt;complexContent>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                     &lt;sequence>
		 *                                       &lt;element name="tpProcRetPrinc">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
		 *                                             &lt;minInclusive value="1"/>
		 *                                             &lt;maxInclusive value="2"/>
		 *                                             &lt;pattern value="[1-2]{1}"/>
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                       &lt;element name="nrProcRetPrinc">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                             &lt;minLength value="1"/>
		 *                                             &lt;maxLength value="21"/>
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                       &lt;element name="codSuspPrinc" minOccurs="0">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
		 *                                             &lt;maxInclusive value="99999999999999"/>
		 *                                             &lt;pattern value="[0-9]{1,14}"/>
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                       &lt;element name="valorPrinc">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                             &lt;minLength value="4"/>
		 *                                             &lt;maxLength value="17"/>
		 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                     &lt;/sequence>
		 *                                   &lt;/restriction>
		 *                                 &lt;/complexContent>
		 *                               &lt;/complexType>
		 *                             &lt;/element>
		 *                             &lt;element name="infoProcRetAd" maxOccurs="50" minOccurs="0">
		 *                               &lt;complexType>
		 *                                 &lt;complexContent>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                     &lt;sequence>
		 *                                       &lt;element name="tpProcRetAdic">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
		 *                                             &lt;minInclusive value="1"/>
		 *                                             &lt;maxInclusive value="2"/>
		 *                                             &lt;pattern value="[1-2]{1}"/>
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                       &lt;element name="nrProcRetAdic">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                             &lt;minLength value="1"/>
		 *                                             &lt;maxLength value="21"/>
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                       &lt;element name="codSuspAdic" minOccurs="0">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
		 *                                             &lt;maxInclusive value="99999999999999"/>
		 *                                             &lt;pattern value="[0-9]{1,14}"/>
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                       &lt;element name="valorAdic">
		 *                                         &lt;simpleType>
		 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                             &lt;minLength value="4"/>
		 *                                             &lt;maxLength value="17"/>
		 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
		 *                                           &lt;/restriction>
		 *                                         &lt;/simpleType>
		 *                                       &lt;/element>
		 *                                     &lt;/sequence>
		 *                                   &lt;/restriction>
		 *                                 &lt;/complexContent>
		 *                               &lt;/complexType>
		 *                             &lt;/element>
		 *                           &lt;/sequence>
		 *                         &lt;/restriction>
		 *                       &lt;/complexContent>
		 *                     &lt;/complexType>
		 *                   &lt;/element>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "ideEstabObra" })
		public static class InfoServTom {

			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
			protected Reinf.EvtServTom.InfoServTom.IdeEstabObra ideEstabObra;

			/**
			 * Obtém o valor da propriedade ideEstabObra.
			 * 
			 * @return possible object is {@link Reinf.EvtServTom.InfoServTom.IdeEstabObra }
			 * 
			 */
			public Reinf.EvtServTom.InfoServTom.IdeEstabObra getIdeEstabObra() {
				return ideEstabObra;
			}

			/**
			 * Define o valor da propriedade ideEstabObra.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link Reinf.EvtServTom.InfoServTom.IdeEstabObra }
			 * 
			 */
			public void setIdeEstabObra(final Reinf.EvtServTom.InfoServTom.IdeEstabObra value) {
				ideEstabObra = value;
			}

			/**
			 * <p>
			 * Classe Java de anonymous complex type.
			 * 
			 * <p>
			 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
			 * desta classe.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="tpInscEstab">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
			 *               &lt;minInclusive value="1"/>
			 *               &lt;maxInclusive value="4"/>
			 *               &lt;pattern value="[1|4]"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="nrInscEstab">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;minLength value="3"/>
			 *               &lt;maxLength value="14"/>
			 *               &lt;pattern value="[0-9]{3,14}"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="indObra">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
			 *               &lt;minInclusive value="0"/>
			 *               &lt;maxInclusive value="2"/>
			 *               &lt;pattern value="[0-2]"/>
			 *             &lt;/restriction>
			 *           &lt;/simpleType>
			 *         &lt;/element>
			 *         &lt;element name="idePrestServ">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="cnpjPrestador">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;minLength value="3"/>
			 *                         &lt;maxLength value="14"/>
			 *                         &lt;pattern value="[0-9]{3,14}"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="vlrTotalBruto">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;minLength value="4"/>
			 *                         &lt;maxLength value="17"/>
			 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="vlrTotalBaseRet">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;minLength value="4"/>
			 *                         &lt;maxLength value="17"/>
			 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="vlrTotalRetPrinc">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;minLength value="4"/>
			 *                         &lt;maxLength value="17"/>
			 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="vlrTotalRetAdic" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;minLength value="4"/>
			 *                         &lt;maxLength value="17"/>
			 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="vlrTotalNRetPrinc" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;minLength value="4"/>
			 *                         &lt;maxLength value="17"/>
			 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="vlrTotalNRetAdic" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;minLength value="4"/>
			 *                         &lt;maxLength value="17"/>
			 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="indCPRB">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
			 *                         &lt;minInclusive value="0"/>
			 *                         &lt;maxInclusive value="1"/>
			 *                         &lt;pattern value="[0|1]"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="nfs" maxOccurs="unbounded">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;sequence>
			 *                             &lt;element name="serie">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="5"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="numDocto">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="15"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="dtEmissaoNF">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="vlrBruto">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="4"/>
			 *                                   &lt;maxLength value="17"/>
			 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="obs" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="250"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="infoTpServ" maxOccurs="9">
			 *                               &lt;complexType>
			 *                                 &lt;complexContent>
			 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                                     &lt;sequence>
			 *                                       &lt;element name="tpServico">
			 *                                         &lt;simpleType>
			 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                             &lt;length value="9"/>
			 *                                             &lt;pattern value="[0-9]{9}"/>
			 *                                           &lt;/restriction>
			 *                                         &lt;/simpleType>
			 *                                       &lt;/element>
			 *                                       &lt;element name="vlrBaseRet">
			 *                                         &lt;simpleType>
			 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                             &lt;minLength value="4"/>
			 *                                             &lt;maxLength value="17"/>
			 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                                           &lt;/restriction>
			 *                                         &lt;/simpleType>
			 *                                       &lt;/element>
			 *                                       &lt;element name="vlrRetencao">
			 *                                         &lt;simpleType>
			 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                             &lt;minLength value="4"/>
			 *                                             &lt;maxLength value="17"/>
			 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                                           &lt;/restriction>
			 *                                         &lt;/simpleType>
			 *                                       &lt;/element>
			 *                                       &lt;element name="vlrRetSub" minOccurs="0">
			 *                                         &lt;simpleType>
			 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                             &lt;minLength value="4"/>
			 *                                             &lt;maxLength value="17"/>
			 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                                           &lt;/restriction>
			 *                                         &lt;/simpleType>
			 *                                       &lt;/element>
			 *                                       &lt;element name="vlrNRetPrinc" minOccurs="0">
			 *                                         &lt;simpleType>
			 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                             &lt;minLength value="4"/>
			 *                                             &lt;maxLength value="17"/>
			 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                                           &lt;/restriction>
			 *                                         &lt;/simpleType>
			 *                                       &lt;/element>
			 *                                       &lt;element name="vlrServicos15" minOccurs="0">
			 *                                         &lt;simpleType>
			 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                             &lt;minLength value="4"/>
			 *                                             &lt;maxLength value="17"/>
			 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                                           &lt;/restriction>
			 *                                         &lt;/simpleType>
			 *                                       &lt;/element>
			 *                                       &lt;element name="vlrServicos20" minOccurs="0">
			 *                                         &lt;simpleType>
			 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                             &lt;minLength value="4"/>
			 *                                             &lt;maxLength value="17"/>
			 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                                           &lt;/restriction>
			 *                                         &lt;/simpleType>
			 *                                       &lt;/element>
			 *                                       &lt;element name="vlrServicos25" minOccurs="0">
			 *                                         &lt;simpleType>
			 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                             &lt;minLength value="4"/>
			 *                                             &lt;maxLength value="17"/>
			 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                                           &lt;/restriction>
			 *                                         &lt;/simpleType>
			 *                                       &lt;/element>
			 *                                       &lt;element name="vlrAdicional" minOccurs="0">
			 *                                         &lt;simpleType>
			 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                             &lt;minLength value="4"/>
			 *                                             &lt;maxLength value="17"/>
			 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                                           &lt;/restriction>
			 *                                         &lt;/simpleType>
			 *                                       &lt;/element>
			 *                                       &lt;element name="vlrNRetAdic" minOccurs="0">
			 *                                         &lt;simpleType>
			 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                             &lt;minLength value="4"/>
			 *                                             &lt;maxLength value="17"/>
			 *                                             &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                                           &lt;/restriction>
			 *                                         &lt;/simpleType>
			 *                                       &lt;/element>
			 *                                     &lt;/sequence>
			 *                                   &lt;/restriction>
			 *                                 &lt;/complexContent>
			 *                               &lt;/complexType>
			 *                             &lt;/element>
			 *                           &lt;/sequence>
			 *                         &lt;/restriction>
			 *                       &lt;/complexContent>
			 *                     &lt;/complexType>
			 *                   &lt;/element>
			 *                   &lt;element name="infoProcRetPr" maxOccurs="50" minOccurs="0">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;sequence>
			 *                             &lt;element name="tpProcRetPrinc">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
			 *                                   &lt;minInclusive value="1"/>
			 *                                   &lt;maxInclusive value="2"/>
			 *                                   &lt;pattern value="[1-2]{1}"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="nrProcRetPrinc">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="21"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="codSuspPrinc" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
			 *                                   &lt;maxInclusive value="99999999999999"/>
			 *                                   &lt;pattern value="[0-9]{1,14}"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="valorPrinc">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="4"/>
			 *                                   &lt;maxLength value="17"/>
			 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                           &lt;/sequence>
			 *                         &lt;/restriction>
			 *                       &lt;/complexContent>
			 *                     &lt;/complexType>
			 *                   &lt;/element>
			 *                   &lt;element name="infoProcRetAd" maxOccurs="50" minOccurs="0">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;sequence>
			 *                             &lt;element name="tpProcRetAdic">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
			 *                                   &lt;minInclusive value="1"/>
			 *                                   &lt;maxInclusive value="2"/>
			 *                                   &lt;pattern value="[1-2]{1}"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="nrProcRetAdic">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="21"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="codSuspAdic" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
			 *                                   &lt;maxInclusive value="99999999999999"/>
			 *                                   &lt;pattern value="[0-9]{1,14}"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="valorAdic">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="4"/>
			 *                                   &lt;maxLength value="17"/>
			 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                           &lt;/sequence>
			 *                         &lt;/restriction>
			 *                       &lt;/complexContent>
			 *                     &lt;/complexType>
			 *                   &lt;/element>
			 *                 &lt;/sequence>
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "tpInscEstab", "nrInscEstab", "indObra", "idePrestServ" })
			public static class IdeEstabObra {

				@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
				protected short tpInscEstab;
				@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
				protected String nrInscEstab;
				@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
				protected short indObra;
				@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
				protected Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ idePrestServ;

				/**
				 * Obtém o valor da propriedade tpInscEstab.
				 * 
				 */
				public short getTpInscEstab() {
					return tpInscEstab;
				}

				/**
				 * Define o valor da propriedade tpInscEstab.
				 * 
				 */
				public void setTpInscEstab(final short value) {
					tpInscEstab = value;
				}

				/**
				 * Obtém o valor da propriedade nrInscEstab.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getNrInscEstab() {
					return nrInscEstab;
				}

				/**
				 * Define o valor da propriedade nrInscEstab.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setNrInscEstab(final String value) {
					nrInscEstab = value;
				}

				/**
				 * Obtém o valor da propriedade indObra.
				 * 
				 */
				public short getIndObra() {
					return indObra;
				}

				/**
				 * Define o valor da propriedade indObra.
				 * 
				 */
				public void setIndObra(final short value) {
					indObra = value;
				}

				/**
				 * Obtém o valor da propriedade idePrestServ.
				 * 
				 * @return possible object is
				 *         {@link Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ }
				 * 
				 */
				public Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ getIdePrestServ() {
					return idePrestServ;
				}

				/**
				 * Define o valor da propriedade idePrestServ.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ }
				 * 
				 */
				public void setIdePrestServ(final Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ value) {
					idePrestServ = value;
				}

				/**
				 * <p>
				 * Classe Java de anonymous complex type.
				 * 
				 * <p>
				 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
				 * desta classe.
				 * 
				 * <pre>
				 * &lt;complexType>
				 *   &lt;complexContent>
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *       &lt;sequence>
				 *         &lt;element name="cnpjPrestador">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;minLength value="3"/>
				 *               &lt;maxLength value="14"/>
				 *               &lt;pattern value="[0-9]{3,14}"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="vlrTotalBruto">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;minLength value="4"/>
				 *               &lt;maxLength value="17"/>
				 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="vlrTotalBaseRet">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;minLength value="4"/>
				 *               &lt;maxLength value="17"/>
				 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="vlrTotalRetPrinc">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;minLength value="4"/>
				 *               &lt;maxLength value="17"/>
				 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="vlrTotalRetAdic" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;minLength value="4"/>
				 *               &lt;maxLength value="17"/>
				 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="vlrTotalNRetPrinc" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;minLength value="4"/>
				 *               &lt;maxLength value="17"/>
				 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="vlrTotalNRetAdic" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;minLength value="4"/>
				 *               &lt;maxLength value="17"/>
				 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="indCPRB">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
				 *               &lt;minInclusive value="0"/>
				 *               &lt;maxInclusive value="1"/>
				 *               &lt;pattern value="[0|1]"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="nfs" maxOccurs="unbounded">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;sequence>
				 *                   &lt;element name="serie">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="5"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="numDocto">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="15"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="dtEmissaoNF">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="vlrBruto">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="4"/>
				 *                         &lt;maxLength value="17"/>
				 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="obs" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="250"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="infoTpServ" maxOccurs="9">
				 *                     &lt;complexType>
				 *                       &lt;complexContent>
				 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                           &lt;sequence>
				 *                             &lt;element name="tpServico">
				 *                               &lt;simpleType>
				 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                                   &lt;length value="9"/>
				 *                                   &lt;pattern value="[0-9]{9}"/>
				 *                                 &lt;/restriction>
				 *                               &lt;/simpleType>
				 *                             &lt;/element>
				 *                             &lt;element name="vlrBaseRet">
				 *                               &lt;simpleType>
				 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                                   &lt;minLength value="4"/>
				 *                                   &lt;maxLength value="17"/>
				 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *                                 &lt;/restriction>
				 *                               &lt;/simpleType>
				 *                             &lt;/element>
				 *                             &lt;element name="vlrRetencao">
				 *                               &lt;simpleType>
				 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                                   &lt;minLength value="4"/>
				 *                                   &lt;maxLength value="17"/>
				 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *                                 &lt;/restriction>
				 *                               &lt;/simpleType>
				 *                             &lt;/element>
				 *                             &lt;element name="vlrRetSub" minOccurs="0">
				 *                               &lt;simpleType>
				 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                                   &lt;minLength value="4"/>
				 *                                   &lt;maxLength value="17"/>
				 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *                                 &lt;/restriction>
				 *                               &lt;/simpleType>
				 *                             &lt;/element>
				 *                             &lt;element name="vlrNRetPrinc" minOccurs="0">
				 *                               &lt;simpleType>
				 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                                   &lt;minLength value="4"/>
				 *                                   &lt;maxLength value="17"/>
				 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *                                 &lt;/restriction>
				 *                               &lt;/simpleType>
				 *                             &lt;/element>
				 *                             &lt;element name="vlrServicos15" minOccurs="0">
				 *                               &lt;simpleType>
				 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                                   &lt;minLength value="4"/>
				 *                                   &lt;maxLength value="17"/>
				 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *                                 &lt;/restriction>
				 *                               &lt;/simpleType>
				 *                             &lt;/element>
				 *                             &lt;element name="vlrServicos20" minOccurs="0">
				 *                               &lt;simpleType>
				 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                                   &lt;minLength value="4"/>
				 *                                   &lt;maxLength value="17"/>
				 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *                                 &lt;/restriction>
				 *                               &lt;/simpleType>
				 *                             &lt;/element>
				 *                             &lt;element name="vlrServicos25" minOccurs="0">
				 *                               &lt;simpleType>
				 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                                   &lt;minLength value="4"/>
				 *                                   &lt;maxLength value="17"/>
				 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *                                 &lt;/restriction>
				 *                               &lt;/simpleType>
				 *                             &lt;/element>
				 *                             &lt;element name="vlrAdicional" minOccurs="0">
				 *                               &lt;simpleType>
				 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                                   &lt;minLength value="4"/>
				 *                                   &lt;maxLength value="17"/>
				 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *                                 &lt;/restriction>
				 *                               &lt;/simpleType>
				 *                             &lt;/element>
				 *                             &lt;element name="vlrNRetAdic" minOccurs="0">
				 *                               &lt;simpleType>
				 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                                   &lt;minLength value="4"/>
				 *                                   &lt;maxLength value="17"/>
				 *                                   &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *                                 &lt;/restriction>
				 *                               &lt;/simpleType>
				 *                             &lt;/element>
				 *                           &lt;/sequence>
				 *                         &lt;/restriction>
				 *                       &lt;/complexContent>
				 *                     &lt;/complexType>
				 *                   &lt;/element>
				 *                 &lt;/sequence>
				 *               &lt;/restriction>
				 *             &lt;/complexContent>
				 *           &lt;/complexType>
				 *         &lt;/element>
				 *         &lt;element name="infoProcRetPr" maxOccurs="50" minOccurs="0">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;sequence>
				 *                   &lt;element name="tpProcRetPrinc">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
				 *                         &lt;minInclusive value="1"/>
				 *                         &lt;maxInclusive value="2"/>
				 *                         &lt;pattern value="[1-2]{1}"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="nrProcRetPrinc">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="21"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="codSuspPrinc" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
				 *                         &lt;maxInclusive value="99999999999999"/>
				 *                         &lt;pattern value="[0-9]{1,14}"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="valorPrinc">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="4"/>
				 *                         &lt;maxLength value="17"/>
				 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                 &lt;/sequence>
				 *               &lt;/restriction>
				 *             &lt;/complexContent>
				 *           &lt;/complexType>
				 *         &lt;/element>
				 *         &lt;element name="infoProcRetAd" maxOccurs="50" minOccurs="0">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;sequence>
				 *                   &lt;element name="tpProcRetAdic">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
				 *                         &lt;minInclusive value="1"/>
				 *                         &lt;maxInclusive value="2"/>
				 *                         &lt;pattern value="[1-2]{1}"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="nrProcRetAdic">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="21"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="codSuspAdic" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
				 *                         &lt;maxInclusive value="99999999999999"/>
				 *                         &lt;pattern value="[0-9]{1,14}"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="valorAdic">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="4"/>
				 *                         &lt;maxLength value="17"/>
				 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                 &lt;/sequence>
				 *               &lt;/restriction>
				 *             &lt;/complexContent>
				 *           &lt;/complexType>
				 *         &lt;/element>
				 *       &lt;/sequence>
				 *     &lt;/restriction>
				 *   &lt;/complexContent>
				 * &lt;/complexType>
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "cnpjPrestador", "vlrTotalBruto", "vlrTotalBaseRet",
						"vlrTotalRetPrinc", "vlrTotalRetAdic", "vlrTotalNRetPrinc", "vlrTotalNRetAdic", "indCPRB",
						"nfs", "infoProcRetPr", "infoProcRetAd" })
				public static class IdePrestServ {

					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
					protected String cnpjPrestador;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
					protected String vlrTotalBruto;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
					protected String vlrTotalBaseRet;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
					protected String vlrTotalRetPrinc;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
					protected String vlrTotalRetAdic;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
					protected String vlrTotalNRetPrinc;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
					protected String vlrTotalNRetAdic;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
					protected short indCPRB;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
					protected List<Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.Nfs> nfs;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
					protected List<Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.InfoProcRetPr> infoProcRetPr;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
					protected List<Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.InfoProcRetAd> infoProcRetAd;

					/**
					 * Obtém o valor da propriedade cnpjPrestador.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getCnpjPrestador() {
						return cnpjPrestador;
					}

					/**
					 * Define o valor da propriedade cnpjPrestador.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setCnpjPrestador(final String value) {
						cnpjPrestador = value;
					}

					/**
					 * Obtém o valor da propriedade vlrTotalBruto.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getVlrTotalBruto() {
						return vlrTotalBruto;
					}

					/**
					 * Define o valor da propriedade vlrTotalBruto.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setVlrTotalBruto(final String value) {
						vlrTotalBruto = value;
					}

					/**
					 * Obtém o valor da propriedade vlrTotalBaseRet.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getVlrTotalBaseRet() {
						return vlrTotalBaseRet;
					}

					/**
					 * Define o valor da propriedade vlrTotalBaseRet.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setVlrTotalBaseRet(final String value) {
						vlrTotalBaseRet = value;
					}

					/**
					 * Obtém o valor da propriedade vlrTotalRetPrinc.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getVlrTotalRetPrinc() {
						return vlrTotalRetPrinc;
					}

					/**
					 * Define o valor da propriedade vlrTotalRetPrinc.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setVlrTotalRetPrinc(final String value) {
						vlrTotalRetPrinc = value;
					}

					/**
					 * Obtém o valor da propriedade vlrTotalRetAdic.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getVlrTotalRetAdic() {
						return vlrTotalRetAdic;
					}

					/**
					 * Define o valor da propriedade vlrTotalRetAdic.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setVlrTotalRetAdic(final String value) {
						vlrTotalRetAdic = value;
					}

					/**
					 * Obtém o valor da propriedade vlrTotalNRetPrinc.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getVlrTotalNRetPrinc() {
						return vlrTotalNRetPrinc;
					}

					/**
					 * Define o valor da propriedade vlrTotalNRetPrinc.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setVlrTotalNRetPrinc(final String value) {
						vlrTotalNRetPrinc = value;
					}

					/**
					 * Obtém o valor da propriedade vlrTotalNRetAdic.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getVlrTotalNRetAdic() {
						return vlrTotalNRetAdic;
					}

					/**
					 * Define o valor da propriedade vlrTotalNRetAdic.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setVlrTotalNRetAdic(final String value) {
						vlrTotalNRetAdic = value;
					}

					/**
					 * Obtém o valor da propriedade indCPRB.
					 * 
					 */
					public short getIndCPRB() {
						return indCPRB;
					}

					/**
					 * Define o valor da propriedade indCPRB.
					 * 
					 */
					public void setIndCPRB(final short value) {
						indCPRB = value;
					}

					/**
					 * Gets the value of the nfs property.
					 * 
					 * <p>
					 * This accessor method returns a reference to the live list, not a snapshot.
					 * Therefore any modification you make to the returned list will be present
					 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
					 * for the nfs property.
					 * 
					 * <p>
					 * For example, to add a new item, do as follows:
					 * 
					 * <pre>
					 * getNfs().add(newItem);
					 * </pre>
					 * 
					 * 
					 * <p>
					 * Objects of the following type(s) are allowed in the list
					 * {@link Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.Nfs }
					 * 
					 * 
					 */
					public List<Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.Nfs> getNfs() {
						if (nfs == null) {
							nfs = new ArrayList<Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.Nfs>();
						}
						return nfs;
					}

					/**
					 * Gets the value of the infoProcRetPr property.
					 * 
					 * <p>
					 * This accessor method returns a reference to the live list, not a snapshot.
					 * Therefore any modification you make to the returned list will be present
					 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
					 * for the infoProcRetPr property.
					 * 
					 * <p>
					 * For example, to add a new item, do as follows:
					 * 
					 * <pre>
					 * getInfoProcRetPr().add(newItem);
					 * </pre>
					 * 
					 * 
					 * <p>
					 * Objects of the following type(s) are allowed in the list
					 * {@link Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.InfoProcRetPr }
					 * 
					 * 
					 */
					public List<Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.InfoProcRetPr> getInfoProcRetPr() {
						if (infoProcRetPr == null) {
							infoProcRetPr = new ArrayList<Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.InfoProcRetPr>();
						}
						return infoProcRetPr;
					}

					/**
					 * Gets the value of the infoProcRetAd property.
					 * 
					 * <p>
					 * This accessor method returns a reference to the live list, not a snapshot.
					 * Therefore any modification you make to the returned list will be present
					 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
					 * for the infoProcRetAd property.
					 * 
					 * <p>
					 * For example, to add a new item, do as follows:
					 * 
					 * <pre>
					 * getInfoProcRetAd().add(newItem);
					 * </pre>
					 * 
					 * 
					 * <p>
					 * Objects of the following type(s) are allowed in the list
					 * {@link Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.InfoProcRetAd }
					 * 
					 * 
					 */
					public List<Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.InfoProcRetAd> getInfoProcRetAd() {
						if (infoProcRetAd == null) {
							infoProcRetAd = new ArrayList<Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.InfoProcRetAd>();
						}
						return infoProcRetAd;
					}

					/**
					 * Informações de processos relacionados a não retenção de contribuição
					 * previdenciária adicional
					 * 
					 * <p>
					 * Classe Java de anonymous complex type.
					 * 
					 * <p>
					 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
					 * desta classe.
					 * 
					 * <pre>
					 * &lt;complexType>
					 *   &lt;complexContent>
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
					 *       &lt;sequence>
					 *         &lt;element name="tpProcRetAdic">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
					 *               &lt;minInclusive value="1"/>
					 *               &lt;maxInclusive value="2"/>
					 *               &lt;pattern value="[1-2]{1}"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="nrProcRetAdic">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="21"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="codSuspAdic" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
					 *               &lt;maxInclusive value="99999999999999"/>
					 *               &lt;pattern value="[0-9]{1,14}"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="valorAdic">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="4"/>
					 *               &lt;maxLength value="17"/>
					 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *       &lt;/sequence>
					 *     &lt;/restriction>
					 *   &lt;/complexContent>
					 * &lt;/complexType>
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "tpProcRetAdic", "nrProcRetAdic", "codSuspAdic", "valorAdic" })
					public static class InfoProcRetAd {

						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
						protected short tpProcRetAdic;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
						protected String nrProcRetAdic;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
						protected Long codSuspAdic;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
						protected String valorAdic;

						/**
						 * Obtém o valor da propriedade tpProcRetAdic.
						 * 
						 */
						public short getTpProcRetAdic() {
							return tpProcRetAdic;
						}

						/**
						 * Define o valor da propriedade tpProcRetAdic.
						 * 
						 */
						public void setTpProcRetAdic(final short value) {
							tpProcRetAdic = value;
						}

						/**
						 * Obtém o valor da propriedade nrProcRetAdic.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getNrProcRetAdic() {
							return nrProcRetAdic;
						}

						/**
						 * Define o valor da propriedade nrProcRetAdic.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setNrProcRetAdic(final String value) {
							nrProcRetAdic = value;
						}

						/**
						 * Obtém o valor da propriedade codSuspAdic.
						 * 
						 * @return possible object is {@link Long }
						 * 
						 */
						public Long getCodSuspAdic() {
							return codSuspAdic;
						}

						/**
						 * Define o valor da propriedade codSuspAdic.
						 * 
						 * @param value
						 *            allowed object is {@link Long }
						 * 
						 */
						public void setCodSuspAdic(final Long value) {
							codSuspAdic = value;
						}

						/**
						 * Obtém o valor da propriedade valorAdic.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getValorAdic() {
							return valorAdic;
						}

						/**
						 * Define o valor da propriedade valorAdic.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setValorAdic(final String value) {
							valorAdic = value;
						}

					}

					/**
					 * Informações de processos relacionados a não retenção de contribuição
					 * previdenciária
					 * 
					 * <p>
					 * Classe Java de anonymous complex type.
					 * 
					 * <p>
					 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
					 * desta classe.
					 * 
					 * <pre>
					 * &lt;complexType>
					 *   &lt;complexContent>
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
					 *       &lt;sequence>
					 *         &lt;element name="tpProcRetPrinc">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
					 *               &lt;minInclusive value="1"/>
					 *               &lt;maxInclusive value="2"/>
					 *               &lt;pattern value="[1-2]{1}"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="nrProcRetPrinc">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="21"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="codSuspPrinc" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
					 *               &lt;maxInclusive value="99999999999999"/>
					 *               &lt;pattern value="[0-9]{1,14}"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="valorPrinc">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="4"/>
					 *               &lt;maxLength value="17"/>
					 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *       &lt;/sequence>
					 *     &lt;/restriction>
					 *   &lt;/complexContent>
					 * &lt;/complexType>
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "tpProcRetPrinc", "nrProcRetPrinc", "codSuspPrinc",
							"valorPrinc" })
					public static class InfoProcRetPr {

						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
						protected short tpProcRetPrinc;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
						protected String nrProcRetPrinc;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
						protected Long codSuspPrinc;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
						protected String valorPrinc;

						/**
						 * Obtém o valor da propriedade tpProcRetPrinc.
						 * 
						 */
						public short getTpProcRetPrinc() {
							return tpProcRetPrinc;
						}

						/**
						 * Define o valor da propriedade tpProcRetPrinc.
						 * 
						 */
						public void setTpProcRetPrinc(final short value) {
							tpProcRetPrinc = value;
						}

						/**
						 * Obtém o valor da propriedade nrProcRetPrinc.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getNrProcRetPrinc() {
							return nrProcRetPrinc;
						}

						/**
						 * Define o valor da propriedade nrProcRetPrinc.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setNrProcRetPrinc(final String value) {
							nrProcRetPrinc = value;
						}

						/**
						 * Obtém o valor da propriedade codSuspPrinc.
						 * 
						 * @return possible object is {@link Long }
						 * 
						 */
						public Long getCodSuspPrinc() {
							return codSuspPrinc;
						}

						/**
						 * Define o valor da propriedade codSuspPrinc.
						 * 
						 * @param value
						 *            allowed object is {@link Long }
						 * 
						 */
						public void setCodSuspPrinc(final Long value) {
							codSuspPrinc = value;
						}

						/**
						 * Obtém o valor da propriedade valorPrinc.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getValorPrinc() {
							return valorPrinc;
						}

						/**
						 * Define o valor da propriedade valorPrinc.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setValorPrinc(final String value) {
							valorPrinc = value;
						}

					}

					/**
					 * 
					 * Detalhamento das notas fiscais de serviços prestados pela empresa
					 * identificada no registro superior.
					 * 
					 * 
					 * <p>
					 * Classe Java de anonymous complex type.
					 * 
					 * <p>
					 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
					 * desta classe.
					 * 
					 * <pre>
					 * &lt;complexType>
					 *   &lt;complexContent>
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
					 *       &lt;sequence>
					 *         &lt;element name="serie">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="5"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="numDocto">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="15"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="dtEmissaoNF">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="vlrBruto">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="4"/>
					 *               &lt;maxLength value="17"/>
					 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="obs" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="250"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="infoTpServ" maxOccurs="9">
					 *           &lt;complexType>
					 *             &lt;complexContent>
					 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
					 *                 &lt;sequence>
					 *                   &lt;element name="tpServico">
					 *                     &lt;simpleType>
					 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *                         &lt;length value="9"/>
					 *                         &lt;pattern value="[0-9]{9}"/>
					 *                       &lt;/restriction>
					 *                     &lt;/simpleType>
					 *                   &lt;/element>
					 *                   &lt;element name="vlrBaseRet">
					 *                     &lt;simpleType>
					 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *                         &lt;minLength value="4"/>
					 *                         &lt;maxLength value="17"/>
					 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
					 *                       &lt;/restriction>
					 *                     &lt;/simpleType>
					 *                   &lt;/element>
					 *                   &lt;element name="vlrRetencao">
					 *                     &lt;simpleType>
					 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *                         &lt;minLength value="4"/>
					 *                         &lt;maxLength value="17"/>
					 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
					 *                       &lt;/restriction>
					 *                     &lt;/simpleType>
					 *                   &lt;/element>
					 *                   &lt;element name="vlrRetSub" minOccurs="0">
					 *                     &lt;simpleType>
					 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *                         &lt;minLength value="4"/>
					 *                         &lt;maxLength value="17"/>
					 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
					 *                       &lt;/restriction>
					 *                     &lt;/simpleType>
					 *                   &lt;/element>
					 *                   &lt;element name="vlrNRetPrinc" minOccurs="0">
					 *                     &lt;simpleType>
					 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *                         &lt;minLength value="4"/>
					 *                         &lt;maxLength value="17"/>
					 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
					 *                       &lt;/restriction>
					 *                     &lt;/simpleType>
					 *                   &lt;/element>
					 *                   &lt;element name="vlrServicos15" minOccurs="0">
					 *                     &lt;simpleType>
					 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *                         &lt;minLength value="4"/>
					 *                         &lt;maxLength value="17"/>
					 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
					 *                       &lt;/restriction>
					 *                     &lt;/simpleType>
					 *                   &lt;/element>
					 *                   &lt;element name="vlrServicos20" minOccurs="0">
					 *                     &lt;simpleType>
					 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *                         &lt;minLength value="4"/>
					 *                         &lt;maxLength value="17"/>
					 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
					 *                       &lt;/restriction>
					 *                     &lt;/simpleType>
					 *                   &lt;/element>
					 *                   &lt;element name="vlrServicos25" minOccurs="0">
					 *                     &lt;simpleType>
					 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *                         &lt;minLength value="4"/>
					 *                         &lt;maxLength value="17"/>
					 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
					 *                       &lt;/restriction>
					 *                     &lt;/simpleType>
					 *                   &lt;/element>
					 *                   &lt;element name="vlrAdicional" minOccurs="0">
					 *                     &lt;simpleType>
					 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *                         &lt;minLength value="4"/>
					 *                         &lt;maxLength value="17"/>
					 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
					 *                       &lt;/restriction>
					 *                     &lt;/simpleType>
					 *                   &lt;/element>
					 *                   &lt;element name="vlrNRetAdic" minOccurs="0">
					 *                     &lt;simpleType>
					 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *                         &lt;minLength value="4"/>
					 *                         &lt;maxLength value="17"/>
					 *                         &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
					 *                       &lt;/restriction>
					 *                     &lt;/simpleType>
					 *                   &lt;/element>
					 *                 &lt;/sequence>
					 *               &lt;/restriction>
					 *             &lt;/complexContent>
					 *           &lt;/complexType>
					 *         &lt;/element>
					 *       &lt;/sequence>
					 *     &lt;/restriction>
					 *   &lt;/complexContent>
					 * &lt;/complexType>
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "serie", "numDocto", "dtEmissaoNF", "vlrBruto", "obs",
							"infoTpServ" })
					public static class Nfs {

						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
						protected String serie;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
						protected String numDocto;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
						protected XMLGregorianCalendar dtEmissaoNF;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
						protected String vlrBruto;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
						protected String obs;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
						protected List<Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.Nfs.InfoTpServ> infoTpServ;

						/**
						 * Obtém o valor da propriedade serie.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getSerie() {
							return serie;
						}

						/**
						 * Define o valor da propriedade serie.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setSerie(final String value) {
							serie = value;
						}

						/**
						 * Obtém o valor da propriedade numDocto.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getNumDocto() {
							return numDocto;
						}

						/**
						 * Define o valor da propriedade numDocto.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setNumDocto(final String value) {
							numDocto = value;
						}

						/**
						 * Obtém o valor da propriedade dtEmissaoNF.
						 * 
						 * @return possible object is {@link XMLGregorianCalendar }
						 * 
						 */
						public XMLGregorianCalendar getDtEmissaoNF() {
							return dtEmissaoNF;
						}

						/**
						 * Define o valor da propriedade dtEmissaoNF.
						 * 
						 * @param value
						 *            allowed object is {@link XMLGregorianCalendar }
						 * 
						 */
						public void setDtEmissaoNF(final XMLGregorianCalendar value) {
							dtEmissaoNF = value;
						}

						/**
						 * Obtém o valor da propriedade vlrBruto.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getVlrBruto() {
							return vlrBruto;
						}

						/**
						 * Define o valor da propriedade vlrBruto.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setVlrBruto(final String value) {
							vlrBruto = value;
						}

						/**
						 * Obtém o valor da propriedade obs.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getObs() {
							return obs;
						}

						/**
						 * Define o valor da propriedade obs.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setObs(final String value) {
							obs = value;
						}

						/**
						 * Gets the value of the infoTpServ property.
						 * 
						 * <p>
						 * This accessor method returns a reference to the live list, not a snapshot.
						 * Therefore any modification you make to the returned list will be present
						 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
						 * for the infoTpServ property.
						 * 
						 * <p>
						 * For example, to add a new item, do as follows:
						 * 
						 * <pre>
						 * getInfoTpServ().add(newItem);
						 * </pre>
						 * 
						 * 
						 * <p>
						 * Objects of the following type(s) are allowed in the list
						 * {@link Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.Nfs.InfoTpServ }
						 * 
						 * 
						 */
						public List<Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.Nfs.InfoTpServ> getInfoTpServ() {
							if (infoTpServ == null) {
								infoTpServ = new ArrayList<Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.Nfs.InfoTpServ>();
							}
							return infoTpServ;
						}

						/**
						 * Informações sobre os tipos de Serviços constantes da Nota Fiscal
						 * 
						 * <p>
						 * Classe Java de anonymous complex type.
						 * 
						 * <p>
						 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
						 * desta classe.
						 * 
						 * <pre>
						 * &lt;complexType>
						 *   &lt;complexContent>
						 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
						 *       &lt;sequence>
						 *         &lt;element name="tpServico">
						 *           &lt;simpleType>
						 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
						 *               &lt;length value="9"/>
						 *               &lt;pattern value="[0-9]{9}"/>
						 *             &lt;/restriction>
						 *           &lt;/simpleType>
						 *         &lt;/element>
						 *         &lt;element name="vlrBaseRet">
						 *           &lt;simpleType>
						 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
						 *               &lt;minLength value="4"/>
						 *               &lt;maxLength value="17"/>
						 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
						 *             &lt;/restriction>
						 *           &lt;/simpleType>
						 *         &lt;/element>
						 *         &lt;element name="vlrRetencao">
						 *           &lt;simpleType>
						 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
						 *               &lt;minLength value="4"/>
						 *               &lt;maxLength value="17"/>
						 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
						 *             &lt;/restriction>
						 *           &lt;/simpleType>
						 *         &lt;/element>
						 *         &lt;element name="vlrRetSub" minOccurs="0">
						 *           &lt;simpleType>
						 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
						 *               &lt;minLength value="4"/>
						 *               &lt;maxLength value="17"/>
						 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
						 *             &lt;/restriction>
						 *           &lt;/simpleType>
						 *         &lt;/element>
						 *         &lt;element name="vlrNRetPrinc" minOccurs="0">
						 *           &lt;simpleType>
						 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
						 *               &lt;minLength value="4"/>
						 *               &lt;maxLength value="17"/>
						 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
						 *             &lt;/restriction>
						 *           &lt;/simpleType>
						 *         &lt;/element>
						 *         &lt;element name="vlrServicos15" minOccurs="0">
						 *           &lt;simpleType>
						 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
						 *               &lt;minLength value="4"/>
						 *               &lt;maxLength value="17"/>
						 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
						 *             &lt;/restriction>
						 *           &lt;/simpleType>
						 *         &lt;/element>
						 *         &lt;element name="vlrServicos20" minOccurs="0">
						 *           &lt;simpleType>
						 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
						 *               &lt;minLength value="4"/>
						 *               &lt;maxLength value="17"/>
						 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
						 *             &lt;/restriction>
						 *           &lt;/simpleType>
						 *         &lt;/element>
						 *         &lt;element name="vlrServicos25" minOccurs="0">
						 *           &lt;simpleType>
						 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
						 *               &lt;minLength value="4"/>
						 *               &lt;maxLength value="17"/>
						 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
						 *             &lt;/restriction>
						 *           &lt;/simpleType>
						 *         &lt;/element>
						 *         &lt;element name="vlrAdicional" minOccurs="0">
						 *           &lt;simpleType>
						 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
						 *               &lt;minLength value="4"/>
						 *               &lt;maxLength value="17"/>
						 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
						 *             &lt;/restriction>
						 *           &lt;/simpleType>
						 *         &lt;/element>
						 *         &lt;element name="vlrNRetAdic" minOccurs="0">
						 *           &lt;simpleType>
						 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
						 *               &lt;minLength value="4"/>
						 *               &lt;maxLength value="17"/>
						 *               &lt;pattern value="[0-9]{1,14}[,][0-9]{2}"/>
						 *             &lt;/restriction>
						 *           &lt;/simpleType>
						 *         &lt;/element>
						 *       &lt;/sequence>
						 *     &lt;/restriction>
						 *   &lt;/complexContent>
						 * &lt;/complexType>
						 * </pre>
						 * 
						 * 
						 */
						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "", propOrder = { "tpServico", "vlrBaseRet", "vlrRetencao", "vlrRetSub",
								"vlrNRetPrinc", "vlrServicos15", "vlrServicos20", "vlrServicos25", "vlrAdicional",
								"vlrNRetAdic" })
						public static class InfoTpServ {

							@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
							protected String tpServico;
							@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
							protected String vlrBaseRet;
							@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00", required = true)
							protected String vlrRetencao;
							@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
							protected String vlrRetSub;
							@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
							protected String vlrNRetPrinc;
							@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
							protected String vlrServicos15;
							@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
							protected String vlrServicos20;
							@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
							protected String vlrServicos25;
							@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
							protected String vlrAdicional;
							@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00")
							protected String vlrNRetAdic;

							/**
							 * Obtém o valor da propriedade tpServico.
							 * 
							 * @return possible object is {@link String }
							 * 
							 */
							public String getTpServico() {
								return tpServico;
							}

							/**
							 * Define o valor da propriedade tpServico.
							 * 
							 * @param value
							 *            allowed object is {@link String }
							 * 
							 */
							public void setTpServico(final String value) {
								tpServico = value;
							}

							/**
							 * Obtém o valor da propriedade vlrBaseRet.
							 * 
							 * @return possible object is {@link String }
							 * 
							 */
							public String getVlrBaseRet() {
								return vlrBaseRet;
							}

							/**
							 * Define o valor da propriedade vlrBaseRet.
							 * 
							 * @param value
							 *            allowed object is {@link String }
							 * 
							 */
							public void setVlrBaseRet(final String value) {
								vlrBaseRet = value;
							}

							/**
							 * Obtém o valor da propriedade vlrRetencao.
							 * 
							 * @return possible object is {@link String }
							 * 
							 */
							public String getVlrRetencao() {
								return vlrRetencao;
							}

							/**
							 * Define o valor da propriedade vlrRetencao.
							 * 
							 * @param value
							 *            allowed object is {@link String }
							 * 
							 */
							public void setVlrRetencao(final String value) {
								vlrRetencao = value;
							}

							/**
							 * Obtém o valor da propriedade vlrRetSub.
							 * 
							 * @return possible object is {@link String }
							 * 
							 */
							public String getVlrRetSub() {
								return vlrRetSub;
							}

							/**
							 * Define o valor da propriedade vlrRetSub.
							 * 
							 * @param value
							 *            allowed object is {@link String }
							 * 
							 */
							public void setVlrRetSub(final String value) {
								vlrRetSub = value;
							}

							/**
							 * Obtém o valor da propriedade vlrNRetPrinc.
							 * 
							 * @return possible object is {@link String }
							 * 
							 */
							public String getVlrNRetPrinc() {
								return vlrNRetPrinc;
							}

							/**
							 * Define o valor da propriedade vlrNRetPrinc.
							 * 
							 * @param value
							 *            allowed object is {@link String }
							 * 
							 */
							public void setVlrNRetPrinc(final String value) {
								vlrNRetPrinc = value;
							}

							/**
							 * Obtém o valor da propriedade vlrServicos15.
							 * 
							 * @return possible object is {@link String }
							 * 
							 */
							public String getVlrServicos15() {
								return vlrServicos15;
							}

							/**
							 * Define o valor da propriedade vlrServicos15.
							 * 
							 * @param value
							 *            allowed object is {@link String }
							 * 
							 */
							public void setVlrServicos15(final String value) {
								vlrServicos15 = value;
							}

							/**
							 * Obtém o valor da propriedade vlrServicos20.
							 * 
							 * @return possible object is {@link String }
							 * 
							 */
							public String getVlrServicos20() {
								return vlrServicos20;
							}

							/**
							 * Define o valor da propriedade vlrServicos20.
							 * 
							 * @param value
							 *            allowed object is {@link String }
							 * 
							 */
							public void setVlrServicos20(final String value) {
								vlrServicos20 = value;
							}

							/**
							 * Obtém o valor da propriedade vlrServicos25.
							 * 
							 * @return possible object is {@link String }
							 * 
							 */
							public String getVlrServicos25() {
								return vlrServicos25;
							}

							/**
							 * Define o valor da propriedade vlrServicos25.
							 * 
							 * @param value
							 *            allowed object is {@link String }
							 * 
							 */
							public void setVlrServicos25(final String value) {
								vlrServicos25 = value;
							}

							/**
							 * Obtém o valor da propriedade vlrAdicional.
							 * 
							 * @return possible object is {@link String }
							 * 
							 */
							public String getVlrAdicional() {
								return vlrAdicional;
							}

							/**
							 * Define o valor da propriedade vlrAdicional.
							 * 
							 * @param value
							 *            allowed object is {@link String }
							 * 
							 */
							public void setVlrAdicional(final String value) {
								vlrAdicional = value;
							}

							/**
							 * Obtém o valor da propriedade vlrNRetAdic.
							 * 
							 * @return possible object is {@link String }
							 * 
							 */
							public String getVlrNRetAdic() {
								return vlrNRetAdic;
							}

							/**
							 * Define o valor da propriedade vlrNRetAdic.
							 * 
							 * @param value
							 *            allowed object is {@link String }
							 * 
							 */
							public void setVlrNRetAdic(final String value) {
								vlrNRetAdic = value;
							}

						}

					}

				}

			}

		}

	}

}

//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.11.06 às 02:26:58 PM GFT 
//

package com.vadinei.reinf.batch.schema.evento.informacaocontribuinte;

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

import com.vadinei.reinf.batch.schema.comum.SignatureType;

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
 *         &lt;element name="evtInfoContri">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpAmb">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                                   &lt;pattern value="1|2|3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="procEmi">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                                   &lt;pattern value="1|2"/>
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
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                                   &lt;pattern value="1|2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrInsc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="8"/>
 *                                   &lt;maxLength value="14"/>
 *                                   &lt;pattern value="\d{8}|\d{11}|\d{14}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoContri">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="inclusao" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="idePeriodo">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="iniValid">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;length value="7"/>
 *                                                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="fimValid" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;length value="7"/>
 *                                                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="infoCadastro">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="classTrib">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;length value="2"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="indEscrituracao">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                                                         &lt;pattern value="0|1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="indDesoneracao">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                                                         &lt;pattern value="0|1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="indAcordoIsenMulta">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                                                         &lt;pattern value="0|1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="indSitPJ" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                                                         &lt;pattern value="[0-4]"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="contato">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="nmCtt">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="70"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="cpfCtt">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="3"/>
 *                                                                   &lt;maxLength value="11"/>
 *                                                                   &lt;pattern value="[0-9]{3,11}"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="foneFixo" minOccurs="0">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="13"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="foneCel" minOccurs="0">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="13"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="email" minOccurs="0">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="60"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="softHouse" maxOccurs="unbounded" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="cnpjSoftHouse">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="3"/>
 *                                                                   &lt;maxLength value="14"/>
 *                                                                   &lt;pattern value="[0-9]{3,14}"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="nmRazao">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="115"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="nmCont">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="70"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="telefone" minOccurs="0">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="13"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="email" minOccurs="0">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="60"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="infoEFR" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="ideEFR">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;pattern value="S|N"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="cnpjEFR" minOccurs="0">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="8"/>
 *                                                                   &lt;maxLength value="14"/>
 *                                                                   &lt;pattern value="[0-9]{8,14}"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="alteracao" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="idePeriodo">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="iniValid">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;length value="7"/>
 *                                                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="fimValid" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;length value="7"/>
 *                                                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="infoCadastro">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="classTrib">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;length value="2"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="indEscrituracao">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                                                         &lt;pattern value="0|1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="indDesoneracao">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                                                         &lt;pattern value="0|1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="indAcordoIsenMulta">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                                                         &lt;pattern value="0|1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="indSitPJ" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                                                         &lt;pattern value="[0-4]"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="contato">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="nmCtt">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="70"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="cpfCtt">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="3"/>
 *                                                                   &lt;maxLength value="11"/>
 *                                                                   &lt;pattern value="[0-9]{3,11}"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="foneFixo" minOccurs="0">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;maxLength value="13"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="foneCel" minOccurs="0">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;maxLength value="13"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="email" minOccurs="0">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="60"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="softHouse" maxOccurs="unbounded" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="cnpjSoftHouse">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="3"/>
 *                                                                   &lt;maxLength value="14"/>
 *                                                                   &lt;pattern value="[0-9]{3,14}"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="nmRazao">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="115"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="nmCont">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="70"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="telefone" minOccurs="0">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="13"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="email" minOccurs="0">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="1"/>
 *                                                                   &lt;maxLength value="60"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="infoEFR" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="ideEFR">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;pattern value="S|N"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="cnpjEFR" minOccurs="0">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="8"/>
 *                                                                   &lt;maxLength value="14"/>
 *                                                                   &lt;pattern value="[0-9]{8,14}"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="novaValidade" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="iniValid">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;length value="7"/>
 *                                                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="fimValid" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;length value="7"/>
 *                                                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="exclusao" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="idePeriodo">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="iniValid">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;length value="7"/>
 *                                                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="fimValid" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;length value="7"/>
 *                                                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
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
@XmlType(name = "", propOrder = { "evtInfoContri", "signature" })
@XmlRootElement(name = "Reinf", namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
public class Reinf {

	@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
	protected Reinf.EvtInfoContri evtInfoContri;
	@XmlElement(name = "Signature", required = true)
	protected SignatureType signature;

	/**
	 * Obtém o valor da propriedade evtInfoContri.
	 * 
	 * @return possible object is {@link Reinf.EvtInfoContri }
	 * 
	 */
	public Reinf.EvtInfoContri getEvtInfoContri() {
		return evtInfoContri;
	}

	/**
	 * Define o valor da propriedade evtInfoContri.
	 * 
	 * @param value
	 *            allowed object is {@link Reinf.EvtInfoContri }
	 * 
	 */
	public void setEvtInfoContri(final Reinf.EvtInfoContri value) {
		evtInfoContri = value;
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
	 *                   &lt;element name="tpAmb">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
	 *                         &lt;pattern value="1|2|3"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="procEmi">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
	 *                         &lt;pattern value="1|2"/>
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
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
	 *                         &lt;pattern value="1|2"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="nrInsc">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;minLength value="8"/>
	 *                         &lt;maxLength value="14"/>
	 *                         &lt;pattern value="\d{8}|\d{11}|\d{14}"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="infoContri">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;choice>
	 *                     &lt;element name="inclusao" minOccurs="0">
	 *                       &lt;complexType>
	 *                         &lt;complexContent>
	 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                             &lt;sequence>
	 *                               &lt;element name="idePeriodo">
	 *                                 &lt;complexType>
	 *                                   &lt;complexContent>
	 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                       &lt;sequence>
	 *                                         &lt;element name="iniValid">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                               &lt;length value="7"/>
	 *                                               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="fimValid" minOccurs="0">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                               &lt;length value="7"/>
	 *                                               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                       &lt;/sequence>
	 *                                     &lt;/restriction>
	 *                                   &lt;/complexContent>
	 *                                 &lt;/complexType>
	 *                               &lt;/element>
	 *                               &lt;element name="infoCadastro">
	 *                                 &lt;complexType>
	 *                                   &lt;complexContent>
	 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                       &lt;sequence>
	 *                                         &lt;element name="classTrib">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                               &lt;length value="2"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="indEscrituracao">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
	 *                                               &lt;pattern value="0|1"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="indDesoneracao">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
	 *                                               &lt;pattern value="0|1"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="indAcordoIsenMulta">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
	 *                                               &lt;pattern value="0|1"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="indSitPJ" minOccurs="0">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
	 *                                               &lt;pattern value="[0-4]"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="contato">
	 *                                           &lt;complexType>
	 *                                             &lt;complexContent>
	 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                                 &lt;sequence>
	 *                                                   &lt;element name="nmCtt">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="70"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="cpfCtt">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="3"/>
	 *                                                         &lt;maxLength value="11"/>
	 *                                                         &lt;pattern value="[0-9]{3,11}"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="foneFixo" minOccurs="0">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="13"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="foneCel" minOccurs="0">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="13"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="email" minOccurs="0">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="60"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                 &lt;/sequence>
	 *                                               &lt;/restriction>
	 *                                             &lt;/complexContent>
	 *                                           &lt;/complexType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="softHouse" maxOccurs="unbounded" minOccurs="0">
	 *                                           &lt;complexType>
	 *                                             &lt;complexContent>
	 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                                 &lt;sequence>
	 *                                                   &lt;element name="cnpjSoftHouse">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="3"/>
	 *                                                         &lt;maxLength value="14"/>
	 *                                                         &lt;pattern value="[0-9]{3,14}"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="nmRazao">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="115"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="nmCont">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="70"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="telefone" minOccurs="0">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="13"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="email" minOccurs="0">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="60"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                 &lt;/sequence>
	 *                                               &lt;/restriction>
	 *                                             &lt;/complexContent>
	 *                                           &lt;/complexType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="infoEFR" minOccurs="0">
	 *                                           &lt;complexType>
	 *                                             &lt;complexContent>
	 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                                 &lt;sequence>
	 *                                                   &lt;element name="ideEFR">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;pattern value="S|N"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="cnpjEFR" minOccurs="0">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="8"/>
	 *                                                         &lt;maxLength value="14"/>
	 *                                                         &lt;pattern value="[0-9]{8,14}"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                 &lt;/sequence>
	 *                                               &lt;/restriction>
	 *                                             &lt;/complexContent>
	 *                                           &lt;/complexType>
	 *                                         &lt;/element>
	 *                                       &lt;/sequence>
	 *                                     &lt;/restriction>
	 *                                   &lt;/complexContent>
	 *                                 &lt;/complexType>
	 *                               &lt;/element>
	 *                             &lt;/sequence>
	 *                           &lt;/restriction>
	 *                         &lt;/complexContent>
	 *                       &lt;/complexType>
	 *                     &lt;/element>
	 *                     &lt;element name="alteracao" minOccurs="0">
	 *                       &lt;complexType>
	 *                         &lt;complexContent>
	 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                             &lt;sequence>
	 *                               &lt;element name="idePeriodo">
	 *                                 &lt;complexType>
	 *                                   &lt;complexContent>
	 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                       &lt;sequence>
	 *                                         &lt;element name="iniValid">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                               &lt;length value="7"/>
	 *                                               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="fimValid" minOccurs="0">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                               &lt;length value="7"/>
	 *                                               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                       &lt;/sequence>
	 *                                     &lt;/restriction>
	 *                                   &lt;/complexContent>
	 *                                 &lt;/complexType>
	 *                               &lt;/element>
	 *                               &lt;element name="infoCadastro">
	 *                                 &lt;complexType>
	 *                                   &lt;complexContent>
	 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                       &lt;sequence>
	 *                                         &lt;element name="classTrib">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                               &lt;length value="2"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="indEscrituracao">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
	 *                                               &lt;pattern value="0|1"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="indDesoneracao">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
	 *                                               &lt;pattern value="0|1"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="indAcordoIsenMulta">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
	 *                                               &lt;pattern value="0|1"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="indSitPJ" minOccurs="0">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
	 *                                               &lt;pattern value="[0-4]"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="contato">
	 *                                           &lt;complexType>
	 *                                             &lt;complexContent>
	 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                                 &lt;sequence>
	 *                                                   &lt;element name="nmCtt">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="70"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="cpfCtt">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="3"/>
	 *                                                         &lt;maxLength value="11"/>
	 *                                                         &lt;pattern value="[0-9]{3,11}"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="foneFixo" minOccurs="0">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;maxLength value="13"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="foneCel" minOccurs="0">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;maxLength value="13"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="email" minOccurs="0">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="60"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                 &lt;/sequence>
	 *                                               &lt;/restriction>
	 *                                             &lt;/complexContent>
	 *                                           &lt;/complexType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="softHouse" maxOccurs="unbounded" minOccurs="0">
	 *                                           &lt;complexType>
	 *                                             &lt;complexContent>
	 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                                 &lt;sequence>
	 *                                                   &lt;element name="cnpjSoftHouse">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="3"/>
	 *                                                         &lt;maxLength value="14"/>
	 *                                                         &lt;pattern value="[0-9]{3,14}"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="nmRazao">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="115"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="nmCont">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="70"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="telefone" minOccurs="0">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="13"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="email" minOccurs="0">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="1"/>
	 *                                                         &lt;maxLength value="60"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                 &lt;/sequence>
	 *                                               &lt;/restriction>
	 *                                             &lt;/complexContent>
	 *                                           &lt;/complexType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="infoEFR" minOccurs="0">
	 *                                           &lt;complexType>
	 *                                             &lt;complexContent>
	 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                                 &lt;sequence>
	 *                                                   &lt;element name="ideEFR">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;pattern value="S|N"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                   &lt;element name="cnpjEFR" minOccurs="0">
	 *                                                     &lt;simpleType>
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                                         &lt;minLength value="8"/>
	 *                                                         &lt;maxLength value="14"/>
	 *                                                         &lt;pattern value="[0-9]{8,14}"/>
	 *                                                       &lt;/restriction>
	 *                                                     &lt;/simpleType>
	 *                                                   &lt;/element>
	 *                                                 &lt;/sequence>
	 *                                               &lt;/restriction>
	 *                                             &lt;/complexContent>
	 *                                           &lt;/complexType>
	 *                                         &lt;/element>
	 *                                       &lt;/sequence>
	 *                                     &lt;/restriction>
	 *                                   &lt;/complexContent>
	 *                                 &lt;/complexType>
	 *                               &lt;/element>
	 *                               &lt;element name="novaValidade" minOccurs="0">
	 *                                 &lt;complexType>
	 *                                   &lt;complexContent>
	 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                       &lt;sequence>
	 *                                         &lt;element name="iniValid">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                               &lt;length value="7"/>
	 *                                               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="fimValid" minOccurs="0">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                               &lt;length value="7"/>
	 *                                               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                       &lt;/sequence>
	 *                                     &lt;/restriction>
	 *                                   &lt;/complexContent>
	 *                                 &lt;/complexType>
	 *                               &lt;/element>
	 *                             &lt;/sequence>
	 *                           &lt;/restriction>
	 *                         &lt;/complexContent>
	 *                       &lt;/complexType>
	 *                     &lt;/element>
	 *                     &lt;element name="exclusao" minOccurs="0">
	 *                       &lt;complexType>
	 *                         &lt;complexContent>
	 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                             &lt;sequence>
	 *                               &lt;element name="idePeriodo">
	 *                                 &lt;complexType>
	 *                                   &lt;complexContent>
	 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                                       &lt;sequence>
	 *                                         &lt;element name="iniValid">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                               &lt;length value="7"/>
	 *                                               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                         &lt;element name="fimValid" minOccurs="0">
	 *                                           &lt;simpleType>
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                               &lt;length value="7"/>
	 *                                               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
	 *                                             &lt;/restriction>
	 *                                           &lt;/simpleType>
	 *                                         &lt;/element>
	 *                                       &lt;/sequence>
	 *                                     &lt;/restriction>
	 *                                   &lt;/complexContent>
	 *                                 &lt;/complexType>
	 *                               &lt;/element>
	 *                             &lt;/sequence>
	 *                           &lt;/restriction>
	 *                         &lt;/complexContent>
	 *                       &lt;/complexType>
	 *                     &lt;/element>
	 *                   &lt;/choice>
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
	@XmlType(name = "", propOrder = { "ideEvento", "ideContri", "infoContri" })
	public static class EvtInfoContri {

		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
		protected Reinf.EvtInfoContri.IdeEvento ideEvento;
		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
		protected Reinf.EvtInfoContri.IdeContri ideContri;
		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
		protected Reinf.EvtInfoContri.InfoContri infoContri;
		@XmlAttribute(name = "id", required = true)
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		protected String id;

		/**
		 * Obtém o valor da propriedade ideEvento.
		 * 
		 * @return possible object is {@link Reinf.EvtInfoContri.IdeEvento }
		 * 
		 */
		public Reinf.EvtInfoContri.IdeEvento getIdeEvento() {
			return ideEvento;
		}

		/**
		 * Define o valor da propriedade ideEvento.
		 * 
		 * @param value
		 *            allowed object is {@link Reinf.EvtInfoContri.IdeEvento }
		 * 
		 */
		public void setIdeEvento(final Reinf.EvtInfoContri.IdeEvento value) {
			ideEvento = value;
		}

		/**
		 * Obtém o valor da propriedade ideContri.
		 * 
		 * @return possible object is {@link Reinf.EvtInfoContri.IdeContri }
		 * 
		 */
		public Reinf.EvtInfoContri.IdeContri getIdeContri() {
			return ideContri;
		}

		/**
		 * Define o valor da propriedade ideContri.
		 * 
		 * @param value
		 *            allowed object is {@link Reinf.EvtInfoContri.IdeContri }
		 * 
		 */
		public void setIdeContri(final Reinf.EvtInfoContri.IdeContri value) {
			ideContri = value;
		}

		/**
		 * Obtém o valor da propriedade infoContri.
		 * 
		 * @return possible object is {@link Reinf.EvtInfoContri.InfoContri }
		 * 
		 */
		public Reinf.EvtInfoContri.InfoContri getInfoContri() {
			return infoContri;
		}

		/**
		 * Define o valor da propriedade infoContri.
		 * 
		 * @param value
		 *            allowed object is {@link Reinf.EvtInfoContri.InfoContri }
		 * 
		 */
		public void setInfoContri(final Reinf.EvtInfoContri.InfoContri value) {
			infoContri = value;
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
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
		 *               &lt;pattern value="1|2"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="nrInsc">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;minLength value="8"/>
		 *               &lt;maxLength value="14"/>
		 *               &lt;pattern value="\d{8}|\d{11}|\d{14}"/>
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

			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
			protected long tpInsc;
			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
			protected String nrInsc;

			/**
			 * Obtém o valor da propriedade tpInsc.
			 * 
			 */
			public long getTpInsc() {
				return tpInsc;
			}

			/**
			 * Define o valor da propriedade tpInsc.
			 * 
			 */
			public void setTpInsc(final long value) {
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
		 *         &lt;element name="tpAmb">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
		 *               &lt;pattern value="1|2|3"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="procEmi">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
		 *               &lt;pattern value="1|2"/>
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
		@XmlType(name = "", propOrder = { "tpAmb", "procEmi", "verProc" })
		public static class IdeEvento {

			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
			protected long tpAmb;
			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
			protected long procEmi;
			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
			protected String verProc;

			/**
			 * Obtém o valor da propriedade tpAmb.
			 * 
			 */
			public long getTpAmb() {
				return tpAmb;
			}

			/**
			 * Define o valor da propriedade tpAmb.
			 * 
			 */
			public void setTpAmb(final long value) {
				tpAmb = value;
			}

			/**
			 * Obtém o valor da propriedade procEmi.
			 * 
			 */
			public long getProcEmi() {
				return procEmi;
			}

			/**
			 * Define o valor da propriedade procEmi.
			 * 
			 */
			public void setProcEmi(final long value) {
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
		 *         &lt;choice>
		 *           &lt;element name="inclusao" minOccurs="0">
		 *             &lt;complexType>
		 *               &lt;complexContent>
		 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                   &lt;sequence>
		 *                     &lt;element name="idePeriodo">
		 *                       &lt;complexType>
		 *                         &lt;complexContent>
		 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                             &lt;sequence>
		 *                               &lt;element name="iniValid">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                     &lt;length value="7"/>
		 *                                     &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="fimValid" minOccurs="0">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                     &lt;length value="7"/>
		 *                                     &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                             &lt;/sequence>
		 *                           &lt;/restriction>
		 *                         &lt;/complexContent>
		 *                       &lt;/complexType>
		 *                     &lt;/element>
		 *                     &lt;element name="infoCadastro">
		 *                       &lt;complexType>
		 *                         &lt;complexContent>
		 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                             &lt;sequence>
		 *                               &lt;element name="classTrib">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                     &lt;length value="2"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="indEscrituracao">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
		 *                                     &lt;pattern value="0|1"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="indDesoneracao">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
		 *                                     &lt;pattern value="0|1"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="indAcordoIsenMulta">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
		 *                                     &lt;pattern value="0|1"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="indSitPJ" minOccurs="0">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
		 *                                     &lt;pattern value="[0-4]"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="contato">
		 *                                 &lt;complexType>
		 *                                   &lt;complexContent>
		 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                       &lt;sequence>
		 *                                         &lt;element name="nmCtt">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="70"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="cpfCtt">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="3"/>
		 *                                               &lt;maxLength value="11"/>
		 *                                               &lt;pattern value="[0-9]{3,11}"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="foneFixo" minOccurs="0">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="13"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="foneCel" minOccurs="0">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="13"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="email" minOccurs="0">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="60"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                       &lt;/sequence>
		 *                                     &lt;/restriction>
		 *                                   &lt;/complexContent>
		 *                                 &lt;/complexType>
		 *                               &lt;/element>
		 *                               &lt;element name="softHouse" maxOccurs="unbounded" minOccurs="0">
		 *                                 &lt;complexType>
		 *                                   &lt;complexContent>
		 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                       &lt;sequence>
		 *                                         &lt;element name="cnpjSoftHouse">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="3"/>
		 *                                               &lt;maxLength value="14"/>
		 *                                               &lt;pattern value="[0-9]{3,14}"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="nmRazao">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="115"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="nmCont">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="70"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="telefone" minOccurs="0">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="13"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="email" minOccurs="0">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="60"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                       &lt;/sequence>
		 *                                     &lt;/restriction>
		 *                                   &lt;/complexContent>
		 *                                 &lt;/complexType>
		 *                               &lt;/element>
		 *                               &lt;element name="infoEFR" minOccurs="0">
		 *                                 &lt;complexType>
		 *                                   &lt;complexContent>
		 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                       &lt;sequence>
		 *                                         &lt;element name="ideEFR">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;pattern value="S|N"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="cnpjEFR" minOccurs="0">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="8"/>
		 *                                               &lt;maxLength value="14"/>
		 *                                               &lt;pattern value="[0-9]{8,14}"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                       &lt;/sequence>
		 *                                     &lt;/restriction>
		 *                                   &lt;/complexContent>
		 *                                 &lt;/complexType>
		 *                               &lt;/element>
		 *                             &lt;/sequence>
		 *                           &lt;/restriction>
		 *                         &lt;/complexContent>
		 *                       &lt;/complexType>
		 *                     &lt;/element>
		 *                   &lt;/sequence>
		 *                 &lt;/restriction>
		 *               &lt;/complexContent>
		 *             &lt;/complexType>
		 *           &lt;/element>
		 *           &lt;element name="alteracao" minOccurs="0">
		 *             &lt;complexType>
		 *               &lt;complexContent>
		 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                   &lt;sequence>
		 *                     &lt;element name="idePeriodo">
		 *                       &lt;complexType>
		 *                         &lt;complexContent>
		 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                             &lt;sequence>
		 *                               &lt;element name="iniValid">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                     &lt;length value="7"/>
		 *                                     &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="fimValid" minOccurs="0">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                     &lt;length value="7"/>
		 *                                     &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                             &lt;/sequence>
		 *                           &lt;/restriction>
		 *                         &lt;/complexContent>
		 *                       &lt;/complexType>
		 *                     &lt;/element>
		 *                     &lt;element name="infoCadastro">
		 *                       &lt;complexType>
		 *                         &lt;complexContent>
		 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                             &lt;sequence>
		 *                               &lt;element name="classTrib">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                     &lt;length value="2"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="indEscrituracao">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
		 *                                     &lt;pattern value="0|1"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="indDesoneracao">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
		 *                                     &lt;pattern value="0|1"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="indAcordoIsenMulta">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
		 *                                     &lt;pattern value="0|1"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="indSitPJ" minOccurs="0">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
		 *                                     &lt;pattern value="[0-4]"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="contato">
		 *                                 &lt;complexType>
		 *                                   &lt;complexContent>
		 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                       &lt;sequence>
		 *                                         &lt;element name="nmCtt">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="70"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="cpfCtt">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="3"/>
		 *                                               &lt;maxLength value="11"/>
		 *                                               &lt;pattern value="[0-9]{3,11}"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="foneFixo" minOccurs="0">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;maxLength value="13"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="foneCel" minOccurs="0">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;maxLength value="13"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="email" minOccurs="0">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="60"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                       &lt;/sequence>
		 *                                     &lt;/restriction>
		 *                                   &lt;/complexContent>
		 *                                 &lt;/complexType>
		 *                               &lt;/element>
		 *                               &lt;element name="softHouse" maxOccurs="unbounded" minOccurs="0">
		 *                                 &lt;complexType>
		 *                                   &lt;complexContent>
		 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                       &lt;sequence>
		 *                                         &lt;element name="cnpjSoftHouse">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="3"/>
		 *                                               &lt;maxLength value="14"/>
		 *                                               &lt;pattern value="[0-9]{3,14}"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="nmRazao">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="115"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="nmCont">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="70"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="telefone" minOccurs="0">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="13"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="email" minOccurs="0">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="1"/>
		 *                                               &lt;maxLength value="60"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                       &lt;/sequence>
		 *                                     &lt;/restriction>
		 *                                   &lt;/complexContent>
		 *                                 &lt;/complexType>
		 *                               &lt;/element>
		 *                               &lt;element name="infoEFR" minOccurs="0">
		 *                                 &lt;complexType>
		 *                                   &lt;complexContent>
		 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                                       &lt;sequence>
		 *                                         &lt;element name="ideEFR">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;pattern value="S|N"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                         &lt;element name="cnpjEFR" minOccurs="0">
		 *                                           &lt;simpleType>
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                               &lt;minLength value="8"/>
		 *                                               &lt;maxLength value="14"/>
		 *                                               &lt;pattern value="[0-9]{8,14}"/>
		 *                                             &lt;/restriction>
		 *                                           &lt;/simpleType>
		 *                                         &lt;/element>
		 *                                       &lt;/sequence>
		 *                                     &lt;/restriction>
		 *                                   &lt;/complexContent>
		 *                                 &lt;/complexType>
		 *                               &lt;/element>
		 *                             &lt;/sequence>
		 *                           &lt;/restriction>
		 *                         &lt;/complexContent>
		 *                       &lt;/complexType>
		 *                     &lt;/element>
		 *                     &lt;element name="novaValidade" minOccurs="0">
		 *                       &lt;complexType>
		 *                         &lt;complexContent>
		 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                             &lt;sequence>
		 *                               &lt;element name="iniValid">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                     &lt;length value="7"/>
		 *                                     &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="fimValid" minOccurs="0">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                     &lt;length value="7"/>
		 *                                     &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                             &lt;/sequence>
		 *                           &lt;/restriction>
		 *                         &lt;/complexContent>
		 *                       &lt;/complexType>
		 *                     &lt;/element>
		 *                   &lt;/sequence>
		 *                 &lt;/restriction>
		 *               &lt;/complexContent>
		 *             &lt;/complexType>
		 *           &lt;/element>
		 *           &lt;element name="exclusao" minOccurs="0">
		 *             &lt;complexType>
		 *               &lt;complexContent>
		 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                   &lt;sequence>
		 *                     &lt;element name="idePeriodo">
		 *                       &lt;complexType>
		 *                         &lt;complexContent>
		 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                             &lt;sequence>
		 *                               &lt;element name="iniValid">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                     &lt;length value="7"/>
		 *                                     &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                               &lt;element name="fimValid" minOccurs="0">
		 *                                 &lt;simpleType>
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                                     &lt;length value="7"/>
		 *                                     &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
		 *                                   &lt;/restriction>
		 *                                 &lt;/simpleType>
		 *                               &lt;/element>
		 *                             &lt;/sequence>
		 *                           &lt;/restriction>
		 *                         &lt;/complexContent>
		 *                       &lt;/complexType>
		 *                     &lt;/element>
		 *                   &lt;/sequence>
		 *                 &lt;/restriction>
		 *               &lt;/complexContent>
		 *             &lt;/complexType>
		 *           &lt;/element>
		 *         &lt;/choice>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "inclusao", "alteracao", "exclusao" })
		public static class InfoContri {

			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
			protected Reinf.EvtInfoContri.InfoContri.Inclusao inclusao;
			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
			protected Reinf.EvtInfoContri.InfoContri.Alteracao alteracao;
			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
			protected Reinf.EvtInfoContri.InfoContri.Exclusao exclusao;

			/**
			 * Obtém o valor da propriedade inclusao.
			 * 
			 * @return possible object is {@link Reinf.EvtInfoContri.InfoContri.Inclusao }
			 * 
			 */
			public Reinf.EvtInfoContri.InfoContri.Inclusao getInclusao() {
				return inclusao;
			}

			/**
			 * Define o valor da propriedade inclusao.
			 * 
			 * @param value
			 *            allowed object is {@link Reinf.EvtInfoContri.InfoContri.Inclusao }
			 * 
			 */
			public void setInclusao(final Reinf.EvtInfoContri.InfoContri.Inclusao value) {
				inclusao = value;
			}

			/**
			 * Obtém o valor da propriedade alteracao.
			 * 
			 * @return possible object is {@link Reinf.EvtInfoContri.InfoContri.Alteracao }
			 * 
			 */
			public Reinf.EvtInfoContri.InfoContri.Alteracao getAlteracao() {
				return alteracao;
			}

			/**
			 * Define o valor da propriedade alteracao.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link Reinf.EvtInfoContri.InfoContri.Alteracao }
			 * 
			 */
			public void setAlteracao(final Reinf.EvtInfoContri.InfoContri.Alteracao value) {
				alteracao = value;
			}

			/**
			 * Obtém o valor da propriedade exclusao.
			 * 
			 * @return possible object is {@link Reinf.EvtInfoContri.InfoContri.Exclusao }
			 * 
			 */
			public Reinf.EvtInfoContri.InfoContri.Exclusao getExclusao() {
				return exclusao;
			}

			/**
			 * Define o valor da propriedade exclusao.
			 * 
			 * @param value
			 *            allowed object is {@link Reinf.EvtInfoContri.InfoContri.Exclusao }
			 * 
			 */
			public void setExclusao(final Reinf.EvtInfoContri.InfoContri.Exclusao value) {
				exclusao = value;
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
			 *         &lt;element name="idePeriodo">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="iniValid">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;length value="7"/>
			 *                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="fimValid" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;length value="7"/>
			 *                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                 &lt;/sequence>
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *         &lt;element name="infoCadastro">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="classTrib">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;length value="2"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="indEscrituracao">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
			 *                         &lt;pattern value="0|1"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="indDesoneracao">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
			 *                         &lt;pattern value="0|1"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="indAcordoIsenMulta">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
			 *                         &lt;pattern value="0|1"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="indSitPJ" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
			 *                         &lt;pattern value="[0-4]"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="contato">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;sequence>
			 *                             &lt;element name="nmCtt">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="70"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="cpfCtt">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="3"/>
			 *                                   &lt;maxLength value="11"/>
			 *                                   &lt;pattern value="[0-9]{3,11}"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="foneFixo" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;maxLength value="13"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="foneCel" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;maxLength value="13"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="email" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="60"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                           &lt;/sequence>
			 *                         &lt;/restriction>
			 *                       &lt;/complexContent>
			 *                     &lt;/complexType>
			 *                   &lt;/element>
			 *                   &lt;element name="softHouse" maxOccurs="unbounded" minOccurs="0">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;sequence>
			 *                             &lt;element name="cnpjSoftHouse">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="3"/>
			 *                                   &lt;maxLength value="14"/>
			 *                                   &lt;pattern value="[0-9]{3,14}"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="nmRazao">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="115"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="nmCont">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="70"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="telefone" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="13"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="email" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="60"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                           &lt;/sequence>
			 *                         &lt;/restriction>
			 *                       &lt;/complexContent>
			 *                     &lt;/complexType>
			 *                   &lt;/element>
			 *                   &lt;element name="infoEFR" minOccurs="0">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;sequence>
			 *                             &lt;element name="ideEFR">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;pattern value="S|N"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="cnpjEFR" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="8"/>
			 *                                   &lt;maxLength value="14"/>
			 *                                   &lt;pattern value="[0-9]{8,14}"/>
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
			 *         &lt;element name="novaValidade" minOccurs="0">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="iniValid">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;length value="7"/>
			 *                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="fimValid" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;length value="7"/>
			 *                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
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
			@XmlType(name = "", propOrder = { "idePeriodo", "infoCadastro", "novaValidade" })
			public static class Alteracao {

				@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
				protected Reinf.EvtInfoContri.InfoContri.Alteracao.IdePeriodo idePeriodo;
				@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
				protected Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro infoCadastro;
				@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
				protected Reinf.EvtInfoContri.InfoContri.Alteracao.NovaValidade novaValidade;

				/**
				 * Obtém o valor da propriedade idePeriodo.
				 * 
				 * @return possible object is
				 *         {@link Reinf.EvtInfoContri.InfoContri.Alteracao.IdePeriodo }
				 * 
				 */
				public Reinf.EvtInfoContri.InfoContri.Alteracao.IdePeriodo getIdePeriodo() {
					return idePeriodo;
				}

				/**
				 * Define o valor da propriedade idePeriodo.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link Reinf.EvtInfoContri.InfoContri.Alteracao.IdePeriodo }
				 * 
				 */
				public void setIdePeriodo(final Reinf.EvtInfoContri.InfoContri.Alteracao.IdePeriodo value) {
					idePeriodo = value;
				}

				/**
				 * Obtém o valor da propriedade infoCadastro.
				 * 
				 * @return possible object is
				 *         {@link Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro }
				 * 
				 */
				public Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro getInfoCadastro() {
					return infoCadastro;
				}

				/**
				 * Define o valor da propriedade infoCadastro.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro }
				 * 
				 */
				public void setInfoCadastro(final Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro value) {
					infoCadastro = value;
				}

				/**
				 * Obtém o valor da propriedade novaValidade.
				 * 
				 * @return possible object is
				 *         {@link Reinf.EvtInfoContri.InfoContri.Alteracao.NovaValidade }
				 * 
				 */
				public Reinf.EvtInfoContri.InfoContri.Alteracao.NovaValidade getNovaValidade() {
					return novaValidade;
				}

				/**
				 * Define o valor da propriedade novaValidade.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link Reinf.EvtInfoContri.InfoContri.Alteracao.NovaValidade }
				 * 
				 */
				public void setNovaValidade(final Reinf.EvtInfoContri.InfoContri.Alteracao.NovaValidade value) {
					novaValidade = value;
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
				 *         &lt;element name="iniValid">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;length value="7"/>
				 *               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="fimValid" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;length value="7"/>
				 *               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
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
				@XmlType(name = "", propOrder = { "iniValid", "fimValid" })
				public static class IdePeriodo {

					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
					protected String iniValid;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected String fimValid;

					/**
					 * Obtém o valor da propriedade iniValid.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getIniValid() {
						return iniValid;
					}

					/**
					 * Define o valor da propriedade iniValid.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setIniValid(final String value) {
						iniValid = value;
					}

					/**
					 * Obtém o valor da propriedade fimValid.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getFimValid() {
						return fimValid;
					}

					/**
					 * Define o valor da propriedade fimValid.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setFimValid(final String value) {
						fimValid = value;
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
				 *         &lt;element name="classTrib">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;length value="2"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="indEscrituracao">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
				 *               &lt;pattern value="0|1"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="indDesoneracao">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
				 *               &lt;pattern value="0|1"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="indAcordoIsenMulta">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
				 *               &lt;pattern value="0|1"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="indSitPJ" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
				 *               &lt;pattern value="[0-4]"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="contato">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;sequence>
				 *                   &lt;element name="nmCtt">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="70"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="cpfCtt">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="3"/>
				 *                         &lt;maxLength value="11"/>
				 *                         &lt;pattern value="[0-9]{3,11}"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="foneFixo" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;maxLength value="13"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="foneCel" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;maxLength value="13"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="email" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="60"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                 &lt;/sequence>
				 *               &lt;/restriction>
				 *             &lt;/complexContent>
				 *           &lt;/complexType>
				 *         &lt;/element>
				 *         &lt;element name="softHouse" maxOccurs="unbounded" minOccurs="0">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;sequence>
				 *                   &lt;element name="cnpjSoftHouse">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="3"/>
				 *                         &lt;maxLength value="14"/>
				 *                         &lt;pattern value="[0-9]{3,14}"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="nmRazao">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="115"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="nmCont">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="70"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="telefone" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="13"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="email" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="60"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                 &lt;/sequence>
				 *               &lt;/restriction>
				 *             &lt;/complexContent>
				 *           &lt;/complexType>
				 *         &lt;/element>
				 *         &lt;element name="infoEFR" minOccurs="0">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;sequence>
				 *                   &lt;element name="ideEFR">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;pattern value="S|N"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="cnpjEFR" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="8"/>
				 *                         &lt;maxLength value="14"/>
				 *                         &lt;pattern value="[0-9]{8,14}"/>
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
				@XmlType(name = "", propOrder = { "classTrib", "indEscrituracao", "indDesoneracao",
						"indAcordoIsenMulta", "indSitPJ", "contato", "softHouse", "infoEFR" })
				public static class InfoCadastro {

					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
					protected String classTrib;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected long indEscrituracao;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected long indDesoneracao;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected long indAcordoIsenMulta;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected Long indSitPJ;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
					protected Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.Contato contato;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected List<Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.SoftHouse> softHouse;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.InfoEFR infoEFR;

					/**
					 * Obtém o valor da propriedade classTrib.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getClassTrib() {
						return classTrib;
					}

					/**
					 * Define o valor da propriedade classTrib.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setClassTrib(final String value) {
						classTrib = value;
					}

					/**
					 * Obtém o valor da propriedade indEscrituracao.
					 * 
					 */
					public long getIndEscrituracao() {
						return indEscrituracao;
					}

					/**
					 * Define o valor da propriedade indEscrituracao.
					 * 
					 */
					public void setIndEscrituracao(final long value) {
						indEscrituracao = value;
					}

					/**
					 * Obtém o valor da propriedade indDesoneracao.
					 * 
					 */
					public long getIndDesoneracao() {
						return indDesoneracao;
					}

					/**
					 * Define o valor da propriedade indDesoneracao.
					 * 
					 */
					public void setIndDesoneracao(final long value) {
						indDesoneracao = value;
					}

					/**
					 * Obtém o valor da propriedade indAcordoIsenMulta.
					 * 
					 */
					public long getIndAcordoIsenMulta() {
						return indAcordoIsenMulta;
					}

					/**
					 * Define o valor da propriedade indAcordoIsenMulta.
					 * 
					 */
					public void setIndAcordoIsenMulta(final long value) {
						indAcordoIsenMulta = value;
					}

					/**
					 * Obtém o valor da propriedade indSitPJ.
					 * 
					 * @return possible object is {@link Long }
					 * 
					 */
					public Long getIndSitPJ() {
						return indSitPJ;
					}

					/**
					 * Define o valor da propriedade indSitPJ.
					 * 
					 * @param value
					 *            allowed object is {@link Long }
					 * 
					 */
					public void setIndSitPJ(final Long value) {
						indSitPJ = value;
					}

					/**
					 * Obtém o valor da propriedade contato.
					 * 
					 * @return possible object is
					 *         {@link Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.Contato }
					 * 
					 */
					public Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.Contato getContato() {
						return contato;
					}

					/**
					 * Define o valor da propriedade contato.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.Contato }
					 * 
					 */
					public void setContato(final Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.Contato value) {
						contato = value;
					}

					/**
					 * Gets the value of the softHouse property.
					 * 
					 * <p>
					 * This accessor method returns a reference to the live list, not a snapshot.
					 * Therefore any modification you make to the returned list will be present
					 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
					 * for the softHouse property.
					 * 
					 * <p>
					 * For example, to add a new item, do as follows:
					 * 
					 * <pre>
					 * getSoftHouse().add(newItem);
					 * </pre>
					 * 
					 * 
					 * <p>
					 * Objects of the following type(s) are allowed in the list
					 * {@link Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.SoftHouse }
					 * 
					 * 
					 */
					public List<Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.SoftHouse> getSoftHouse() {
						if (softHouse == null) {
							softHouse = new ArrayList<Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.SoftHouse>();
						}
						return softHouse;
					}

					/**
					 * Obtém o valor da propriedade infoEFR.
					 * 
					 * @return possible object is
					 *         {@link Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.InfoEFR }
					 * 
					 */
					public Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.InfoEFR getInfoEFR() {
						return infoEFR;
					}

					/**
					 * Define o valor da propriedade infoEFR.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.InfoEFR }
					 * 
					 */
					public void setInfoEFR(final Reinf.EvtInfoContri.InfoContri.Alteracao.InfoCadastro.InfoEFR value) {
						infoEFR = value;
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
					 *         &lt;element name="nmCtt">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="70"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="cpfCtt">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="3"/>
					 *               &lt;maxLength value="11"/>
					 *               &lt;pattern value="[0-9]{3,11}"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="foneFixo" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;maxLength value="13"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="foneCel" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;maxLength value="13"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="email" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="60"/>
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
					@XmlType(name = "", propOrder = { "nmCtt", "cpfCtt", "foneFixo", "foneCel", "email" })
					public static class Contato {

						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
						protected String nmCtt;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
						protected String cpfCtt;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
						protected String foneFixo;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
						protected String foneCel;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
						protected String email;

						/**
						 * Obtém o valor da propriedade nmCtt.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getNmCtt() {
							return nmCtt;
						}

						/**
						 * Define o valor da propriedade nmCtt.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setNmCtt(final String value) {
							nmCtt = value;
						}

						/**
						 * Obtém o valor da propriedade cpfCtt.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getCpfCtt() {
							return cpfCtt;
						}

						/**
						 * Define o valor da propriedade cpfCtt.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setCpfCtt(final String value) {
							cpfCtt = value;
						}

						/**
						 * Obtém o valor da propriedade foneFixo.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getFoneFixo() {
							return foneFixo;
						}

						/**
						 * Define o valor da propriedade foneFixo.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setFoneFixo(final String value) {
							foneFixo = value;
						}

						/**
						 * Obtém o valor da propriedade foneCel.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getFoneCel() {
							return foneCel;
						}

						/**
						 * Define o valor da propriedade foneCel.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setFoneCel(final String value) {
							foneCel = value;
						}

						/**
						 * Obtém o valor da propriedade email.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getEmail() {
							return email;
						}

						/**
						 * Define o valor da propriedade email.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setEmail(final String value) {
							email = value;
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
					 *         &lt;element name="ideEFR">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;pattern value="S|N"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="cnpjEFR" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="8"/>
					 *               &lt;maxLength value="14"/>
					 *               &lt;pattern value="[0-9]{8,14}"/>
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
					@XmlType(name = "", propOrder = { "ideEFR", "cnpjEFR" })
					public static class InfoEFR {

						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
						protected String ideEFR;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
						protected String cnpjEFR;

						/**
						 * Obtém o valor da propriedade ideEFR.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getIdeEFR() {
							return ideEFR;
						}

						/**
						 * Define o valor da propriedade ideEFR.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setIdeEFR(final String value) {
							ideEFR = value;
						}

						/**
						 * Obtém o valor da propriedade cnpjEFR.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getCnpjEFR() {
							return cnpjEFR;
						}

						/**
						 * Define o valor da propriedade cnpjEFR.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setCnpjEFR(final String value) {
							cnpjEFR = value;
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
					 *         &lt;element name="cnpjSoftHouse">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="3"/>
					 *               &lt;maxLength value="14"/>
					 *               &lt;pattern value="[0-9]{3,14}"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="nmRazao">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="115"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="nmCont">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="70"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="telefone" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="13"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="email" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="60"/>
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
					@XmlType(name = "", propOrder = { "cnpjSoftHouse", "nmRazao", "nmCont", "telefone", "email" })
					public static class SoftHouse {

						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
						protected String cnpjSoftHouse;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
						protected String nmRazao;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
						protected String nmCont;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
						protected String telefone;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
						protected String email;

						/**
						 * Obtém o valor da propriedade cnpjSoftHouse.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getCnpjSoftHouse() {
							return cnpjSoftHouse;
						}

						/**
						 * Define o valor da propriedade cnpjSoftHouse.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setCnpjSoftHouse(final String value) {
							cnpjSoftHouse = value;
						}

						/**
						 * Obtém o valor da propriedade nmRazao.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getNmRazao() {
							return nmRazao;
						}

						/**
						 * Define o valor da propriedade nmRazao.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setNmRazao(final String value) {
							nmRazao = value;
						}

						/**
						 * Obtém o valor da propriedade nmCont.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getNmCont() {
							return nmCont;
						}

						/**
						 * Define o valor da propriedade nmCont.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setNmCont(final String value) {
							nmCont = value;
						}

						/**
						 * Obtém o valor da propriedade telefone.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getTelefone() {
							return telefone;
						}

						/**
						 * Define o valor da propriedade telefone.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setTelefone(final String value) {
							telefone = value;
						}

						/**
						 * Obtém o valor da propriedade email.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getEmail() {
							return email;
						}

						/**
						 * Define o valor da propriedade email.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setEmail(final String value) {
							email = value;
						}

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
				 *         &lt;element name="iniValid">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;length value="7"/>
				 *               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="fimValid" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;length value="7"/>
				 *               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
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
				@XmlType(name = "", propOrder = { "iniValid", "fimValid" })
				public static class NovaValidade {

					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
					protected String iniValid;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected String fimValid;

					/**
					 * Obtém o valor da propriedade iniValid.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getIniValid() {
						return iniValid;
					}

					/**
					 * Define o valor da propriedade iniValid.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setIniValid(final String value) {
						iniValid = value;
					}

					/**
					 * Obtém o valor da propriedade fimValid.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getFimValid() {
						return fimValid;
					}

					/**
					 * Define o valor da propriedade fimValid.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setFimValid(final String value) {
						fimValid = value;
					}

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
			 *         &lt;element name="idePeriodo">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="iniValid">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;length value="7"/>
			 *                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="fimValid" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;length value="7"/>
			 *                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
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
			@XmlType(name = "", propOrder = { "idePeriodo" })
			public static class Exclusao {

				@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
				protected Reinf.EvtInfoContri.InfoContri.Exclusao.IdePeriodo idePeriodo;

				/**
				 * Obtém o valor da propriedade idePeriodo.
				 * 
				 * @return possible object is
				 *         {@link Reinf.EvtInfoContri.InfoContri.Exclusao.IdePeriodo }
				 * 
				 */
				public Reinf.EvtInfoContri.InfoContri.Exclusao.IdePeriodo getIdePeriodo() {
					return idePeriodo;
				}

				/**
				 * Define o valor da propriedade idePeriodo.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link Reinf.EvtInfoContri.InfoContri.Exclusao.IdePeriodo }
				 * 
				 */
				public void setIdePeriodo(final Reinf.EvtInfoContri.InfoContri.Exclusao.IdePeriodo value) {
					idePeriodo = value;
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
				 *         &lt;element name="iniValid">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;length value="7"/>
				 *               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="fimValid" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;length value="7"/>
				 *               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
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
				@XmlType(name = "", propOrder = { "iniValid", "fimValid" })
				public static class IdePeriodo {

					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
					protected String iniValid;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected String fimValid;

					/**
					 * Obtém o valor da propriedade iniValid.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getIniValid() {
						return iniValid;
					}

					/**
					 * Define o valor da propriedade iniValid.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setIniValid(final String value) {
						iniValid = value;
					}

					/**
					 * Obtém o valor da propriedade fimValid.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getFimValid() {
						return fimValid;
					}

					/**
					 * Define o valor da propriedade fimValid.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setFimValid(final String value) {
						fimValid = value;
					}

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
			 *         &lt;element name="idePeriodo">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="iniValid">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;length value="7"/>
			 *                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="fimValid" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;length value="7"/>
			 *                         &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                 &lt;/sequence>
			 *               &lt;/restriction>
			 *             &lt;/complexContent>
			 *           &lt;/complexType>
			 *         &lt;/element>
			 *         &lt;element name="infoCadastro">
			 *           &lt;complexType>
			 *             &lt;complexContent>
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                 &lt;sequence>
			 *                   &lt;element name="classTrib">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                         &lt;length value="2"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="indEscrituracao">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
			 *                         &lt;pattern value="0|1"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="indDesoneracao">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
			 *                         &lt;pattern value="0|1"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="indAcordoIsenMulta">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
			 *                         &lt;pattern value="0|1"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="indSitPJ" minOccurs="0">
			 *                     &lt;simpleType>
			 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
			 *                         &lt;pattern value="[0-4]"/>
			 *                       &lt;/restriction>
			 *                     &lt;/simpleType>
			 *                   &lt;/element>
			 *                   &lt;element name="contato">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;sequence>
			 *                             &lt;element name="nmCtt">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="70"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="cpfCtt">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="3"/>
			 *                                   &lt;maxLength value="11"/>
			 *                                   &lt;pattern value="[0-9]{3,11}"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="foneFixo" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="13"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="foneCel" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="13"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="email" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="60"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                           &lt;/sequence>
			 *                         &lt;/restriction>
			 *                       &lt;/complexContent>
			 *                     &lt;/complexType>
			 *                   &lt;/element>
			 *                   &lt;element name="softHouse" maxOccurs="unbounded" minOccurs="0">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;sequence>
			 *                             &lt;element name="cnpjSoftHouse">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="3"/>
			 *                                   &lt;maxLength value="14"/>
			 *                                   &lt;pattern value="[0-9]{3,14}"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="nmRazao">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="115"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="nmCont">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="70"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="telefone" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="13"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="email" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="1"/>
			 *                                   &lt;maxLength value="60"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                           &lt;/sequence>
			 *                         &lt;/restriction>
			 *                       &lt;/complexContent>
			 *                     &lt;/complexType>
			 *                   &lt;/element>
			 *                   &lt;element name="infoEFR" minOccurs="0">
			 *                     &lt;complexType>
			 *                       &lt;complexContent>
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *                           &lt;sequence>
			 *                             &lt;element name="ideEFR">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;pattern value="S|N"/>
			 *                                 &lt;/restriction>
			 *                               &lt;/simpleType>
			 *                             &lt;/element>
			 *                             &lt;element name="cnpjEFR" minOccurs="0">
			 *                               &lt;simpleType>
			 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *                                   &lt;minLength value="8"/>
			 *                                   &lt;maxLength value="14"/>
			 *                                   &lt;pattern value="[0-9]{8,14}"/>
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
			@XmlType(name = "", propOrder = { "idePeriodo", "infoCadastro" })
			public static class Inclusao {

				@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
				protected Reinf.EvtInfoContri.InfoContri.Inclusao.IdePeriodo idePeriodo;
				@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
				protected Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro infoCadastro;

				/**
				 * Obtém o valor da propriedade idePeriodo.
				 * 
				 * @return possible object is
				 *         {@link Reinf.EvtInfoContri.InfoContri.Inclusao.IdePeriodo }
				 * 
				 */
				public Reinf.EvtInfoContri.InfoContri.Inclusao.IdePeriodo getIdePeriodo() {
					return idePeriodo;
				}

				/**
				 * Define o valor da propriedade idePeriodo.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link Reinf.EvtInfoContri.InfoContri.Inclusao.IdePeriodo }
				 * 
				 */
				public void setIdePeriodo(final Reinf.EvtInfoContri.InfoContri.Inclusao.IdePeriodo value) {
					idePeriodo = value;
				}

				/**
				 * Obtém o valor da propriedade infoCadastro.
				 * 
				 * @return possible object is
				 *         {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro }
				 * 
				 */
				public Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro getInfoCadastro() {
					return infoCadastro;
				}

				/**
				 * Define o valor da propriedade infoCadastro.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro }
				 * 
				 */
				public void setInfoCadastro(final Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro value) {
					infoCadastro = value;
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
				 *         &lt;element name="iniValid">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;length value="7"/>
				 *               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="fimValid" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;length value="7"/>
				 *               &lt;pattern value="20([0-9][0-9])-(0[1-9]|1[0-2])"/>
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
				@XmlType(name = "", propOrder = { "iniValid", "fimValid" })
				public static class IdePeriodo {

					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
					protected String iniValid;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected String fimValid;

					/**
					 * Obtém o valor da propriedade iniValid.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getIniValid() {
						return iniValid;
					}

					/**
					 * Define o valor da propriedade iniValid.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setIniValid(final String value) {
						iniValid = value;
					}

					/**
					 * Obtém o valor da propriedade fimValid.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getFimValid() {
						return fimValid;
					}

					/**
					 * Define o valor da propriedade fimValid.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setFimValid(final String value) {
						fimValid = value;
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
				 *         &lt;element name="classTrib">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *               &lt;length value="2"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="indEscrituracao">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
				 *               &lt;pattern value="0|1"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="indDesoneracao">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
				 *               &lt;pattern value="0|1"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="indAcordoIsenMulta">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
				 *               &lt;pattern value="0|1"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="indSitPJ" minOccurs="0">
				 *           &lt;simpleType>
				 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
				 *               &lt;pattern value="[0-4]"/>
				 *             &lt;/restriction>
				 *           &lt;/simpleType>
				 *         &lt;/element>
				 *         &lt;element name="contato">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;sequence>
				 *                   &lt;element name="nmCtt">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="70"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="cpfCtt">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="3"/>
				 *                         &lt;maxLength value="11"/>
				 *                         &lt;pattern value="[0-9]{3,11}"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="foneFixo" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="13"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="foneCel" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="13"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="email" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="60"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                 &lt;/sequence>
				 *               &lt;/restriction>
				 *             &lt;/complexContent>
				 *           &lt;/complexType>
				 *         &lt;/element>
				 *         &lt;element name="softHouse" maxOccurs="unbounded" minOccurs="0">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;sequence>
				 *                   &lt;element name="cnpjSoftHouse">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="3"/>
				 *                         &lt;maxLength value="14"/>
				 *                         &lt;pattern value="[0-9]{3,14}"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="nmRazao">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="115"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="nmCont">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="70"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="telefone" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="13"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="email" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="1"/>
				 *                         &lt;maxLength value="60"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                 &lt;/sequence>
				 *               &lt;/restriction>
				 *             &lt;/complexContent>
				 *           &lt;/complexType>
				 *         &lt;/element>
				 *         &lt;element name="infoEFR" minOccurs="0">
				 *           &lt;complexType>
				 *             &lt;complexContent>
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
				 *                 &lt;sequence>
				 *                   &lt;element name="ideEFR">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;pattern value="S|N"/>
				 *                       &lt;/restriction>
				 *                     &lt;/simpleType>
				 *                   &lt;/element>
				 *                   &lt;element name="cnpjEFR" minOccurs="0">
				 *                     &lt;simpleType>
				 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
				 *                         &lt;minLength value="8"/>
				 *                         &lt;maxLength value="14"/>
				 *                         &lt;pattern value="[0-9]{8,14}"/>
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
				@XmlType(name = "", propOrder = { "classTrib", "indEscrituracao", "indDesoneracao",
						"indAcordoIsenMulta", "indSitPJ", "contato", "softHouse", "infoEFR" })
				public static class InfoCadastro {

					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
					protected String classTrib;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected long indEscrituracao;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected long indDesoneracao;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected long indAcordoIsenMulta;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected Long indSitPJ;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
					protected Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.Contato contato;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected List<Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.SoftHouse> softHouse;
					@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
					protected Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.InfoEFR infoEFR;

					/**
					 * Obtém o valor da propriedade classTrib.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getClassTrib() {
						return classTrib;
					}

					/**
					 * Define o valor da propriedade classTrib.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setClassTrib(final String value) {
						classTrib = value;
					}

					/**
					 * Obtém o valor da propriedade indEscrituracao.
					 * 
					 */
					public long getIndEscrituracao() {
						return indEscrituracao;
					}

					/**
					 * Define o valor da propriedade indEscrituracao.
					 * 
					 */
					public void setIndEscrituracao(final long value) {
						indEscrituracao = value;
					}

					/**
					 * Obtém o valor da propriedade indDesoneracao.
					 * 
					 */
					public long getIndDesoneracao() {
						return indDesoneracao;
					}

					/**
					 * Define o valor da propriedade indDesoneracao.
					 * 
					 */
					public void setIndDesoneracao(final long value) {
						indDesoneracao = value;
					}

					/**
					 * Obtém o valor da propriedade indAcordoIsenMulta.
					 * 
					 */
					public long getIndAcordoIsenMulta() {
						return indAcordoIsenMulta;
					}

					/**
					 * Define o valor da propriedade indAcordoIsenMulta.
					 * 
					 */
					public void setIndAcordoIsenMulta(final long value) {
						indAcordoIsenMulta = value;
					}

					/**
					 * Obtém o valor da propriedade indSitPJ.
					 * 
					 * @return possible object is {@link Long }
					 * 
					 */
					public Long getIndSitPJ() {
						return indSitPJ;
					}

					/**
					 * Define o valor da propriedade indSitPJ.
					 * 
					 * @param value
					 *            allowed object is {@link Long }
					 * 
					 */
					public void setIndSitPJ(final Long value) {
						indSitPJ = value;
					}

					/**
					 * Obtém o valor da propriedade contato.
					 * 
					 * @return possible object is
					 *         {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.Contato }
					 * 
					 */
					public Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.Contato getContato() {
						return contato;
					}

					/**
					 * Define o valor da propriedade contato.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.Contato }
					 * 
					 */
					public void setContato(final Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.Contato value) {
						contato = value;
					}

					/**
					 * Gets the value of the softHouse property.
					 * 
					 * <p>
					 * This accessor method returns a reference to the live list, not a snapshot.
					 * Therefore any modification you make to the returned list will be present
					 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
					 * for the softHouse property.
					 * 
					 * <p>
					 * For example, to add a new item, do as follows:
					 * 
					 * <pre>
					 * getSoftHouse().add(newItem);
					 * </pre>
					 * 
					 * 
					 * <p>
					 * Objects of the following type(s) are allowed in the list
					 * {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.SoftHouse }
					 * 
					 * 
					 */
					public List<Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.SoftHouse> getSoftHouse() {
						if (softHouse == null) {
							softHouse = new ArrayList<Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.SoftHouse>();
						}
						return softHouse;
					}

					/**
					 * Obtém o valor da propriedade infoEFR.
					 * 
					 * @return possible object is
					 *         {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.InfoEFR }
					 * 
					 */
					public Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.InfoEFR getInfoEFR() {
						return infoEFR;
					}

					/**
					 * Define o valor da propriedade infoEFR.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.InfoEFR }
					 * 
					 */
					public void setInfoEFR(final Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.InfoEFR value) {
						infoEFR = value;
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
					 *         &lt;element name="nmCtt">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="70"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="cpfCtt">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="3"/>
					 *               &lt;maxLength value="11"/>
					 *               &lt;pattern value="[0-9]{3,11}"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="foneFixo" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="13"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="foneCel" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="13"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="email" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="60"/>
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
					@XmlType(name = "", propOrder = { "nmCtt", "cpfCtt", "foneFixo", "foneCel", "email" })
					public static class Contato {

						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
						protected String nmCtt;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
						protected String cpfCtt;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
						protected String foneFixo;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
						protected String foneCel;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
						protected String email;

						/**
						 * Obtém o valor da propriedade nmCtt.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getNmCtt() {
							return nmCtt;
						}

						/**
						 * Define o valor da propriedade nmCtt.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setNmCtt(final String value) {
							nmCtt = value;
						}

						/**
						 * Obtém o valor da propriedade cpfCtt.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getCpfCtt() {
							return cpfCtt;
						}

						/**
						 * Define o valor da propriedade cpfCtt.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setCpfCtt(final String value) {
							cpfCtt = value;
						}

						/**
						 * Obtém o valor da propriedade foneFixo.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getFoneFixo() {
							return foneFixo;
						}

						/**
						 * Define o valor da propriedade foneFixo.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setFoneFixo(final String value) {
							foneFixo = value;
						}

						/**
						 * Obtém o valor da propriedade foneCel.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getFoneCel() {
							return foneCel;
						}

						/**
						 * Define o valor da propriedade foneCel.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setFoneCel(final String value) {
							foneCel = value;
						}

						/**
						 * Obtém o valor da propriedade email.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getEmail() {
							return email;
						}

						/**
						 * Define o valor da propriedade email.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setEmail(final String value) {
							email = value;
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
					 *         &lt;element name="ideEFR">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;pattern value="S|N"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="cnpjEFR" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="8"/>
					 *               &lt;maxLength value="14"/>
					 *               &lt;pattern value="[0-9]{8,14}"/>
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
					@XmlType(name = "", propOrder = { "ideEFR", "cnpjEFR" })
					public static class InfoEFR {

						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
						protected String ideEFR;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
						protected String cnpjEFR;

						/**
						 * Obtém o valor da propriedade ideEFR.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getIdeEFR() {
							return ideEFR;
						}

						/**
						 * Define o valor da propriedade ideEFR.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setIdeEFR(final String value) {
							ideEFR = value;
						}

						/**
						 * Obtém o valor da propriedade cnpjEFR.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getCnpjEFR() {
							return cnpjEFR;
						}

						/**
						 * Define o valor da propriedade cnpjEFR.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setCnpjEFR(final String value) {
							cnpjEFR = value;
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
					 *         &lt;element name="cnpjSoftHouse">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="3"/>
					 *               &lt;maxLength value="14"/>
					 *               &lt;pattern value="[0-9]{3,14}"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="nmRazao">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="115"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="nmCont">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="70"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="telefone" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="13"/>
					 *             &lt;/restriction>
					 *           &lt;/simpleType>
					 *         &lt;/element>
					 *         &lt;element name="email" minOccurs="0">
					 *           &lt;simpleType>
					 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
					 *               &lt;minLength value="1"/>
					 *               &lt;maxLength value="60"/>
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
					@XmlType(name = "", propOrder = { "cnpjSoftHouse", "nmRazao", "nmCont", "telefone", "email" })
					public static class SoftHouse {

						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
						protected String cnpjSoftHouse;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
						protected String nmRazao;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00", required = true)
						protected String nmCont;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
						protected String telefone;
						@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/evtInfoContribuinte/v1_02_00")
						protected String email;

						/**
						 * Obtém o valor da propriedade cnpjSoftHouse.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getCnpjSoftHouse() {
							return cnpjSoftHouse;
						}

						/**
						 * Define o valor da propriedade cnpjSoftHouse.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setCnpjSoftHouse(final String value) {
							cnpjSoftHouse = value;
						}

						/**
						 * Obtém o valor da propriedade nmRazao.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getNmRazao() {
							return nmRazao;
						}

						/**
						 * Define o valor da propriedade nmRazao.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setNmRazao(final String value) {
							nmRazao = value;
						}

						/**
						 * Obtém o valor da propriedade nmCont.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getNmCont() {
							return nmCont;
						}

						/**
						 * Define o valor da propriedade nmCont.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setNmCont(final String value) {
							nmCont = value;
						}

						/**
						 * Obtém o valor da propriedade telefone.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getTelefone() {
							return telefone;
						}

						/**
						 * Define o valor da propriedade telefone.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setTelefone(final String value) {
							telefone = value;
						}

						/**
						 * Obtém o valor da propriedade email.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getEmail() {
							return email;
						}

						/**
						 * Define o valor da propriedade email.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setEmail(final String value) {
							email = value;
						}

					}

				}

			}

		}

	}

}

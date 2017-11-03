//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.11.03 às 02:56:12 PM GFT 
//


package com.vadinei.reinf.operacao.schema.comunicacao.retornoloteevento;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Define uma ocorrencia encontrada no processamento de um arquivo.
 * 
 * <p>Classe Java de TRegistroOcorrencias complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRegistroOcorrencias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ocorrencias" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tipo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="localizacaoErroAviso" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="codigo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="descricao">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="255"/>
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
@XmlType(name = "TRegistroOcorrencias", namespace = "http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01", propOrder = {
    "ocorrencias"
})
public class TRegistroOcorrencias {

    @XmlElement(required = true)
    protected List<TRegistroOcorrencias.Ocorrencias> ocorrencias;

    /**
     * Gets the value of the ocorrencias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ocorrencias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOcorrencias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRegistroOcorrencias.Ocorrencias }
     * 
     * 
     */
    public List<TRegistroOcorrencias.Ocorrencias> getOcorrencias() {
        if (ocorrencias == null) {
            ocorrencias = new ArrayList<TRegistroOcorrencias.Ocorrencias>();
        }
        return this.ocorrencias;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tipo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="localizacaoErroAviso" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="codigo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="descricao">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="255"/>
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
    @XmlType(name = "", propOrder = {
        "tipo",
        "localizacaoErroAviso",
        "codigo",
        "descricao"
    })
    public static class Ocorrencias {

        @XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01", required = true)
        protected BigInteger tipo;
        @XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01")
        protected String localizacaoErroAviso;
        @XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01", required = true)
        protected String codigo;
        @XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01", required = true)
        protected String descricao;

        /**
         * Obtém o valor da propriedade tipo.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipo() {
            return tipo;
        }

        /**
         * Define o valor da propriedade tipo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipo(BigInteger value) {
            this.tipo = value;
        }

        /**
         * Obtém o valor da propriedade localizacaoErroAviso.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalizacaoErroAviso() {
            return localizacaoErroAviso;
        }

        /**
         * Define o valor da propriedade localizacaoErroAviso.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalizacaoErroAviso(String value) {
            this.localizacaoErroAviso = value;
        }

        /**
         * Obtém o valor da propriedade codigo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Define o valor da propriedade codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

        /**
         * Obtém o valor da propriedade descricao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescricao() {
            return descricao;
        }

        /**
         * Define o valor da propriedade descricao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescricao(String value) {
            this.descricao = value;
        }

    }

}

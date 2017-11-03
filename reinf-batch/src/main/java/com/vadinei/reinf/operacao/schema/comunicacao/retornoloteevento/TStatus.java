//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.11.03 às 02:56:12 PM GFT 
//


package com.vadinei.reinf.operacao.schema.comunicacao.retornoloteevento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contém o status atual do da resposta do processamento do lote (Código e Descrição).
 * 
 * <p>Classe Java de TStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdStatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descRetorno">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dadosRegistroOcorrenciaLote" type="{http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01}TRegistroOcorrencias" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStatus", namespace = "http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01", propOrder = {
    "cdStatus",
    "descRetorno",
    "dadosRegistroOcorrenciaLote"
})
public class TStatus {

    @XmlElement(required = true)
    protected String cdStatus;
    @XmlElement(required = true)
    protected String descRetorno;
    protected TRegistroOcorrencias dadosRegistroOcorrenciaLote;

    /**
     * Obtém o valor da propriedade cdStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdStatus() {
        return cdStatus;
    }

    /**
     * Define o valor da propriedade cdStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdStatus(String value) {
        this.cdStatus = value;
    }

    /**
     * Obtém o valor da propriedade descRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRetorno() {
        return descRetorno;
    }

    /**
     * Define o valor da propriedade descRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRetorno(String value) {
        this.descRetorno = value;
    }

    /**
     * Obtém o valor da propriedade dadosRegistroOcorrenciaLote.
     * 
     * @return
     *     possible object is
     *     {@link TRegistroOcorrencias }
     *     
     */
    public TRegistroOcorrencias getDadosRegistroOcorrenciaLote() {
        return dadosRegistroOcorrenciaLote;
    }

    /**
     * Define o valor da propriedade dadosRegistroOcorrenciaLote.
     * 
     * @param value
     *     allowed object is
     *     {@link TRegistroOcorrencias }
     *     
     */
    public void setDadosRegistroOcorrenciaLote(TRegistroOcorrencias value) {
        this.dadosRegistroOcorrenciaLote = value;
    }

}

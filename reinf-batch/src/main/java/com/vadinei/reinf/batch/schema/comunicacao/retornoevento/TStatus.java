//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.11.03 às 03:00:10 PM GFT 
//


package com.vadinei.reinf.batch.schema.comunicacao.retornoevento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contém o status atual do Evento(Código e Descrição).
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
 *         &lt;element name="cdRetorno">
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
 *         &lt;element name="dadosRegistroOcorrenciaEvento" type="{http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01}TRegistroOcorrencias" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStatus", namespace = "http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01", propOrder = {
    "cdRetorno",
    "descRetorno",
    "dadosRegistroOcorrenciaEvento"
})
public class TStatus {

    @XmlElement(required = true)
    protected String cdRetorno;
    @XmlElement(required = true)
    protected String descRetorno;
    protected TRegistroOcorrencias dadosRegistroOcorrenciaEvento;

    /**
     * Obtém o valor da propriedade cdRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdRetorno() {
        return cdRetorno;
    }

    /**
     * Define o valor da propriedade cdRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdRetorno(String value) {
        this.cdRetorno = value;
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
     * Obtém o valor da propriedade dadosRegistroOcorrenciaEvento.
     * 
     * @return
     *     possible object is
     *     {@link TRegistroOcorrencias }
     *     
     */
    public TRegistroOcorrencias getDadosRegistroOcorrenciaEvento() {
        return dadosRegistroOcorrenciaEvento;
    }

    /**
     * Define o valor da propriedade dadosRegistroOcorrenciaEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link TRegistroOcorrencias }
     *     
     */
    public void setDadosRegistroOcorrenciaEvento(TRegistroOcorrencias value) {
        this.dadosRegistroOcorrenciaEvento = value;
    }

}

//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.11.03 às 03:00:10 PM GFT 
//


package com.vadinei.reinf.batch.operacao.schema.comunicacao.retornoevento;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informações de identificação do contribuinte
 * 
 * <p>Classe Java de TIdeContrib complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TIdeContrib">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpInsc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nrInsc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="15"/>
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
@XmlType(name = "TIdeContrib", namespace = "http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01", propOrder = {
    "tpInsc",
    "nrInsc"
})
public class TIdeContrib {

    @XmlElement(required = true)
    protected BigInteger tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;

    /**
     * Obtém o valor da propriedade tpInsc.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTpInsc() {
        return tpInsc;
    }

    /**
     * Define o valor da propriedade tpInsc.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTpInsc(BigInteger value) {
        this.tpInsc = value;
    }

    /**
     * Obtém o valor da propriedade nrInsc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInsc() {
        return nrInsc;
    }

    /**
     * Define o valor da propriedade nrInsc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInsc(String value) {
        this.nrInsc = value;
    }

}

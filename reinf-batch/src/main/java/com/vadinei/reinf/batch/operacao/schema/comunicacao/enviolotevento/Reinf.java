//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.11.03 às 02:50:03 PM GFT 
//


package com.vadinei.reinf.batch.operacao.schema.comunicacao.enviolotevento;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="loteEventos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="100">
 *                   &lt;element name="evento" type="{http://www.reinf.esocial.gov.br/schemas/envioLoteEventos/v1_01_01}TArquivoeReinf"/>
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
@XmlType(name = "", propOrder = {
    "loteEventos"
})
@XmlRootElement(name = "Reinf")
public class Reinf {

    @XmlElement(required = true)
    protected Reinf.LoteEventos loteEventos;

    /**
     * Obtém o valor da propriedade loteEventos.
     * 
     * @return
     *     possible object is
     *     {@link Reinf.LoteEventos }
     *     
     */
    public Reinf.LoteEventos getLoteEventos() {
        return loteEventos;
    }

    /**
     * Define o valor da propriedade loteEventos.
     * 
     * @param value
     *     allowed object is
     *     {@link Reinf.LoteEventos }
     *     
     */
    public void setLoteEventos(Reinf.LoteEventos value) {
        this.loteEventos = value;
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
     *       &lt;sequence maxOccurs="100">
     *         &lt;element name="evento" type="{http://www.reinf.esocial.gov.br/schemas/envioLoteEventos/v1_01_01}TArquivoeReinf"/>
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
        "evento"
    })
    public static class LoteEventos {

        @XmlElement(required = true)
        protected List<TArquivoeReinf> evento;

        /**
         * Gets the value of the evento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the evento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TArquivoeReinf }
         * 
         * 
         */
        public List<TArquivoeReinf> getEvento() {
            if (evento == null) {
                evento = new ArrayList<TArquivoeReinf>();
            }
            return this.evento;
        }

    }

}

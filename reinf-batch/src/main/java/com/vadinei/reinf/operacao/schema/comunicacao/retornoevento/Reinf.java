//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.11.03 às 03:00:10 PM GFT 
//

package com.vadinei.reinf.operacao.schema.comunicacao.retornoevento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.vadinei.reinf.operacao.schema.comum.SignatureType;

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
 *         &lt;element name="retornoEvento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideContrib" type="{http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01}TIdeContrib"/>
 *                   &lt;element name="dadosRecepcaoEvento" type="{http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01}TDadosRecepcaoEvento"/>
 *                   &lt;element name="status" type="{http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01}TStatus"/>
 *                   &lt;element name="dadosReciboEntrega" type="{http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01}TDadosReciboEntrega" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
@XmlType(name = "", propOrder = { "retornoEvento", "signature" })
@XmlRootElement(name = "Reinf", namespace = "http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01")
public class Reinf {

	@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01", required = true)
	protected Reinf.RetornoEvento retornoEvento;
	@XmlElement(name = "Signature", required = true)
	protected SignatureType signature;

	/**
	 * Obtém o valor da propriedade retornoEvento.
	 * 
	 * @return possible object is {@link Reinf.RetornoEvento }
	 * 
	 */
	public Reinf.RetornoEvento getRetornoEvento() {
		return retornoEvento;
	}

	/**
	 * Define o valor da propriedade retornoEvento.
	 * 
	 * @param value
	 *            allowed object is {@link Reinf.RetornoEvento }
	 * 
	 */
	public void setRetornoEvento(final Reinf.RetornoEvento value) {
		retornoEvento = value;
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
	 *         &lt;element name="ideContrib" type="{http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01}TIdeContrib"/>
	 *         &lt;element name="dadosRecepcaoEvento" type="{http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01}TDadosRecepcaoEvento"/>
	 *         &lt;element name="status" type="{http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01}TStatus"/>
	 *         &lt;element name="dadosReciboEntrega" type="{http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01}TDadosReciboEntrega" minOccurs="0"/>
	 *       &lt;/sequence>
	 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "ideContrib", "dadosRecepcaoEvento", "status", "dadosReciboEntrega" })
	public static class RetornoEvento {

		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01", required = true)
		protected TIdeContrib ideContrib;
		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01", required = true)
		protected TDadosRecepcaoEvento dadosRecepcaoEvento;
		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01", required = true)
		protected TStatus status;
		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoEvento/v1_01_01")
		protected TDadosReciboEntrega dadosReciboEntrega;
		@XmlAttribute(name = "id", required = true)
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		@XmlSchemaType(name = "ID")
		protected String id;

		/**
		 * Obtém o valor da propriedade ideContrib.
		 * 
		 * @return possible object is {@link TIdeContrib }
		 * 
		 */
		public TIdeContrib getIdeContrib() {
			return ideContrib;
		}

		/**
		 * Define o valor da propriedade ideContrib.
		 * 
		 * @param value
		 *            allowed object is {@link TIdeContrib }
		 * 
		 */
		public void setIdeContrib(final TIdeContrib value) {
			ideContrib = value;
		}

		/**
		 * Obtém o valor da propriedade dadosRecepcaoEvento.
		 * 
		 * @return possible object is {@link TDadosRecepcaoEvento }
		 * 
		 */
		public TDadosRecepcaoEvento getDadosRecepcaoEvento() {
			return dadosRecepcaoEvento;
		}

		/**
		 * Define o valor da propriedade dadosRecepcaoEvento.
		 * 
		 * @param value
		 *            allowed object is {@link TDadosRecepcaoEvento }
		 * 
		 */
		public void setDadosRecepcaoEvento(final TDadosRecepcaoEvento value) {
			dadosRecepcaoEvento = value;
		}

		/**
		 * Obtém o valor da propriedade status.
		 * 
		 * @return possible object is {@link TStatus }
		 * 
		 */
		public TStatus getStatus() {
			return status;
		}

		/**
		 * Define o valor da propriedade status.
		 * 
		 * @param value
		 *            allowed object is {@link TStatus }
		 * 
		 */
		public void setStatus(final TStatus value) {
			status = value;
		}

		/**
		 * Obtém o valor da propriedade dadosReciboEntrega.
		 * 
		 * @return possible object is {@link TDadosReciboEntrega }
		 * 
		 */
		public TDadosReciboEntrega getDadosReciboEntrega() {
			return dadosReciboEntrega;
		}

		/**
		 * Define o valor da propriedade dadosReciboEntrega.
		 * 
		 * @param value
		 *            allowed object is {@link TDadosReciboEntrega }
		 * 
		 */
		public void setDadosReciboEntrega(final TDadosReciboEntrega value) {
			dadosReciboEntrega = value;
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

	}

}

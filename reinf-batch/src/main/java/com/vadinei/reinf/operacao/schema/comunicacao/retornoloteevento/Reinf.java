//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.11.03 às 02:56:12 PM GFT 
//

package com.vadinei.reinf.operacao.schema.comunicacao.retornoloteevento;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="retornoLoteEventos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideTransmissor" type="{http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01}TIdeTransmissor"/>
 *                   &lt;element name="status" type="{http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01}TStatus"/>
 *                   &lt;element name="retornoEventos" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="100">
 *                             &lt;element name="evento" type="{http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01}TArquivoReinf"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder = { "retornoLoteEventos", "signature" })
@XmlRootElement(name = "Reinf", namespace = "http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01")
public class Reinf {

	@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01", required = true)
	protected Reinf.RetornoLoteEventos retornoLoteEventos;
	@XmlElement(name = "Signature", required = true)
	protected SignatureType signature;

	/**
	 * Obtém o valor da propriedade retornoLoteEventos.
	 * 
	 * @return possible object is {@link Reinf.RetornoLoteEventos }
	 * 
	 */
	public Reinf.RetornoLoteEventos getRetornoLoteEventos() {
		return retornoLoteEventos;
	}

	/**
	 * Define o valor da propriedade retornoLoteEventos.
	 * 
	 * @param value
	 *            allowed object is {@link Reinf.RetornoLoteEventos }
	 * 
	 */
	public void setRetornoLoteEventos(final Reinf.RetornoLoteEventos value) {
		retornoLoteEventos = value;
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
	 *         &lt;element name="ideTransmissor" type="{http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01}TIdeTransmissor"/>
	 *         &lt;element name="status" type="{http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01}TStatus"/>
	 *         &lt;element name="retornoEventos" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence maxOccurs="100">
	 *                   &lt;element name="evento" type="{http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01}TArquivoReinf"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
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
	@XmlType(name = "", propOrder = { "ideTransmissor", "status", "retornoEventos" })
	public static class RetornoLoteEventos {

		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01", required = true)
		protected TIdeTransmissor ideTransmissor;
		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01", required = true)
		protected TStatus status;
		@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01")
		protected Reinf.RetornoLoteEventos.RetornoEventos retornoEventos;
		@XmlAttribute(name = "id", required = true)
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlID
		@XmlSchemaType(name = "ID")
		protected String id;

		/**
		 * Obtém o valor da propriedade ideTransmissor.
		 * 
		 * @return possible object is {@link TIdeTransmissor }
		 * 
		 */
		public TIdeTransmissor getIdeTransmissor() {
			return ideTransmissor;
		}

		/**
		 * Define o valor da propriedade ideTransmissor.
		 * 
		 * @param value
		 *            allowed object is {@link TIdeTransmissor }
		 * 
		 */
		public void setIdeTransmissor(final TIdeTransmissor value) {
			ideTransmissor = value;
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
		 * Obtém o valor da propriedade retornoEventos.
		 * 
		 * @return possible object is {@link Reinf.RetornoLoteEventos.RetornoEventos }
		 * 
		 */
		public Reinf.RetornoLoteEventos.RetornoEventos getRetornoEventos() {
			return retornoEventos;
		}

		/**
		 * Define o valor da propriedade retornoEventos.
		 * 
		 * @param value
		 *            allowed object is {@link Reinf.RetornoLoteEventos.RetornoEventos }
		 * 
		 */
		public void setRetornoEventos(final Reinf.RetornoLoteEventos.RetornoEventos value) {
			retornoEventos = value;
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
		 *       &lt;sequence maxOccurs="100">
		 *         &lt;element name="evento" type="{http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01}TArquivoReinf"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "evento" })
		public static class RetornoEventos {

			@XmlElement(namespace = "http://www.reinf.esocial.gov.br/schemas/retornoLoteEventos/v1_01_01", required = true)
			protected List<TArquivoReinf> evento;

			/**
			 * Gets the value of the evento property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a snapshot.
			 * Therefore any modification you make to the returned list will be present
			 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
			 * for the evento property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getEvento().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list {@link TArquivoReinf
			 * }
			 * 
			 * 
			 */
			public List<TArquivoReinf> getEvento() {
				if (evento == null) {
					evento = new ArrayList<TArquivoReinf>();
				}
				return evento;
			}

		}

	}

}

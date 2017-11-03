//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.11.03 às 03:00:10 PM GFT 
//

package com.vadinei.reinf.batch.schema.comunicacao.retornoevento;

import java.math.BigInteger;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.vadinei.reinf.batch.schema.comum.CanonicalizationMethodType;
import com.vadinei.reinf.batch.schema.comum.DSAKeyValueType;
import com.vadinei.reinf.batch.schema.comum.DigestMethodType;
import com.vadinei.reinf.batch.schema.comum.KeyInfoType;
import com.vadinei.reinf.batch.schema.comum.KeyValueType;
import com.vadinei.reinf.batch.schema.comum.ManifestType;
import com.vadinei.reinf.batch.schema.comum.ObjectType;
import com.vadinei.reinf.batch.schema.comum.PGPDataType;
import com.vadinei.reinf.batch.schema.comum.RSAKeyValueType;
import com.vadinei.reinf.batch.schema.comum.ReferenceType;
import com.vadinei.reinf.batch.schema.comum.RetrievalMethodType;
import com.vadinei.reinf.batch.schema.comum.SPKIDataType;
import com.vadinei.reinf.batch.schema.comum.SignatureMethodType;
import com.vadinei.reinf.batch.schema.comum.SignaturePropertiesType;
import com.vadinei.reinf.batch.schema.comum.SignaturePropertyType;
import com.vadinei.reinf.batch.schema.comum.SignatureType;
import com.vadinei.reinf.batch.schema.comum.SignatureValueType;
import com.vadinei.reinf.batch.schema.comum.SignedInfoType;
import com.vadinei.reinf.batch.schema.comum.TransformType;
import com.vadinei.reinf.batch.schema.comum.TransformsType;
import com.vadinei.reinf.batch.schema.comum.X509DataType;
import com.vadinei.reinf.batch.schema.comum.X509IssuerSerialType;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.vadinei.reinf.operacao.schema.comunicacao.retornoevento package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _SPKIData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKIData");
	private final static QName _KeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
	private final static QName _RSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
	private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
	private final static QName _KeyInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
	private final static QName _SignatureValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#",
			"SignatureValue");
	private final static QName _MgmtData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
	private final static QName _SignatureMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#",
			"SignatureMethod");
	private final static QName _Object_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Object");
	private final static QName _SignatureProperties_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#",
			"SignatureProperties");
	private final static QName _Transform_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
	private final static QName _KeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
	private final static QName _PGPData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPData");
	private final static QName _Transforms_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
	private final static QName _Reference_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
	private final static QName _RetrievalMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#",
			"RetrievalMethod");
	private final static QName _DSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue");
	private final static QName _DigestMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
	private final static QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
	private final static QName _CanonicalizationMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#",
			"CanonicalizationMethod");
	private final static QName _SignedInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
	private final static QName _X509Data_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
	private final static QName _Manifest_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Manifest");
	private final static QName _SignatureProperty_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#",
			"SignatureProperty");
	private final static QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName(
			"http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");
	private final static QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
	private final static QName _PGPDataTypePGPKeyID_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyID");
	private final static QName _PGPDataTypePGPKeyPacket_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#",
			"PGPKeyPacket");
	private final static QName _X509DataTypeX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#",
			"X509IssuerSerial");
	private final static QName _X509DataTypeX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
	private final static QName _X509DataTypeX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#",
			"X509SubjectName");
	private final static QName _X509DataTypeX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
	private final static QName _X509DataTypeX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#",
			"X509Certificate");
	private final static QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#",
			"SPKISexp");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema
	 * derived classes for package:
	 * com.vadinei.reinf.operacao.schema.comunicacao.retornoevento
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Reinf }
	 * 
	 */
	public Reinf createReinf() {
		return new Reinf();
	}

	/**
	 * Create an instance of {@link TRegistroOcorrencias }
	 * 
	 */
	public TRegistroOcorrencias createTRegistroOcorrencias() {
		return new TRegistroOcorrencias();
	}

	/**
	 * Create an instance of {@link Reinf.RetornoEvento }
	 * 
	 */
	public Reinf.RetornoEvento createReinfRetornoEvento() {
		return new Reinf.RetornoEvento();
	}

	/**
	 * Create an instance of {@link SignatureType }
	 * 
	 */
	public SignatureType createSignatureType() {
		return new SignatureType();
	}

	/**
	 * Create an instance of {@link TDadosRecepcaoEvento }
	 * 
	 */
	public TDadosRecepcaoEvento createTDadosRecepcaoEvento() {
		return new TDadosRecepcaoEvento();
	}

	/**
	 * Create an instance of {@link TStatus }
	 * 
	 */
	public TStatus createTStatus() {
		return new TStatus();
	}

	/**
	 * Create an instance of {@link TDadosReciboEntrega }
	 * 
	 */
	public TDadosReciboEntrega createTDadosReciboEntrega() {
		return new TDadosReciboEntrega();
	}

	/**
	 * Create an instance of {@link TIdeContrib }
	 * 
	 */
	public TIdeContrib createTIdeContrib() {
		return new TIdeContrib();
	}

	/**
	 * Create an instance of {@link PGPDataType }
	 * 
	 */
	public PGPDataType createPGPDataType() {
		return new PGPDataType();
	}

	/**
	 * Create an instance of {@link KeyValueType }
	 * 
	 */
	public KeyValueType createKeyValueType() {
		return new KeyValueType();
	}

	/**
	 * Create an instance of {@link DSAKeyValueType }
	 * 
	 */
	public DSAKeyValueType createDSAKeyValueType() {
		return new DSAKeyValueType();
	}

	/**
	 * Create an instance of {@link ReferenceType }
	 * 
	 */
	public ReferenceType createReferenceType() {
		return new ReferenceType();
	}

	/**
	 * Create an instance of {@link RetrievalMethodType }
	 * 
	 */
	public RetrievalMethodType createRetrievalMethodType() {
		return new RetrievalMethodType();
	}

	/**
	 * Create an instance of {@link TransformsType }
	 * 
	 */
	public TransformsType createTransformsType() {
		return new TransformsType();
	}

	/**
	 * Create an instance of {@link CanonicalizationMethodType }
	 * 
	 */
	public CanonicalizationMethodType createCanonicalizationMethodType() {
		return new CanonicalizationMethodType();
	}

	/**
	 * Create an instance of {@link DigestMethodType }
	 * 
	 */
	public DigestMethodType createDigestMethodType() {
		return new DigestMethodType();
	}

	/**
	 * Create an instance of {@link ManifestType }
	 * 
	 */
	public ManifestType createManifestType() {
		return new ManifestType();
	}

	/**
	 * Create an instance of {@link SignaturePropertyType }
	 * 
	 */
	public SignaturePropertyType createSignaturePropertyType() {
		return new SignaturePropertyType();
	}

	/**
	 * Create an instance of {@link X509DataType }
	 * 
	 */
	public X509DataType createX509DataType() {
		return new X509DataType();
	}

	/**
	 * Create an instance of {@link SignedInfoType }
	 * 
	 */
	public SignedInfoType createSignedInfoType() {
		return new SignedInfoType();
	}

	/**
	 * Create an instance of {@link RSAKeyValueType }
	 * 
	 */
	public RSAKeyValueType createRSAKeyValueType() {
		return new RSAKeyValueType();
	}

	/**
	 * Create an instance of {@link SPKIDataType }
	 * 
	 */
	public SPKIDataType createSPKIDataType() {
		return new SPKIDataType();
	}

	/**
	 * Create an instance of {@link SignatureValueType }
	 * 
	 */
	public SignatureValueType createSignatureValueType() {
		return new SignatureValueType();
	}

	/**
	 * Create an instance of {@link KeyInfoType }
	 * 
	 */
	public KeyInfoType createKeyInfoType() {
		return new KeyInfoType();
	}

	/**
	 * Create an instance of {@link SignaturePropertiesType }
	 * 
	 */
	public SignaturePropertiesType createSignaturePropertiesType() {
		return new SignaturePropertiesType();
	}

	/**
	 * Create an instance of {@link SignatureMethodType }
	 * 
	 */
	public SignatureMethodType createSignatureMethodType() {
		return new SignatureMethodType();
	}

	/**
	 * Create an instance of {@link ObjectType }
	 * 
	 */
	public ObjectType createObjectType() {
		return new ObjectType();
	}

	/**
	 * Create an instance of {@link TransformType }
	 * 
	 */
	public TransformType createTransformType() {
		return new TransformType();
	}

	/**
	 * Create an instance of {@link X509IssuerSerialType }
	 * 
	 */
	public X509IssuerSerialType createX509IssuerSerialType() {
		return new X509IssuerSerialType();
	}

	/**
	 * Create an instance of {@link TRegistroOcorrencias.Ocorrencias }
	 * 
	 */
	public TRegistroOcorrencias.Ocorrencias createTRegistroOcorrenciasOcorrencias() {
		return new TRegistroOcorrencias.Ocorrencias();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SPKIDataType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKIData")
	public JAXBElement<SPKIDataType> createSPKIData(final SPKIDataType value) {
		return new JAXBElement<SPKIDataType>(ObjectFactory._SPKIData_QNAME, SPKIDataType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyName")
	public JAXBElement<String> createKeyName(final String value) {
		return new JAXBElement<String>(ObjectFactory._KeyName_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RSAKeyValue")
	public JAXBElement<RSAKeyValueType> createRSAKeyValue(final RSAKeyValueType value) {
		return new JAXBElement<RSAKeyValueType>(ObjectFactory._RSAKeyValue_QNAME, RSAKeyValueType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
	public JAXBElement<SignatureType> createSignature(final SignatureType value) {
		return new JAXBElement<SignatureType>(ObjectFactory._Signature_QNAME, SignatureType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyInfo")
	public JAXBElement<KeyInfoType> createKeyInfo(final KeyInfoType value) {
		return new JAXBElement<KeyInfoType>(ObjectFactory._KeyInfo_QNAME, KeyInfoType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SignatureValueType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureValue")
	public JAXBElement<SignatureValueType> createSignatureValue(final SignatureValueType value) {
		return new JAXBElement<SignatureValueType>(ObjectFactory._SignatureValue_QNAME, SignatureValueType.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "MgmtData")
	public JAXBElement<String> createMgmtData(final String value) {
		return new JAXBElement<String>(ObjectFactory._MgmtData_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SignatureMethodType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureMethod")
	public JAXBElement<SignatureMethodType> createSignatureMethod(final SignatureMethodType value) {
		return new JAXBElement<SignatureMethodType>(ObjectFactory._SignatureMethod_QNAME, SignatureMethodType.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Object")
	public JAXBElement<ObjectType> createObject(final ObjectType value) {
		return new JAXBElement<ObjectType>(ObjectFactory._Object_QNAME, ObjectType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link SignaturePropertiesType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperties")
	public JAXBElement<SignaturePropertiesType> createSignatureProperties(final SignaturePropertiesType value) {
		return new JAXBElement<SignaturePropertiesType>(ObjectFactory._SignatureProperties_QNAME,
				SignaturePropertiesType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TransformType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transform")
	public JAXBElement<TransformType> createTransform(final TransformType value) {
		return new JAXBElement<TransformType>(ObjectFactory._Transform_QNAME, TransformType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyValue")
	public JAXBElement<KeyValueType> createKeyValue(final KeyValueType value) {
		return new JAXBElement<KeyValueType>(ObjectFactory._KeyValue_QNAME, KeyValueType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link PGPDataType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPData")
	public JAXBElement<PGPDataType> createPGPData(final PGPDataType value) {
		return new JAXBElement<PGPDataType>(ObjectFactory._PGPData_QNAME, PGPDataType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TransformsType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transforms")
	public JAXBElement<TransformsType> createTransforms(final TransformsType value) {
		return new JAXBElement<TransformsType>(ObjectFactory._Transforms_QNAME, TransformsType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Reference")
	public JAXBElement<ReferenceType> createReference(final ReferenceType value) {
		return new JAXBElement<ReferenceType>(ObjectFactory._Reference_QNAME, ReferenceType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RetrievalMethod")
	public JAXBElement<RetrievalMethodType> createRetrievalMethod(final RetrievalMethodType value) {
		return new JAXBElement<RetrievalMethodType>(ObjectFactory._RetrievalMethod_QNAME, RetrievalMethodType.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DSAKeyValue")
	public JAXBElement<DSAKeyValueType> createDSAKeyValue(final DSAKeyValueType value) {
		return new JAXBElement<DSAKeyValueType>(ObjectFactory._DSAKeyValue_QNAME, DSAKeyValueType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DigestMethodType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestMethod")
	public JAXBElement<DigestMethodType> createDigestMethod(final DigestMethodType value) {
		return new JAXBElement<DigestMethodType>(ObjectFactory._DigestMethod_QNAME, DigestMethodType.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestValue")
	public JAXBElement<byte[]> createDigestValue(final byte[] value) {
		return new JAXBElement<byte[]>(ObjectFactory._DigestValue_QNAME, byte[].class, null, (value));
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link CanonicalizationMethodType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "CanonicalizationMethod")
	public JAXBElement<CanonicalizationMethodType> createCanonicalizationMethod(
			final CanonicalizationMethodType value) {
		return new JAXBElement<CanonicalizationMethodType>(ObjectFactory._CanonicalizationMethod_QNAME,
				CanonicalizationMethodType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SignedInfoType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignedInfo")
	public JAXBElement<SignedInfoType> createSignedInfo(final SignedInfoType value) {
		return new JAXBElement<SignedInfoType>(ObjectFactory._SignedInfo_QNAME, SignedInfoType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link X509DataType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Data")
	public JAXBElement<X509DataType> createX509Data(final X509DataType value) {
		return new JAXBElement<X509DataType>(ObjectFactory._X509Data_QNAME, X509DataType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ManifestType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Manifest")
	public JAXBElement<ManifestType> createManifest(final ManifestType value) {
		return new JAXBElement<ManifestType>(ObjectFactory._Manifest_QNAME, ManifestType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link SignaturePropertyType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperty")
	public JAXBElement<SignaturePropertyType> createSignatureProperty(final SignaturePropertyType value) {
		return new JAXBElement<SignaturePropertyType>(ObjectFactory._SignatureProperty_QNAME,
				SignaturePropertyType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "HMACOutputLength", scope = SignatureMethodType.class)
	public JAXBElement<BigInteger> createSignatureMethodTypeHMACOutputLength(final BigInteger value) {
		return new JAXBElement<BigInteger>(ObjectFactory._SignatureMethodTypeHMACOutputLength_QNAME, BigInteger.class,
				SignatureMethodType.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "XPath", scope = TransformType.class)
	public JAXBElement<String> createTransformTypeXPath(final String value) {
		return new JAXBElement<String>(ObjectFactory._TransformTypeXPath_QNAME, String.class, TransformType.class,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPKeyID", scope = PGPDataType.class)
	public JAXBElement<byte[]> createPGPDataTypePGPKeyID(final byte[] value) {
		return new JAXBElement<byte[]>(ObjectFactory._PGPDataTypePGPKeyID_QNAME, byte[].class, PGPDataType.class,
				(value));
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPKeyPacket", scope = PGPDataType.class)
	public JAXBElement<byte[]> createPGPDataTypePGPKeyPacket(final byte[] value) {
		return new JAXBElement<byte[]>(ObjectFactory._PGPDataTypePGPKeyPacket_QNAME, byte[].class, PGPDataType.class,
				(value));
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link X509IssuerSerialType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509IssuerSerial", scope = X509DataType.class)
	public JAXBElement<X509IssuerSerialType> createX509DataTypeX509IssuerSerial(final X509IssuerSerialType value) {
		return new JAXBElement<X509IssuerSerialType>(ObjectFactory._X509DataTypeX509IssuerSerial_QNAME,
				X509IssuerSerialType.class, X509DataType.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509CRL", scope = X509DataType.class)
	public JAXBElement<byte[]> createX509DataTypeX509CRL(final byte[] value) {
		return new JAXBElement<byte[]>(ObjectFactory._X509DataTypeX509CRL_QNAME, byte[].class, X509DataType.class,
				(value));
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SubjectName", scope = X509DataType.class)
	public JAXBElement<String> createX509DataTypeX509SubjectName(final String value) {
		return new JAXBElement<String>(ObjectFactory._X509DataTypeX509SubjectName_QNAME, String.class,
				X509DataType.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SKI", scope = X509DataType.class)
	public JAXBElement<byte[]> createX509DataTypeX509SKI(final byte[] value) {
		return new JAXBElement<byte[]>(ObjectFactory._X509DataTypeX509SKI_QNAME, byte[].class, X509DataType.class,
				(value));
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Certificate", scope = X509DataType.class)
	public JAXBElement<byte[]> createX509DataTypeX509Certificate(final byte[] value) {
		return new JAXBElement<byte[]>(ObjectFactory._X509DataTypeX509Certificate_QNAME, byte[].class,
				X509DataType.class, (value));
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKISexp", scope = SPKIDataType.class)
	public JAXBElement<byte[]> createSPKIDataTypeSPKISexp(final byte[] value) {
		return new JAXBElement<byte[]>(ObjectFactory._SPKIDataTypeSPKISexp_QNAME, byte[].class, SPKIDataType.class,
				(value));
	}

}

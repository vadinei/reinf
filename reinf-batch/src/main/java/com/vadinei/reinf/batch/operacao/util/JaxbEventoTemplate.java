package com.vadinei.reinf.batch.operacao.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringWriter;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.vadinei.reinf.batch.operacao.enums.TipoEventoEnum;
import com.vadinei.reinf.batch.operacao.to.EventoTO;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 * Template Method para montar o XML dos Eventos.
 */
public abstract class JaxbEventoTemplate implements Serializable {

	private static final long serialVersionUID = -1133445889633453386L;

	private String caminhoCertificado;

	private KeyInfo keyInfo;

	private PrivateKey privateKey;

	private String senha;

	public abstract void prepararGerarXML();

	public abstract EventoTO getEventoTO();

	public abstract Object getJaxbEvento();

	public final void gerarXML() {

		// TODO: Inicializar os dados do certificado e da senha.
		caminhoCertificado = ConstanteUtil.STRING_VAZIA;
		senha = ConstanteUtil.STRING_VAZIA;

		prepararGerarXML();

		final EventoTO eventoTO = getEventoTO();
		final Object jaxbEvento = getJaxbEvento();

		if ((eventoTO == null) || (jaxbEvento == null)) {
			// TODO: Efetuar o devido tratamento para este fluxo.
			return;
		}

		final StringWriter writer = new StringWriter();

		try {
			final JAXBContext context = JAXBContext.newInstance(jaxbEvento.getClass());
			final Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(jaxbEvento, writer);

			String xml = writer.toString();
			xml = ValidacaoUtil.excluirAcentos(xml);
			eventoTO.setXmlOriginal(xml);

			xml = getXMLAssinado(eventoTO);
			eventoTO.setXmlEnvio(xml);
		} catch (final JAXBException e) {
			e.printStackTrace();
		} catch (final NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (final InvalidAlgorithmParameterException e) {
			e.printStackTrace();
		} catch (final KeyStoreException e) {
			e.printStackTrace();
		} catch (final CertificateException e) {
			e.printStackTrace();
		} catch (final UnrecoverableEntryException e) {
			e.printStackTrace();
		} catch (final SAXException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		} catch (final ParserConfigurationException e) {
			e.printStackTrace();
		} catch (final MarshalException e) {
			e.printStackTrace();
		} catch (final XMLSignatureException e) {
			e.printStackTrace();
		} catch (final TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		} catch (final TransformerException e) {
			e.printStackTrace();
		}

	}

	private String getXMLAssinado(final EventoTO eventoTO)
			throws SAXException, IOException, ParserConfigurationException, NoSuchAlgorithmException,
			InvalidAlgorithmParameterException, KeyStoreException, CertificateException, UnrecoverableEntryException,
			MarshalException, XMLSignatureException, TransformerFactoryConfigurationError, TransformerException {

		String retorno = null;

		final Document document = carregarDocumentFactory(eventoTO.getXmlOriginal());
		final XMLSignatureFactory signatureFactory = XMLSignatureFactory.getInstance(ConstanteUtil.DOM);
		final List<Transform> transformList = carregarSignatureFactory(signatureFactory);
		carregarCertificados(signatureFactory);

		final String tagName = TipoEventoEnum.getInstance(eventoTO.getTipoEvento()).getTag();

		for (int index = 0; index < document.getDocumentElement().getElementsByTagName(tagName).getLength(); index++) {
			assinarEFinanceira(signatureFactory, transformList, document, index, tagName);
		}

		final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		final Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult(outputStream));
		final String xml = outputStream.toString();

		if ((xml != null) && (!ConstanteUtil.STRING_VAZIA.equals(xml))) {
			retorno = xml;
		}

		return retorno;

	}

	private Document carregarDocumentFactory(final String xml)
			throws SAXException, IOException, ParserConfigurationException {

		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		return factory.newDocumentBuilder()
				.parse(new ByteArrayInputStream(new String(xml.getBytes()).getBytes(ConstanteUtil.UTF_8)));

	}

	private List<Transform> carregarSignatureFactory(final XMLSignatureFactory signatureFactory)
			throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {

		final ArrayList<Transform> transformList = new ArrayList<Transform>();
		final TransformParameterSpec tps = null;
		final Transform envelopedTransform = signatureFactory.newTransform(Transform.ENVELOPED, tps);
		final Transform c14NTransform = signatureFactory.newTransform(ConstanteUtil.REC_XML_C14N_20010315, tps);

		transformList.add(envelopedTransform);
		transformList.add(c14NTransform);
		return transformList;

	}

	private void carregarCertificados(final XMLSignatureFactory signatureFactory) throws KeyStoreException,
	NoSuchAlgorithmException, CertificateException, IOException, UnrecoverableEntryException {

		if (keyInfo == null) {
			final InputStream entrada = new FileInputStream(caminhoCertificado);
			final KeyStore ks = KeyStore.getInstance(ConstanteUtil.PKCS12);
			ks.load(entrada, senha.toCharArray()); // Tratar possível NullPointerException

			KeyStore.PrivateKeyEntry pkEntry = null;
			final Enumeration<String> aliasesEnum = ks.aliases();

			while (aliasesEnum.hasMoreElements()) {
				final String alias = aliasesEnum.nextElement();

				if (ks.isKeyEntry(alias)) {
					pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias,
							new KeyStore.PasswordProtection(senha.toCharArray()));
					privateKey = pkEntry.getPrivateKey();
					break;
				}
			}

			if (pkEntry != null) {
				final X509Certificate cert = (X509Certificate) pkEntry.getCertificate();
				final KeyInfoFactory keyInfoFactory = signatureFactory.getKeyInfoFactory();
				final List<X509Certificate> x509Content = new ArrayList<X509Certificate>();
				x509Content.add(cert);
				final X509Data x509Data = keyInfoFactory.newX509Data(x509Content);
				keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(x509Data));
			}
		}

	}

	private void assinarEFinanceira(final XMLSignatureFactory signatureFactory, final List<Transform> transformList,
			final Document document, final int index, final String tag) throws NoSuchAlgorithmException,
	InvalidAlgorithmParameterException, MarshalException, XMLSignatureException {

		final NodeList elements = document.getElementsByTagName(tag);
		final Element el = (Element) elements.item(index);
		final String id = el.getAttribute(ConstanteUtil.ID);
		el.setIdAttribute(ConstanteUtil.ID, true);

		final Reference ref = signatureFactory.newReference(ConstanteUtil.CERQUILHA.concat(id),
				signatureFactory.newDigestMethod(DigestMethod.SHA256, null), transformList, null, null);

		final SignedInfo si = signatureFactory.newSignedInfo(
				signatureFactory.newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE,
						(C14NMethodParameterSpec) null),
				signatureFactory.newSignatureMethod(ConstanteUtil.XMLDSIG_MORE_RSA_SHA256, null),
				Collections.singletonList(ref));

		final DOMSignContext dsc = new DOMSignContext(privateKey,
				document.getElementsByTagName(ConstanteUtil.TAG_REINF).item(index));

		final XMLSignature signature = signatureFactory.newXMLSignature(si, keyInfo);
		signature.sign(dsc);

	}

}

package com.vadinei.reinf.batch.operacao.util;

import java.io.Serializable;
import java.util.Locale;

public class ConstanteUtil implements Serializable {

	public static final String CERQUILHA = "#";

	public static final String DATA_XML_FORMATO_YYYY_MM = "yyyyMM";

	public static final String DATA_XML_FORMATO_YYYY_MM_SEPARADO = "yyyy-MM";

	public static final String DATA_XML_FORMATO_YYYY_MM_DD = "yyyyMMdd";

	public static final String DATA_XML_FORMATO_YYYY_MM_DD_SEPARADO = "yyyy-MM-dd";

	public static final String DOM = "DOM";

	public static final String ID = "id";

	public static final Locale LOCALE_PT_BR = new Locale(ConstanteUtil.SIGLA_PORTUGUES, ConstanteUtil.SIGLA_BRASIL);

	public static final int NUMERO_CASA_DECIMAL_PADRAO = 2;

	public static final String P_ASCII = "[^\\p{ASCII}]";

	public static final String PKCS12 = "pkcs12";

	public static final String REC_XML_C14N_20010315 = "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";

	public static final String SIGLA_BRASIL = "BR";

	public static final String SIGLA_PORTUGUES = "pt";

	public static final String STRING_VAZIA = "";

	public static final String STRING_ESPACO = " ";

	public static final String TAG_REINF = "Reinf";

	public static final String UTF_8 = "UTF-8";

	public static final String XMLDSIG_MORE_RSA_SHA256 = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";

	public static final Double ZERO_DOUBLE = 0d;

	private static final long serialVersionUID = -7090522224169475459L;

}

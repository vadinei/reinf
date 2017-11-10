package com.vadinei.reinf.batch.operacao.util;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public final class NumberUtil implements Serializable {

	private static final long serialVersionUID = -8286189269882011377L;

	public static synchronized String formatarDecimal(final Number valor, final boolean usarAgrupamento,
			final int numeroCasaDecimal) {

		String retorno = null;

		if (valor != null) {
			final NumberFormat numberFormat = NumberFormat.getNumberInstance(ConstanteUtil.LOCALE_PT_BR);
			final DecimalFormat decimalFormat = (DecimalFormat) numberFormat;

			decimalFormat.setGroupingUsed(usarAgrupamento);
			decimalFormat.setMaximumFractionDigits(numeroCasaDecimal);
			decimalFormat.setMinimumFractionDigits(numeroCasaDecimal);

			retorno = decimalFormat.format(valor);
		}

		return retorno;

	}

	/**
	 * @param valor
	 * @return String
	 */
	public static synchronized String formatarBigDecimalParaXML(final BigDecimal valor) {

		final String retorno = NumberUtil.formatarBigDecimalParaXML(valor, Boolean.FALSE);
		return retorno;

	}

	/**
	 * @param valor
	 * @param obrigatorio
	 * @return String
	 */
	public static synchronized String formatarBigDecimalParaXML(final BigDecimal valor, final boolean obrigatorio) {

		BigDecimal valorVerificado = valor;

		if ((obrigatorio) && (valor == null)) {

			valorVerificado = BigDecimal.ZERO;

		} else if ((!obrigatorio) && (BigDecimal.ZERO.equals(valor))) {

			valorVerificado = null;

		}

		final String retorno = NumberUtil.formatarBigDecimal(valorVerificado, Boolean.FALSE,
				ConstanteUtil.NUMERO_CASA_DECIMAL_PADRAO);

		return retorno;

	}

	/**
	 * @param valor
	 * @param usarAgrupamento
	 * @param numeroCasaDecimal
	 * @return String
	 */
	public static synchronized String formatarBigDecimal(final BigDecimal valor, final boolean usarAgrupamento,
			final int numeroCasaDecimal) {

		final String retorno = NumberUtil.formatarDecimal(valor, usarAgrupamento, numeroCasaDecimal);
		return retorno;

	}

	/**
	 * @param valor
	 * @return String
	 */
	public static synchronized String formatarDoubleParaXML(final Double valor) {

		final String retorno = NumberUtil.formatarDoubleParaXML(valor, Boolean.FALSE);
		return retorno;

	}

	/**
	 * @param valor
	 * @param obrigatorio
	 * @return String
	 */
	public static synchronized String formatarDoubleParaXML(final Double valor, final boolean obrigatorio) {

		Double valorVerificado = valor;

		if ((obrigatorio) && (valor == null)) {

			valorVerificado = ConstanteUtil.ZERO_DOUBLE;

		} else if ((!obrigatorio) && (ConstanteUtil.ZERO_DOUBLE.equals(valor))) {

			valorVerificado = null;

		}

		final String retorno = NumberUtil.formatarDouble(valorVerificado, Boolean.FALSE,
				ConstanteUtil.NUMERO_CASA_DECIMAL_PADRAO);
		return retorno;

	}

	/**
	 * @param valor
	 * @param usarAgrupamento
	 * @param numeroCasaDecimal
	 * @return String
	 */
	public static synchronized String formatarDouble(final Double valor, final boolean usarAgrupamento,
			final int numeroCasaDecimal) {

		final String retorno = NumberUtil.formatarDecimal(valor, usarAgrupamento, numeroCasaDecimal);
		return retorno;

	}

	/**
	 * @param valor
	 * @param classType
	 * @return Number
	 */
	public static synchronized Number parseNumber(final Number valor, final Class<?> classType) {

		Number retorno = null;

		if ((valor != null) && (classType != null)) {

			if (classType.equals(Byte.class)) {

				retorno = valor.byteValue();

			} else if (classType.equals(Short.class)) {

				retorno = valor.shortValue();

			} else if (classType.equals(Integer.class)) {

				retorno = valor.intValue();

			} else if (classType.equals(Long.class)) {

				retorno = valor.longValue();

			} else if (classType.equals(Float.class)) {

				retorno = valor.floatValue();

			} else if (classType.equals(Double.class)) {

				retorno = valor.doubleValue();

			} else if (classType.equals(BigInteger.class)) {

				retorno = new BigInteger(valor.toString());

			} else if (classType.equals(BigDecimal.class)) {

				retorno = new BigDecimal(valor.toString());

			}

		}

		return retorno;
	}

	/**
	 * @param valor
	 * @return Byte
	 */
	public static synchronized Byte parseByte(final Number valor) {

		final Byte retorno = (Byte) NumberUtil.parseNumber(valor, Byte.class);
		return retorno;

	}

	/**
	 * @param valor
	 * @return Short
	 */
	public static synchronized Short parseShort(final Number valor) {

		final Short retorno = (Short) NumberUtil.parseNumber(valor, Short.class);
		return retorno;

	}

	/**
	 * @param valor
	 * @return Integer
	 */
	public static synchronized Integer parseInteger(final Number valor) {

		final Integer retorno = (Integer) NumberUtil.parseNumber(valor, Integer.class);
		return retorno;

	}

	/**
	 * @param valor
	 * @return Long
	 */
	public static synchronized Long parseLong(final Number valor) {

		final Long retorno = (Long) NumberUtil.parseNumber(valor, Long.class);
		return retorno;

	}

	/**
	 * @param valor
	 * @return Float
	 */
	public static synchronized Float parseFloat(final Number valor) {

		final Float retorno = (Float) NumberUtil.parseNumber(valor, Float.class);
		return retorno;

	}

	/**
	 * @param valor
	 * @return Double
	 */
	public static synchronized Double parseDouble(final Number valor) {

		final Double retorno = (Double) NumberUtil.parseNumber(valor, Double.class);
		return retorno;

	}

	/**
	 * @param valor
	 * @return BigInteger
	 */
	public static synchronized BigInteger parseBigInteger(final Number valor) {

		final BigInteger retorno = (BigInteger) NumberUtil.parseNumber(valor, BigInteger.class);
		return retorno;

	}

	/**
	 * @param valor
	 * @return BigDecimal
	 */
	public static synchronized BigDecimal parseBigDecimal(final Number valor) {

		final BigDecimal retorno = (BigDecimal) NumberUtil.parseNumber(valor, BigDecimal.class);
		return retorno;

	}

}

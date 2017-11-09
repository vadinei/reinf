package com.vadinei.reinf.batch.operacao.util;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public final class NumberUtil implements Serializable {

	private static final long serialVersionUID = -8286189269882011377L;

	/**
	 * @param valor
	 * @param usarAgrupamento
	 * @param numeroCasaDecimal
	 * @return String
	 */
	public static String formatarBigDecimal(final BigDecimal valor, final boolean usarAgrupamento,
			final int numeroCasaDecimal) {

		final double doubleValue = (valor == null) ? ConstanteUtil.ZERO_DOUBLE : valor.doubleValue();
		final String retorno = NumberUtil.formatarDouble(doubleValue, usarAgrupamento, numeroCasaDecimal);
		return retorno;

	}

	/**
	 * @param valor
	 * @param usarAgrupamento
	 * @param numeroCasaDecimal
	 * @return String
	 */
	public static String formatarDouble(final Double valor, final boolean usarAgrupamento,
			final int numeroCasaDecimal) {

		final double doubleValue = (valor == null) ? ConstanteUtil.ZERO_DOUBLE : valor.doubleValue();
		final NumberFormat format = NumberFormat.getNumberInstance(ConstanteUtil.LOCALE_PT_BR);

		format.setGroupingUsed(usarAgrupamento);
		format.setMaximumFractionDigits(numeroCasaDecimal);
		format.setMinimumFractionDigits(numeroCasaDecimal);

		final String retorno = format.format(doubleValue);
		return retorno;

	}

	/**
	 * @param valor
	 * @return String
	 */
	public static String formatarBigDecimalParaXML(final BigDecimal valor) {

		final String retorno = NumberUtil.formatarBigDecimal(valor, Boolean.FALSE,
				ConstanteUtil.NUMERO_CASA_DECIMAL_PADRAO);
		return retorno;

	}

	/**
	 * @param valor
	 * @return String
	 */
	public static String formatarDoubleParaXML(final Double valor) {

		final String retorno = NumberUtil.formatarDouble(valor, Boolean.FALSE,
				ConstanteUtil.NUMERO_CASA_DECIMAL_PADRAO);
		return retorno;

	}

}

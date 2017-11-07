package com.vadinei.reinf.batch.operacao.enums;

public enum TipoEventoEnum {

	INFORMACAO_CONTRIBUINTE("1", "evtInfoContribuinte"), //$NON-NLS-1$
	TOMADOR_SERVICO("2", "evtTomadorServicos"), //$NON-NLS-1$
	FECHAMENTO("3", "evtFechamento"), //$NON-NLS-1$
	EXCLUSAO("4", "evtExclusao"); //$NON-NLS-1$

	private final String codigo;

	private final String tag;

	/**
	 * @param codigo
	 * @param tag
	 */
	private TipoEventoEnum(final String codigo, final String tag) {
		this.codigo = codigo;
		this.tag = tag;
	}

	/**
	 * @return O atributo codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @return O atributo tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param codigo
	 * @return TipoEventoEnum
	 */
	public static TipoEventoEnum getInstance(final String codigo) {

		TipoEventoEnum retorno = null;

		for (final TipoEventoEnum cursor : TipoEventoEnum.values()) {
			if (cursor.getCodigo().equals(codigo)) {
				retorno = cursor;
				break;
			}
		}

		return retorno;
	}

}

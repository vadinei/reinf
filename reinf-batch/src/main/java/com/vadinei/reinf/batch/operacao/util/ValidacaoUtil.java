package com.vadinei.reinf.batch.operacao.util;

import java.io.Serializable;
import java.text.Normalizer;

public final class ValidacaoUtil implements Serializable {

	private static final long serialVersionUID = 548296059241830366L;

	public static String excluirAcentos(final String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll(ConstanteUtil.P_ASCII,
				ConstanteUtil.STRING_VAZIA);
	}
}

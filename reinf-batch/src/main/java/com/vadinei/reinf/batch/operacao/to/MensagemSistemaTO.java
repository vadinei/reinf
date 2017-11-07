package com.vadinei.reinf.batch.operacao.to;

import java.io.Serializable;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class MensagemSistemaTO implements Serializable {

	private static final long serialVersionUID = 4988931162896308267L;

	private Integer codigoMensagem;

	private String chaveMensagem;

	private Long codigoEvento;

	private Integer tipoOcorrencia;

	private String descricaoLocalizacaoErroAviso;

	public MensagemSistemaTO() {
		super();
	}

	/**
	 * @return O atributo codigoMensagem
	 */
	public Integer getCodigoMensagem() {
		return codigoMensagem;
	}

	/**
	 * @param codigoMensagem
	 *            define o atributo codigoMensagem
	 */
	public void setCodigoMensagem(final Integer codigoMensagem) {
		this.codigoMensagem = codigoMensagem;
	}

	/**
	 * @return O atributo chaveMensagem
	 */
	public String getChaveMensagem() {
		return chaveMensagem;
	}

	/**
	 * @param chaveMensagem
	 *            define o atributo chaveMensagem
	 */
	public void setChaveMensagem(final String chaveMensagem) {
		this.chaveMensagem = chaveMensagem;
	}

	/**
	 * @return O atributo codigoEvento
	 */
	public Long getCodigoEvento() {
		return codigoEvento;
	}

	/**
	 * @param codigoEvento
	 *            define o atributo codigoEvento
	 */
	public void setCodigoEvento(final Long codigoEvento) {
		this.codigoEvento = codigoEvento;
	}

	/**
	 * @return O atributo tipoOcorrencia
	 */
	public Integer getTipoOcorrencia() {
		return tipoOcorrencia;
	}

	/**
	 * @param tipoOcorrencia
	 *            define o atributo tipoOcorrencia
	 */
	public void setTipoOcorrencia(final Integer tipoOcorrencia) {
		this.tipoOcorrencia = tipoOcorrencia;
	}

	/**
	 * @return O atributo descricaoLocalizacaoErroAviso
	 */
	public String getDescricaoLocalizacaoErroAviso() {
		return descricaoLocalizacaoErroAviso;
	}

	/**
	 * @param descricaoLocalizacaoErroAviso
	 *            define o atributo descricaoLocalizacaoErroAviso
	 */
	public void setDescricaoLocalizacaoErroAviso(final String descricaoLocalizacaoErroAviso) {
		this.descricaoLocalizacaoErroAviso = descricaoLocalizacaoErroAviso;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return MensagemSistemaTO.serialVersionUID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((chaveMensagem == null) ? 0 : chaveMensagem.hashCode());
		result = (prime * result) + ((codigoEvento == null) ? 0 : codigoEvento.hashCode());
		result = (prime * result) + ((codigoMensagem == null) ? 0 : codigoMensagem.hashCode());
		result = (prime * result)
				+ ((descricaoLocalizacaoErroAviso == null) ? 0 : descricaoLocalizacaoErroAviso.hashCode());
		result = (prime * result) + ((tipoOcorrencia == null) ? 0 : tipoOcorrencia.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final MensagemSistemaTO other = (MensagemSistemaTO) obj;
		if (chaveMensagem == null) {
			if (other.chaveMensagem != null) {
				return false;
			}
		} else if (!chaveMensagem.equals(other.chaveMensagem)) {
			return false;
		}
		if (codigoEvento == null) {
			if (other.codigoEvento != null) {
				return false;
			}
		} else if (!codigoEvento.equals(other.codigoEvento)) {
			return false;
		}
		if (codigoMensagem == null) {
			if (other.codigoMensagem != null) {
				return false;
			}
		} else if (!codigoMensagem.equals(other.codigoMensagem)) {
			return false;
		}
		if (descricaoLocalizacaoErroAviso == null) {
			if (other.descricaoLocalizacaoErroAviso != null) {
				return false;
			}
		} else if (!descricaoLocalizacaoErroAviso.equals(other.descricaoLocalizacaoErroAviso)) {
			return false;
		}
		if (tipoOcorrencia == null) {
			if (other.tipoOcorrencia != null) {
				return false;
			}
		} else if (!tipoOcorrencia.equals(other.tipoOcorrencia)) {
			return false;
		}
		return true;
	}

}

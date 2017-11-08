package com.vadinei.reinf.batch.operacao.to;

import java.io.Serializable;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class EventoTomadorServicoIdentificacaoContribuinteTO implements Serializable {

	private static final long serialVersionUID = 1101286906406563233L;

	private Short tipoInscricao; // tpInsc

	private String numeroInscricao; // nrInsc

	/**
	 * @param tipoInscricao
	 * @param numeroInscricao
	 */
	public EventoTomadorServicoIdentificacaoContribuinteTO(final Short tipoInscricao, final String numeroInscricao) {
		super();
		this.tipoInscricao = tipoInscricao;
		this.numeroInscricao = numeroInscricao;
	}

	/**
	 * @return O atributo tipoInscricao
	 */
	public Short getTipoInscricao() {
		return tipoInscricao;
	}

	/**
	 * @param tipoInscricao
	 *            define o atributo tipoInscricao
	 */
	public void setTipoInscricao(final Short tipoInscricao) {
		this.tipoInscricao = tipoInscricao;
	}

	/**
	 * @return O atributo numeroInscricao
	 */
	public String getNumeroInscricao() {
		return numeroInscricao;
	}

	/**
	 * @param numeroInscricao
	 *            define o atributo numeroInscricao
	 */
	public void setNumeroInscricao(final String numeroInscricao) {
		this.numeroInscricao = numeroInscricao;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return EventoTomadorServicoIdentificacaoContribuinteTO.serialVersionUID;
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
		result = (prime * result) + ((tipoInscricao == null) ? 0 : tipoInscricao.hashCode());
		result = (prime * result) + ((numeroInscricao == null) ? 0 : numeroInscricao.hashCode());
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
		final EventoTomadorServicoIdentificacaoContribuinteTO other = (EventoTomadorServicoIdentificacaoContribuinteTO) obj;
		if (tipoInscricao == null) {
			if (other.tipoInscricao != null) {
				return false;
			}
		} else if (!tipoInscricao.equals(other.tipoInscricao)) {
			return false;
		}
		if (numeroInscricao == null) {
			if (other.numeroInscricao != null) {
				return false;
			}
		} else if (!numeroInscricao.equals(other.numeroInscricao)) {
			return false;
		}
		return true;
	}

}

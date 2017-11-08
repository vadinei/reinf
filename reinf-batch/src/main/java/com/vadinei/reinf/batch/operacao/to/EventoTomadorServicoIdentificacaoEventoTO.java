package com.vadinei.reinf.batch.operacao.to;

import java.io.Serializable;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class EventoTomadorServicoIdentificacaoEventoTO implements Serializable {

	private static final long serialVersionUID = -6619659087467717708L;

	private Short tipoEvento; // indRetif

	private String numeroRecibo; // nrRecibo

	private String periodoApuracao; // perApur: AAAA-MM

	private Short tipoAmbiente; // tpAmb

	private Short processoEmissao; // procEmi

	private String versaoProcessoEmissao; // verProc

	/**
	 * @param tipoEvento
	 * @param numeroRecibo
	 * @param periodoApuracao
	 * @param tipoAmbiente
	 * @param processoEmissao
	 * @param versaoProcessoEmissao
	 */
	public EventoTomadorServicoIdentificacaoEventoTO(final Short tipoEvento, final String numeroRecibo,
			final String periodoApuracao, final Short tipoAmbiente, final Short processoEmissao,
			final String versaoProcessoEmissao) {
		super();

		this.tipoEvento = tipoEvento;
		this.numeroRecibo = numeroRecibo;
		this.periodoApuracao = periodoApuracao;
		this.tipoAmbiente = tipoAmbiente;
		this.processoEmissao = processoEmissao;
		this.versaoProcessoEmissao = versaoProcessoEmissao;
	}

	/**
	 * @return O atributo tipoEvento
	 */
	public Short getTipoEvento() {
		return tipoEvento;
	}

	/**
	 * @param tipoEvento
	 *            define o atributo tipoEvento
	 */
	public void setTipoEvento(final Short tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	/**
	 * @return O atributo numeroRecibo
	 */
	public String getNumeroRecibo() {
		return numeroRecibo;
	}

	/**
	 * @param numeroRecibo
	 *            define o atributo numeroRecibo
	 */
	public void setNumeroRecibo(final String numeroRecibo) {
		this.numeroRecibo = numeroRecibo;
	}

	/**
	 * @return O atributo periodoApuracao
	 */
	public String getPeriodoApuracao() {
		return periodoApuracao;
	}

	/**
	 * @param periodoApuracao
	 *            define o atributo periodoApuracao
	 */
	public void setPeriodoApuracao(final String periodoApuracao) {
		this.periodoApuracao = periodoApuracao;
	}

	/**
	 * @return O atributo tipoAmbiente
	 */
	public Short getTipoAmbiente() {
		return tipoAmbiente;
	}

	/**
	 * @param tipoAmbiente
	 *            define o atributo tipoAmbiente
	 */
	public void setTipoAmbiente(final Short tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}

	/**
	 * @return O atributo processoEmissao
	 */
	public Short getProcessoEmissao() {
		return processoEmissao;
	}

	/**
	 * @param processoEmissao
	 *            define o atributo processoEmissao
	 */
	public void setProcessoEmissao(final Short processoEmissao) {
		this.processoEmissao = processoEmissao;
	}

	/**
	 * @return O atributo versaoProcessoEmissao
	 */
	public String getVersaoProcessoEmissao() {
		return versaoProcessoEmissao;
	}

	/**
	 * @param versaoProcessoEmissao
	 *            define o atributo versaoProcessoEmissao
	 */
	public void setVersaoProcessoEmissao(final String versaoProcessoEmissao) {
		this.versaoProcessoEmissao = versaoProcessoEmissao;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return EventoTomadorServicoIdentificacaoEventoTO.serialVersionUID;
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
		result = (prime * result) + ((numeroRecibo == null) ? 0 : numeroRecibo.hashCode());
		result = (prime * result) + ((periodoApuracao == null) ? 0 : periodoApuracao.hashCode());
		result = (prime * result) + ((processoEmissao == null) ? 0 : processoEmissao.hashCode());
		result = (prime * result) + ((tipoAmbiente == null) ? 0 : tipoAmbiente.hashCode());
		result = (prime * result) + ((tipoEvento == null) ? 0 : tipoEvento.hashCode());
		result = (prime * result) + ((versaoProcessoEmissao == null) ? 0 : versaoProcessoEmissao.hashCode());
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
		final EventoTomadorServicoIdentificacaoEventoTO other = (EventoTomadorServicoIdentificacaoEventoTO) obj;
		if (numeroRecibo == null) {
			if (other.numeroRecibo != null) {
				return false;
			}
		} else if (!numeroRecibo.equals(other.numeroRecibo)) {
			return false;
		}
		if (periodoApuracao == null) {
			if (other.periodoApuracao != null) {
				return false;
			}
		} else if (!periodoApuracao.equals(other.periodoApuracao)) {
			return false;
		}
		if (processoEmissao == null) {
			if (other.processoEmissao != null) {
				return false;
			}
		} else if (!processoEmissao.equals(other.processoEmissao)) {
			return false;
		}
		if (tipoAmbiente == null) {
			if (other.tipoAmbiente != null) {
				return false;
			}
		} else if (!tipoAmbiente.equals(other.tipoAmbiente)) {
			return false;
		}
		if (tipoEvento == null) {
			if (other.tipoEvento != null) {
				return false;
			}
		} else if (!tipoEvento.equals(other.tipoEvento)) {
			return false;
		}
		if (versaoProcessoEmissao == null) {
			if (other.versaoProcessoEmissao != null) {
				return false;
			}
		} else if (!versaoProcessoEmissao.equals(other.versaoProcessoEmissao)) {
			return false;
		}
		return true;
	}

}

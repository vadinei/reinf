package com.vadinei.reinf.batch.operacao.to;

import java.io.Serializable;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class EventoTomadorServicoIdentificacaoEstabelecimentoObraTO implements Serializable {

	private static final long serialVersionUID = 8789187214519923129L;

	private final Short tipoInscricaoEstabelecimento; // tpInscEstab

	private final String numeroInscricaoEstabelecimento; // nrInscEstab

	private final Short indicativoObra; // indObra

	// idePrestServ
	private EventoTomadorServivoIdentificacaoPrestadorServicoTO identificacaoPrestadorServicoTO;

	/**
	 * @param tipoInscricaoEstabelecimento
	 * @param numeroInscricaoEstabelecimento
	 * @param indicativoObra
	 */
	public EventoTomadorServicoIdentificacaoEstabelecimentoObraTO(final Short tipoInscricaoEstabelecimento,
			final String numeroInscricaoEstabelecimento, final Short indicativoObra) {
		super();
		this.tipoInscricaoEstabelecimento = tipoInscricaoEstabelecimento;
		this.numeroInscricaoEstabelecimento = numeroInscricaoEstabelecimento;
		this.indicativoObra = indicativoObra;
	}

	/**
	 * @return O atributo identificacaoPrestadorServicoTO
	 */
	public EventoTomadorServivoIdentificacaoPrestadorServicoTO getIdentificacaoPrestadorServicoTO() {
		return identificacaoPrestadorServicoTO;
	}

	/**
	 * @param identificacaoPrestadorServicoTO
	 *            define o atributo identificacaoPrestadorServicoTO
	 */
	public void setIdentificacaoPrestadorServicoTO(
			final EventoTomadorServivoIdentificacaoPrestadorServicoTO identificacaoPrestadorServicoTO) {
		this.identificacaoPrestadorServicoTO = identificacaoPrestadorServicoTO;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return EventoTomadorServicoIdentificacaoEstabelecimentoObraTO.serialVersionUID;
	}

	/**
	 * @return O atributo tipoInscricaoEstabelecimento
	 */
	public Short getTipoInscricaoEstabelecimento() {
		return tipoInscricaoEstabelecimento;
	}

	/**
	 * @return O atributo numeroInscricaoEstabelecimento
	 */
	public String getNumeroInscricaoEstabelecimento() {
		return numeroInscricaoEstabelecimento;
	}

	/**
	 * @return O atributo indicativoObra
	 */
	public Short getIndicativoObra() {
		return indicativoObra;
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
		result = (prime * result)
				+ ((tipoInscricaoEstabelecimento == null) ? 0 : tipoInscricaoEstabelecimento.hashCode());
		result = (prime * result)
				+ ((numeroInscricaoEstabelecimento == null) ? 0 : numeroInscricaoEstabelecimento.hashCode());
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
		final EventoTomadorServicoIdentificacaoEstabelecimentoObraTO other = (EventoTomadorServicoIdentificacaoEstabelecimentoObraTO) obj;
		if (tipoInscricaoEstabelecimento == null) {
			if (other.tipoInscricaoEstabelecimento != null) {
				return false;
			}
		} else if (!tipoInscricaoEstabelecimento.equals(other.tipoInscricaoEstabelecimento)) {
			return false;
		}
		if (numeroInscricaoEstabelecimento == null) {
			if (other.numeroInscricaoEstabelecimento != null) {
				return false;
			}
		} else if (!numeroInscricaoEstabelecimento.equals(other.numeroInscricaoEstabelecimento)) {
			return false;
		}
		return true;
	}

}

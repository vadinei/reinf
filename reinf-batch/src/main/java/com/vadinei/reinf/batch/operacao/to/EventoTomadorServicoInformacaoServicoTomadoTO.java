package com.vadinei.reinf.batch.operacao.to;

import java.io.Serializable;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class EventoTomadorServicoInformacaoServicoTomadoTO implements Serializable {

	private static final long serialVersionUID = 8502486237213755549L;

	// ideEstabObra
	private EventoTomadorServicoIdentificacaoEstabelecimentoObraTO identificacaoEstabelecimentoObraTO;

	public EventoTomadorServicoInformacaoServicoTomadoTO() {
		super();
	}

	/**
	 * @return O atributo identificacaoEstabelecimentoObraTO
	 */
	public EventoTomadorServicoIdentificacaoEstabelecimentoObraTO getIdentificacaoEstabelecimentoObraTO() {
		return identificacaoEstabelecimentoObraTO;
	}

	/**
	 * @param identificacaoEstabelecimentoObraTO
	 *            define o atributo identificacaoEstabelecimentoObraTO
	 */
	public void setIdentificacaoEstabelecimentoObraTO(
			final EventoTomadorServicoIdentificacaoEstabelecimentoObraTO identificacaoEstabelecimentoObraTO) {
		this.identificacaoEstabelecimentoObraTO = identificacaoEstabelecimentoObraTO;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return EventoTomadorServicoInformacaoServicoTomadoTO.serialVersionUID;
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
				+ ((identificacaoEstabelecimentoObraTO == null) ? 0 : identificacaoEstabelecimentoObraTO.hashCode());
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
		final EventoTomadorServicoInformacaoServicoTomadoTO other = (EventoTomadorServicoInformacaoServicoTomadoTO) obj;
		if (identificacaoEstabelecimentoObraTO == null) {
			if (other.identificacaoEstabelecimentoObraTO != null) {
				return false;
			}
		} else if (!identificacaoEstabelecimentoObraTO.equals(other.identificacaoEstabelecimentoObraTO)) {
			return false;
		}
		return true;
	}

}

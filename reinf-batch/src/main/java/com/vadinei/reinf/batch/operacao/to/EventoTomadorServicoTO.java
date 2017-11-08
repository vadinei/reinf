package com.vadinei.reinf.batch.operacao.to;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 * Evento R-2010 - Cessão de Mão de Obra ou Empreitada.
 */
public class EventoTomadorServicoTO extends EventoTO {

	private static final long serialVersionUID = -7846049376799784061L;

	private String id; // Id

	// ideEvento
	private EventoTomadorServicoIdentificacaoEventoTO identificacaoEventoTO;

	// ideContri
	private EventoTomadorServicoIdentificacaoContribuinteTO identificacaoContribuinteTO;

	// infoServTom
	private EventoTomadorServicoInformacaoServicoTomadoTO informacaoServicoTomadoTO;

	public EventoTomadorServicoTO() {
		super();
	}

	/**
	 * @param id
	 */
	public EventoTomadorServicoTO(final String id) {
		this();
		this.id = id;
	}

	/**
	 * @return O atributo id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            define o atributo id
	 */
	public void setId(final String id) {
		this.id = id;
	}

	/**
	 * @return O atributo identificacaoEventoTO
	 */
	public EventoTomadorServicoIdentificacaoEventoTO getIdentificacaoEventoTO() {
		return identificacaoEventoTO;
	}

	/**
	 * @param identificacaoEventoTO
	 *            define o atributo identificacaoEventoTO
	 */
	public void setIdentificacaoEventoTO(final EventoTomadorServicoIdentificacaoEventoTO identificacaoEventoTO) {
		this.identificacaoEventoTO = identificacaoEventoTO;
	}

	/**
	 * @return O atributo identificacaoContribuinteTO
	 */
	public EventoTomadorServicoIdentificacaoContribuinteTO getIdentificacaoContribuinteTO() {
		return identificacaoContribuinteTO;
	}

	/**
	 * @param identificacaoContribuinteTO
	 *            define o atributo identificacaoContribuinteTO
	 */
	public void setIdentificacaoContribuinteTO(
			final EventoTomadorServicoIdentificacaoContribuinteTO identificacaoContribuinteTO) {
		this.identificacaoContribuinteTO = identificacaoContribuinteTO;
	}

	/**
	 * @return O atributo informacaoServicoTomadoTO
	 */
	public EventoTomadorServicoInformacaoServicoTomadoTO getInformacaoServicoTomadoTO() {
		return informacaoServicoTomadoTO;
	}

	/**
	 * @param informacaoServicoTomadoTO
	 *            define o atributo informacaoServicoTomadoTO
	 */
	public void setInformacaoServicoTomadoTO(
			final EventoTomadorServicoInformacaoServicoTomadoTO informacaoServicoTomadoTO) {
		this.informacaoServicoTomadoTO = informacaoServicoTomadoTO;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return EventoTomadorServicoTO.serialVersionUID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = (prime * result) + ((id == null) ? 0 : id.hashCode());
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
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final EventoTomadorServicoTO other = (EventoTomadorServicoTO) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}

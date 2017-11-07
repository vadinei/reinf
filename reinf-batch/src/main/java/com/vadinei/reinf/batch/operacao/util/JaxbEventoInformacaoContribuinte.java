package com.vadinei.reinf.batch.operacao.util;

import java.io.Serializable;

import com.vadinei.reinf.batch.operacao.to.EventoTO;
import com.vadinei.reinf.batch.schema.evento.informacaocontribuinte.ObjectFactory;
import com.vadinei.reinf.batch.schema.evento.informacaocontribuinte.Reinf;
import com.vadinei.reinf.batch.schema.evento.informacaocontribuinte.Reinf.EvtInfoContri;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class JaxbEventoInformacaoContribuinte extends JaxbEventoTemplate implements Serializable {

	private static final long serialVersionUID = -3109992683791859805L;

	private final EventoTO eventoTO;

	private final Reinf.EvtInfoContri jaxbEvento;

	private final ObjectFactory jaxbObjectFactory;

	/**
	 * @param eventoTO
	 * @param jaxbEvento
	 * @param jaxbObjectFactory
	 */
	public JaxbEventoInformacaoContribuinte(final EventoTO eventoTO, final ObjectFactory jaxbObjectFactory) {
		super();

		this.eventoTO = eventoTO != null ? eventoTO : new EventoTO();
		this.jaxbObjectFactory = jaxbObjectFactory != null ? jaxbObjectFactory : new ObjectFactory();

		final EvtInfoContri jaxbEvento = jaxbObjectFactory.createReinfEvtInfoContri();
		this.jaxbEvento = jaxbEvento;
	}

	@Override
	public void setup() {

		// Implementação da passagem dos valores do eventoTo para jaxbEvento.

	}

	@Override
	public EventoTO getEventoTO() {
		return eventoTO;
	}

	@Override
	public Object getJaxbEvento() {
		return jaxbEvento;
	}

	@Override
	public Object getJaxbObjectFactory() {
		return jaxbObjectFactory;
	}

}

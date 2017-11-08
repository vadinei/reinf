package com.vadinei.reinf.batch.operacao.util;

import java.io.Serializable;

import com.vadinei.reinf.batch.operacao.to.EventoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoTO;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.ObjectFactory;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class JaxbEventoTomadorServico extends JaxbEventoTemplate implements Serializable {

	private static final long serialVersionUID = 3642357472086523563L;

	private final EventoTO eventoTO;

	private final Reinf.EvtServTom jaxbEvento;

	private final ObjectFactory jaxbObjectFactory;

	/**
	 * @param eventoTO
	 * @param jaxbEvento
	 * @param jaxbObjectFactory
	 */
	public JaxbEventoTomadorServico(final EventoTomadorServicoTO eventoTO, final ObjectFactory jaxbObjectFactory) {
		super();

		this.eventoTO = eventoTO != null ? eventoTO : new EventoTomadorServicoTO();
		this.jaxbObjectFactory = jaxbObjectFactory != null ? jaxbObjectFactory : new ObjectFactory();

		final EvtServTom jaxbEvento = jaxbObjectFactory.createReinfEvtServTom();
		this.jaxbEvento = jaxbEvento;
	}

	@Override
	public void setup() {

		// TODO: Implementação da passagem dos valores do eventoTo para jaxbEvento.

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

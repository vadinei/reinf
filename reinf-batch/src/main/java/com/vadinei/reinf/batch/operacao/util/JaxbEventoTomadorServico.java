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

	/**
	 * @param eventoTomadorServicoTO
	 * @param jaxbObjectFactory
	 */
	public JaxbEventoTomadorServico(final EventoTomadorServicoTO eventoTomadorServicoTO,
			final ObjectFactory jaxbObjectFactory) {
		super();

		eventoTO = eventoTomadorServicoTO != null ? eventoTomadorServicoTO : new EventoTomadorServicoTO();

		final ObjectFactory jaxbFactory = jaxbObjectFactory != null ? jaxbObjectFactory : new ObjectFactory();
		final EvtServTom jaxbEvento = jaxbFactory.createReinfEvtServTom();
		this.jaxbEvento = jaxbEvento;
	}

	@Override
	public void prepararGerarXML() {

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

}

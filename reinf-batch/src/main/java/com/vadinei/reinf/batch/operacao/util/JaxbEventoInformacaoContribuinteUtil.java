package com.vadinei.reinf.batch.operacao.util;

import java.io.Serializable;

import com.vadinei.reinf.batch.operacao.to.EventoInformacaoContribuinteTO;
import com.vadinei.reinf.batch.operacao.to.EventoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoTO;
import com.vadinei.reinf.batch.schema.evento.informacaocontribuinte.ObjectFactory;
import com.vadinei.reinf.batch.schema.evento.informacaocontribuinte.Reinf;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class JaxbEventoInformacaoContribuinteUtil extends JaxbEventoTemplateUtil implements Serializable {

	private static final long serialVersionUID = -3109992683791859805L;

	private final EventoTO eventoTO;

	private final ObjectFactory jaxbObjectFactory;

	private final Reinf.EvtInfoContri jaxbEvento;

	/**
	 * @param eventoTO
	 * @param jaxbEvento
	 * @param jaxbObjectFactory
	 */
	public JaxbEventoInformacaoContribuinteUtil(final EventoInformacaoContribuinteTO eventoTO,
			final ObjectFactory jaxbObjectFactory) {

		super();

		this.eventoTO = eventoTO != null ? eventoTO : new EventoTomadorServicoTO();
		this.jaxbObjectFactory = jaxbObjectFactory != null ? jaxbObjectFactory : new ObjectFactory();

		final Reinf.EvtInfoContri jaxbEvento = jaxbObjectFactory.createReinfEvtInfoContri();
		this.jaxbEvento = jaxbEvento;

	}

	@Override
	public void prepararGeracaoXML() {

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

	@Override
	public String getNamespace() {
		return null;
	}

}

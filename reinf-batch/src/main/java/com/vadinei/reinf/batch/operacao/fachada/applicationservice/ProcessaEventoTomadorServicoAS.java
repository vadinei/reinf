package com.vadinei.reinf.batch.operacao.fachada.applicationservice;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import com.vadinei.reinf.batch.operacao.fachada.applicationservice.entitycontroller.ProcessaEventoTomadorServicoECLocal;
import com.vadinei.reinf.batch.operacao.to.EventoInformacaoContribuinteTO;
import com.vadinei.reinf.batch.operacao.to.EventoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoTO;
import com.vadinei.reinf.batch.operacao.util.JaxbEventoTemplate;
import com.vadinei.reinf.batch.operacao.util.JaxbEventoTomadorServico;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.ObjectFactory;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
@Stateless
public class ProcessaEventoTomadorServicoAS extends ProcessaEventoASTemplate
implements ProcessaEventoTomadorServicoASLocal {

	@EJB
	private ProcessaEventoTomadorServicoECLocal processaEventoTomadorServicoECLocal;

	private ObjectFactory jaxbObjectFactory;

	private static final long serialVersionUID = 5834315293348378880L;

	@Override
	public void inicializar() {
		// TODO: implementar um Singleton para instanciar o ObjectFactory.
		jaxbObjectFactory = new ObjectFactory();
	}

	@Override
	public Logger getLog() {
		final Logger retorno = Logger.getLogger(ProcessaEventoTomadorServicoAS.class);
		return retorno;
	}

	@Override
	public void prepararGeraraoEvento() {

	}

	@Override
	public List<? extends EventoTO> getListaEventoParaGeracao() {
		return new ArrayList<EventoInformacaoContribuinteTO>();
	}

	@Override
	public void gerarEvento(final EventoTO eventoTo) {

		final EventoTomadorServicoTO eventoTomadorServicoTO = (EventoTomadorServicoTO) eventoTo;

		// TODO: definir os atributos do evento.

		// Processa a geração do XML do evento.
		final JaxbEventoTemplate jaxbEventoTemplate = new JaxbEventoTomadorServico(eventoTomadorServicoTO,
				jaxbObjectFactory);
		jaxbEventoTemplate.gerarXML();

	}

	@Override
	public void finalizarGeracaoEvento() {

	}

	@Override
	public void prepararEnvioEvento() {

	}

	@Override
	public List<? extends EventoTO> getListaEventoParaEnvio() {
		return new ArrayList<EventoInformacaoContribuinteTO>();
	}

	@Override
	public void enviarEvento(final EventoTO eventoTo) {

	}

	@Override
	public void finalizarEnvioEvento() {

	}

}

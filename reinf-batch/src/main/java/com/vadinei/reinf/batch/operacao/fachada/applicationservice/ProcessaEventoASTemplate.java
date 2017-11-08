package com.vadinei.reinf.batch.operacao.fachada.applicationservice;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.apache.log4j.Logger;

import com.vadinei.reinf.batch.operacao.to.EventoTO;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 * Template Method para a camada Application Service (AS) dos Eventos
 */
@Stateless
public abstract class ProcessaEventoASTemplate implements ProcessaEventoASTemplateLocal {

	private static final long serialVersionUID = -6664115365931509299L;

	@PostConstruct
	public abstract void inicializar();

	public abstract Logger getLog();

	// Métodos abstratos utilizados em gerarEvento(final String mensagem)
	public abstract void prepararGeraraoEvento();

	public abstract List<? extends EventoTO> getListaEventoParaGeracao();

	public abstract void gerarEvento(final EventoTO eventoTo);

	public abstract void finalizarGeracaoEvento();

	// Métodos abstratos utilizados em enviarEvento(final String mensagem)
	public abstract void prepararEnvioEvento();

	public abstract List<? extends EventoTO> getListaEventoParaEnvio();

	public abstract void enviarEvento(final EventoTO eventoTo);

	public abstract void finalizarEnvioEvento();

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void gerarEvento(final String mensagem) {

		prepararGeraraoEvento();

		final List<? extends EventoTO> listaEvento = getListaEventoParaGeracao();

		for (final EventoTO eventoTo : listaEvento) {

			gerarEvento(eventoTo);

		}

		finalizarGeracaoEvento();

	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void enviarEvento(final String mensagem) {

	}

}

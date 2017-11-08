package com.vadinei.reinf.batch.operacao.fachada.applicationservice;

import java.io.Serializable;

import javax.ejb.Local;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
@Local
public interface ProcessaEventoASTemplateLocal extends Serializable {

	void gerarEvento(final String mensagem);

	void enviarEvento(final String mensagem);
}

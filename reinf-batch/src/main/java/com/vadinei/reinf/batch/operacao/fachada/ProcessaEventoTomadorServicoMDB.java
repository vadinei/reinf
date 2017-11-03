package com.vadinei.reinf.batch.operacao.fachada;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
@MessageDriven
public class ProcessaEventoTomadorServicoMDB implements MessageListener {

	@Override
	public void onMessage(final Message arg0) {

	}

}

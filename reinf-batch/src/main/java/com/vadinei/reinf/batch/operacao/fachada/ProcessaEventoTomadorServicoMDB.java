package com.vadinei.reinf.batch.operacao.fachada;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
@MessageDriven(name = "ProcessaEventoTomadorServicoMDB", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "jms.queue.Test"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class ProcessaEventoTomadorServicoMDB implements MessageListener, Serializable {

	@Resource
	private Queue queue;

	@Resource
	private QueueConnectionFactory connectionFactory;

	private QueueConnection connection;

	private QueueSession session;

	private MessageProducer messageProducer;

	@EJB
	private ProcessaEventoTomadorServicoSFLocal processaEventoTomadorServicoSF;

	private static final long serialVersionUID = 745859427128618618L;

	@Override
	public void onMessage(final Message message) {

	}

}

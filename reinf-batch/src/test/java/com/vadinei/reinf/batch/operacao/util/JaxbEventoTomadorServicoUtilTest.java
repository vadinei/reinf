package com.vadinei.reinf.batch.operacao.util;

import org.junit.Before;
import org.junit.Test;

import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoTO;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.ObjectFactory;

public class JaxbEventoTomadorServicoUtilTest {

	private EventoTomadorServicoTO eventoTO;
	private ObjectFactory jaxbObjectFactory;

	@Before
	public void setup() {

		eventoTO = new EventoTomadorServicoTO();
		jaxbObjectFactory = new ObjectFactory();

	}

	@Test
	public void gerarXML() {

		final JaxbEventoTomadorServicoUtil jaxbEvento = new JaxbEventoTomadorServicoUtil(eventoTO, jaxbObjectFactory);

		jaxbEvento.gerarXML();

		System.out.println(eventoTO.getXmlOriginal());

	}

}

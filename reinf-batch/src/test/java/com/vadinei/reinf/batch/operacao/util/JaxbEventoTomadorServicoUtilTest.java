package com.vadinei.reinf.batch.operacao.util;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoIdentificacaoContribuinteTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoIdentificacaoEstabelecimentoObraTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoIdentificacaoEventoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoIdentificacaoPrestadorServicoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoInformacaoServicoTomadoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoInformacaoTipoServicoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoNotaFiscalServicoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoTO;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.ObjectFactory;

public class JaxbEventoTomadorServicoUtilTest {

	private EventoTomadorServicoTO eventoTO;
	private ObjectFactory jaxbObjectFactory;

	@Before
	public void setup() {

		eventoTO = getEventoTO();
		jaxbObjectFactory = new ObjectFactory();

	}

	@Test
	public void gerarXML() {

		final JaxbEventoTomadorServicoUtil jaxbEvento = new JaxbEventoTomadorServicoUtil(eventoTO, jaxbObjectFactory);

		jaxbEvento.gerarXML();

		System.out.println(eventoTO.getXmlOriginal());

	}

	private EventoTomadorServicoTO getEventoTO() {

		// final BigDecimal bigdecimalPadrao = null;
		// final BigDecimal bigdecimalPadrao = BigDecimal.ZERO;
		final BigDecimal bigdecimalPadrao = new BigDecimal("99999999999999.99");
		final EventoTomadorServicoTO retorno = new EventoTomadorServicoTO();

		/*
		 * ">" significa cada nível em que o atributo/objeto está para a raiz do evento.
		 */

		// > Reinf
		// >> retorno (evtServTom)
		retorno.setId("000000000000000000000000000000000000");

		// >>> identificacaoEventoTO (ideEvento)
		final EventoTomadorServicoIdentificacaoEventoTO identificacaoEventoTO = new EventoTomadorServicoIdentificacaoEventoTO(
				(short) 1, "1", Date.valueOf("2017-01-01"), (short) 1, (short) 1, "1_02_00");
		retorno.setIdentificacaoEventoTO(identificacaoEventoTO);

		// >>> identificacaoContribuinteTO (ideContri)
		final EventoTomadorServicoIdentificacaoContribuinteTO identificacaoContribuinteTO = new EventoTomadorServicoIdentificacaoContribuinteTO(
				(short) 1, "11111111111111");
		retorno.setIdentificacaoContribuinteTO(identificacaoContribuinteTO);

		// >>> informacaoServicoTomadoTO (infoServTom)
		final EventoTomadorServicoInformacaoServicoTomadoTO informacaoServicoTomadoTO = new EventoTomadorServicoInformacaoServicoTomadoTO();

		// >>>> identificacaoEstabelecimentoObraTO (ideEstabObra)
		final EventoTomadorServicoIdentificacaoEstabelecimentoObraTO identificacaoEstabelecimentoObraTO = new EventoTomadorServicoIdentificacaoEstabelecimentoObraTO(
				(short) 1, "22222222222222", (short) 1);

		// >>>>> identificacaoPrestadorServicoTO (idePrestServ)
		final EventoTomadorServicoIdentificacaoPrestadorServicoTO identificacaoPrestadorServicoTO = new EventoTomadorServicoIdentificacaoPrestadorServicoTO(
				"33333333333333", bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao,
				bigdecimalPadrao, bigdecimalPadrao, (short) 1);

		// >>>>>> listaNotaFiscalServicoTO (nfs)
		final List<EventoTomadorServicoNotaFiscalServicoTO> listaNotaFiscalServicoTO = new ArrayList<EventoTomadorServicoNotaFiscalServicoTO>();

		final EventoTomadorServicoNotaFiscalServicoTO nfs1 = new EventoTomadorServicoNotaFiscalServicoTO("1", "1",
				Date.valueOf("2017-01-01"), bigdecimalPadrao, "Nota Fiscal de Seriços 1");

		// >>>>>>> listaInformacaoTipoServicoTO1 (infoTpServ) - nsf1
		final List<EventoTomadorServicoInformacaoTipoServicoTO> listaInformacaoTipoServicoTO1 = new ArrayList<EventoTomadorServicoInformacaoTipoServicoTO>();

		final EventoTomadorServicoInformacaoTipoServicoTO informacaoTipoServicoTO1Nfs1 = new EventoTomadorServicoInformacaoTipoServicoTO(
				"000000001", bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao,
				bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao);
		final EventoTomadorServicoInformacaoTipoServicoTO informacaoTipoServicoTO2Nfs1 = new EventoTomadorServicoInformacaoTipoServicoTO(
				"000000002", bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao,
				bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao);

		listaInformacaoTipoServicoTO1.add(informacaoTipoServicoTO1Nfs1);
		listaInformacaoTipoServicoTO1.add(informacaoTipoServicoTO2Nfs1);

		nfs1.setListaInformacaoTipoServicoTO(listaInformacaoTipoServicoTO1);

		final EventoTomadorServicoNotaFiscalServicoTO nfs2 = new EventoTomadorServicoNotaFiscalServicoTO("2", "2",
				Date.valueOf("2017-01-02"), bigdecimalPadrao, "Nota Fiscal de Seriços 2");

		// >>>>>>> listaInformacaoTipoServicoTO2 (infoTpServ) - nsf2
		final List<EventoTomadorServicoInformacaoTipoServicoTO> listaInformacaoTipoServicoTO2 = new ArrayList<EventoTomadorServicoInformacaoTipoServicoTO>();

		final EventoTomadorServicoInformacaoTipoServicoTO informacaoTipoServicoTO1Nfs2 = new EventoTomadorServicoInformacaoTipoServicoTO(
				"000000003", bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao,
				bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao);
		final EventoTomadorServicoInformacaoTipoServicoTO informacaoTipoServicoTO2Nfs2 = new EventoTomadorServicoInformacaoTipoServicoTO(
				"000000004", bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao,
				bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao, bigdecimalPadrao);

		listaInformacaoTipoServicoTO2.add(informacaoTipoServicoTO1Nfs2);
		listaInformacaoTipoServicoTO2.add(informacaoTipoServicoTO2Nfs2);

		nfs2.setListaInformacaoTipoServicoTO(listaInformacaoTipoServicoTO2);

		listaNotaFiscalServicoTO.add(nfs1);
		listaNotaFiscalServicoTO.add(nfs2);

		// >>>>>> listaInformacaoProcessoNaoRetencaoPrevidenciariaTO (infoProcRetPr)
		final List<EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO> listaInformacaoProcessoNaoRetencaoPrevidenciariaTO = new ArrayList<EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO>();
		final EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO informacaoProcessoNaoRetencaoPrevidenciariaTO1 = new EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO(
				(short) 1, "1", null, bigdecimalPadrao);
		final EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO informacaoProcessoNaoRetencaoPrevidenciariaTO2 = new EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO(
				(short) 2, "2", null, bigdecimalPadrao);

		listaInformacaoProcessoNaoRetencaoPrevidenciariaTO.add(informacaoProcessoNaoRetencaoPrevidenciariaTO1);
		listaInformacaoProcessoNaoRetencaoPrevidenciariaTO.add(informacaoProcessoNaoRetencaoPrevidenciariaTO2);

		// >>>>>> listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO
		// (infoProcRetAd)
		final List<EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO> listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO = new ArrayList<EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO>();
		final EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO informacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO1 = new EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO(
				(short) 1, "3", null, bigdecimalPadrao);
		final EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO informacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO2 = new EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO(
				(short) 2, "4", null, bigdecimalPadrao);

		listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO
		.add(informacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO1);
		listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO
		.add(informacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO2);

		// >>>>>> idePrestServ.nfs
		identificacaoPrestadorServicoTO.setListaNotaFiscalServicoTO(listaNotaFiscalServicoTO);

		// >>>>>> idePrestServ.infoProcRetPr
		identificacaoPrestadorServicoTO.setListaInformacaoProcessoNaoRetencaoPrevidenciariaTO(
				listaInformacaoProcessoNaoRetencaoPrevidenciariaTO);

		// >>>>>> idePrestServ.infoProcRetAd
		identificacaoPrestadorServicoTO.setListaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO(
				listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO);

		// >>>>> ideEstabObra.idePrestServ
		identificacaoEstabelecimentoObraTO.setIdentificacaoPrestadorServicoTO(identificacaoPrestadorServicoTO);

		// >>>> infoServTom.ideEstabObra
		informacaoServicoTomadoTO.setIdentificacaoEstabelecimentoObraTO(identificacaoEstabelecimentoObraTO);

		// >>> evtServTom.infoServTom
		retorno.setInformacaoServicoTomadoTO(informacaoServicoTomadoTO);

		return retorno;
	}

}

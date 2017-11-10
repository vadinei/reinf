package com.vadinei.reinf.batch.operacao.util;

import java.io.Serializable;
import java.util.List;

import com.vadinei.reinf.batch.operacao.to.EventoTO;
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
import com.vadinei.reinf.batch.schema.comum.SignatureType;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.ObjectFactory;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.IdeContri;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.IdeEvento;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.InfoServTom;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.InfoServTom.IdeEstabObra;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.InfoProcRetAd;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.InfoProcRetPr;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.Nfs;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.Nfs.InfoTpServ;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class JaxbEventoTomadorServicoUtil extends JaxbEventoTemplateUtil implements Serializable {

	private static final String NAMESPACE = "xmlns:\"http://www.reinf.esocial.gov.br/schemas/evtTomadorServicos/v1_02_00\"";

	private static final long serialVersionUID = 3642357472086523563L;

	private final EventoTO eventoTO;

	private final ObjectFactory jaxbObjectFactory;

	private final Reinf jaxbEvento;

	/**
	 * @param eventoTomadorServicoTO
	 * @param jaxbObjectFactory
	 */
	public JaxbEventoTomadorServicoUtil(final EventoTomadorServicoTO eventoTomadorServicoTO,
			final ObjectFactory jaxbObjectFactory) {

		super();

		eventoTO = eventoTomadorServicoTO != null ? eventoTomadorServicoTO : new EventoTomadorServicoTO();
		this.jaxbObjectFactory = jaxbObjectFactory != null ? jaxbObjectFactory : new ObjectFactory();

		final Reinf jaxbEvento = jaxbObjectFactory.createReinf();
		this.jaxbEvento = jaxbEvento;

	}

	@Override
	public void prepararGeracaoXML() {

		final EventoTomadorServicoTO eventoTO = (EventoTomadorServicoTO) getEventoTO();
		final ObjectFactory jaxbObjectFactory = (ObjectFactory) getJaxbObjectFactory();
		final Reinf jaxbEvento = (Reinf) getJaxbEvento();

		// evtServTom
		final EvtServTom evtServTom = jaxbObjectFactory.createReinfEvtServTom();
		evtServTom.setId(eventoTO.getId());

		// ideEvento
		final IdeEvento ideEvento = getIdeEvento(eventoTO, jaxbObjectFactory);
		evtServTom.setIdeEvento(ideEvento);

		// ideContri
		final IdeContri ideContri = getIdeContri(eventoTO, jaxbObjectFactory);
		evtServTom.setIdeContri(ideContri);

		// infoServTom
		final InfoServTom infoServTom = getInfoServTom(eventoTO, jaxbObjectFactory);
		evtServTom.setInfoServTom(infoServTom);

		jaxbEvento.setEvtServTom(evtServTom);

		final SignatureType signature = jaxbObjectFactory.createSignatureType();
		jaxbEvento.setSignature(signature);
	}

	/**
	 * @param eventoTO
	 * @param jaxbObjectFactory
	 * @return IdeEvento
	 */
	private IdeEvento getIdeEvento(final EventoTomadorServicoTO eventoTO, final ObjectFactory jaxbObjectFactory) {

		final IdeEvento retorno = jaxbObjectFactory.createReinfEvtServTomIdeEvento();
		final EventoTomadorServicoIdentificacaoEventoTO identificacaoEventoTO = eventoTO.getIdentificacaoEventoTO();

		if (identificacaoEventoTO == null) {
			return retorno;
		}

		retorno.setIndRetif(identificacaoEventoTO.getIndicativoRetificacao());
		retorno.setNrRecibo(identificacaoEventoTO.getNumeroRecibo());
		retorno.setPerApur(DataUtil.converterDateParaXML(identificacaoEventoTO.getPeriodoApuracao(), "yyyy-MM"));
		retorno.setTpAmb(identificacaoEventoTO.getTipoAmbiente());
		retorno.setProcEmi(identificacaoEventoTO.getProcessoEmissao());
		retorno.setVerProc(identificacaoEventoTO.getVersaoProcessoEmissao());

		return retorno;

	}

	/**
	 * @param eventoTO
	 * @param jaxbObjectFactory
	 * @return IdeContri
	 */
	private IdeContri getIdeContri(final EventoTomadorServicoTO eventoTO, final ObjectFactory jaxbObjectFactory) {

		final IdeContri retorno = jaxbObjectFactory.createReinfEvtServTomIdeContri();
		final EventoTomadorServicoIdentificacaoContribuinteTO identificacaoContribuinteTO = eventoTO
				.getIdentificacaoContribuinteTO();

		if (identificacaoContribuinteTO == null) {
			return retorno;
		}

		retorno.setTpInsc(identificacaoContribuinteTO.getTipoInscricao());
		retorno.setNrInsc(identificacaoContribuinteTO.getNumeroInscricao());

		return retorno;

	}

	/**
	 * @param eventoTO
	 * @param jaxbObjectFactory
	 * @return InfoServTom
	 */
	private InfoServTom getInfoServTom(final EventoTomadorServicoTO eventoTO, final ObjectFactory jaxbObjectFactory) {

		final InfoServTom retorno = jaxbObjectFactory.createReinfEvtServTomInfoServTom();

		// ideEstabObra
		final IdeEstabObra ideEstabObra = getIdeEstabObra(eventoTO, retorno, jaxbObjectFactory);
		retorno.setIdeEstabObra(ideEstabObra);

		return retorno;

	}

	/**
	 * @param eventoTO
	 * @param infoServTom
	 * @param jaxbObjectFactory
	 * @return IdeEstabObra
	 */
	private IdeEstabObra getIdeEstabObra(final EventoTomadorServicoTO eventoTO, final InfoServTom infoServTom,
			final ObjectFactory jaxbObjectFactory) {

		final IdeEstabObra retorno = jaxbObjectFactory.createReinfEvtServTomInfoServTomIdeEstabObra();

		final EventoTomadorServicoInformacaoServicoTomadoTO informacaoServicoTomadoTO = eventoTO
				.getInformacaoServicoTomadoTO();

		if (informacaoServicoTomadoTO == null) {
			return retorno;
		}

		final EventoTomadorServicoIdentificacaoEstabelecimentoObraTO identificacaoEstabelecimentoObraTO = informacaoServicoTomadoTO
				.getIdentificacaoEstabelecimentoObraTO();

		if (identificacaoEstabelecimentoObraTO == null) {
			return retorno;
		}

		retorno.setTpInscEstab(identificacaoEstabelecimentoObraTO.getTipoInscricaoEstabelecimento());
		retorno.setNrInscEstab(identificacaoEstabelecimentoObraTO.getNumeroInscricaoEstabelecimento());
		retorno.setIndObra(identificacaoEstabelecimentoObraTO.getIndicativoObra());

		// idePrestServ
		final IdePrestServ idePrestServ = getIdePrestServ(eventoTO, retorno, jaxbObjectFactory);
		retorno.setIdePrestServ(idePrestServ);

		return retorno;

	}

	/**
	 * @param eventoTO
	 * @param ideEstabObra
	 * @param jaxbObjectFactory
	 * @return IdePrestServ
	 */
	private IdePrestServ getIdePrestServ(final EventoTomadorServicoTO eventoTO, final IdeEstabObra ideEstabObra,
			final ObjectFactory jaxbObjectFactory) {

		final IdePrestServ retorno = jaxbObjectFactory.createReinfEvtServTomInfoServTomIdeEstabObraIdePrestServ();

		final EventoTomadorServicoInformacaoServicoTomadoTO informacaoServicoTomadoTO = eventoTO
				.getInformacaoServicoTomadoTO();

		if (informacaoServicoTomadoTO == null) {
			return retorno;
		}

		final EventoTomadorServicoIdentificacaoEstabelecimentoObraTO identificacaoEstabelecimentoObraTO = informacaoServicoTomadoTO
				.getIdentificacaoEstabelecimentoObraTO();

		if (identificacaoEstabelecimentoObraTO == null) {
			return retorno;
		}

		final EventoTomadorServicoIdentificacaoPrestadorServicoTO identificacaoPrestadorServicoTO = identificacaoEstabelecimentoObraTO
				.getIdentificacaoPrestadorServicoTO();

		if (identificacaoPrestadorServicoTO == null) {
			return retorno;
		}

		retorno.setCnpjPrestador(identificacaoPrestadorServicoTO.getCnpjPrestador());
		retorno.setVlrTotalBruto(NumberUtil.formatarBigDecimalParaXML(
				identificacaoPrestadorServicoTO.getValorTotalBrutoNotaFiscal(), Boolean.TRUE));
		retorno.setVlrTotalBaseRet(NumberUtil.formatarBigDecimalParaXML(
				identificacaoPrestadorServicoTO.getValorTotalBaseRetencaoContribuicao(), Boolean.TRUE));
		retorno.setVlrTotalRetPrinc(NumberUtil.formatarBigDecimalParaXML(
				identificacaoPrestadorServicoTO.getValorTotalRetencaoPrincipalNotaFiscalServico(), Boolean.TRUE));
		retorno.setVlrTotalRetAdic(NumberUtil.formatarBigDecimalParaXML(
				identificacaoPrestadorServicoTO.getValorTotalRetencaoAdicionalNotaFiscalServico()));
		retorno.setVlrTotalNRetPrinc(NumberUtil.formatarBigDecimalParaXML(
				identificacaoPrestadorServicoTO.getValorTotalRetencaoPrincipalExcepcional()));
		retorno.setVlrTotalNRetAdic(NumberUtil.formatarBigDecimalParaXML(
				identificacaoPrestadorServicoTO.getValorTotalRetencaoAdicionalExcepcional()));
		retorno.setIndCPRB(identificacaoPrestadorServicoTO.getIndicativoCPRB());

		// nfs
		prepararNfs(identificacaoPrestadorServicoTO, retorno, jaxbObjectFactory);

		// infoProcRetPr
		prepaparInfoProcRetPr(identificacaoPrestadorServicoTO, retorno, jaxbObjectFactory);

		// infoProcRetAd
		prepararInfoProcRetAd(identificacaoPrestadorServicoTO, retorno, jaxbObjectFactory);

		return retorno;

	}

	/**
	 * @param identificacaoPrestadorServicoTO
	 * @param retorno
	 * @param jaxbObjectFactory
	 */
	private void prepararNfs(final EventoTomadorServicoIdentificacaoPrestadorServicoTO identificacaoPrestadorServicoTO,
			final IdePrestServ retorno, final ObjectFactory jaxbObjectFactory) {

		final List<EventoTomadorServicoNotaFiscalServicoTO> listaNotaFiscalServicoTO = identificacaoPrestadorServicoTO
				.getListaNotaFiscalServicoTO();

		if ((listaNotaFiscalServicoTO != null) && (!listaNotaFiscalServicoTO.isEmpty())) {

			final List<Nfs> listaNfs = retorno.getNfs();
			for (final EventoTomadorServicoNotaFiscalServicoTO nfsTO : listaNotaFiscalServicoTO) {

				final Nfs nfs = getNfs(nfsTO, jaxbObjectFactory);
				listaNfs.add(nfs);

			}

		}

	}

	/**
	 * @param nfsTO
	 * @param jaxbObjectFactory
	 * @return Nfs
	 */
	private Nfs getNfs(final EventoTomadorServicoNotaFiscalServicoTO nfsTO, final ObjectFactory jaxbObjectFactory) {

		final Nfs retorno = jaxbObjectFactory.createReinfEvtServTomInfoServTomIdeEstabObraIdePrestServNfs();

		if (nfsTO == null) {
			return retorno;
		}

		retorno.setSerie(nfsTO.getSerie());
		retorno.setNumDocto(nfsTO.getNumeroDocumento());
		retorno.setDtEmissaoNF(DataUtil.converterDateParaXML(nfsTO.getDataEmissaoNotaFiscal()));
		retorno.setVlrBruto(NumberUtil.formatarBigDecimalParaXML(nfsTO.getValorBruto(), Boolean.TRUE));
		retorno.setObs(nfsTO.getObservacao());

		// infoTpServ
		final List<EventoTomadorServicoInformacaoTipoServicoTO> listaInformacaoTipoServicoTO = nfsTO
				.getListaInformacaoTipoServicoTO();

		if ((listaInformacaoTipoServicoTO != null) && (!listaInformacaoTipoServicoTO.isEmpty())) {

			final List<InfoTpServ> listaInfoTpServ = retorno.getInfoTpServ();
			for (final EventoTomadorServicoInformacaoTipoServicoTO infoTpServTO : listaInformacaoTipoServicoTO) {

				final InfoTpServ infoTpServ = getInfoTpServ(infoTpServTO, jaxbObjectFactory);
				listaInfoTpServ.add(infoTpServ);

			}

		}

		return retorno;

	}

	/**
	 * @param infoTpServTO
	 * @param jaxbObjectFactory
	 * @return InfoTpServ
	 */
	private InfoTpServ getInfoTpServ(final EventoTomadorServicoInformacaoTipoServicoTO infoTpServTO,
			final ObjectFactory jaxbObjectFactory) {

		final InfoTpServ retorno = jaxbObjectFactory
				.createReinfEvtServTomInfoServTomIdeEstabObraIdePrestServNfsInfoTpServ();

		if (infoTpServTO == null) {
			return retorno;
		}

		retorno.setTpServico(infoTpServTO.getTipoServico());
		retorno.setVlrBaseRet(NumberUtil.formatarBigDecimalParaXML(infoTpServTO.getValorBaseRetencao(), Boolean.TRUE));
		retorno.setVlrRetencao(NumberUtil.formatarBigDecimalParaXML(infoTpServTO.getValorRetencao(), Boolean.TRUE));
		retorno.setVlrRetSub(NumberUtil.formatarBigDecimalParaXML(infoTpServTO.getValorRetencaoServicoSubcontratado()));
		retorno.setVlrNRetPrinc(
				NumberUtil.formatarBigDecimalParaXML(infoTpServTO.getValorRetencaoPrincipalExcepcional()));
		retorno.setVlrServicos15(
				NumberUtil.formatarBigDecimalParaXML(infoTpServTO.getValorServicoSeguradoEspecial15Anos()));
		retorno.setVlrServicos20(
				NumberUtil.formatarBigDecimalParaXML(infoTpServTO.getValorServicoSeguradoEspecial20Anos()));
		retorno.setVlrServicos25(
				NumberUtil.formatarBigDecimalParaXML(infoTpServTO.getValorServicoSeguradoEspecial25Anos()));
		retorno.setVlrAdicional(NumberUtil.formatarBigDecimalParaXML(infoTpServTO.getValorAdicional()));
		retorno.setVlrNRetAdic(
				NumberUtil.formatarBigDecimalParaXML(infoTpServTO.getValorRetencaoAdicionalExcepcional()));

		return retorno;

	}

	/**
	 * @param identificacaoPrestadorServicoTO
	 * @param retorno
	 * @param jaxbObjectFactory
	 */
	private void prepaparInfoProcRetPr(
			final EventoTomadorServicoIdentificacaoPrestadorServicoTO identificacaoPrestadorServicoTO,
			final IdePrestServ retorno, final ObjectFactory jaxbObjectFactory) {

		final List<EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO> listaInfNaoRetencaoPrevidenciariaTO = identificacaoPrestadorServicoTO
				.getListaInformacaoProcessoNaoRetencaoPrevidenciariaTO();

		if ((listaInfNaoRetencaoPrevidenciariaTO != null) && (!listaInfNaoRetencaoPrevidenciariaTO.isEmpty())) {

			final List<InfoProcRetPr> listaInfoProcRetPr = retorno.getInfoProcRetPr();
			for (final EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO infoProcRetPrTO : listaInfNaoRetencaoPrevidenciariaTO) {

				final InfoProcRetPr infoProcRetPr = getInfoProcRetPr(infoProcRetPrTO, jaxbObjectFactory);
				listaInfoProcRetPr.add(infoProcRetPr);

			}

		}

	}

	/**
	 * @param infoProcRetPrTO
	 * @param jaxbObjectFactory
	 * @return InfoProcRetPr
	 */
	private InfoProcRetPr getInfoProcRetPr(
			final EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO infoProcRetPrTO,
			final ObjectFactory jaxbObjectFactory) {

		final InfoProcRetPr retorno = jaxbObjectFactory
				.createReinfEvtServTomInfoServTomIdeEstabObraIdePrestServInfoProcRetPr();

		if (infoProcRetPrTO == null) {
			return retorno;
		}

		retorno.setTpProcRetPrinc(infoProcRetPrTO.getTipoProcessoRetencaoPrincipal());
		retorno.setNrProcRetPrinc(infoProcRetPrTO.getNumeroProcessoRetencaoPrincipal());
		retorno.setCodSuspPrinc(infoProcRetPrTO.getCodigoIndicativoSuspensaoPrincipal());
		retorno.setValorPrinc(
				NumberUtil.formatarBigDecimalParaXML(infoProcRetPrTO.getValorRetencaoPrincipal(), Boolean.TRUE));

		return retorno;

	}

	/**
	 * @param identificacaoPrestadorServicoTO
	 * @param retorno
	 * @param jaxbObjectFactory
	 */
	private void prepararInfoProcRetAd(
			final EventoTomadorServicoIdentificacaoPrestadorServicoTO identificacaoPrestadorServicoTO,
			final IdePrestServ retorno, final ObjectFactory jaxbObjectFactory) {

		final List<EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO> listaInfNaoRetencaoPrevidenciariaAdicionalTO = identificacaoPrestadorServicoTO
				.getListaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO();

		if ((listaInfNaoRetencaoPrevidenciariaAdicionalTO != null)
				&& (!listaInfNaoRetencaoPrevidenciariaAdicionalTO.isEmpty())) {

			final List<InfoProcRetAd> listaInfoProcRetAd = retorno.getInfoProcRetAd();
			for (final EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO infoProcRetAdTO : listaInfNaoRetencaoPrevidenciariaAdicionalTO) {

				final InfoProcRetAd infoProcRetAd = getInfoProcRetAd(infoProcRetAdTO, jaxbObjectFactory);
				listaInfoProcRetAd.add(infoProcRetAd);

			}

		}

	}

	/**
	 * @param infoProcRetAdTO
	 * @param jaxbObjectFactory
	 * @return InfoProcRetAd
	 */
	private InfoProcRetAd getInfoProcRetAd(
			final EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO infoProcRetAdTO,
			final ObjectFactory jaxbObjectFactory) {

		final InfoProcRetAd retorno = jaxbObjectFactory
				.createReinfEvtServTomInfoServTomIdeEstabObraIdePrestServInfoProcRetAd();

		if (infoProcRetAdTO == null) {
			return retorno;
		}

		retorno.setTpProcRetAdic(infoProcRetAdTO.getTipoProcessoRetencaoAdicional());
		retorno.setNrProcRetAdic(infoProcRetAdTO.getNumeroProcessoRetencaoAdicional());
		retorno.setCodSuspAdic(infoProcRetAdTO.getCodigoIndicativoSuspensaoAdicional());
		retorno.setValorAdic(
				NumberUtil.formatarBigDecimalParaXML(infoProcRetAdTO.getValorRetencaoAdicional(), Boolean.TRUE));

		return retorno;

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
		return JaxbEventoTomadorServicoUtil.NAMESPACE;
	}

}
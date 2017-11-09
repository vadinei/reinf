package com.vadinei.reinf.batch.operacao.util;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.vadinei.reinf.batch.operacao.to.EventoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoIdentificacaoContribuinteTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoIdentificacaoEstabelecimentoObraTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoIdentificacaoEventoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoIdentificacaoPrestadorServicoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoInformacaoServicoTomadoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoNotaFiscalServicoTO;
import com.vadinei.reinf.batch.operacao.to.EventoTomadorServicoTO;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.ObjectFactory;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.IdeContri;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.IdeEvento;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.InfoServTom;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.InfoServTom.IdeEstabObra;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ;
import com.vadinei.reinf.batch.schema.evento.tomadorservico.Reinf.EvtServTom.InfoServTom.IdeEstabObra.IdePrestServ.Nfs;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class JaxbEventoTomadorServico extends JaxbEventoTemplate implements Serializable {

	private static final long serialVersionUID = 3642357472086523563L;

	private final EventoTO eventoTO;

	private final ObjectFactory jaxbObjectFactory;

	private final EvtServTom jaxbEvento;

	private final NumberFormat decimalFormat;

	/**
	 * @param eventoTomadorServicoTO
	 * @param jaxbObjectFactory
	 */
	public JaxbEventoTomadorServico(final EventoTomadorServicoTO eventoTomadorServicoTO,
			final ObjectFactory jaxbObjectFactory) {

		super();

		eventoTO = eventoTomadorServicoTO != null ? eventoTomadorServicoTO : new EventoTomadorServicoTO();
		this.jaxbObjectFactory = jaxbObjectFactory != null ? jaxbObjectFactory : new ObjectFactory();

		final EvtServTom jaxbEvento = jaxbObjectFactory.createReinfEvtServTom();
		this.jaxbEvento = jaxbEvento;

		final Locale locale = new Locale(ConstanteUtil.SIGLA_PORTUGUES, ConstanteUtil.SIGLA_BRASIL);
		decimalFormat = NumberFormat.getNumberInstance(locale);
		decimalFormat.setGroupingUsed(Boolean.FALSE);
		decimalFormat.setMaximumFractionDigits(ConstanteUtil.CASA_DECIMAL_PADRAO);
		decimalFormat.setMinimumFractionDigits(ConstanteUtil.CASA_DECIMAL_PADRAO);

	}

	@Override
	public void prepararGerarXML() {

		final EventoTomadorServicoTO eventoTO = (EventoTomadorServicoTO) getEventoTO();
		final ObjectFactory jaxbObjectFactory = (ObjectFactory) getJaxbObjectFactory();
		final EvtServTom jaxbEvento = (EvtServTom) getJaxbEvento();

		jaxbEvento.setId(eventoTO.getId());

		// ideEvento
		final IdeEvento ideEvento = getIdeEvento(eventoTO, jaxbObjectFactory);
		jaxbEvento.setIdeEvento(ideEvento);

		// ideContri
		final IdeContri ideContri = getIdeContri(eventoTO, jaxbObjectFactory);
		jaxbEvento.setIdeContri(ideContri);

		// infoServTom
		final InfoServTom infoServTom = getInfoServTom(eventoTO, jaxbObjectFactory);
		jaxbEvento.setInfoServTom(infoServTom);

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

		try {
			final GregorianCalendar gcPeriodoApuracao = new GregorianCalendar();
			gcPeriodoApuracao.setTime(identificacaoEventoTO.getPeriodoApuracao());

			// TODO: Ver a questão da formatação AAAA-MM (YYYY-MM)
			final XMLGregorianCalendar xgcPeriodoApuracao = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(gcPeriodoApuracao);
			retorno.setPerApur(xgcPeriodoApuracao);
		} catch (final DatatypeConfigurationException e) {
			e.printStackTrace();
		}

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

		final EventoTomadorServicoIdentificacaoEstabelecimentoObraTO identificacaoEstabelecimentoObraTO = eventoTO
				.getInformacaoServicoTomadoTO().getIdentificacaoEstabelecimentoObraTO();

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

		final EventoTomadorServicoIdentificacaoEstabelecimentoObraTO identificacaoEstabelecimentoObraTO = eventoTO
				.getInformacaoServicoTomadoTO().getIdentificacaoEstabelecimentoObraTO();

		if (identificacaoEstabelecimentoObraTO == null) {
			return retorno;
		}

		final EventoTomadorServicoIdentificacaoPrestadorServicoTO identificacaoPrestadorServicoTO = eventoTO
				.getInformacaoServicoTomadoTO().getIdentificacaoEstabelecimentoObraTO()
				.getIdentificacaoPrestadorServicoTO();

		if (identificacaoPrestadorServicoTO == null) {
			return retorno;
		}

		retorno.setCnpjPrestador(identificacaoPrestadorServicoTO.getCnpjPrestador());
		retorno.setVlrTotalBruto(getDecimalFormmat(identificacaoPrestadorServicoTO.getValorTotalBrutoNotaFiscal()));
		retorno.setVlrTotalBaseRet(getDecimalFormmat(identificacaoPrestadorServicoTO.getValorTotalBaseRetencaoContribuicao()));
		retorno.setVlrTotalRetPrinc(getDecimalFormmat(identificacaoPrestadorServicoTO.getValorTotalRetencaoPrincipalNotaFiscalServico()));
		retorno.setVlrTotalRetAdic(getDecimalFormmat(identificacaoPrestadorServicoTO.getValorTotalRetencaoAdicionalNotaFiscalServico()));
		retorno.setVlrTotalNRetPrinc(getDecimalFormmat(identificacaoPrestadorServicoTO.getValorTotalRetencaoPrincipalExcepcional()));
		retorno.setVlrTotalNRetAdic(getDecimalFormmat(identificacaoPrestadorServicoTO.getValorTotalRetencaoAdicionalExcepcional()));
		retorno.setIndCPRB(identificacaoPrestadorServicoTO.getIndicativoCPRB());

		setDetalhamentoPrestador(eventoTO, retorno, jaxbObjectFactory);
		return retorno;

	}

	/**
	 * @param eventoTO
	 * @param idePrestServ
	 * @param jaxbObjectFactory
	 */
	private void setDetalhamentoPrestador(final EventoTomadorServicoTO eventoTO, final IdePrestServ idePrestServ,
			final ObjectFactory jaxbObjectFactory) {

		final EventoTomadorServicoInformacaoServicoTomadoTO informacaoServicoTomadoTO = eventoTO
				.getInformacaoServicoTomadoTO();

		if (informacaoServicoTomadoTO == null) {
			return;
		}

		final EventoTomadorServicoIdentificacaoEstabelecimentoObraTO identificacaoEstabelecimentoObraTO = eventoTO
				.getInformacaoServicoTomadoTO().getIdentificacaoEstabelecimentoObraTO();

		if (identificacaoEstabelecimentoObraTO == null) {
			return;
		}

		final EventoTomadorServicoIdentificacaoPrestadorServicoTO identificacaoPrestadorServicoTO = eventoTO
				.getInformacaoServicoTomadoTO().getIdentificacaoEstabelecimentoObraTO()
				.getIdentificacaoPrestadorServicoTO();

		if (identificacaoPrestadorServicoTO == null) {
			return;
		}

		final List<EventoTomadorServicoNotaFiscalServicoTO> listaNotaFiscalServicoTO = eventoTO
				.getInformacaoServicoTomadoTO().getIdentificacaoEstabelecimentoObraTO()
				.getIdentificacaoPrestadorServicoTO().getListaNotaFiscalServicoTO();

		if ((listaNotaFiscalServicoTO == null) || listaNotaFiscalServicoTO.isEmpty()) {
			return;
		}

		// nfs
		final List<Nfs> listaNfs = idePrestServ.getNfs();
		listaNfs.clear();

		for (final EventoTomadorServicoNotaFiscalServicoTO notaFiscalServicoTO : listaNotaFiscalServicoTO) {

		}

	}

	/**
	 * @param valor
	 * @return String
	 */
	private String getDecimalFormmat(final BigDecimal valor) {
		final double valorDouble = valor == null ? BigDecimal.ZERO.doubleValue() : valor.doubleValue();
		return decimalFormat.format(valorDouble);
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

}

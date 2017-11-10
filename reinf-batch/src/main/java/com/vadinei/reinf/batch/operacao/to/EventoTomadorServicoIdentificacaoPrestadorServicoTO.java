package com.vadinei.reinf.batch.operacao.to;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class EventoTomadorServicoIdentificacaoPrestadorServicoTO implements Serializable {

	private static final long serialVersionUID = 7093794534451395094L;

	private String cnpjPrestador; // cnpjPrestador

	private BigDecimal valorTotalBrutoNotaFiscal; // valorTotalBruto

	private BigDecimal valorTotalBaseRetencaoContribuicao; // valorTotalBaseRet

	private BigDecimal valorTotalRetencaoPrincipalNotaFiscalServico; // valorTotalRetPrinc

	private BigDecimal valorTotalRetencaoAdicionalNotaFiscalServico; // valorTotalRetAdic

	private BigDecimal valorTotalRetencaoPrincipalExcepcional; // valorTotalNRetPrinc

	private BigDecimal valorTotalRetencaoAdicionalExcepcional; // valorTotalNRetAdic

	private Short indicativoCPRB; // indCPRB

	// nfs
	private List<EventoTomadorServicoNotaFiscalServicoTO> listaNotaFiscalServicoTO;

	// infoProcRetPr
	private List<EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO> listaInformacaoProcessoNaoRetencaoPrevidenciariaTO;

	// infoProcRetAd
	private List<EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO> listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO;

	/**
	 * @param cnpjPrestador
	 * @param valorTotalBrutoNotaFiscal
	 * @param valorTotalBaseRetencaoContribuicao
	 * @param valorTotalRetencaoPrincipalNotaFiscalServico
	 * @param valorTotalRetencaoAdicionalNotaFiscalServico
	 * @param valorTotalRetencaoPrincipalExcepcional
	 * @param valorTotalRetencaoAdicionalExcepcional
	 * @param indicativoCPRB
	 */
	public EventoTomadorServicoIdentificacaoPrestadorServicoTO(final String cnpjPrestador,
			final BigDecimal valorTotalBrutoNotaFiscal, final BigDecimal valorTotalBaseRetencaoContribuicao,
			final BigDecimal valorTotalRetencaoPrincipalNotaFiscalServico,
			final BigDecimal valorTotalRetencaoAdicionalNotaFiscalServico,
			final BigDecimal valorTotalRetencaoPrincipalExcepcional,
			final BigDecimal valorTotalRetencaoAdicionalExcepcional, final Short indicativoCPRB) {
		super();
		this.cnpjPrestador = cnpjPrestador;
		this.valorTotalBrutoNotaFiscal = valorTotalBrutoNotaFiscal;
		this.valorTotalBaseRetencaoContribuicao = valorTotalBaseRetencaoContribuicao;
		this.valorTotalRetencaoPrincipalNotaFiscalServico = valorTotalRetencaoPrincipalNotaFiscalServico;
		this.valorTotalRetencaoAdicionalNotaFiscalServico = valorTotalRetencaoAdicionalNotaFiscalServico;
		this.valorTotalRetencaoPrincipalExcepcional = valorTotalRetencaoPrincipalExcepcional;
		this.valorTotalRetencaoAdicionalExcepcional = valorTotalRetencaoAdicionalExcepcional;
		this.indicativoCPRB = indicativoCPRB;
	}

	/**
	 * @return O atributo cnpjPrestador
	 */
	public String getCnpjPrestador() {
		return cnpjPrestador;
	}

	/**
	 * @param cnpjPrestador
	 *            define o atributo cnpjPrestador
	 */
	public void setCnpjPrestador(final String cnpjPrestador) {
		this.cnpjPrestador = cnpjPrestador;
	}

	/**
	 * @return O atributo valorTotalBrutoNotaFiscal
	 */
	public BigDecimal getValorTotalBrutoNotaFiscal() {
		return valorTotalBrutoNotaFiscal;
	}

	/**
	 * @param valorTotalBrutoNotaFiscal
	 *            define o atributo valorTotalBrutoNotaFiscal
	 */
	public void setValorTotalBrutoNotaFiscal(final BigDecimal valorTotalBrutoNotaFiscal) {
		this.valorTotalBrutoNotaFiscal = valorTotalBrutoNotaFiscal;
	}

	/**
	 * @return O atributo valorTotalBaseRetencaoContribuicao
	 */
	public BigDecimal getValorTotalBaseRetencaoContribuicao() {
		return valorTotalBaseRetencaoContribuicao;
	}

	/**
	 * @param valorTotalBaseRetencaoContribuicao
	 *            define o atributo valorTotalBaseRetencaoContribuicao
	 */
	public void setValorTotalBaseRetencaoContribuicao(final BigDecimal valorTotalBaseRetencaoContribuicao) {
		this.valorTotalBaseRetencaoContribuicao = valorTotalBaseRetencaoContribuicao;
	}

	/**
	 * @return O atributo valorTotalRetencaoPrincipalNotaFiscalServico
	 */
	public BigDecimal getValorTotalRetencaoPrincipalNotaFiscalServico() {
		return valorTotalRetencaoPrincipalNotaFiscalServico;
	}

	/**
	 * @param valorTotalRetencaoPrincipalNotaFiscalServico
	 *            define o atributo valorTotalRetencaoPrincipalNotaFiscalServico
	 */
	public void setValorTotalRetencaoPrincipalNotaFiscalServico(
			final BigDecimal valorTotalRetencaoPrincipalNotaFiscalServico) {
		this.valorTotalRetencaoPrincipalNotaFiscalServico = valorTotalRetencaoPrincipalNotaFiscalServico;
	}

	/**
	 * @return O atributo valorTotalRetencaoAdicionalNotaFiscalServico
	 */
	public BigDecimal getValorTotalRetencaoAdicionalNotaFiscalServico() {
		return valorTotalRetencaoAdicionalNotaFiscalServico;
	}

	/**
	 * @param valorTotalRetencaoAdicionalNotaFiscalServico
	 *            define o atributo valorTotalRetencaoAdicionalNotaFiscalServico
	 */
	public void setValorTotalRetencaoAdicionalNotaFiscalServico(
			final BigDecimal valorTotalRetencaoAdicionalNotaFiscalServico) {
		this.valorTotalRetencaoAdicionalNotaFiscalServico = valorTotalRetencaoAdicionalNotaFiscalServico;
	}

	/**
	 * @return O atributo valorTotalRetencaoPrincipalExcepcional
	 */
	public BigDecimal getValorTotalRetencaoPrincipalExcepcional() {
		return valorTotalRetencaoPrincipalExcepcional;
	}

	/**
	 * @param valorTotalRetencaoPrincipalExcepcional
	 *            define o atributo valorTotalRetencaoPrincipalExcepcional
	 */
	public void setValorTotalRetencaoPrincipalExcepcional(final BigDecimal valorTotalRetencaoPrincipalExcepcional) {
		this.valorTotalRetencaoPrincipalExcepcional = valorTotalRetencaoPrincipalExcepcional;
	}

	/**
	 * @return O atributo valorTotalRetencaoAdicionalExcepcional
	 */
	public BigDecimal getValorTotalRetencaoAdicionalExcepcional() {
		return valorTotalRetencaoAdicionalExcepcional;
	}

	/**
	 * @param valorTotalRetencaoAdicionalExcepcional
	 *            define o atributo valorTotalRetencaoAdicionalExcepcional
	 */
	public void setValorTotalRetencaoAdicionalExcepcional(final BigDecimal valorTotalRetencaoAdicionalExcepcional) {
		this.valorTotalRetencaoAdicionalExcepcional = valorTotalRetencaoAdicionalExcepcional;
	}

	/**
	 * @return O atributo indicativoCPRB
	 */
	public Short getIndicativoCPRB() {
		return indicativoCPRB;
	}

	/**
	 * @param indicativoCPRB
	 *            define o atributo indicativoCPRB
	 */
	public void setIndicativoCPRB(final Short indicativoCPRB) {
		this.indicativoCPRB = indicativoCPRB;
	}

	/**
	 * @return O atributo listaNotaFiscalServicoTO
	 */
	public List<EventoTomadorServicoNotaFiscalServicoTO> getListaNotaFiscalServicoTO() {
		return listaNotaFiscalServicoTO;
	}

	/**
	 * @param listaNotaFiscalServicoTO
	 *            define o atributo listaNotaFiscalServicoTO
	 */
	public void setListaNotaFiscalServicoTO(
			final List<EventoTomadorServicoNotaFiscalServicoTO> listaNotaFiscalServicoTO) {
		this.listaNotaFiscalServicoTO = listaNotaFiscalServicoTO;
	}

	/**
	 * @return O atributo listaInformacaoProcessoNaoRetencaoPrevidenciariaTO
	 */
	public List<EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO> getListaInformacaoProcessoNaoRetencaoPrevidenciariaTO() {
		return listaInformacaoProcessoNaoRetencaoPrevidenciariaTO;
	}

	/**
	 * @param listaInformacaoProcessoNaoRetencaoPrevidenciariaTO
	 *            define o atributo
	 *            listaInformacaoProcessoNaoRetencaoPrevidenciariaTO
	 */
	public void setListaInformacaoProcessoNaoRetencaoPrevidenciariaTO(
			final List<EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaTO> listaInformacaoProcessoNaoRetencaoPrevidenciariaTO) {
		this.listaInformacaoProcessoNaoRetencaoPrevidenciariaTO = listaInformacaoProcessoNaoRetencaoPrevidenciariaTO;
	}

	/**
	 * @return O atributo
	 *         listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO
	 */
	public List<EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO> getListaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO() {
		return listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO;
	}

	/**
	 * @param listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO
	 *            define o atributo
	 *            listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO
	 */
	public void setListaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO(
			final List<EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO> listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO) {
		this.listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO = listaInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return EventoTomadorServicoIdentificacaoPrestadorServicoTO.serialVersionUID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((cnpjPrestador == null) ? 0 : cnpjPrestador.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final EventoTomadorServicoIdentificacaoPrestadorServicoTO other = (EventoTomadorServicoIdentificacaoPrestadorServicoTO) obj;
		if (cnpjPrestador == null) {
			if (other.cnpjPrestador != null) {
				return false;
			}
		} else if (!cnpjPrestador.equals(other.cnpjPrestador)) {
			return false;
		}
		return true;
	}

}

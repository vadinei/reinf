package com.vadinei.reinf.batch.operacao.to;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class EventoTomadorServivoIdentificacaoPrestadorServicoTO implements Serializable {

	private static final long serialVersionUID = 7093794534451395094L;

	private String cnpjPrestador; // cnpjPrestador

	private BigDecimal valorTotalBrutoNotaFiscal; // vlrTotalBruto

	private BigDecimal vlrTotalBaseRetencaoContribuicao; // vlrTotalBaseRet

	private BigDecimal valorTotalRetencaoPrincipalNotaFiscalServico; // vlrTotalRetPrinc

	private BigDecimal valorTotalRetencaoAdicionalNotaFiscalServico; // vlrTotalRetAdic

	private BigDecimal valorTotalRetencaoPrincipalExcepcional; // vlrTotalNRetPrinc

	private BigDecimal valorTotalRetencaoAdicionalExcepcional; // vlrTotalNRetAdic

	private Short indicativoCPRB; // indCPRB

	// nfs
	private List<EventoTomadorServicoNotaFiscalServico> listaNotaFiscalServico;

	// infoProcRetPr
	private List<EventoTomadorServicoInformacaoNaoRetencaoPrevidenciariaTO> listaInformacaoNaoRetencaoPrevidenciariaTO;

	// infoProcRetAd
	private List<EventoTomadorServicoInformacaoNaoRetencaoPrevidenciariaAdicionalTO> listaInformacaoNaoRetencaoPrevidenciariaAdicionalTO;

	/**
	 * @param cnpjPrestador
	 * @param valorTotalBrutoNotaFiscal
	 * @param vlrTotalBaseRetencaoContribuicao
	 * @param valorTotalRetencaoPrincipalNotaFiscalServico
	 * @param valorTotalRetencaoAdicionalNotaFiscalServico
	 * @param valorTotalRetencaoPrincipalExcepcional
	 * @param valorTotalRetencaoAdicionalExcepcional
	 * @param indicativoCPRB
	 * @param listaNotaFiscalServico
	 */
	public EventoTomadorServivoIdentificacaoPrestadorServicoTO(final String cnpjPrestador,
			final BigDecimal valorTotalBrutoNotaFiscal, final BigDecimal vlrTotalBaseRetencaoContribuicao,
			final BigDecimal valorTotalRetencaoPrincipalNotaFiscalServico,
			final BigDecimal valorTotalRetencaoAdicionalNotaFiscalServico,
			final BigDecimal valorTotalRetencaoPrincipalExcepcional,
			final BigDecimal valorTotalRetencaoAdicionalExcepcional, final Short indicativoCPRB,
			final List<EventoTomadorServicoNotaFiscalServico> listaNotaFiscalServico) {
		super();
		this.cnpjPrestador = cnpjPrestador;
		this.valorTotalBrutoNotaFiscal = valorTotalBrutoNotaFiscal;
		this.vlrTotalBaseRetencaoContribuicao = vlrTotalBaseRetencaoContribuicao;
		this.valorTotalRetencaoPrincipalNotaFiscalServico = valorTotalRetencaoPrincipalNotaFiscalServico;
		this.valorTotalRetencaoAdicionalNotaFiscalServico = valorTotalRetencaoAdicionalNotaFiscalServico;
		this.valorTotalRetencaoPrincipalExcepcional = valorTotalRetencaoPrincipalExcepcional;
		this.valorTotalRetencaoAdicionalExcepcional = valorTotalRetencaoAdicionalExcepcional;
		this.indicativoCPRB = indicativoCPRB;
		this.listaNotaFiscalServico = listaNotaFiscalServico;
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
	 * @return O atributo vlrTotalBaseRetencaoContribuicao
	 */
	public BigDecimal getVlrTotalBaseRetencaoContribuicao() {
		return vlrTotalBaseRetencaoContribuicao;
	}

	/**
	 * @param vlrTotalBaseRetencaoContribuicao
	 *            define o atributo vlrTotalBaseRetencaoContribuicao
	 */
	public void setVlrTotalBaseRetencaoContribuicao(final BigDecimal vlrTotalBaseRetencaoContribuicao) {
		this.vlrTotalBaseRetencaoContribuicao = vlrTotalBaseRetencaoContribuicao;
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
	 * @return O atributo listaNotaFiscalServico
	 */
	public List<EventoTomadorServicoNotaFiscalServico> getListaNotaFiscalServico() {
		return listaNotaFiscalServico;
	}

	/**
	 * @param listaNotaFiscalServico
	 *            define o atributo listaNotaFiscalServico
	 */
	public void setListaNotaFiscalServico(final List<EventoTomadorServicoNotaFiscalServico> listaNotaFiscalServico) {
		this.listaNotaFiscalServico = listaNotaFiscalServico;
	}

	/**
	 * @return O atributo listaInformacaoNaoRetencaoPrevidenciariaTO
	 */
	public List<EventoTomadorServicoInformacaoNaoRetencaoPrevidenciariaTO> getListaInformacaoNaoRetencaoPrevidenciariaTO() {
		return listaInformacaoNaoRetencaoPrevidenciariaTO;
	}

	/**
	 * @param listaInformacaoNaoRetencaoPrevidenciariaTO
	 *            define o atributo listaInformacaoNaoRetencaoPrevidenciariaTO
	 */
	public void setListaInformacaoNaoRetencaoPrevidenciariaTO(
			final List<EventoTomadorServicoInformacaoNaoRetencaoPrevidenciariaTO> listaInformacaoNaoRetencaoPrevidenciariaTO) {
		this.listaInformacaoNaoRetencaoPrevidenciariaTO = listaInformacaoNaoRetencaoPrevidenciariaTO;
	}

	/**
	 * @return O atributo listaInformacaoNaoRetencaoPrevidenciariaAdicionalTO
	 */
	public List<EventoTomadorServicoInformacaoNaoRetencaoPrevidenciariaAdicionalTO> getListaInformacaoNaoRetencaoPrevidenciariaAdicionalTO() {
		return listaInformacaoNaoRetencaoPrevidenciariaAdicionalTO;
	}

	/**
	 * @param listaInformacaoNaoRetencaoPrevidenciariaAdicionalTO
	 *            define o atributo
	 *            listaInformacaoNaoRetencaoPrevidenciariaAdicionalTO
	 */
	public void setListaInformacaoNaoRetencaoPrevidenciariaAdicionalTO(
			final List<EventoTomadorServicoInformacaoNaoRetencaoPrevidenciariaAdicionalTO> listaInformacaoNaoRetencaoPrevidenciariaAdicionalTO) {
		this.listaInformacaoNaoRetencaoPrevidenciariaAdicionalTO = listaInformacaoNaoRetencaoPrevidenciariaAdicionalTO;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return EventoTomadorServivoIdentificacaoPrestadorServicoTO.serialVersionUID;
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
		final EventoTomadorServivoIdentificacaoPrestadorServicoTO other = (EventoTomadorServivoIdentificacaoPrestadorServicoTO) obj;
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

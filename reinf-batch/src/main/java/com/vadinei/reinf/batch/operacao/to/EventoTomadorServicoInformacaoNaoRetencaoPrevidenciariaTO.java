package com.vadinei.reinf.batch.operacao.to;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class EventoTomadorServicoInformacaoNaoRetencaoPrevidenciariaTO implements Serializable {

	private static final long serialVersionUID = 7879427617424542298L;

	private Short tipoProcessoRetencaoPrincipal; // tpProcRetPrinc

	private String numeroProcessoRetencaoPrincipal; // nrProcRetPrinc

	private Long codigoIndicativoSuspensaoPrincipal; // codSuspPrinc

	private BigDecimal valorRetencaoPrincipal; // valorPrinc

	/**
	 * @param tipoProcessoRetencaoPrincipal
	 * @param numeroProcessoRetencaoPrincipal
	 * @param codigoIndicativoSuspensaoPrincipal
	 * @param valorRetencaoPrincipal
	 */
	public EventoTomadorServicoInformacaoNaoRetencaoPrevidenciariaTO(final Short tipoProcessoRetencaoPrincipal,
			final String numeroProcessoRetencaoPrincipal, final Long codigoIndicativoSuspensaoPrincipal,
			final BigDecimal valorRetencaoPrincipal) {
		super();
		this.tipoProcessoRetencaoPrincipal = tipoProcessoRetencaoPrincipal;
		this.numeroProcessoRetencaoPrincipal = numeroProcessoRetencaoPrincipal;
		this.codigoIndicativoSuspensaoPrincipal = codigoIndicativoSuspensaoPrincipal;
		this.valorRetencaoPrincipal = valorRetencaoPrincipal;
	}

	/**
	 * @return O atributo tipoProcessoRetencaoPrincipal
	 */
	public Short getTipoProcessoRetencaoPrincipal() {
		return tipoProcessoRetencaoPrincipal;
	}

	/**
	 * @param tipoProcessoRetencaoPrincipal
	 *            define o atributo tipoProcessoRetencaoPrincipal
	 */
	public void setTipoProcessoRetencaoPrincipal(final Short tipoProcessoRetencaoPrincipal) {
		this.tipoProcessoRetencaoPrincipal = tipoProcessoRetencaoPrincipal;
	}

	/**
	 * @return O atributo numeroProcessoRetencaoPrincipal
	 */
	public String getNumeroProcessoRetencaoPrincipal() {
		return numeroProcessoRetencaoPrincipal;
	}

	/**
	 * @param numeroProcessoRetencaoPrincipal
	 *            define o atributo numeroProcessoRetencaoPrincipal
	 */
	public void setNumeroProcessoRetencaoPrincipal(final String numeroProcessoRetencaoPrincipal) {
		this.numeroProcessoRetencaoPrincipal = numeroProcessoRetencaoPrincipal;
	}

	/**
	 * @return O atributo codigoIndicativoSuspensaoPrincipal
	 */
	public Long getCodigoIndicativoSuspensaoPrincipal() {
		return codigoIndicativoSuspensaoPrincipal;
	}

	/**
	 * @param codigoIndicativoSuspensaoPrincipal
	 *            define o atributo codigoIndicativoSuspensaoPrincipal
	 */
	public void setCodigoIndicativoSuspensaoPrincipal(final Long codigoIndicativoSuspensaoPrincipal) {
		this.codigoIndicativoSuspensaoPrincipal = codigoIndicativoSuspensaoPrincipal;
	}

	/**
	 * @return O atributo valorRetencaoPrincipal
	 */
	public BigDecimal getValorRetencaoPrincipal() {
		return valorRetencaoPrincipal;
	}

	/**
	 * @param valorRetencaoPrincipal
	 *            define o atributo valorRetencaoPrincipal
	 */
	public void setValorRetencaoPrincipal(final BigDecimal valorRetencaoPrincipal) {
		this.valorRetencaoPrincipal = valorRetencaoPrincipal;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return EventoTomadorServicoInformacaoNaoRetencaoPrevidenciariaTO.serialVersionUID;
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
		result = (prime * result)
				+ ((tipoProcessoRetencaoPrincipal == null) ? 0 : tipoProcessoRetencaoPrincipal.hashCode());
		result = (prime * result)
				+ ((numeroProcessoRetencaoPrincipal == null) ? 0 : numeroProcessoRetencaoPrincipal.hashCode());
		result = (prime * result)
				+ ((codigoIndicativoSuspensaoPrincipal == null) ? 0 : codigoIndicativoSuspensaoPrincipal.hashCode());
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
		final EventoTomadorServicoInformacaoNaoRetencaoPrevidenciariaTO other = (EventoTomadorServicoInformacaoNaoRetencaoPrevidenciariaTO) obj;
		if (tipoProcessoRetencaoPrincipal == null) {
			if (other.tipoProcessoRetencaoPrincipal != null) {
				return false;
			}
		} else if (!tipoProcessoRetencaoPrincipal.equals(other.tipoProcessoRetencaoPrincipal)) {
			return false;
		}
		if (numeroProcessoRetencaoPrincipal == null) {
			if (other.numeroProcessoRetencaoPrincipal != null) {
				return false;
			}
		} else if (!numeroProcessoRetencaoPrincipal.equals(other.numeroProcessoRetencaoPrincipal)) {
			return false;
		}
		if (codigoIndicativoSuspensaoPrincipal == null) {
			if (other.codigoIndicativoSuspensaoPrincipal != null) {
				return false;
			}
		} else if (!codigoIndicativoSuspensaoPrincipal.equals(other.codigoIndicativoSuspensaoPrincipal)) {
			return false;
		}
		return true;
	}

}

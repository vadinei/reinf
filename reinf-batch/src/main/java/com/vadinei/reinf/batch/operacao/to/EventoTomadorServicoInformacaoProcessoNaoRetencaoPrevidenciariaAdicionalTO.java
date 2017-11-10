package com.vadinei.reinf.batch.operacao.to;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO implements Serializable {

	private static final long serialVersionUID = -4408446997062673374L;

	private Short tipoProcessoRetencaoAdicional; // tpProcRetAdic

	private String numeroProcessoRetencaoAdicional; // nrProcRetAdic

	private Long codigoIndicativoSuspensaoAdicional; // codSuspAdic

	private BigDecimal valorRetencaoAdicional; // valorAdic

	/**
	 * @param tipoProcessoRetencaoAdicional
	 * @param numeroProcessoRetencaoAdicional
	 * @param codigoIndicativoSuspensaoAdicional
	 * @param valorRetencaoAdicional
	 */
	public EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO(final Short tipoProcessoRetencaoAdicional,
			final String numeroProcessoRetencaoAdicional, final Long codigoIndicativoSuspensaoAdicional,
			final BigDecimal valorRetencaoAdicional) {
		super();
		this.tipoProcessoRetencaoAdicional = tipoProcessoRetencaoAdicional;
		this.numeroProcessoRetencaoAdicional = numeroProcessoRetencaoAdicional;
		this.codigoIndicativoSuspensaoAdicional = codigoIndicativoSuspensaoAdicional;
		this.valorRetencaoAdicional = valorRetencaoAdicional;
	}

	/**
	 * @return O atributo tipoProcessoRetencaoAdicional
	 */
	public Short getTipoProcessoRetencaoAdicional() {
		return tipoProcessoRetencaoAdicional;
	}

	/**
	 * @param tipoProcessoRetencaoAdicional
	 *            define o atributo tipoProcessoRetencaoAdicional
	 */
	public void setTipoProcessoRetencaoAdicional(final Short tipoProcessoRetencaoAdicional) {
		this.tipoProcessoRetencaoAdicional = tipoProcessoRetencaoAdicional;
	}

	/**
	 * @return O atributo numeroProcessoRetencaoAdicional
	 */
	public String getNumeroProcessoRetencaoAdicional() {
		return numeroProcessoRetencaoAdicional;
	}

	/**
	 * @param numeroProcessoRetencaoAdicional
	 *            define o atributo numeroProcessoRetencaoAdicional
	 */
	public void setNumeroProcessoRetencaoAdicional(final String numeroProcessoRetencaoAdicional) {
		this.numeroProcessoRetencaoAdicional = numeroProcessoRetencaoAdicional;
	}

	/**
	 * @return O atributo codigoIndicativoSuspensaoAdicional
	 */
	public Long getCodigoIndicativoSuspensaoAdicional() {
		return codigoIndicativoSuspensaoAdicional;
	}

	/**
	 * @param codigoIndicativoSuspensaoAdicional
	 *            define o atributo codigoIndicativoSuspensaoAdicional
	 */
	public void setCodigoIndicativoSuspensaoAdicional(final Long codigoIndicativoSuspensaoAdicional) {
		this.codigoIndicativoSuspensaoAdicional = codigoIndicativoSuspensaoAdicional;
	}

	/**
	 * @return O atributo valorRetencaoAdicional
	 */
	public BigDecimal getValorRetencaoAdicional() {
		return valorRetencaoAdicional;
	}

	/**
	 * @param valorRetencaoAdicional
	 *            define o atributo valorRetencaoAdicional
	 */
	public void setValorRetencaoAdicional(final BigDecimal valorRetencaoAdicional) {
		this.valorRetencaoAdicional = valorRetencaoAdicional;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO.serialVersionUID;
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
				+ ((tipoProcessoRetencaoAdicional == null) ? 0 : tipoProcessoRetencaoAdicional.hashCode());
		result = (prime * result)
				+ ((numeroProcessoRetencaoAdicional == null) ? 0 : numeroProcessoRetencaoAdicional.hashCode());
		result = (prime * result)
				+ ((codigoIndicativoSuspensaoAdicional == null) ? 0 : codigoIndicativoSuspensaoAdicional.hashCode());
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
		final EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO other = (EventoTomadorServicoInformacaoProcessoNaoRetencaoPrevidenciariaAdicionalTO) obj;
		if (tipoProcessoRetencaoAdicional == null) {
			if (other.tipoProcessoRetencaoAdicional != null) {
				return false;
			}
		} else if (!tipoProcessoRetencaoAdicional.equals(other.tipoProcessoRetencaoAdicional)) {
			return false;
		}
		if (numeroProcessoRetencaoAdicional == null) {
			if (other.numeroProcessoRetencaoAdicional != null) {
				return false;
			}
		} else if (!numeroProcessoRetencaoAdicional.equals(other.numeroProcessoRetencaoAdicional)) {
			return false;
		}
		if (codigoIndicativoSuspensaoAdicional == null) {
			if (other.codigoIndicativoSuspensaoAdicional != null) {
				return false;
			}
		} else if (!codigoIndicativoSuspensaoAdicional.equals(other.codigoIndicativoSuspensaoAdicional)) {
			return false;
		}
		return true;
	}

}

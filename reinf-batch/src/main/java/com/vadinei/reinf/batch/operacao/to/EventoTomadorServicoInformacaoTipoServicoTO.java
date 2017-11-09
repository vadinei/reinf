package com.vadinei.reinf.batch.operacao.to;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class EventoTomadorServicoInformacaoTipoServicoTO implements Serializable {

	private static final long serialVersionUID = 1416887134069513634L;

	private String tipoServico; // tpServico

	private BigDecimal valorBaseRetencao; // vlrBaseRet

	private BigDecimal valorRetencao; // vlrRetencao

	private BigDecimal valorRetencaoServicoSubcontratado; // vlrRetSub

	private BigDecimal valorRetencaoPrincipalExcepcional; // vlrNRetPrinc

	private BigDecimal valorServicoSeguradoEspecial15Anos; // vlrServicos15

	private BigDecimal valorServicoSeguradoEspecial20Anos; // vlrServicos20

	private BigDecimal valorServicoSeguradoEspecial25Anos; // vlrServicos25

	private BigDecimal valorAdicional; // vlrAdicional

	private BigDecimal valorRetencaoAdicionalExcepcional; // vlrNRetAdic

	/**
	 * @param tipoServico
	 * @param valorBaseRetencao
	 * @param valorRetencao
	 * @param valorRetencaoServicoSubcontratado
	 * @param valorRetencaoPrincipalExcepcional
	 * @param valorServicoSeguradoEspecial15Anos
	 * @param valorServicoSeguradoEspecial20Anos
	 * @param valorServicoSeguradoEspecial25Anos
	 * @param valorAdicional
	 * @param valorRetencaoAdicionalExcepcional
	 */
	public EventoTomadorServicoInformacaoTipoServicoTO(final String tipoServico,
			final BigDecimal valorBaseRetencao, final BigDecimal valorRetencao,
			final BigDecimal valorRetencaoServicoSubcontratado, final BigDecimal valorRetencaoPrincipalExcepcional,
			final BigDecimal valorServicoSeguradoEspecial15Anos, final BigDecimal valorServicoSeguradoEspecial20Anos,
			final BigDecimal valorServicoSeguradoEspecial25Anos, final BigDecimal valorAdicional,
			final BigDecimal valorRetencaoAdicionalExcepcional) {
		super();
		this.tipoServico = tipoServico;
		this.valorBaseRetencao = valorBaseRetencao;
		this.valorRetencao = valorRetencao;
		this.valorRetencaoServicoSubcontratado = valorRetencaoServicoSubcontratado;
		this.valorRetencaoPrincipalExcepcional = valorRetencaoPrincipalExcepcional;
		this.valorServicoSeguradoEspecial15Anos = valorServicoSeguradoEspecial15Anos;
		this.valorServicoSeguradoEspecial20Anos = valorServicoSeguradoEspecial20Anos;
		this.valorServicoSeguradoEspecial25Anos = valorServicoSeguradoEspecial25Anos;
		this.valorAdicional = valorAdicional;
		this.valorRetencaoAdicionalExcepcional = valorRetencaoAdicionalExcepcional;
	}

	/**
	 * @return O atributo tipoServico
	 */
	public String getTipoServico() {
		return tipoServico;
	}

	/**
	 * @param tipoServico
	 *            define o atributo tipoServico
	 */
	public void setTipoServico(final String tipoServico) {
		this.tipoServico = tipoServico;
	}

	/**
	 * @return O atributo valorBaseRetencao
	 */
	public BigDecimal getValorBaseRetencao() {
		return valorBaseRetencao;
	}

	/**
	 * @param valorBaseRetencao
	 *            define o atributo valorBaseRetencao
	 */
	public void setValorBaseRetencao(final BigDecimal valorBaseRetencao) {
		this.valorBaseRetencao = valorBaseRetencao;
	}

	/**
	 * @return O atributo valorRetencao
	 */
	public BigDecimal getValorRetencao() {
		return valorRetencao;
	}

	/**
	 * @param valorRetencao
	 *            define o atributo valorRetencao
	 */
	public void setValorRetencao(final BigDecimal valorRetencao) {
		this.valorRetencao = valorRetencao;
	}

	/**
	 * @return O atributo valorRetencaoServicoSubcontratado
	 */
	public BigDecimal getValorRetencaoServicoSubcontratado() {
		return valorRetencaoServicoSubcontratado;
	}

	/**
	 * @param valorRetencaoServicoSubcontratado
	 *            define o atributo valorRetencaoServicoSubcontratado
	 */
	public void setValorRetencaoServicoSubcontratado(final BigDecimal valorRetencaoServicoSubcontratado) {
		this.valorRetencaoServicoSubcontratado = valorRetencaoServicoSubcontratado;
	}

	/**
	 * @return O atributo valorRetencaoPrincipalExcepcional
	 */
	public BigDecimal getValorRetencaoPrincipalExcepcional() {
		return valorRetencaoPrincipalExcepcional;
	}

	/**
	 * @param valorRetencaoPrincipalExcepcional
	 *            define o atributo valorRetencaoPrincipalExcepcional
	 */
	public void setValorRetencaoPrincipalExcepcional(final BigDecimal valorRetencaoPrincipalExcepcional) {
		this.valorRetencaoPrincipalExcepcional = valorRetencaoPrincipalExcepcional;
	}

	/**
	 * @return O atributo valorServicoSeguradoEspecial15Anos
	 */
	public BigDecimal getValorServicoSeguradoEspecial15Anos() {
		return valorServicoSeguradoEspecial15Anos;
	}

	/**
	 * @param valorServicoSeguradoEspecial15Anos
	 *            define o atributo valorServicoSeguradoEspecial15Anos
	 */
	public void setValorServicoSeguradoEspecial15Anos(final BigDecimal valorServicoSeguradoEspecial15Anos) {
		this.valorServicoSeguradoEspecial15Anos = valorServicoSeguradoEspecial15Anos;
	}

	/**
	 * @return O atributo valorServicoSeguradoEspecial20Anos
	 */
	public BigDecimal getValorServicoSeguradoEspecial20Anos() {
		return valorServicoSeguradoEspecial20Anos;
	}

	/**
	 * @param valorServicoSeguradoEspecial20Anos
	 *            define o atributo valorServicoSeguradoEspecial20Anos
	 */
	public void setValorServicoSeguradoEspecial20Anos(final BigDecimal valorServicoSeguradoEspecial20Anos) {
		this.valorServicoSeguradoEspecial20Anos = valorServicoSeguradoEspecial20Anos;
	}

	/**
	 * @return O atributo valorServicoSeguradoEspecial25Anos
	 */
	public BigDecimal getValorServicoSeguradoEspecial25Anos() {
		return valorServicoSeguradoEspecial25Anos;
	}

	/**
	 * @param valorServicoSeguradoEspecial25Anos
	 *            define o atributo valorServicoSeguradoEspecial25Anos
	 */
	public void setValorServicoSeguradoEspecial25Anos(final BigDecimal valorServicoSeguradoEspecial25Anos) {
		this.valorServicoSeguradoEspecial25Anos = valorServicoSeguradoEspecial25Anos;
	}

	/**
	 * @return O atributo valorAdicional
	 */
	public BigDecimal getValorAdicional() {
		return valorAdicional;
	}

	/**
	 * @param valorAdicional
	 *            define o atributo valorAdicional
	 */
	public void setValorAdicional(final BigDecimal valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	/**
	 * @return O atributo valorRetencaoAdicionalExcepcional
	 */
	public BigDecimal getValorRetencaoAdicionalExcepcional() {
		return valorRetencaoAdicionalExcepcional;
	}

	/**
	 * @param valorRetencaoAdicionalExcepcional
	 *            define o atributo valorRetencaoAdicionalExcepcional
	 */
	public void setValorRetencaoAdicionalExcepcional(final BigDecimal valorRetencaoAdicionalExcepcional) {
		this.valorRetencaoAdicionalExcepcional = valorRetencaoAdicionalExcepcional;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return EventoTomadorServicoInformacaoTipoServicoTO.serialVersionUID;
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
		result = (prime * result) + ((tipoServico == null) ? 0 : tipoServico.hashCode());
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
		final EventoTomadorServicoInformacaoTipoServicoTO other = (EventoTomadorServicoInformacaoTipoServicoTO) obj;
		if (tipoServico == null) {
			if (other.tipoServico != null) {
				return false;
			}
		} else if (!tipoServico.equals(other.tipoServico)) {
			return false;
		}
		return true;
	}

}

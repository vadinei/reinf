package com.vadinei.reinf.batch.operacao.to;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class EventoTomadorServicoNotaFiscalServicoTO implements Serializable {

	private static final long serialVersionUID = -6693007616982139010L;

	private String serie; // serie

	private String numeroDocumento; // numDocto

	private Date dataEmissaoNotaFiscal; // dtEmissaoNF

	private BigDecimal valorBruto; // vlrBruto

	private String observacao; // obs

	// infoTpServ
	private List<EventoTomadorServicoInformacaoTipoServicoTO> listaInformacaoTipoServicoTO;

	/**
	 * @param serie
	 * @param numeroDocumento
	 * @param dataEmissaoNotaFiscal
	 * @param valorBruto
	 * @param observacao
	 */
	public EventoTomadorServicoNotaFiscalServicoTO(final String serie, final String numeroDocumento,
			final Date dataEmissaoNotaFiscal, final BigDecimal valorBruto, final String observacao) {
		super();
		this.serie = serie;
		this.numeroDocumento = numeroDocumento;
		this.dataEmissaoNotaFiscal = dataEmissaoNotaFiscal;
		this.valorBruto = valorBruto;
		this.observacao = observacao;
	}

	/**
	 * @return O atributo serie
	 */
	public String getSerie() {
		return serie;
	}

	/**
	 * @param serie
	 *            define o atributo serie
	 */
	public void setSerie(final String serie) {
		this.serie = serie;
	}

	/**
	 * @return O atributo numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * @param numeroDocumento
	 *            define o atributo numeroDocumento
	 */
	public void setNumeroDocumento(final String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * @return O atributo dataEmissaoNotaFiscal
	 */
	public Date getDataEmissaoNotaFiscal() {
		return dataEmissaoNotaFiscal;
	}

	/**
	 * @param dataEmissaoNotaFiscal
	 *            define o atributo dataEmissaoNotaFiscal
	 */
	public void setDataEmissaoNotaFiscal(final Date dataEmissaoNotaFiscal) {
		this.dataEmissaoNotaFiscal = dataEmissaoNotaFiscal;
	}

	/**
	 * @return O atributo valorBruto
	 */
	public BigDecimal getValorBruto() {
		return valorBruto;
	}

	/**
	 * @param valorBruto
	 *            define o atributo valorBruto
	 */
	public void setValorBruto(final BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}

	/**
	 * @return O atributo observacao
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * @param observacao
	 *            define o atributo observacao
	 */
	public void setObservacao(final String observacao) {
		this.observacao = observacao;
	}

	/**
	 * @return O atributo listaInformacaoTipoServicoTO
	 */
	public List<EventoTomadorServicoInformacaoTipoServicoTO> getListaInformacaoTipoServicoTO() {
		return listaInformacaoTipoServicoTO;
	}

	/**
	 * @param listaInformacaoTipoServicoTO
	 *            define o atributo listaInformacaoTipoServicoTO
	 */
	public void setListaInformacaoTipoServicoTO(
			final List<EventoTomadorServicoInformacaoTipoServicoTO> listaInformacaoTipoServicoTO) {
		this.listaInformacaoTipoServicoTO = listaInformacaoTipoServicoTO;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return EventoTomadorServicoNotaFiscalServicoTO.serialVersionUID;
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
		result = (prime * result) + ((serie == null) ? 0 : serie.hashCode());
		result = (prime * result) + ((numeroDocumento == null) ? 0 : numeroDocumento.hashCode());
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
		final EventoTomadorServicoNotaFiscalServicoTO other = (EventoTomadorServicoNotaFiscalServicoTO) obj;
		if (serie == null) {
			if (other.serie != null) {
				return false;
			}
		} else if (!serie.equals(other.serie)) {
			return false;
		}
		if (numeroDocumento == null) {
			if (other.numeroDocumento != null) {
				return false;
			}
		} else if (!numeroDocumento.equals(other.numeroDocumento)) {
			return false;
		}
		return true;
	}

}

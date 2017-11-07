package com.vadinei.reinf.batch.operacao.to;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author José Vádinei Soares - vadinei@hotmail.com
 *
 */
public class EventoTO implements Serializable {

	private static final long serialVersionUID = 5224403746330614078L;

	private Long codigo;

	private Long codigoLote;

	private Date dataReferencia;

	private String tipoEvento;

	private String xmlOriginal;

	private String xmlEnvio;

	private String xmlRetorno;

	private String situacaoInformacao;

	private String versaoLeiaute;

	private Long codigoRetificadora;

	private String numeroRecibo;

	private String numeroReciboAnterior;

	private Long tipoAmbiente;

	private String versaoAplicacao;

	private Long emissaoAplicacao;

	private String matriculaUsuarioAssinatura;

	private String matriculaUsuarioEnvio;

	private List<MensagemSistemaTO> mensagens;

	public EventoTO() {
		super();
	}

	/**
	 * @return O atributo codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            define o atributo codigo
	 */
	public void setCodigo(final Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return O atributo codigoLote
	 */
	public Long getCodigoLote() {
		return codigoLote;
	}

	/**
	 * @param codigoLote
	 *            define o atributo codigoLote
	 */
	public void setCodigoLote(final Long codigoLote) {
		this.codigoLote = codigoLote;
	}

	/**
	 * @return O atributo dataReferencia
	 */
	public Date getDataReferencia() {
		return dataReferencia;
	}

	/**
	 * @param dataReferencia
	 *            define o atributo dataReferencia
	 */
	public void setDataReferencia(final Date dataReferencia) {
		this.dataReferencia = dataReferencia;
	}

	/**
	 * @return O atributo tipoEvento
	 */
	public String getTipoEvento() {
		return tipoEvento;
	}

	/**
	 * @param tipoEvento
	 *            define o atributo tipoEvento
	 */
	public void setTipoEvento(final String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	/**
	 * @return O atributo xmlOriginal
	 */
	public String getXmlOriginal() {
		return xmlOriginal;
	}

	/**
	 * @param xmlOriginal
	 *            define o atributo xmlOriginal
	 */
	public void setXmlOriginal(final String xmlOriginal) {
		this.xmlOriginal = xmlOriginal;
	}

	/**
	 * @return O atributo xmlEnvio
	 */
	public String getXmlEnvio() {
		return xmlEnvio;
	}

	/**
	 * @param xmlEnvio
	 *            define o atributo xmlEnvio
	 */
	public void setXmlEnvio(final String xmlEnvio) {
		this.xmlEnvio = xmlEnvio;
	}

	/**
	 * @return O atributo xmlRetorno
	 */
	public String getXmlRetorno() {
		return xmlRetorno;
	}

	/**
	 * @param xmlRetorno
	 *            define o atributo xmlRetorno
	 */
	public void setXmlRetorno(final String xmlRetorno) {
		this.xmlRetorno = xmlRetorno;
	}

	/**
	 * @return O atributo situacaoInformacao
	 */
	public String getSituacaoInformacao() {
		return situacaoInformacao;
	}

	/**
	 * @param situacaoInformacao
	 *            define o atributo situacaoInformacao
	 */
	public void setSituacaoInformacao(final String situacaoInformacao) {
		this.situacaoInformacao = situacaoInformacao;
	}

	/**
	 * @return O atributo versaoLeiaute
	 */
	public String getVersaoLeiaute() {
		return versaoLeiaute;
	}

	/**
	 * @param versaoLeiaute
	 *            define o atributo versaoLeiaute
	 */
	public void setVersaoLeiaute(final String versaoLeiaute) {
		this.versaoLeiaute = versaoLeiaute;
	}

	/**
	 * @return O atributo codigoRetificadora
	 */
	public Long getCodigoRetificadora() {
		return codigoRetificadora;
	}

	/**
	 * @param codigoRetificadora
	 *            define o atributo codigoRetificadora
	 */
	public void setCodigoRetificadora(final Long codigoRetificadora) {
		this.codigoRetificadora = codigoRetificadora;
	}

	/**
	 * @return O atributo numeroRecibo
	 */
	public String getNumeroRecibo() {
		return numeroRecibo;
	}

	/**
	 * @param numeroRecibo
	 *            define o atributo numeroRecibo
	 */
	public void setNumeroRecibo(final String numeroRecibo) {
		this.numeroRecibo = numeroRecibo;
	}

	/**
	 * @return O atributo numeroReciboAnterior
	 */
	public String getNumeroReciboAnterior() {
		return numeroReciboAnterior;
	}

	/**
	 * @param numeroReciboAnterior
	 *            define o atributo numeroReciboAnterior
	 */
	public void setNumeroReciboAnterior(final String numeroReciboAnterior) {
		this.numeroReciboAnterior = numeroReciboAnterior;
	}

	/**
	 * @return O atributo tipoAmbiente
	 */
	public Long getTipoAmbiente() {
		return tipoAmbiente;
	}

	/**
	 * @param tipoAmbiente
	 *            define o atributo tipoAmbiente
	 */
	public void setTipoAmbiente(final Long tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}

	/**
	 * @return O atributo versaoAplicacao
	 */
	public String getVersaoAplicacao() {
		return versaoAplicacao;
	}

	/**
	 * @param versaoAplicacao
	 *            define o atributo versaoAplicacao
	 */
	public void setVersaoAplicacao(final String versaoAplicacao) {
		this.versaoAplicacao = versaoAplicacao;
	}

	/**
	 * @return O atributo emissaoAplicacao
	 */
	public Long getEmissaoAplicacao() {
		return emissaoAplicacao;
	}

	/**
	 * @param emissaoAplicacao
	 *            define o atributo emissaoAplicacao
	 */
	public void setEmissaoAplicacao(final Long emissaoAplicacao) {
		this.emissaoAplicacao = emissaoAplicacao;
	}

	/**
	 * @return O atributo matriculaUsuarioAssinatura
	 */
	public String getMatriculaUsuarioAssinatura() {
		return matriculaUsuarioAssinatura;
	}

	/**
	 * @param matriculaUsuarioAssinatura
	 *            define o atributo matriculaUsuarioAssinatura
	 */
	public void setMatriculaUsuarioAssinatura(final String matriculaUsuarioAssinatura) {
		this.matriculaUsuarioAssinatura = matriculaUsuarioAssinatura;
	}

	/**
	 * @return O atributo matriculaUsuarioEnvio
	 */
	public String getMatriculaUsuarioEnvio() {
		return matriculaUsuarioEnvio;
	}

	/**
	 * @param matriculaUsuarioEnvio
	 *            define o atributo matriculaUsuarioEnvio
	 */
	public void setMatriculaUsuarioEnvio(final String matriculaUsuarioEnvio) {
		this.matriculaUsuarioEnvio = matriculaUsuarioEnvio;
	}

	/**
	 * @return O atributo mensagens
	 */
	public List<MensagemSistemaTO> getMensagens() {
		return mensagens;
	}

	/**
	 * @param mensagens
	 *            define o atributo mensagens
	 */
	public void setMensagens(final List<MensagemSistemaTO> mensagens) {
		this.mensagens = mensagens;
	}

	/**
	 * @return O atributo serialversionuid
	 */
	public static long getSerialversionuid() {
		return EventoTO.serialVersionUID;
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
		result = (prime * result) + ((codigo == null) ? 0 : codigo.hashCode());
		result = (prime * result) + ((codigoLote == null) ? 0 : codigoLote.hashCode());
		result = (prime * result) + ((codigoRetificadora == null) ? 0 : codigoRetificadora.hashCode());
		result = (prime * result) + ((dataReferencia == null) ? 0 : dataReferencia.hashCode());
		result = (prime * result) + ((emissaoAplicacao == null) ? 0 : emissaoAplicacao.hashCode());
		result = (prime * result) + ((matriculaUsuarioAssinatura == null) ? 0 : matriculaUsuarioAssinatura.hashCode());
		result = (prime * result) + ((matriculaUsuarioEnvio == null) ? 0 : matriculaUsuarioEnvio.hashCode());
		result = (prime * result) + ((mensagens == null) ? 0 : mensagens.hashCode());
		result = (prime * result) + ((numeroRecibo == null) ? 0 : numeroRecibo.hashCode());
		result = (prime * result) + ((numeroReciboAnterior == null) ? 0 : numeroReciboAnterior.hashCode());
		result = (prime * result) + ((situacaoInformacao == null) ? 0 : situacaoInformacao.hashCode());
		result = (prime * result) + ((tipoAmbiente == null) ? 0 : tipoAmbiente.hashCode());
		result = (prime * result) + ((tipoEvento == null) ? 0 : tipoEvento.hashCode());
		result = (prime * result) + ((versaoAplicacao == null) ? 0 : versaoAplicacao.hashCode());
		result = (prime * result) + ((versaoLeiaute == null) ? 0 : versaoLeiaute.hashCode());
		result = (prime * result) + ((xmlEnvio == null) ? 0 : xmlEnvio.hashCode());
		result = (prime * result) + ((xmlOriginal == null) ? 0 : xmlOriginal.hashCode());
		result = (prime * result) + ((xmlRetorno == null) ? 0 : xmlRetorno.hashCode());
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
		final EventoTO other = (EventoTO) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (codigoLote == null) {
			if (other.codigoLote != null) {
				return false;
			}
		} else if (!codigoLote.equals(other.codigoLote)) {
			return false;
		}
		if (codigoRetificadora == null) {
			if (other.codigoRetificadora != null) {
				return false;
			}
		} else if (!codigoRetificadora.equals(other.codigoRetificadora)) {
			return false;
		}
		if (dataReferencia == null) {
			if (other.dataReferencia != null) {
				return false;
			}
		} else if (!dataReferencia.equals(other.dataReferencia)) {
			return false;
		}
		if (emissaoAplicacao == null) {
			if (other.emissaoAplicacao != null) {
				return false;
			}
		} else if (!emissaoAplicacao.equals(other.emissaoAplicacao)) {
			return false;
		}
		if (matriculaUsuarioAssinatura == null) {
			if (other.matriculaUsuarioAssinatura != null) {
				return false;
			}
		} else if (!matriculaUsuarioAssinatura.equals(other.matriculaUsuarioAssinatura)) {
			return false;
		}
		if (matriculaUsuarioEnvio == null) {
			if (other.matriculaUsuarioEnvio != null) {
				return false;
			}
		} else if (!matriculaUsuarioEnvio.equals(other.matriculaUsuarioEnvio)) {
			return false;
		}
		if (mensagens == null) {
			if (other.mensagens != null) {
				return false;
			}
		} else if (!mensagens.equals(other.mensagens)) {
			return false;
		}
		if (numeroRecibo == null) {
			if (other.numeroRecibo != null) {
				return false;
			}
		} else if (!numeroRecibo.equals(other.numeroRecibo)) {
			return false;
		}
		if (numeroReciboAnterior == null) {
			if (other.numeroReciboAnterior != null) {
				return false;
			}
		} else if (!numeroReciboAnterior.equals(other.numeroReciboAnterior)) {
			return false;
		}
		if (situacaoInformacao == null) {
			if (other.situacaoInformacao != null) {
				return false;
			}
		} else if (!situacaoInformacao.equals(other.situacaoInformacao)) {
			return false;
		}
		if (tipoAmbiente == null) {
			if (other.tipoAmbiente != null) {
				return false;
			}
		} else if (!tipoAmbiente.equals(other.tipoAmbiente)) {
			return false;
		}
		if (tipoEvento == null) {
			if (other.tipoEvento != null) {
				return false;
			}
		} else if (!tipoEvento.equals(other.tipoEvento)) {
			return false;
		}
		if (versaoAplicacao == null) {
			if (other.versaoAplicacao != null) {
				return false;
			}
		} else if (!versaoAplicacao.equals(other.versaoAplicacao)) {
			return false;
		}
		if (versaoLeiaute == null) {
			if (other.versaoLeiaute != null) {
				return false;
			}
		} else if (!versaoLeiaute.equals(other.versaoLeiaute)) {
			return false;
		}
		if (xmlEnvio == null) {
			if (other.xmlEnvio != null) {
				return false;
			}
		} else if (!xmlEnvio.equals(other.xmlEnvio)) {
			return false;
		}
		if (xmlOriginal == null) {
			if (other.xmlOriginal != null) {
				return false;
			}
		} else if (!xmlOriginal.equals(other.xmlOriginal)) {
			return false;
		}
		if (xmlRetorno == null) {
			if (other.xmlRetorno != null) {
				return false;
			}
		} else if (!xmlRetorno.equals(other.xmlRetorno)) {
			return false;
		}
		return true;
	}

}

package br.gov.ma.tce.qrcode.server.beans.documento_qrcode;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author josemar
 *
 */
@Entity(name=DocumentoQrCode.NAME)
@Table(schema = "test_qrcode", name = "documento_qrcode")
@SequenceGenerator(name = "test_qrcode.documento_qrcode_id_seq", sequenceName = "test_qrcode.documento_qrcode_id_seq", allocationSize = 1)
public class DocumentoQrCode {

	public static final String NAME = "test_qrcode_documento_qrcode";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_qrcode.documento_qrcode_id_seq")
	@Column(name = "documento_qrcode_id")
	private Integer documentoQrcodeId;

	@Column(name = "tabela", columnDefinition = "text")
	private String tabela;

	@Column(name = "campo", columnDefinition = "text")
	private String campo;
	
	@Column(name = "chave", columnDefinition = "text")
	private String chave;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "valor_chave", updatable = false, unique = true, nullable = false)
	private UUID valorChave;

	@Column(name = "data_criacao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao = new Date();

	public Integer getDocumentoQrcodeId() {
		return documentoQrcodeId;
	}

	public void setDocumentoQrcodeId(Integer documentoQrcodeId) {
		this.documentoQrcodeId = documentoQrcodeId;
	}

	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public UUID getValorChave() {
		return valorChave;
	}

	public void setValorChave(UUID valorChave) {
		this.valorChave = valorChave;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((campo == null) ? 0 : campo.hashCode());
		result = prime * result + ((chave == null) ? 0 : chave.hashCode());
		result = prime * result + ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result + ((documentoQrcodeId == null) ? 0 : documentoQrcodeId.hashCode());
		result = prime * result + ((tabela == null) ? 0 : tabela.hashCode());
		result = prime * result + ((valorChave == null) ? 0 : valorChave.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocumentoQrCode other = (DocumentoQrCode) obj;
		if (campo == null) {
			if (other.campo != null)
				return false;
		} else if (!campo.equals(other.campo))
			return false;
		if (chave == null) {
			if (other.chave != null)
				return false;
		} else if (!chave.equals(other.chave))
			return false;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (documentoQrcodeId == null) {
			if (other.documentoQrcodeId != null)
				return false;
		} else if (!documentoQrcodeId.equals(other.documentoQrcodeId))
			return false;
		if (tabela == null) {
			if (other.tabela != null)
				return false;
		} else if (!tabela.equals(other.tabela))
			return false;
		if (valorChave == null) {
			if (other.valorChave != null)
				return false;
		} else if (!valorChave.equals(other.valorChave))
			return false;
		return true;
	}
	
}

package br.com.treinamento.java.model;

import java.math.BigDecimal;

public abstract class DocumentoFiscal {

	private Long idDocumentoFiscal;
	
	private Long numero;
	
	private String serie;
	
	private String chave;
	
	private Cliente cliente;
	
	private Emitente emitente;
	
	private String versaoXML;
	
	private ModeloDocumentoEnum modeloDocumento;
	
	public abstract BigDecimal getValorTotal();
	
	public DocumentoFiscal(Long numero, String serie) {
		this.numero = numero;
		this.serie = serie;
	}

	public String getVersaoXML() {
		return versaoXML;
	}

	public void setVersaoXML(String versaoXML) {
		this.versaoXML = versaoXML;
	}

	public Long getIdDocumentoFiscal() {
		return idDocumentoFiscal;
	}

	public void setIdDocumentoFiscal(Long idDocumentoFiscal) {
		this.idDocumentoFiscal = idDocumentoFiscal;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Emitente getEmitente() {
		return emitente;
	}

	public void setEmitente(Emitente emitente) {
		this.emitente = emitente;
	}

	public ModeloDocumentoEnum getModeloDocumento() {
		return modeloDocumento;
	}

	public void setModeloDocumento(ModeloDocumentoEnum modeloDocumento) {
		this.modeloDocumento = modeloDocumento;
	}
	
}

package br.com.treinamento.java.model;

public class Emitente {

	private Long idEmiente;
	
	private String cnpj;
	
	private String descricao;

	public Emitente(String cnpj, String descricao) {
		this.cnpj = cnpj;
		this.descricao = descricao;
	}
	
	public Long getIdEmiente() {
		return idEmiente;
	}

	public void setIdEmiente(Long idEmiente) {
		this.idEmiente = idEmiente;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}

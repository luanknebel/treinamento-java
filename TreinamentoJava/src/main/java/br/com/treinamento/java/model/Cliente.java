package br.com.treinamento.java.model;

public class Cliente {

	private Long idCliente;
	
	private String cpfCnpj;
	
	private String nome;

	public Cliente(String cpfCnpj, String nome) {
		this.cpfCnpj = cpfCnpj;
		this.nome = nome;
	}
	
	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

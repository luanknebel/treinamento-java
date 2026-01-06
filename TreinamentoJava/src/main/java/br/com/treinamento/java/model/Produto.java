package br.com.treinamento.java.model;

import java.math.BigDecimal;

public class Produto {

	private Long idProduto;
	
	private BigDecimal valor;
	
	private String descricao;

	public Produto(BigDecimal valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}

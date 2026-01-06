package br.com.treinamento.java.model;

import java.math.BigDecimal;

public class ItemNotaFiscal {

	private Long idItemNotaFiscal;
	
	private NotaFiscal notaFiscal;
	
	private Produto produto;
	
	private BigDecimal quantidade;
	
	public ItemNotaFiscal(NotaFiscal notaFiscal, Produto produto, BigDecimal quantidade) {
		this.notaFiscal = notaFiscal;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Long getIdItemNotaFiscal() {
		return idItemNotaFiscal;
	}

	public void setIdItemNotaFiscal(Long idItemNotaFiscal) {
		this.idItemNotaFiscal = idItemNotaFiscal;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorTotal() {
		return quantidade.multiply(produto.getValor());
	}

	
}

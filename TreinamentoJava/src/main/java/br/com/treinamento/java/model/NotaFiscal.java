package br.com.treinamento.java.model;

import java.math.BigDecimal;
import java.util.List;

public class NotaFiscal extends DocumentoFiscal{

	private BigDecimal desconto;
	
	private List<ItemNotaFiscal> itens;
	
	public NotaFiscal(Long numero, String serie) {
		super(numero, serie);
	}
	
	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public List<ItemNotaFiscal> getItens() {
		return itens;
	}

	public void setItens(List<ItemNotaFiscal> itens) {
		this.itens = itens;
	}

	@Override
	public BigDecimal getValorTotal() {
		BigDecimal valorTotalProdutos = BigDecimal.ZERO;
		
		for (ItemNotaFiscal itemNotaFiscal : itens) {
			valorTotalProdutos = valorTotalProdutos.add(itemNotaFiscal.getValorTotal());
		}
		
		return valorTotalProdutos.subtract(desconto);
	}

}

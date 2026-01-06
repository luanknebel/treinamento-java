package br.com.treinamento.java.model;

import java.math.BigDecimal;

public class CTe extends DocumentoFiscal{

	public CTe(Long numero, String serie) {
		super(numero, serie);
	}

	private BigDecimal valorDesconto;
	
	private BigDecimal valorFrete;
	
	private BigDecimal valorDocumentos;
	
	private BigDecimal valorPedagio;

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(BigDecimal valorFrete) {
		this.valorFrete = valorFrete;
	}

	public BigDecimal getValorDocumentos() {
		return valorDocumentos;
	}

	public void setValorDocumentos(BigDecimal valorDocumentos) {
		this.valorDocumentos = valorDocumentos;
	}

	public BigDecimal getValorPedagio() {
		return valorPedagio;
	}

	public void setValorPedagio(BigDecimal valorPedagio) {
		this.valorPedagio = valorPedagio;
	}

	@Override
	public BigDecimal getValorTotal() {
		BigDecimal valorTotal = valorFrete.add(valorDocumentos).add(valorPedagio).subtract(valorDesconto);
		return valorTotal;
	}
	
}

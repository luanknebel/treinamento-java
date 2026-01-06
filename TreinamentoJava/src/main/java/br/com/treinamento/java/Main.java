package br.com.treinamento.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.treinamento.java.model.CTe;
import br.com.treinamento.java.model.Cliente;
import br.com.treinamento.java.model.Emitente;
import br.com.treinamento.java.model.ItemNotaFiscal;
import br.com.treinamento.java.model.NotaFiscal;
import br.com.treinamento.java.model.Produto;
import br.com.treinamento.java.service.FaturamentoDocumentoFiscalService;

public class Main {

	public static void main(String[] args) {
		
		faturamentoCTe();
		faturantoNotaFiscal();
	}

	private static void faturamentoCTe() {
		CTe cTe = new CTe(3333l, "002");
		Emitente emitente = new Emitente("12345678790", "Empresa do Joao");
		Cliente cliente = new Cliente("12345678912", "Maria");
		
		cTe.setValorDesconto(new BigDecimal("10"));
		cTe.setValorDocumentos(new BigDecimal("1000.99"));
		cTe.setValorFrete(new BigDecimal("300"));
		cTe.setValorPedagio(new BigDecimal("15"));
		cTe.setCliente(cliente);
		cTe.setEmitente(emitente);
		new FaturamentoDocumentoFiscalService().faturar(cTe);
	}

	private static void faturantoNotaFiscal() {
		NotaFiscal notaFiscal = new NotaFiscal(123L, "001");
		
		Emitente emitente = new Emitente("12345678790", "Empresa do Joao");
		Cliente cliente = new Cliente("12345678912", "Maria");
		Produto produto1 = new Produto(new BigDecimal("100.59"), "Mouse sem fio");
		Produto produto2 = new Produto(new BigDecimal("150.59"), "Teclado sem fio");
		
		List<ItemNotaFiscal> itens = new ArrayList<>();
		itens.add(new ItemNotaFiscal(notaFiscal, produto1, new BigDecimal(2)));
		itens.add(new ItemNotaFiscal(notaFiscal, produto2, new BigDecimal(2)));
		
		notaFiscal.setDesconto(new BigDecimal(30.45));
		notaFiscal.setCliente(cliente);
		notaFiscal.setEmitente(emitente);
		notaFiscal.setItens(itens);
		
		new FaturamentoDocumentoFiscalService().faturar(notaFiscal);
	}
	
}

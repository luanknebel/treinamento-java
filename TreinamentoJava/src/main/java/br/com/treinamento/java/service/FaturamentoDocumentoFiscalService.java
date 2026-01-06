package br.com.treinamento.java.service;

import java.math.RoundingMode;

import br.com.treinamento.java.model.DocumentoFiscal;
import br.com.treinamento.java.model.ModeloDocumentoEnum;

public class FaturamentoDocumentoFiscalService {

	public void faturar(DocumentoFiscal documentoFiscal) {
		
		System.out.println("faturando nota fiscal com o valor " + documentoFiscal.getValorTotal().setScale(5, RoundingMode.HALF_UP));
		
		ExecutaIntegracaoSefazService executaIntegracaoSefazService = ExecutaIntegracaoSefazServiceFactory.getImplementacao(documentoFiscal);
		executaIntegracaoSefazService.enviarDocumentoSefaz(documentoFiscal);
		 
	}
	
}

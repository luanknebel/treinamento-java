package br.com.treinamento.java.service;

import br.com.treinamento.java.model.DocumentoFiscal;
import br.com.treinamento.java.service.integacao.sefaz.IntegracaoSefazCTev3ServiceImpl;
import br.com.treinamento.java.service.integacao.sefaz.IntegracaoSefazCTev4ServiceImpl;
import br.com.treinamento.java.service.integacao.sefaz.IntegracaoSefazNFeServiceImpl;

public class ExecutaIntegracaoSefazServiceFactory {

	private ExecutaIntegracaoSefazServiceFactory() {
	}
	
	public static ExecutaIntegracaoSefazService getImplementacao(DocumentoFiscal documentoFiscal) {
		
		IntegracaoSefazNFeServiceImpl integracaoSefazNFeServiceImpl = new IntegracaoSefazNFeServiceImpl();
		IntegracaoSefazCTev3ServiceImpl integracaoSefazCTev3ServiceImpl = new IntegracaoSefazCTev3ServiceImpl();
		IntegracaoSefazCTev4ServiceImpl integracaoSefazCTev4ServiceImpl = new IntegracaoSefazCTev4ServiceImpl();
		
		if(isImplementacaoCompativel(integracaoSefazNFeServiceImpl, documentoFiscal)) {
			return integracaoSefazNFeServiceImpl;
		}
		
		if(isImplementacaoCompativel(integracaoSefazCTev3ServiceImpl, documentoFiscal)) {
			return integracaoSefazCTev3ServiceImpl;
		}
		
		if(isImplementacaoCompativel(integracaoSefazCTev4ServiceImpl, documentoFiscal)) {
			return integracaoSefazCTev4ServiceImpl;
		}
		
		throw new RuntimeException("nao existem implementacao para o modelo e xml do documento");
	}
	
	private static boolean isImplementacaoCompativel(ExecutaIntegracaoSefazService service, DocumentoFiscal documento) {
		return (documento.getModeloDocumento().equals(service.getModelo()) && documento.getVersaoXML().equals(service.getVersaoXML()));
	}
}

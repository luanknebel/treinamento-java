package br.com.treinamento.java.service.integacao.sefaz;

import br.com.treinamento.java.model.DocumentoFiscal;
import br.com.treinamento.java.model.ModeloDocumentoEnum;
import br.com.treinamento.java.service.ExecutaIntegracaoSefazService;

public class IntegracaoSefazNFeServiceImpl implements ExecutaIntegracaoSefazService{

	@Override
	public void enviarDocumentoSefaz(DocumentoFiscal documentoFiscal) {
		System.out.println("chamando a sefaz da nota fiscal com xml v4");
	}

	@Override
	public ModeloDocumentoEnum getModelo() {
		return ModeloDocumentoEnum.MODELO55;
	}

	@Override
	public String getVersaoXML() {
		return "4.00";
	}

}

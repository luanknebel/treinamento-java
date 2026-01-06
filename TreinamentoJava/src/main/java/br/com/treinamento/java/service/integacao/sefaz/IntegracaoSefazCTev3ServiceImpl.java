package br.com.treinamento.java.service.integacao.sefaz;

import br.com.treinamento.java.model.DocumentoFiscal;
import br.com.treinamento.java.model.ModeloDocumentoEnum;
import br.com.treinamento.java.service.ExecutaIntegracaoSefazService;

public class IntegracaoSefazCTev3ServiceImpl implements ExecutaIntegracaoSefazService{

	@Override
	public void enviarDocumentoSefaz(DocumentoFiscal documentoFiscal) {
		System.out.println("chamando a sefaz do cte com xml da versao 3");
	}

	@Override
	public ModeloDocumentoEnum getModelo() {
		return ModeloDocumentoEnum.MODELO57;
	}

	@Override
	public String getVersaoXML() {
		return "3.00";
	}
	
}

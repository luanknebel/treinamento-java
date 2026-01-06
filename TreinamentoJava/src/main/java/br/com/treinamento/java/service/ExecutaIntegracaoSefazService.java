package br.com.treinamento.java.service;

import br.com.treinamento.java.model.DocumentoFiscal;
import br.com.treinamento.java.model.ModeloDocumentoEnum;

public interface ExecutaIntegracaoSefazService {

	public void enviarDocumentoSefaz(DocumentoFiscal documentoFiscal);
	
	public ModeloDocumentoEnum getModelo();
	
	public String getVersaoXML();
}

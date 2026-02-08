package br.com.treinamento.jakarta.resource;

import br.com.treinamento.jakarta.converter.IConverter;
import br.com.treinamento.jakarta.converter.ProdutoConverter;
import br.com.treinamento.jakarta.model.Produto;
import br.com.treinamento.jakarta.resource.dto.ProdutoDTO;
import br.com.treinamento.jakarta.service.IService;
import br.com.treinamento.jakarta.service.ProdutoService;
import jakarta.inject.Inject;

public class ProdutoResource extends AbstractResource<Produto, ProdutoDTO>{

    @Inject
    private ProdutoService produtoService;

    @Inject
    private ProdutoConverter produtoConverter;

    @Override
    public IService<Produto> getService() {
        return produtoService;
    }

    @Override
    public IConverter<Produto, ProdutoDTO> getConverter() {
        return produtoConverter;
    }
}

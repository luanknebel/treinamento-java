package br.com.treinamento.jakarta.service.impl;

import br.com.treinamento.jakarta.model.Produto;
import br.com.treinamento.jakarta.service.ProdutoService;
import br.com.treinamento.jakarta.repository.AbstractRepository;
import br.com.treinamento.jakarta.repository.ProdutoRepository;
import jakarta.inject.Inject;

public class ProdutoServiceImpl extends IServiceImpl<Produto> implements ProdutoService{

    @Inject
    private ProdutoRepository produtoRepository;

    @Override
    public AbstractRepository<Produto> getRepository() {
        return produtoRepository;
    }
}

package br.com.treinamento.jakarta.repository;

import br.com.treinamento.jakarta.model.Produto;

public class ProdutoRepository extends AbstractRepository<Produto>{

    @Override
    public Class<Produto> getEntityClass() {
        return Produto.class;
    }
}

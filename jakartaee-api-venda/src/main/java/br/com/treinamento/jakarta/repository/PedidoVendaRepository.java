package br.com.treinamento.jakarta.repository;

import br.com.treinamento.jakarta.model.PedidoVenda;

public class PedidoVendaRepository extends AbstractRepository<PedidoVenda>{

    @Override
    public Class<PedidoVenda> getEntityClass() {
        return PedidoVenda.class;
    }
}

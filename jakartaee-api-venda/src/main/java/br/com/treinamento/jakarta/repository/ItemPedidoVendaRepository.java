package br.com.treinamento.jakarta.repository;

import br.com.treinamento.jakarta.model.ItemPedidoVenda;

public class ItemPedidoVendaRepository extends AbstractRepository<ItemPedidoVenda>{

    @Override
    public Class<ItemPedidoVenda> getEntityClass() {
        return ItemPedidoVenda.class;
    }
}

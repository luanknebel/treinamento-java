package br.com.treinamento.jakarta.service.impl;

import br.com.treinamento.jakarta.model.ItemPedidoVenda;
import br.com.treinamento.jakarta.repository.AbstractRepository;
import br.com.treinamento.jakarta.repository.ItemPedidoVendaRepository;
import br.com.treinamento.jakarta.service.ItemPedidoVendaService;
import jakarta.inject.Inject;

public class ItemPedidoVendaServiceImpl extends IServiceImpl<ItemPedidoVenda> implements ItemPedidoVendaService {

    @Inject
    private ItemPedidoVendaRepository itemPedidoVendaRepository;

    @Override
    public AbstractRepository<ItemPedidoVenda> getRepository() {
        return itemPedidoVendaRepository;
    }
}

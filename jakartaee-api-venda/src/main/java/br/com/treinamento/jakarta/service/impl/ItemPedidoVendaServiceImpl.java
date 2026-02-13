package br.com.treinamento.jakarta.service.impl;

import br.com.treinamento.jakarta.model.ItemPedidoVenda;
import br.com.treinamento.jakarta.repository.AbstractRepository;
import br.com.treinamento.jakarta.repository.ItemPedidoVendaRepository;
import br.com.treinamento.jakarta.service.ItemPedidoVendaService;
import br.com.treinamento.jakarta.service.PedidoVendaService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
public class ItemPedidoVendaServiceImpl extends IServiceImpl<ItemPedidoVenda> implements ItemPedidoVendaService {

    @Inject
    private ItemPedidoVendaRepository itemPedidoVendaRepository;

    @Inject
    private PedidoVendaService pedidoVendaService;
    
    @Override
    public AbstractRepository<ItemPedidoVenda> getRepository() {
        return itemPedidoVendaRepository;
    }

    @Override
    public void afterUpdate(ItemPedidoVenda itemPedidoVenda) {
        Long idPedido = itemPedidoVenda.getPedidoVenda().getId();
        pedidoVendaService.calcularValorTotalPedido(idPedido);
    }

    @Override
    public void afterPersist(ItemPedidoVenda itemPedidoVenda) {
        Long idPedido = itemPedidoVenda.getPedidoVenda().getId();
        pedidoVendaService.calcularValorTotalPedido(idPedido);
    }

    @Override
    public void beforeDelete(Long id) {
        ItemPedidoVenda itemPedidoVenda = itemPedidoVendaRepository.findValidate(id);
        pedidoVendaService.descontarValorTotalPedido(itemPedidoVenda);
    }

}

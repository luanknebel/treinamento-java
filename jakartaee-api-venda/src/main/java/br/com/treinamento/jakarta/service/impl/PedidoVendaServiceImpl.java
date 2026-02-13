package br.com.treinamento.jakarta.service.impl;

import br.com.treinamento.jakarta.model.ItemPedidoVenda;
import br.com.treinamento.jakarta.model.PedidoVenda;
import br.com.treinamento.jakarta.service.PedidoVendaService;
import br.com.treinamento.jakarta.repository.AbstractRepository;
import br.com.treinamento.jakarta.repository.PedidoVendaRepository;
import br.com.treinamento.jakarta.util.CollectionUtil;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

@Transactional
public class PedidoVendaServiceImpl extends IServiceImpl<PedidoVenda> implements PedidoVendaService {

    @Inject
    private PedidoVendaRepository pedidoVendaRepository;

    @Override
    public AbstractRepository<PedidoVenda> getRepository() {
        return pedidoVendaRepository;
    }

    @Override
    public void beforeUpdate(PedidoVenda pedidoVenda) {
        calcularValorTotalPedido(pedidoVenda.getId());
    }

    @Override
    public void beforePersist(PedidoVenda pedidoVenda) {
        if(Objects.isNull(pedidoVenda.getId())){
            pedidoVenda.setValorTotal(BigDecimal.ZERO);
        }else{
            calcularValorTotalPedido(pedidoVenda.getId());
        }
    }

    public void calcularValorTotalPedido(Long idPedido){
        PedidoVenda pedidoVenda = pedidoVendaRepository.findValidate(idPedido);
        pedidoVenda.setValorTotal(BigDecimal.ZERO);

        BigDecimal valorTotal = BigDecimal.ZERO;
        Collection<ItemPedidoVenda> itens = CollectionUtil.getNotNull(pedidoVenda.getItens());

        for (ItemPedidoVenda item : itens) {
            valorTotal = valorTotal.add(item.getValorUnitario().multiply(item.getQuantidade()));
        }
        pedidoVenda.setValorTotal(valorTotal);
        pedidoVendaRepository.merge(pedidoVenda);
    }

    @Override
    public void descontarValorTotalPedido(ItemPedidoVenda itemPedidoVenda) {
        PedidoVenda pedidoVenda = itemPedidoVenda.getPedidoVenda();
        BigDecimal valorTotal = pedidoVenda.getValorTotal();
        BigDecimal valorItem = itemPedidoVenda.getValorUnitario().multiply(itemPedidoVenda.getQuantidade());
        pedidoVenda.setValorTotal(valorTotal.subtract(valorItem));
        pedidoVendaRepository.merge(pedidoVenda);
    }

}

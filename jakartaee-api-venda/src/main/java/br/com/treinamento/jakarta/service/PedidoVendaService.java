package br.com.treinamento.jakarta.service;

import br.com.treinamento.jakarta.model.ItemPedidoVenda;
import br.com.treinamento.jakarta.model.PedidoVenda;

public interface PedidoVendaService extends IService<PedidoVenda>{

    public void calcularValorTotalPedido(Long idPedido);

    public void descontarValorTotalPedido(ItemPedidoVenda itemPedidoVenda);

}

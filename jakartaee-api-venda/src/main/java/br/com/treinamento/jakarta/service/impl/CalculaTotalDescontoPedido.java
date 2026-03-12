package br.com.treinamento.jakarta.service.impl;

import br.com.treinamento.jakarta.model.PedidoVenda;

public class CalculaTotalDescontoPedido {

    public void calcular(PedidoVenda pedidoVenda) {
        System.out.println(pedidoVenda.getCliente().getNome());
        System.out.println("calculando desconto");
    }

}

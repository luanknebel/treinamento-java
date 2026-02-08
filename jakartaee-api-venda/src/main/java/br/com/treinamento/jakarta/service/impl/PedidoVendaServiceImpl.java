package br.com.treinamento.jakarta.service.impl;

import br.com.treinamento.jakarta.model.PedidoVenda;
import br.com.treinamento.jakarta.service.PedidoVendaService;
import br.com.treinamento.jakarta.repository.AbstractRepository;
import br.com.treinamento.jakarta.repository.PedidoVendaRepository;

public class PedidoVendaServiceImpl extends IServiceImpl<PedidoVenda> implements PedidoVendaService {

    private PedidoVendaRepository pedidoVendaRepository;

    @Override
    public AbstractRepository<PedidoVenda> getRepository() {
        return pedidoVendaRepository;
    }
}

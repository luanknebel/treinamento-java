package br.com.treinamento.jakarta.service.impl;

import br.com.treinamento.jakarta.model.Cliente;
import br.com.treinamento.jakarta.service.ClienteService;
import br.com.treinamento.jakarta.service.impl.repository.AbstractRepository;
import br.com.treinamento.jakarta.service.impl.repository.ClienteRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
public class ClienteServiceImpl extends IServiceImpl<Cliente> implements ClienteService {

    @Inject
    private ClienteRepository clienteRepository;

    @Override
    public AbstractRepository<Cliente> getRepository() {
        return clienteRepository;
    }
}

package br.com.treinamento.jakarta.service.impl.repository;

import br.com.treinamento.jakarta.model.Cliente;

public class ClienteRepository extends AbstractRepository<Cliente>{

    @Override
    public Class<Cliente> getEntityClass() {
        return Cliente.class;
    }

}

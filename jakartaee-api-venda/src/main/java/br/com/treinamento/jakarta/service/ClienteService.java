package br.com.treinamento.jakarta.service;

import br.com.treinamento.jakarta.model.Cliente;
import br.com.treinamento.jakarta.service.repository.ClienteRepository;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
public class ClienteService {

    @Inject
    private ClienteRepository clienteRepository;

    public Cliente find(Long id){
        return clienteRepository.find(id);
    }

    public void persist(Cliente cliente) {
        clienteRepository.persist(cliente);
    }

    public void update(Cliente cliente) {
        clienteRepository.merge(cliente);
    }

    public void delete(Long id) {
        clienteRepository.remove(clienteRepository.find(id));
    }
}

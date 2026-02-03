package br.com.treinamento.jakarta.hello.model;

import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
public class ClienteService {

    @PersistenceContext(unitName = "PostgresDS")
    private EntityManager entityManager;

    public void gravarCliente(Cliente cliente){

        entityManager.persist(cliente);

    }

}

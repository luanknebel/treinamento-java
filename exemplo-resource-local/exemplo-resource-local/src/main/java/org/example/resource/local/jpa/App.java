package org.example.resource.local.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.resource.local.jpa.model.Cliente;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Cliente cliente = new Cliente();
        cliente.setNome("pedro");
        em.persist(cliente);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}

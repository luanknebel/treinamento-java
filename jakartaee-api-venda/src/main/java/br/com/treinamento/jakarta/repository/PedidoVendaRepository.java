package br.com.treinamento.jakarta.repository;

import br.com.treinamento.jakarta.model.PedidoVenda;
import jakarta.persistence.TypedQuery;

public class PedidoVendaRepository extends AbstractRepository<PedidoVenda>{

    @Override
    public Class<PedidoVenda> getEntityClass() {
        return PedidoVenda.class;
    }

     public PedidoVenda findFetch(Long id){

        String jpql = """
                      select p from PedidoVenda p
                          join fetch p.cliente
                          join fetch p.usuario
                          where p.id = :id
                    """;
        TypedQuery<PedidoVenda> typedQuery = getEntityManager().createQuery(jpql, PedidoVenda.class);
        typedQuery.setParameter("id", id);
        return typedQuery.getSingleResult();
     }

    public PedidoVenda findFetchItens(Long id){

        String jpql = """
                      select p from PedidoVenda p
                          join fetch p.itens
                          where p.id = :id
                    """;
        TypedQuery<PedidoVenda> typedQuery = getEntityManager().createQuery(jpql, PedidoVenda.class);
        typedQuery.setParameter("id", id);
        return typedQuery.getSingleResult();
    }

}

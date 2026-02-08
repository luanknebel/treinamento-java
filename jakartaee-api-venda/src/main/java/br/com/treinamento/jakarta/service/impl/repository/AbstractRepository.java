package br.com.treinamento.jakarta.service.impl.repository;

import br.com.treinamento.jakarta.model.AbstractModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.Objects;

public abstract class AbstractRepository<T extends AbstractModel> {

    @PersistenceContext(unitName = "PostgresDS")
    private EntityManager entityManager;

    public void persist(T entity){
        entityManager.persist(entity);
    }

    public  T merge(T entity){
        return entityManager.merge(entity);
    }

    public void remove(Long id){
        T entity = find(id);
        remove(entity);
    }

    public void remove(T entity){
        if(Objects.nonNull(entity)){
            entityManager.remove(entity);
        }
    }

    public T find(Long id) {
         return entityManager.find(getEntityClass(), id);
    };

    public abstract Class<T> getEntityClass();
}

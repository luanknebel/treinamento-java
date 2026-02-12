package br.com.treinamento.jakarta.repository;

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

    public T findValidate(Long id){
        T entity = entityManager.find(getEntityClass(), id);
        if(Objects.isNull(entity)){
            throw new RuntimeException("Entity " + getEntityClass().getName() + " not found with id: " + id);
        }
        return entity;
    }

    public abstract Class<T> getEntityClass();
}

package br.com.treinamento.jakarta.service.impl;

import br.com.treinamento.jakarta.model.AbstractModel;
import br.com.treinamento.jakarta.service.IService;
import br.com.treinamento.jakarta.repository.AbstractRepository;

public abstract class IServiceImpl<T extends AbstractModel> implements IService<T> {

    @Override
    public T find(Long id) {
        return getRepository().find(id);
    }

    @Override
    public void update(T entity) {
        beforeUpdate(entity);
        getRepository().merge(entity);
        afterUpdate(entity);
    }

    @Override
    public void persist(T entity) {
        beforePersist(entity);
        getRepository().persist(entity);
        afterPersist(entity);
    }

    @Override
    public void delete(Long id) {
        beforeDelete(id);
        getRepository().remove(id);
        afterDelete(id);
    }

    public void beforePersist(T entity){};
    public void beforeUpdate(T entity){};
    public void beforeDelete(Long id){};
    public void afterPersist(T entity){};
    public void afterUpdate(T entity){};
    public void afterDelete(Long id){};

    public abstract AbstractRepository<T> getRepository();

}

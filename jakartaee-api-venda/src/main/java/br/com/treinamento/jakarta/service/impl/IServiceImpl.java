package br.com.treinamento.jakarta.service.impl;

import br.com.treinamento.jakarta.model.AbstractModel;
import br.com.treinamento.jakarta.service.IService;
import br.com.treinamento.jakarta.service.impl.repository.AbstractRepository;

public abstract class IServiceImpl<T extends AbstractModel> implements IService<T> {

    @Override
    public T find(Long id) {
        return getRepository().find(id);
    }

    @Override
    public void update(T entity) {
        getRepository().merge(entity);
    }

    @Override
    public void persist(T entity) {
        getRepository().persist(entity);
    }

    @Override
    public void delete(Long id) {
        getRepository().remove(id);
    }

    public abstract AbstractRepository<T> getRepository();

}

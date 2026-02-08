package br.com.treinamento.jakarta.service;

import br.com.treinamento.jakarta.model.AbstractModel;

public interface IService<T extends AbstractModel> {

    public T find(Long id);

    public void persist(T entity);

    public void update(T entity);

    public void delete(Long id);

}

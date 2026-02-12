package br.com.treinamento.jakarta.converter;

import br.com.treinamento.jakarta.model.AbstractModel;
import br.com.treinamento.jakarta.resource.dto.AbstractDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public interface IConverter<T extends AbstractModel, D extends AbstractDTO> {

    public D convertTODTO(T entity);

    public T convertTOEntity(D dto);

    public default Collection<D> convertTODTO(Collection<T> entities) {
        Collection<D> dtos = new ArrayList<>();
        for (T entity : entities) {
            D dto = convertTODTO(entity);
            if (dto != null) {
                dtos.add(dto);
            }
        }
        return dtos;
    }

    public default Set<T> convertTOEntity(Collection<D> dtos) {
        Set<T> entities = new HashSet<>();
        for (D dto : dtos) {
            T entity = convertTOEntity(dto);
            if (entity != null) {
                entities.add(entity);
            }
        }
        return entities;
    }

}

package br.com.treinamento.jakarta.resource;

import br.com.treinamento.jakarta.converter.IConverter;
import br.com.treinamento.jakarta.model.AbstractModel;
import br.com.treinamento.jakarta.resource.dto.AbstractDTO;
import br.com.treinamento.jakarta.service.IService;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

public abstract class AbstractResource<T extends AbstractModel, D extends AbstractDTO> {

    @GET
    @Path("{id}")
    public D find(@PathParam("id") Long id){
        T entity = getService().find(id);
        return getConverter().convertTODTO(entity);
    }

    @POST
    public void persist(D dto){
        T entity = getConverter().convertTOEntity(dto);
        getService().persist(entity);
    }

    @PUT
    public void update(D dto){
        T entity = getConverter().convertTOEntity(dto);
        getService().update(entity);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id){
        getService().delete(id);
    }

    public abstract IService<T> getService();

    public abstract IConverter<T, D> getConverter();
}

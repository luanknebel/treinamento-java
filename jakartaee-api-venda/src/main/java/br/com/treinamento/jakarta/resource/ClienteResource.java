package br.com.treinamento.jakarta.resource;

import br.com.treinamento.jakarta.converter.ClienteConverter;
import br.com.treinamento.jakarta.converter.IConverter;
import br.com.treinamento.jakarta.model.Cliente;
import br.com.treinamento.jakarta.resource.dto.ClienteDTO;
import br.com.treinamento.jakarta.service.ClienteService;
import br.com.treinamento.jakarta.service.IService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("cliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource {

    @Inject
    private ClienteService clienteService;

    @Inject
    private ClienteConverter clienteConverter;

    @GET
    @Path("{id}")
    public ClienteDTO find(@PathParam("id") Long id){
        Cliente cliente = clienteService.find(id);
        return clienteConverter.convertTODTO(cliente);
    }

    @POST
    public void persist(ClienteDTO clienteDTO){
        Cliente cliente = clienteConverter.converTOEntity(clienteDTO);
        clienteService.persist(cliente);
    }

    @PUT
    public void update(ClienteDTO clienteDTO){
        Cliente cliente = clienteConverter.converTOEntity(clienteDTO);
        clienteService.update(cliente);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id){
        clienteService.delete(id);
    }
}

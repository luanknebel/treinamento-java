package br.com.treinamento.jakarta.resource;

import br.com.treinamento.jakarta.converter.ClienteConverter;
import br.com.treinamento.jakarta.model.Cliente;
import br.com.treinamento.jakarta.resource.dto.ClienteDTO;
import br.com.treinamento.jakarta.service.ClienteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
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
        return clienteConverter.converterTODTO(cliente);
    }

    @POST
    public void persist(ClienteDTO clienteDTO){
        Cliente cliente = clienteConverter.converterTOEntity(clienteDTO);
        clienteService.persist(cliente);
    }

    @PUT
    public void update(ClienteDTO clienteDTO){
        Cliente cliente = clienteConverter.converterTOEntity(clienteDTO);
        clienteService.update(cliente);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id){
        clienteService.delete(id);
    }
}

package br.com.treinamento.jakarta.hello;

import br.com.treinamento.jakarta.hello.model.Cliente;
import br.com.treinamento.jakarta.hello.model.ClienteService;
import br.com.treinamento.jakarta.hello.model.dto.ClienteDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("hello")
public class HelloWorldResource {

    @Inject
    private ClienteService clienteService;

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Hello hello(@QueryParam("name") String name) {
        if ((name == null) || name.trim().isEmpty()) {
            name = "world";
        }

        return new Hello(name);
    }

    @POST
    @Path("gravar-cliente")
    public void gravarCliente(ClienteDTO dto){

        Cliente clienteEntity = new Cliente();
        clienteEntity.setNome(dto.getNome());
        clienteService.gravarCliente(clienteEntity);

    }
}

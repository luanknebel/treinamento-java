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
public class ClienteResource extends AbstractResource<Cliente, ClienteDTO>{

    @Inject
    private ClienteService clienteService;

    @Inject
    private ClienteConverter clienteConverter;


    @Override
    public IService<Cliente> getService() {
        return clienteService;
    }

    @Override
    public IConverter<Cliente, ClienteDTO> getConverter() {
        return clienteConverter;
    }
}

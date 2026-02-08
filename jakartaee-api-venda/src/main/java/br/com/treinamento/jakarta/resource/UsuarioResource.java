package br.com.treinamento.jakarta.resource;

import br.com.treinamento.jakarta.converter.UsuarioConverter;
import br.com.treinamento.jakarta.model.Usuario;
import br.com.treinamento.jakarta.resource.dto.UsuarioDTO;
import br.com.treinamento.jakarta.service.UsuarioService;
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

@Path( "usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioResource {

    @Inject
    private UsuarioService usuarioService;

    @Inject
    private UsuarioConverter usuarioConverter;

    @GET
    @Path("{id}")
    public UsuarioDTO find(@PathParam("id") Long id){
        Usuario usuario = usuarioService.find(id);
        return usuarioConverter.convertTODTO(usuario);
    }

    @POST
    public void persist(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.converterTOEntity(usuarioDTO);
        usuarioService.persist(usuario);
    }

    @PUT
    public void update(UsuarioDTO clienteDTO){
        Usuario usuario = usuarioConverter.converterTOEntity(clienteDTO);
        usuarioService.update(usuario);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id){
        usuarioService.delete(id);
    }

}

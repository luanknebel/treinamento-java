package br.com.treinamento.jakarta.resource;

import br.com.treinamento.jakarta.converter.IConverter;
import br.com.treinamento.jakarta.converter.UsuarioConverter;
import br.com.treinamento.jakarta.model.Usuario;
import br.com.treinamento.jakarta.resource.dto.UsuarioDTO;
import br.com.treinamento.jakarta.service.IService;
import br.com.treinamento.jakarta.service.UsuarioService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path( "usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioResource extends AbstractResource<Usuario, UsuarioDTO>{

    @Inject
    private UsuarioService usuarioService;

    @Inject
    private UsuarioConverter usuarioConverter;

    @Override
    public IService<Usuario> getService() {
        return usuarioService;
    }

    @Override
    public IConverter<Usuario, UsuarioDTO> getConverter() {
        return usuarioConverter;
    }
}

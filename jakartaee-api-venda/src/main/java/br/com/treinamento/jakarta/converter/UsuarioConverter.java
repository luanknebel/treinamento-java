package br.com.treinamento.jakarta.converter;

import br.com.treinamento.jakarta.model.Usuario;
import br.com.treinamento.jakarta.resource.dto.UsuarioDTO;

public class UsuarioConverter {

     public UsuarioDTO convertTODTO(Usuario usuario){
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(usuario.getId());
        usuarioDTO.setLogin(usuario.getLogin());
        usuarioDTO.setSenha(usuario.getSenha());
        usuarioDTO.setAtivo(usuario.getAtivo());
        return usuarioDTO;
    }

    public Usuario converterTOEntity(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDTO.getId());
        usuario.setLogin(usuarioDTO.getLogin());
        usuario.setSenha(usuarioDTO.getSenha());
        usuario.setAtivo(usuarioDTO.getAtivo());
        return usuario;
    }

}

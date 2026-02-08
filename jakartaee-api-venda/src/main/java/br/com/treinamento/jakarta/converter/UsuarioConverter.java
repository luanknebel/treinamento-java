package br.com.treinamento.jakarta.converter;

import br.com.treinamento.jakarta.model.Usuario;
import br.com.treinamento.jakarta.resource.dto.UsuarioDTO;

public class UsuarioConverter implements IConverter<Usuario, UsuarioDTO>{

    @Override
    public UsuarioDTO convertTODTO(Usuario entity) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(entity.getId());
        dto.setLogin(entity.getLogin());
        dto.setSenha(entity.getSenha());
        dto.setAtivo(entity.getAtivo());

        return dto;
    }

    @Override
    public Usuario convertTOEntity(UsuarioDTO dto) {
        Usuario entity = new Usuario();
        entity.setId(dto.getId());
        entity.setLogin(dto.getLogin());
        entity.setSenha(dto.getSenha());
        entity.setAtivo(dto.getAtivo());

        return entity;
    }
}

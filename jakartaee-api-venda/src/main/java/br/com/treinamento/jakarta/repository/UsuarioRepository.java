package br.com.treinamento.jakarta.repository;

import br.com.treinamento.jakarta.model.Usuario;

public class UsuarioRepository extends AbstractRepository<Usuario>{

    @Override
    public Class<Usuario> getEntityClass() {
        return Usuario.class;
    }
}

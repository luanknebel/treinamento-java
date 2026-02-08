package br.com.treinamento.jakarta.service.impl;

import br.com.treinamento.jakarta.model.Usuario;
import br.com.treinamento.jakarta.service.UsuarioService;
import br.com.treinamento.jakarta.service.impl.repository.AbstractRepository;
import br.com.treinamento.jakarta.service.impl.repository.UsuarioRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
public class UsuarioServiceImpl extends IServiceImpl<Usuario> implements UsuarioService{

    @Inject
    private UsuarioRepository usuarioRepository;

    @Override
    public AbstractRepository<Usuario> getRepository() {
        return usuarioRepository;
    }
}

package com.arquitetura.hexagonal.adapters.repository;

import com.arquitetura.hexagonal.adapters.converter.UsuarioConverter;
import com.arquitetura.hexagonal.adapters.entity.UsuarioEntity;
import com.arquitetura.hexagonal.core.domain.Usuario;
import com.arquitetura.hexagonal.core.ports.out.UsuarioRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter converter;

    public UsuarioRepositoryAdapter(UsuarioRepository usuarioRepository, UsuarioConverter converter) {
        this.usuarioRepository = usuarioRepository;
        this.converter = converter;
    }

    @Override
    public Usuario create(Usuario usuario) {
        UsuarioEntity entity = converter.toEntity(usuario);
        return converter.toDomain(usuarioRepository.save(entity));
    }
}

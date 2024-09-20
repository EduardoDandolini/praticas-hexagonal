package com.arquitetura.hexagonal.core.ports.out;

import com.arquitetura.hexagonal.core.domain.Usuario;

import java.util.List;

public interface UsuarioRepositoryPort {

    Usuario create(Usuario usuario);

    List<Usuario> findAll();

}

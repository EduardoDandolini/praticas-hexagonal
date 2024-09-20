package com.arquitetura.hexagonal.core.ports.out;

import com.arquitetura.hexagonal.core.domain.Usuario;

public interface UsuarioRepositoryPort {

    Usuario create(Usuario usuario);

}

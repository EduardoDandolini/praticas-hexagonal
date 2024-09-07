package com.arquitetura.hexagonal.core.ports;

import com.arquitetura.hexagonal.core.domain.Usuario;

public interface UsuarioServicePort {

    Usuario salvar(Usuario usuario);

}

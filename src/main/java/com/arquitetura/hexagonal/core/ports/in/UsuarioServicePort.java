package com.arquitetura.hexagonal.core.ports.in;

import com.arquitetura.hexagonal.core.domain.Usuario;

import java.util.List;

public interface UsuarioServicePort {

    Usuario salvar(Usuario usuario);

    List<Usuario> listar();

}

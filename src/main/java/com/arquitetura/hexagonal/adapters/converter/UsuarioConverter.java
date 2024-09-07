package com.arquitetura.hexagonal.adapters.converter;

import com.arquitetura.hexagonal.adapters.dto.UsuarioDTO;
import com.arquitetura.hexagonal.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    public Usuario toDomain(UsuarioDTO dto) {
        return new Usuario(dto.id(), dto.nome(), dto.email());
    }

    public UsuarioDTO toDto(Usuario domain) {
        return new UsuarioDTO(domain.getId(), domain.getNome(), domain.getEmail());
    }
}

package com.arquitetura.hexagonal.adapters.converter;

import com.arquitetura.hexagonal.adapters.dto.UsuarioDTO;
import com.arquitetura.hexagonal.adapters.entity.UsuarioEntity;
import com.arquitetura.hexagonal.core.domain.Usuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioConverter {

    public Usuario toDomain(UsuarioDTO dto) {
        return new Usuario(dto.id(), dto.nome(), dto.email());
    }

    public UsuarioDTO toDto(Usuario domain) {
        return new UsuarioDTO(domain.getId(), domain.getNome(), domain.getEmail());
    }

    public UsuarioEntity toEntity(Usuario domain) {
        return new UsuarioEntity(domain.getEmail(), domain.getId(), domain.getNome());
    }

    public Usuario toDomain(UsuarioEntity entity) {
        return new Usuario(entity.getId(), entity.getNome(), entity.getEmail());
    }

    public List<Usuario> toDomainList(List<UsuarioEntity> all) {
        return all.stream().map(this::toDomain).toList();
    }

    public List<UsuarioDTO> toDtoList(List<Usuario> all) {
        return all.stream().map(this::toDto).toList();
    }
}

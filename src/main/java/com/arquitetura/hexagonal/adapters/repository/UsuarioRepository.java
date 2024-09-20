package com.arquitetura.hexagonal.adapters.repository;

import com.arquitetura.hexagonal.adapters.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}

package com.arquitetura.hexagonal.infraestrutura;

import com.arquitetura.hexagonal.core.ports.UsuarioServicePort;
import com.arquitetura.hexagonal.core.service.UsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public UsuarioServicePort usuarioServiceImpl() {
        return new UsuarioService();
    }
}

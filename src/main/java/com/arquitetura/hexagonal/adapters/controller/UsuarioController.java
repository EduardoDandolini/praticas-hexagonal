package com.arquitetura.hexagonal.adapters.controller;

import com.arquitetura.hexagonal.adapters.converter.UsuarioConverter;
import com.arquitetura.hexagonal.adapters.dto.UsuarioDTO;
import com.arquitetura.hexagonal.core.ports.in.UsuarioServicePort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioServicePort usuarioServicePort;
    private UsuarioConverter converter;

    public UsuarioController(UsuarioServicePort usuarioServicePort, UsuarioConverter converter) {
        this.usuarioServicePort = usuarioServicePort;
        this.converter = converter;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public UsuarioDTO salvar(@RequestBody UsuarioDTO dto){
      return converter.toDto(usuarioServicePort.salvar(converter.toDomain(dto)));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioDTO> listar(){
        return converter.toDtoList(usuarioServicePort.listar());
    }
}

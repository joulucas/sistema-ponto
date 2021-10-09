package com.sistemaponto.controller;

import com.sistemaponto.domain.Registro;
import com.sistemaponto.service.RegistroService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    private RegistroService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Registro salvar(@RequestBody Registro registro){
        return service.salvar(registro);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Registro buscarRegistroPorID(@PathVariable("id") Long id){
        return service.buscaPorCodigo(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Registro nao encontrado"));
    }
}

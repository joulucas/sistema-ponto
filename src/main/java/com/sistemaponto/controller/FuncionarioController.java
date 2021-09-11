package com.sistemaponto.controller;

import com.sistemaponto.domain.Funcionario;
import com.sistemaponto.service.FuncionarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Funcionario salvar(@RequestBody Funcionario funcionario){
        return service.salvar(funcionario);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Funcionario> listarFuncionario(){
        return  service.listarTodos();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Funcionario buscarFuncionarioPorID(@PathVariable("id") Long id){
        return service.buscaPorCodigo(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Funcionario nao encontrado"));
    }

    @PutMapping("/{id}")
    public void atualizarFuncionario(@PathVariable("id") Long id,
                                     @RequestBody Funcionario funcionario){
        service.buscaPorCodigo(id)
                .map(funcionario1 -> {
                    modelMapper.map(funcionario, funcionario1);
                    return Void.TYPE;
                }).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                "Funcionario nao encontrado"));;
    }

}

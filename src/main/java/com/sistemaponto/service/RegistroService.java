package com.sistemaponto.service;

import com.sistemaponto.domain.Funcionario;
import com.sistemaponto.domain.Registro;
import com.sistemaponto.repository.FuncionarioRepository;
import com.sistemaponto.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/registro")
public class RegistroService {

    @Autowired
    private RegistroRepository registroRepository;

    public Registro salvar(Registro registro){
        return registroRepository.save(registro);
    }

    public Optional<Registro> buscaPorCodigo(Long codigo){
        return registroRepository.findById(codigo);
    }

}

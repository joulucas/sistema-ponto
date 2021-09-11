package com.sistemaponto.service;

import com.sistemaponto.domain.Funcionario;
import com.sistemaponto.repository.FuncionarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario salvar(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> buscaPorCodigo(Long codigo){
        return funcionarioRepository.findById(codigo);
    }

}

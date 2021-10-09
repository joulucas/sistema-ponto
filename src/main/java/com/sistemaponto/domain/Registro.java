package com.sistemaponto.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    @Column(name = "data_hora")
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataHora;

    @ManyToOne
    @JoinColumn(name = "codigo_funcionario")
    private Funcionario funcionario;

    public Registro(Long codigo, Date dataHora, Funcionario funcionario) {
        this.codigo = codigo;
        this.dataHora = dataHora;
        this.funcionario = funcionario;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}

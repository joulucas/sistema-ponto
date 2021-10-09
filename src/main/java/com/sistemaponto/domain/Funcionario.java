package com.sistemaponto.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    @Column(name ="nome", nullable = false )
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cep")
    private String cep;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "matricula")
    private BigInteger matricula;

    @Column(name = "imagem")
    private byte[] imagem;

    public Funcionario(Long codigo, String nome, String sobrenome, String endereco, String estado, String cep, String email, String senha, BigInteger matricula) {
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.estado = estado;
        this.cep = cep;
        this.email = email;
        this.senha = senha;
        this.matricula = matricula;
    }

    public Funcionario() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public BigInteger getMatricula() {
        return matricula;
    }

    public void setMatricula(BigInteger matricula) {
        this.matricula = matricula;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
}

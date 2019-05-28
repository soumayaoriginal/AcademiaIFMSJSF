/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academiaif.mapeamento.pessoa;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Frank
 */
@MappedSuperclass
public abstract class PessoaMapeamento {
    @Id
    @GeneratedValue
    private long idPessoa;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(nullable = false)
    private int idade;
    @Column(length = 11, nullable = false)
    private String cpf;

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long id) {
        this.idPessoa = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}

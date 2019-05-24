/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academiaif.mapeamento.outros;

import br.com.academiaif.mapeamento.pessoa.ClienteMapeamento;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Frank
 */
@Entity
@Table(name = "planos")
public class PlanoMapeamento implements Serializable {

    @Id
    @GeneratedValue
    private long idPlano;
    @Column(length = 20, nullable = false)
    private String nome;
    @Column(name = "descPlano", nullable = false)
    private String descricao;
    private double valor;
    @OneToMany(mappedBy = "planoMapeamento", fetch = FetchType.LAZY)
    @Cascade(CascadeType.SAVE_UPDATE)
    private List<ClienteMapeamento> listaDeClientes;

    public long getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(long idPlano) {
        this.idPlano = idPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<ClienteMapeamento> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(List<ClienteMapeamento> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

}

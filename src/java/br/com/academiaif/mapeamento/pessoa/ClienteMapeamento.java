/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academiaif.mapeamento.pessoa;

import br.com.academiaif.mapeamento.outros.PlanoMapeamento;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Frank
 */
@Entity
@Table(name = "clientes")
public class ClienteMapeamento extends PessoaMapeamento implements Serializable {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPlano", insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private PlanoMapeamento planoMapeamento;
    
    @Transient
    private Long idPlano;
    
    @Column(nullable = false)
    private int diaVencimento;

    public PlanoMapeamento getPlanoMapeamento() {
        return planoMapeamento;
    }

    public void setPlanoMapeamento(PlanoMapeamento planoMapeamento) {
        this.planoMapeamento = planoMapeamento;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public Long getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Long idPlano) {
        this.idPlano = idPlano;
    }
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academiaif.mapeamento.pessoa;

import br.com.academiaif.mapeamento.outros.CargoMapeamento;
import java.io.Serializable;
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
@Table(name = "funcionarios")
public class FuncionarioMapeamento extends PessoaMapeamento implements Serializable{
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCargo", insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    
    @Transient
    private Long idCargo;
    private CargoMapeamento cargoMapeamento;
    
    private int satisfacaoDoCliente;

    public CargoMapeamento getCargoMapeamento() {
        return cargoMapeamento;
    }

    public void setCargoMapeamento(CargoMapeamento cargoMapeamento) {
        this.cargoMapeamento = cargoMapeamento;
    }

    public Long getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Long idCargo) {
        this.idCargo = idCargo;
    }
    
    

    public int getSatisfacaoDoCliente() {
        return satisfacaoDoCliente;
    }

    public void setSatisfacaoDoCliente(int satisfacaoDoCliente) {
        this.satisfacaoDoCliente = satisfacaoDoCliente;
    }
    
    
}

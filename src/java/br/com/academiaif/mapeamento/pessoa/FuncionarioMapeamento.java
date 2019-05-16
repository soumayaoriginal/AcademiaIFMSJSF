/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academiaif.mapeamento.pessoa;

import br.com.academiaif.mampeamento.outros.CargoMapeamento;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Frank
 */
@Entity
@Table(name = "funcionarios")
public class FuncionarioMapeamento extends PessoaMapeamento implements Serializable{
    private CargoMapeamento cargoMapeamento;
    private int satisfacaoDoCliente;

    public CargoMapeamento getCargoMapeamento() {
        return cargoMapeamento;
    }

    public void setCargoMapeamento(CargoMapeamento cargoMapeamento) {
        this.cargoMapeamento = cargoMapeamento;
    }

    public int getSatisfacaoDoCliente() {
        return satisfacaoDoCliente;
    }

    public void setSatisfacaoDoCliente(int satisfacaoDoCliente) {
        this.satisfacaoDoCliente = satisfacaoDoCliente;
    }
    
    
}

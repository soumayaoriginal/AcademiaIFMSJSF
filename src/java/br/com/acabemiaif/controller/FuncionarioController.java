/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acabemiaif.controller;

import br.com.academiaif.mapeamento.outros.CargoMapeamento;
import br.com.academiaif.mapeamento.pessoa.FuncionarioMapeamento;
import br.com.academiaif.repository.CargoRepository;
import br.com.academiaif.repository.FuncionarioRepository;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Frank
 */
@ViewScoped
@ManagedBean
public class FuncionarioController {
    
    private FuncionarioMapeamento funcionarioMapeamento;
    private CargoRepository cargoRepository;
    private FuncionarioRepository funcionarioRepository;
    private List<FuncionarioMapeamento> listaDeFuncionarios;
    private List<CargoMapeamento> listaDeCargos;
    
    public FuncionarioController(){
        this.funcionarioMapeamento = new FuncionarioMapeamento();
        this.funcionarioRepository = new FuncionarioRepository();
        this.cargoRepository = new CargoRepository();
        this.listaDeCargos = cargoRepository.buscarTodos();
    }
    
    public void salvar(){
        CargoMapeamento cargo = this.funcionarioRepository.buscarPorId(funcionarioMapeamento.getIdCargo());
        this.funcionarioMapeamento.setCargoMapeamento(cargo);
        this.funcionarioRepository.salvar(funcionarioMapeamento);
    }
    
    public void remover(FuncionarioMapeamento funcionarioMapeamento){
        this.funcionarioRepository.remover(funcionarioMapeamento);
    }
   
    public void buscarTodos(){
        this.listaDeFuncionarios = this.funcionarioRepository.buscarTodos();
    }
    
    public FuncionarioMapeamento getFuncionarioMapeamento() {
        return funcionarioMapeamento;
    }

    public void setFuncionarioMapeamento(FuncionarioMapeamento funcionarioMapeamento) {
        this.funcionarioMapeamento = funcionarioMapeamento;
    }

    public FuncionarioRepository getFuncionarioRepository() {
        return funcionarioRepository;
    }

    public void setFuncionarioRepository(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public CargoRepository getCargoRepository() {
        return cargoRepository;
    }

    public void setCargoRepository(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public List<FuncionarioMapeamento> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(List<FuncionarioMapeamento> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    public List<CargoMapeamento> getListaDeCargos() {
        return listaDeCargos;
    }

    public void setListaDeCargos(List<CargoMapeamento> listaDeCargos) {
        this.listaDeCargos = listaDeCargos;
    }
    
    
}

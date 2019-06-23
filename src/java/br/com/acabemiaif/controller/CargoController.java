/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acabemiaif.controller;

import br.com.academiaif.mapeamento.outros.CargoMapeamento;
import br.com.academiaif.repository.CargoRepository;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Soumaya
 */
@ViewScoped
@ManagedBean
public class CargoController {
    private CargoMapeamento cargoMapeamento;
    private CargoRepository cargoRepository;
    private List<CargoMapeamento> listaDeCargos;

    
    public CargoController(){
        this.cargoMapeamento = new CargoMapeamento();
        this.cargoRepository = new CargoRepository();
        this.listaDeCargos = new ArrayList<>();
    }
    
    public void salvar(){
        this.cargoRepository.salvar(cargoMapeamento);
    }
    
    public void buscarTodos(){
        this.listaDeCargos = this.cargoRepository.buscarTodos();
    }
    
    public void remover(CargoMapeamento cargo){
        this.cargoRepository.remover(cargo);
    }

    public CargoMapeamento getCargoMapeamento() {
        return cargoMapeamento;
    }

    public void setCargoMapeamento(CargoMapeamento cargoMapeamento) {
        this.cargoMapeamento = cargoMapeamento;
    }

    public CargoRepository getCargoRepository() {
        return cargoRepository;
    }

    public void setCargoRepository(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public List<CargoMapeamento> getListaDeCargos() {
        return listaDeCargos;
    }

    public void setListaDeCargos(List<CargoMapeamento> listaDeCargos) {
        this.listaDeCargos = listaDeCargos;
    }
    
    
}

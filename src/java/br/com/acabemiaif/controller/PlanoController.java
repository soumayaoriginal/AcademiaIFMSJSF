/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acabemiaif.controller;

import br.com.academiaif.mapeamento.outros.PlanoMapeamento;
import br.com.academiaif.repository.PlanoRepository;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Frank
 */
@ManagedBean
public class PlanoController {
    private PlanoMapeamento planoMapeamento;
    private PlanoRepository planoRepository;
    
    public PlanoController(){
        this.planoMapeamento = new PlanoMapeamento();
        this.planoRepository = new PlanoRepository();
    }
    
    public void salvar(){
        this.planoRepository.salvar(planoMapeamento);
    }

    public PlanoMapeamento getPlanoMapeamento() {
        return planoMapeamento;
    }

    public void setPlanoMapeamento(PlanoMapeamento planoMapeamento) {
        this.planoMapeamento = planoMapeamento;
    }

    public PlanoRepository getPlanoRepository() {
        return planoRepository;
    }

    public void setPlanoRepository(PlanoRepository planoRepository) {
        this.planoRepository = planoRepository;
    }
    
}

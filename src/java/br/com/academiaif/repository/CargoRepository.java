/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academiaif.repository;

import br.com.academiaif.mapeamento.outros.CargoMapeamento;
import br.com.academiaif.dao.Conexao;
import java.util.List;

/**
 *
 * @author Soumaya
 */
public class CargoRepository extends Conexao{
    
    public void salvar(CargoMapeamento cargo){
        Conectar();
        getSession().save(cargo);
        Fechar();
    }
    
    public List<CargoMapeamento> buscarTodos(){
        List<CargoMapeamento> listaDeCargos;
        Conectar();
        listaDeCargos = getSession().createQuery("from CargoMapeamento").list();
        Fechar();
        return listaDeCargos;
    }

    public CargoMapeamento buscarPorId(Long id) {
        Conectar();
        CargoMapeamento cargoMapeamento = (CargoMapeamento) getSession()
                .createQuery("from CargoMapeamento where id = :idCargo")
                .setParameter("idCargo", id)
                .setMaxResults(1).uniqueResult();
        Fechar();
        return cargoMapeamento;
    }
    
    public void remover(CargoMapeamento cargo){
        Conectar();
        getSession().delete(cargo);
        Fechar();
    }
}

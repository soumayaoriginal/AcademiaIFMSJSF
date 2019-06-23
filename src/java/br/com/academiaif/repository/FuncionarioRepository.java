/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academiaif.repository;

import br.com.academiaif.dao.Conexao;
import br.com.academiaif.mapeamento.outros.CargoMapeamento;
import br.com.academiaif.mapeamento.pessoa.FuncionarioMapeamento;
import java.util.List;

/**
 *
 * @author Frank
 */
public class FuncionarioRepository extends Conexao{
    
    public void salvar(FuncionarioMapeamento funcionario){
        Conectar();
        getSession().save(funcionario);
        Fechar();
    }
    
    public List<FuncionarioMapeamento> buscarTodos(){
        List<FuncionarioMapeamento> listaDeFuncionarios;
        Conectar();
        listaDeFuncionarios = getSession().createQuery("from FuncionarioMapeamento").list();
        Fechar();
        return listaDeFuncionarios;
    }
    
    public void remover(FuncionarioMapeamento funcionario){
        Conectar();
        getSession().delete(funcionario);
        Fechar();
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
}

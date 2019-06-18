/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academiaif.repository;

import br.com.academiaif.mapeamento.outros.PlanoMapeamento;
import br.com.academiaif.dao.Conexao;
import br.com.academiaif.mapeamento.pessoa.ClienteMapeamento;
import java.util.List;

/**
 *
 * @author Frank
 */
public class ClienteRepository extends Conexao{
    
    public void salvar(ClienteMapeamento cliente){
        Conectar();
        getSession().save(cliente);
        Fechar();
    }
    
    public List<ClienteMapeamento> buscarTodos(){
        List<ClienteMapeamento> listaDeClientes;
        Conectar();
        listaDeClientes = getSession().createQuery("from ClienteMapeamento").list();
        Fechar();
        return listaDeClientes;
    }
    
    
    
    
    
    
    
    
    public PlanoMapeamento buscarPorId(Long id) {
        Conectar();
        PlanoMapeamento planoMapeamento = (PlanoMapeamento) getSession()
                .createQuery("from PlanoMapeamento where id = :idPlano")
                .setParameter("idPlano", id)
                .setMaxResults(1).uniqueResult();
        Fechar();
        return planoMapeamento;
    }
}

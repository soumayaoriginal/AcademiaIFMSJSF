/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acabemiaif.controller;

import br.com.academiaif.util.NewHibernateUtil;
import javax.faces.bean.ManagedBean;
import org.hibernate.SessionFactory;

/**
 *
 * @author Frank
 */
@ManagedBean
public class ClienteController {
    public void salvar(){
        SessionFactory sessionFac = NewHibernateUtil.getSessionFactory();
        
        sessionFac.close();
    }
}
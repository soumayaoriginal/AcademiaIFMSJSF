/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academiaif.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author tyago
 */
public class Conexao {

    private Session mSession;
    private Transaction mTransaction;

    public Conexao() {
        mSession = NewHibernateUtil.getSessionFactory().openSession();
        mTransaction = mSession.beginTransaction();
    }

    public void Conectar() {
        if (!mSession.isOpen()) {
            mSession = NewHibernateUtil.getSessionFactory().openSession();
        }
        if (!mTransaction.isActive()) {
            mTransaction = mSession.beginTransaction();
        }
    }

    public void Fechar() {
        mSession.getTransaction().commit();
        mSession.close();
    }

    public Session getSession() {
        return mSession;
    }

    public void setSession(Session mSession) {
        this.mSession = mSession;
    }

    public Transaction getTransaction() {
        return mTransaction;
    }

    public void setTransaction(Transaction mTransaction) {
        this.mTransaction = mTransaction;
    }

}

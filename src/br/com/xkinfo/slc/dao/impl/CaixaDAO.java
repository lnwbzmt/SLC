package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.ICaixaDAO;
import br.com.xkinfo.slc.modelo.Caixa;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class CaixaDAO implements ICaixaDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirCaixa(Caixa caixa) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(caixa);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarCaixa(Caixa caixa) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(caixa);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirCaixa(Caixa caixa) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(caixa);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Caixa> getCaixas() throws Exception {
        ArrayList<Caixa> lista = new ArrayList<Caixa>();
        Query query = entityManager.createQuery("select x from Caixa x");
        lista = (ArrayList<Caixa>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Caixa> getCaixas(String filtro) throws Exception {
        ArrayList<Caixa> lista = new ArrayList<Caixa>();
        Query query = entityManager.createQuery("select x from Caixa x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<Caixa>) query.getResultList();
        return lista;
    }

    @Override
    public Caixa getCaixa(int id) throws Exception {
        Caixa caixa = null;
        try {
            caixa = entityManager.find(Caixa.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return caixa;
    }

    @Override
    public Caixa getCaixa(String nome) throws Exception {
        Caixa caixa = null;
        try {
            caixa = entityManager.find(Caixa.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return caixa;
    }

}

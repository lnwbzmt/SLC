package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IFaturaDAO;
import br.com.xkinfo.slc.modelo.Fatura;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class FaturaDAO implements IFaturaDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirFatura(Fatura fatura) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(fatura);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarFatura(Fatura fatura) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(fatura);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirFatura(Fatura fatura) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(fatura);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Fatura> getFaturas() throws Exception {
        ArrayList<Fatura> lista = new ArrayList<Fatura>();
        Query query = entityManager.createQuery("select x from Fatura x");
        lista = (ArrayList<Fatura>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Fatura> getFaturas(String filtro) throws Exception {
        ArrayList<Fatura> lista = new ArrayList<Fatura>();
        Query query = entityManager.createQuery("select x from Fatura x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<Fatura>) query.getResultList();
        return lista;
    }

    @Override
    public Fatura getFatura(int id) throws Exception {
        Fatura fatura = null;
        try {
            fatura = entityManager.find(Fatura.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return fatura;
    }

    @Override
    public Fatura getFatura(String nome) throws Exception {
        Fatura fatura = null;
        try {
            fatura = entityManager.find(Fatura.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return fatura;
    }

}

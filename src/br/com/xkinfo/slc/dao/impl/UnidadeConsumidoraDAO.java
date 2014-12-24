package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IUnidadeConsumidoraDAO;
import br.com.xkinfo.slc.modelo.UnidadeConsumidora;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class UnidadeConsumidoraDAO implements IUnidadeConsumidoraDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(unidadeConsumidora);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(unidadeConsumidora);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(entityManager.getReference(UnidadeConsumidora.class, unidadeConsumidora.getId()));
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<UnidadeConsumidora> getUnidadeConsumidoras() throws Exception {
        ArrayList<UnidadeConsumidora> lista;
        Query query = entityManager.createQuery("select x from UnidadeConsumidora x");
        lista = (ArrayList<UnidadeConsumidora>) query.getResultList();
        return lista;
    }

    @Override
    public UnidadeConsumidora getUnidadeConsumidora(int id) throws Exception {
        UnidadeConsumidora unidadeConsumidora = null;
        try {
            unidadeConsumidora = entityManager.find(UnidadeConsumidora.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return unidadeConsumidora;
    }

}

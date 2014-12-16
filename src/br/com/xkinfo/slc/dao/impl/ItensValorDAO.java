package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IItensValorDAO;
import br.com.xkinfo.slc.modelo.ItensValor;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class ItensValorDAO implements IItensValorDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirItensValor(ItensValor itensValor) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(itensValor);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarItensValor(ItensValor itensValor) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(itensValor);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirItensValor(ItensValor itensValor) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(itensValor);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<ItensValor> getItensValors() throws Exception {
        ArrayList<ItensValor> lista = new ArrayList<ItensValor>();
        Query query = entityManager.createQuery("select x from ItensValor x");
        lista = (ArrayList<ItensValor>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<ItensValor> getItensValors(String filtro) throws Exception {
        ArrayList<ItensValor> lista = new ArrayList<ItensValor>();
        Query query = entityManager.createQuery("select x from ItensValor x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<ItensValor>) query.getResultList();
        return lista;
    }

    @Override
    public ItensValor getItensValor(int id) throws Exception {
        ItensValor itensValor = null;
        try {
            itensValor = entityManager.find(ItensValor.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return itensValor;
    }

    @Override
    public ItensValor getItensValor(String nome) throws Exception {
        ItensValor itensValor = null;
        try {
            itensValor = entityManager.find(ItensValor.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return itensValor;
    }

}

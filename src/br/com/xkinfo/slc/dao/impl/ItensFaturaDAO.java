package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IItensFaturaDAO;
import br.com.xkinfo.slc.modelo.ItensFatura;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class ItensFaturaDAO implements IItensFaturaDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirItensFatura(ItensFatura itensFatura) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(itensFatura);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarItensFatura(ItensFatura itensFatura) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(itensFatura);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirItensFatura(ItensFatura itensFatura) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(itensFatura);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<ItensFatura> getItensFaturas() throws Exception {
        ArrayList<ItensFatura> lista = new ArrayList<ItensFatura>();
        Query query = entityManager.createQuery("select x from ItensFatura x");
        lista = (ArrayList<ItensFatura>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<ItensFatura> getItensFaturas(String filtro) throws Exception {
        ArrayList<ItensFatura> lista = new ArrayList<ItensFatura>();
        Query query = entityManager.createQuery("select x from ItensFatura x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<ItensFatura>) query.getResultList();
        return lista;
    }

    @Override
    public ItensFatura getItensFatura(int id) throws Exception {
        ItensFatura itensFatura = null;
        try {
            itensFatura = entityManager.find(ItensFatura.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return itensFatura;
    }

    @Override
    public ItensFatura getItensFatura(String nome) throws Exception {
        ItensFatura itensFatura = null;
        try {
            itensFatura = entityManager.find(ItensFatura.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return itensFatura;
    }

}

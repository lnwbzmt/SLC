package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IHidrometroUCDAO;
import br.com.xkinfo.slc.modelo.HidrometroUc;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class HidrometroUCDAO implements IHidrometroUCDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirHidrometroUC(HidrometroUc hidrometroUC) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(hidrometroUC);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarHidrometroUC(HidrometroUc hidrometroUC) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(hidrometroUC);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirHidrometroUC(HidrometroUc hidrometroUC) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(entityManager.getReference(HidrometroUc.class, hidrometroUC.getId()));
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<HidrometroUc> getHidrometroUCs() throws Exception {
        ArrayList<HidrometroUc> lista;
        Query query = entityManager.createQuery("select x from HidrometroUc x");
        lista = (ArrayList<HidrometroUc>) query.getResultList();
        return lista;
    }

    @Override
    public HidrometroUc getHidrometroUC(int id) throws Exception {
        HidrometroUc hidrometroUC = null;
        try {
            hidrometroUC = entityManager.find(HidrometroUc.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return hidrometroUC;
    }

}

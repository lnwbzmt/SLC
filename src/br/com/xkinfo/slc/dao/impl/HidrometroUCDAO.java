package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IHidrometroUCDAO;
import br.com.xkinfo.slc.modelo.HidrometroUC;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class HidrometroUCDAO implements IHidrometroUCDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirHidrometroUC(HidrometroUC hidrometroUC) throws Exception {
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
    public void alterarHidrometroUC(HidrometroUC hidrometroUC) throws Exception {
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
    public void excluirHidrometroUC(HidrometroUC hidrometroUC) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(hidrometroUC);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<HidrometroUC> getHidrometroUCs() throws Exception {
        ArrayList<HidrometroUC> lista = new ArrayList<HidrometroUC>();
        Query query = entityManager.createQuery("select x from HidrometroUC x");
        lista = (ArrayList<HidrometroUC>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<HidrometroUC> getHidrometroUCs(String filtro) throws Exception {
        ArrayList<HidrometroUC> lista = new ArrayList<HidrometroUC>();
        Query query = entityManager.createQuery("select x from HidrometroUC x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<HidrometroUC>) query.getResultList();
        return lista;
    }

    @Override
    public HidrometroUC getHidrometroUC(int id) throws Exception {
        HidrometroUC hidrometroUC = null;
        try {
            hidrometroUC = entityManager.find(HidrometroUC.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return hidrometroUC;
    }

    @Override
    public HidrometroUC getHidrometroUC(String nome) throws Exception {
        HidrometroUC hidrometroUC = null;
        try {
            hidrometroUC = entityManager.find(HidrometroUC.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return hidrometroUC;
    }

}

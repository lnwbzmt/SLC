package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IPessoaUCDAO;
import br.com.xkinfo.slc.modelo.PessoaUc;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class PessoaUCDAO implements IPessoaUCDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirPessoaUC(PessoaUc pessoaUC) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(pessoaUC);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarPessoaUC(PessoaUc pessoaUC) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(pessoaUC);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirPessoaUC(PessoaUc pessoaUC) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(entityManager.getReference(PessoaUc.class, pessoaUC.getId()));
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<PessoaUc> getPessoaUCs() throws Exception {
        ArrayList<PessoaUc> lista;
        Query query = entityManager.createQuery("select x from PessoaUc x");
        lista = (ArrayList<PessoaUc>) query.getResultList();
        return lista;
    }

    @Override
    public PessoaUc getPessoaUC(int id) throws Exception {
        PessoaUc pessoaUC = null;
        try {
            pessoaUC = entityManager.find(PessoaUc.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return pessoaUC;
    }

}

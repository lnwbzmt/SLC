package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IPessoaUCDAO;
import br.com.xkinfo.slc.modelo.PessoaUC;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class PessoaUCDAO implements IPessoaUCDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirPessoaUC(PessoaUC pessoaUC) throws Exception {
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
    public void alterarPessoaUC(PessoaUC pessoaUC) throws Exception {
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
    public void excluirPessoaUC(PessoaUC pessoaUC) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(pessoaUC);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<PessoaUC> getPessoaUCs() throws Exception {
        ArrayList<PessoaUC> lista = new ArrayList<PessoaUC>();
        Query query = entityManager.createQuery("select x from PessoaUC x");
        lista = (ArrayList<PessoaUC>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<PessoaUC> getPessoaUCs(String filtro) throws Exception {
        ArrayList<PessoaUC> lista = new ArrayList<PessoaUC>();
        Query query = entityManager.createQuery("select x from PessoaUC x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<PessoaUC>) query.getResultList();
        return lista;
    }

    @Override
    public PessoaUC getPessoaUC(int id) throws Exception {
        PessoaUC pessoaUC = null;
        try {
            pessoaUC = entityManager.find(PessoaUC.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return pessoaUC;
    }

    @Override
    public PessoaUC getPessoaUC(String nome) throws Exception {
        PessoaUC pessoaUC = null;
        try {
            pessoaUC = entityManager.find(PessoaUC.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return pessoaUC;
    }

}

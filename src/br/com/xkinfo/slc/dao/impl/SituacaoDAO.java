package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.ISituacaoDAO;
import br.com.xkinfo.slc.modelo.Situacao;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class SituacaoDAO implements ISituacaoDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirSituacao(Situacao situacao) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(situacao);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarSituacao(Situacao situacao) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(situacao);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirSituacao(Situacao situacao) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(entityManager.getReference(Situacao.class, situacao.getId()));
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Situacao> getSituacoes() throws Exception {
        ArrayList<Situacao> lista;
        Query query = entityManager.createQuery("select x from Situacao x");
        lista = (ArrayList<Situacao>) query.getResultList();
        return lista;
    }

    @Override
    public Situacao getSituacao(int id) throws Exception {
        Situacao situacao = null;
        try {
            situacao = entityManager.find(Situacao.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return situacao;
    }

}

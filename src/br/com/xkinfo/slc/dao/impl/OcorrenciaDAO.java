package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IOcorrenciaDAO;
import br.com.xkinfo.slc.modelo.Ocorrencia;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class OcorrenciaDAO implements IOcorrenciaDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirOcorrencia(Ocorrencia ocorrencia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(ocorrencia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarOcorrencia(Ocorrencia ocorrencia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(ocorrencia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirOcorrencia(Ocorrencia ocorrencia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(ocorrencia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Ocorrencia> getOcorrencias() throws Exception {
        ArrayList<Ocorrencia> lista;
        Query query = entityManager.createQuery("select x from Ocorrencia x");
        lista = (ArrayList<Ocorrencia>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Ocorrencia> getOcorrencias(String filtro) throws Exception {
        ArrayList<Ocorrencia> lista;
        Query query = entityManager.createQuery("select x from Ocorrencia x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<Ocorrencia>) query.getResultList();
        return lista;
    }

    @Override
    public Ocorrencia getOcorrencia(int id) throws Exception {
        Ocorrencia ocorrencia = null;
        try {
            ocorrencia = entityManager.find(Ocorrencia.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ocorrencia;
    }

    @Override
    public Ocorrencia getOcorrencia(String nome) throws Exception {
        Ocorrencia ocorrencia = null;
        try {
            ocorrencia = entityManager.find(Ocorrencia.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ocorrencia;
    }

}

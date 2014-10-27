package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.ICompetenciaDAO;
import br.com.xkinfo.slc.modelo.Competencia;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class CompetenciaDAO implements ICompetenciaDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirCompetencia(Competencia competencia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(competencia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarCompetencia(Competencia competencia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(competencia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirCompetencia(Competencia competencia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(competencia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Competencia> getCompetencias() throws Exception {
        ArrayList<Competencia> lista = new ArrayList<Competencia>();
        Query query = entityManager.createQuery("select x from Competencia x");
        lista = (ArrayList<Competencia>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Competencia> getCompetencias(String filtro) throws Exception {
        ArrayList<Competencia> lista = new ArrayList<Competencia>();
        Query query = entityManager.createQuery("select x from Competencia x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<Competencia>) query.getResultList();
        return lista;
    }

    @Override
    public Competencia getCompetencia(int id) throws Exception {
        Competencia competencia = null;
        try {
            competencia = entityManager.find(Competencia.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return competencia;
    }

    @Override
    public Competencia getCompetencia(String nome) throws Exception {
        Competencia competencia = null;
        try {
            competencia = entityManager.find(Competencia.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return competencia;
    }

}

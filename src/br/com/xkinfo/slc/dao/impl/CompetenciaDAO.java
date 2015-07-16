package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.ICompetenciaDAO;
import br.com.xkinfo.slc.modelo.Competencia;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import java.util.Date;
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
            entityManager.remove(entityManager.getReference(Competencia.class, competencia.getId()));
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Competencia> getCompetencias() throws Exception {
        ArrayList<Competencia> lista;
        Query query = entityManager.createQuery("select x from Competencia x");
        lista = (ArrayList<Competencia>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Competencia> getCompetencias(Date filtro) throws Exception {
        ArrayList<Competencia> lista;
        Query query = entityManager.createQuery("select x from Competencia x where x.competencia = :filtro");
        query.setParameter("filtro", filtro);
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

}

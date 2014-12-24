package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.ICondominioDAO;
import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class CondominioDAO implements ICondominioDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();
    private Condominio condominio;

    @Override
    public void incluirCondominio(Condominio condominio) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(condominio);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarCondominio(Condominio condominio) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(condominio);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirCondominio(Condominio condominio) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(entityManager.getReference(Condominio.class, condominio.getId()));
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Condominio> getCondominios() throws Exception {
        ArrayList<Condominio> lista;
        Query query = entityManager.createQuery("select x from Condominio x");
        lista = (ArrayList<Condominio>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Condominio> getCondominios(String filtro) throws Exception {
        ArrayList<Condominio> lista;
        Query query = entityManager.createQuery("select x from Condominio x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<Condominio>) query.getResultList();
        return lista;
    }

    @Override
    public Condominio getCondominio(Integer id) throws Exception {
        condominio = null;
        condominio = entityManager.find(Condominio.class, id);
        return condominio;
    }

    @Override
    public Condominio getCondominioCnpj(Integer cnpj) throws Exception {
        condominio = null;
        condominio = entityManager.find(Condominio.class, cnpj);
        return condominio;
    }

}

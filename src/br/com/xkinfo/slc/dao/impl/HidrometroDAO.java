package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IHidrometroDAO;
import br.com.xkinfo.slc.modelo.Hidrometro;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class HidrometroDAO implements IHidrometroDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirHidrometro(Hidrometro hidrometro) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(hidrometro);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarHidrometro(Hidrometro hidrometro) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(hidrometro);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirHidrometro(Hidrometro hidrometro) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(hidrometro);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Hidrometro> getHidrometros() throws Exception {
        ArrayList<Hidrometro> lista = new ArrayList<Hidrometro>();
        Query query = entityManager.createQuery("select x from Hidrometro x");
        lista = (ArrayList<Hidrometro>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Hidrometro> getHidrometros(String filtro) throws Exception {
        ArrayList<Hidrometro> lista = new ArrayList<Hidrometro>();
        Query query = entityManager.createQuery("select x from Hidrometro x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<Hidrometro>) query.getResultList();
        return lista;
    }

    @Override
    public Hidrometro getHidrometro(int id) throws Exception {
        Hidrometro hidrometro = null;
        try {
            hidrometro = entityManager.find(Hidrometro.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return hidrometro;
    }

    @Override
    public Hidrometro getHidrometro(String nome) throws Exception {
        Hidrometro hidrometro = null;
        try {
            hidrometro = entityManager.find(Hidrometro.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return hidrometro;
    }

}

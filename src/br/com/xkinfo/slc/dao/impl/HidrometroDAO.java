package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IHidrometroDAO;
import br.com.xkinfo.slc.modelo.Hidrometro;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import java.util.Date;
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
            entityManager.remove(entityManager.getReference(Hidrometro.class, hidrometro.getId()));
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Hidrometro> getHidrometros() throws Exception {
        ArrayList<Hidrometro> lista;
        Query query = entityManager.createQuery("select x from Hidrometro x");
        lista = (ArrayList<Hidrometro>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Hidrometro> getHidrometros(String serie) throws Exception {
        ArrayList<Hidrometro> lista;
        Query query = entityManager.createQuery("select x from Hidrometro x where x.nrserie like :nome ");
        query.setParameter("nome", "%" + serie + "%");
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
    public ArrayList<Hidrometro> getHidrometros(Date dataAquisicao) throws Exception {
        ArrayList<Hidrometro> lista;
        Query query = entityManager.createQuery("select x from Hidrometro x where x.dataaquisicao = :nome");
        query.setParameter("nome", "%" + dataAquisicao + "%");
        lista = (ArrayList<Hidrometro>) query.getResultList();
        return lista;
    }

}

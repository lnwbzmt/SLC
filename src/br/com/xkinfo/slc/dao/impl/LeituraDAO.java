package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.ILeituraDAO;
import br.com.xkinfo.slc.modelo.Leitura;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class LeituraDAO implements ILeituraDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirLeitura(Leitura leitura) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(leitura);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarLeitura(Leitura leitura) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(leitura);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirLeitura(Leitura leitura) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(leitura);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Leitura> getLeituras() throws Exception {
        ArrayList<Leitura> lista = new ArrayList<Leitura>();
        Query query = entityManager.createQuery("select x from Leitura x");
        lista = (ArrayList<Leitura>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Leitura> getLeituras(String filtro) throws Exception {
        ArrayList<Leitura> lista = new ArrayList<Leitura>();
        Query query = entityManager.createQuery("select x from Leitura x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<Leitura>) query.getResultList();
        return lista;
    }

    @Override
    public Leitura getLeitura(int id) throws Exception {
        Leitura leitura = null;
        try {
            leitura = entityManager.find(Leitura.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return leitura;
    }

    @Override
    public Leitura getLeitura(String nome) throws Exception {
        Leitura leitura = null;
        try {
            leitura = entityManager.find(Leitura.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return leitura;
    }

}

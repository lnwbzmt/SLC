package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IItensDAO;
import br.com.xkinfo.slc.modelo.Itens;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class ItensDAO implements IItensDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirItem(Itens itens) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(itens);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarItem(Itens itens) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(itens);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirItem(Itens itens) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(itens);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Itens> getItens() throws Exception {
        ArrayList<Itens> lista = new ArrayList<Itens>();
        Query query = entityManager.createQuery("select x from Itens x");
        lista = (ArrayList<Itens>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Itens> getItens(String filtro) throws Exception {
        ArrayList<Itens> lista = new ArrayList<Itens>();
        Query query = entityManager.createQuery("select x from Itens x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<Itens>) query.getResultList();
        return lista;
    }

    @Override
    public Itens getItem(int id) throws Exception {
        Itens itens = null;
        try {
            itens = entityManager.find(Itens.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return itens;
    }

    @Override
    public Itens getItem(String nome) throws Exception {
        Itens itens = null;
        try {
            itens = entityManager.find(Itens.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return itens;
    }

}

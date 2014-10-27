package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IPessoaDAO;
import br.com.xkinfo.slc.modelo.Pessoa;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class PessoaDAO implements IPessoaDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirPessoa(Pessoa pessoa) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(pessoa);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarPessoa(Pessoa pessoa) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(pessoa);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirPessoa(Pessoa pessoa) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(pessoa);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Pessoa> getPessoas() throws Exception {
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        Query query = entityManager.createQuery("select x from Pessoa x");
        lista = (ArrayList<Pessoa>) query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Pessoa> getPessoas(String filtro) throws Exception {
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        Query query = entityManager.createQuery("select x from Pessoa x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<Pessoa>) query.getResultList();
        return lista;
    }

    @Override
    public Pessoa getPessoa(int id) throws Exception {
        Pessoa pessoa = null;
        try {
            pessoa = entityManager.find(Pessoa.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return pessoa;
    }

    @Override
    public Pessoa getPessoa(String nome) throws Exception {
        Pessoa pessoa = null;
        try {
            pessoa = entityManager.find(Pessoa.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return pessoa;
    }

}

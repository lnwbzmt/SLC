package br.com.xkinfo.slc.dao.impl;

import br.com.xkinfo.slc.dao.IUsuarioDAO;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class UsuarioDAO implements IUsuarioDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirUsuario(Usuario usuario) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(usuario);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarUsuario(Usuario usuario) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(usuario);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirUsuario(Usuario usuario) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(usuario);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Usuario> getUsuarios() throws Exception {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        Query query = entityManager.createQuery("select x from Usuario x");
        lista = (ArrayList<Usuario>) 
                query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Usuario> getUsuarios(String filtro) throws Exception {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        Query query = entityManager.createQuery("select x from Usuario x WHERE x.nome like :nome");
        query.setParameter("nome", filtro);
        lista = (ArrayList<Usuario>) 
                query.getResultList();
        return lista;
    }

    @Override
    public Usuario getUsuario(int id) throws Exception {
        Usuario usuario = null;
        try {
            usuario = entityManager.find(Usuario.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return usuario;  
    }

    @Override
    public Usuario getUsuario(String nome) throws Exception {
        Usuario usuario = null;
        try {
            usuario = entityManager.find(Usuario.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return usuario;  
    }

}

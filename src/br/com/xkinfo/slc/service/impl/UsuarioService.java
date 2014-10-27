package br.com.xkinfo.slc.service.impl;


import br.com.xkinfo.slc.dao.impl.UsuarioDAO;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.IUsuarioService;
import java.util.ArrayList;

public class UsuarioService implements IUsuarioService {

    UsuarioDAO usuarioDAO = new UsuarioDAO();

    @Override
    public void incluirUsuario(Usuario usuario) throws Exception {
        usuarioDAO.incluirUsuario(usuario);
    }

    @Override
    public void alterarUsuario(Usuario usuario) throws Exception {
        usuarioDAO.alterarUsuario(usuario);
    }

    @Override
    public void excluirUsuario(Usuario usuario) throws Exception {
        usuarioDAO.excluirUsuario(usuario);
    }

    @Override
    public ArrayList<Usuario> getUsuarios() throws Exception {
        return usuarioDAO.getUsuarios();
    }

    @Override
    public ArrayList<Usuario> getUsuarios(String filtro) throws Exception {
        return usuarioDAO.getUsuarios(filtro);
    }

    @Override
    public Usuario getUsuario(int id) throws Exception {
        return usuarioDAO.getUsuario(id);
    }

    @Override
    public Usuario getUsuario(String nome) throws Exception {
        return usuarioDAO.getUsuario(nome);
    }

    @Override
    public Usuario isUsuarioValido(String login, String senha) throws Exception {
        ArrayList<Usuario> usuarios = usuarioDAO.getUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    }
}

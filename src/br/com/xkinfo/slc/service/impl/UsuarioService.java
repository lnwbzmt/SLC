package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.IUsuarioService;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioService implements IUsuarioService {
    
    private Date dataInclusao;
    private Date dataAlteracao;


    @Override
    public void incluirUsuario(String nome, String usuario, String senha, Usuario usu) throws Exception {
        dataInclusao = new Date();
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setUsuario(usuario);
        u.setSenha(senha);
        u.setUsuarioinclusao(usu);
        u.setDatainclusao(dataInclusao);
        
        DAOFactory.getUsuarioDAO().incluirUsuario(u);
    }

    @Override
    public void alterarUsuario(Integer id, String nome, String usuario, String senha, Usuario usu) throws Exception {
        dataAlteracao = new Date();
        Usuario u = new Usuario();
        u.setId(id);
        u.setNome(nome);
        u.setUsuario(usuario);
        u.setSenha(senha);
        u.setUsuarioalteracao(usu);
        u.setDataalteracao(dataAlteracao);
        
        DAOFactory.getUsuarioDAO().alterarUsuario(u);
    }

    @Override
    public void excluirUsuario(Integer id) throws Exception {
        DAOFactory.getUsuarioDAO().excluirUsuario(getUsuario(id));
    }

    @Override
    public ArrayList<Usuario> getUsuarios() throws Exception {
        return DAOFactory.getUsuarioDAO().getUsuarios();
    }

    @Override
    public Usuario getUsuario(int id) throws Exception {
        return DAOFactory.getUsuarioDAO().getUsuario(id);
    }

    @Override
    public Usuario isUsuarioValido(String login, String senha) throws Exception {
        ArrayList<Usuario> usuarios = getUsuarios();
        for (Usuario usuario : usuarios) {
            if (usuario.getUsuario().equals(login.toUpperCase()) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    }
}

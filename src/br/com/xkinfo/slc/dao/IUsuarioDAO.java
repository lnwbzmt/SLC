package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;

public interface IUsuarioDAO {

    public void incluirUsuario(Usuario usuario) throws Exception;

    public void alterarUsuario(Usuario usuario) throws Exception;

    public void excluirUsuario(Usuario usuario) throws Exception;

    public ArrayList<Usuario> getUsuarios() throws Exception;

    public Usuario getUsuario(int id) throws Exception;

}

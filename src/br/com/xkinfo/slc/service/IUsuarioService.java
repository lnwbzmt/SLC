package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;

public interface IUsuarioService {

    public void incluirUsuario(Usuario usuario) throws Exception;

    public void alterarUsuario(Usuario usuario) throws Exception;

    public void excluirUsuario(Usuario usuario) throws Exception;

    public ArrayList<Usuario> getUsuarios() throws Exception;

    public ArrayList<Usuario> getUsuarios(String filtro) throws Exception;

    public Usuario getUsuario(int id) throws Exception;

    public Usuario getUsuario(String nome) throws Exception;

    public Usuario isUsuarioValido(String login, String senha) throws Exception;
}

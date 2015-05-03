package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;

public interface IUsuarioService {

    public Boolean incluirUsuario(String nome, String usuario, String senha, Usuario usu) throws Exception;

    public Boolean alterarUsuario(Integer id, String nome, String usuario, String senha, Usuario usu, Usuario usuarioinclusao, Date dataInclusao) throws Exception;

    public void excluirUsuario(Integer id) throws Exception;

    public ArrayList<Usuario> getUsuarios() throws Exception;

    public Usuario getUsuario(int id) throws Exception;

    public Usuario isUsuarioValido(String login, String senha) throws Exception;

    public boolean validarUsuario(String nome, String usuario, String senha) throws Exception;
}

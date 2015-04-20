package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.IUsuarioService;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class UsuarioService implements IUsuarioService {

    private Date dataInclusao;
    private Date dataAlteracao;

    @Override
    public Boolean incluirUsuario(String nome, String usuario, String senha, Usuario usu) throws Exception {
        dataInclusao = new Date();

        ArrayList<String> lista = new ArrayList(8);
        String ret = new String();

        if (nome == null || nome.equalsIgnoreCase("")) {
            lista.add("Nome");
        }
        if (usuario == null || usuario.equalsIgnoreCase("")) {
            lista.add("Usuario");
        }
        if (senha == null || senha.equalsIgnoreCase("")) {
            lista.add("Senha");
        }

        if (lista.isEmpty()) {

            Usuario u = new Usuario();
            u.setNome(nome);
            u.setUsuario(usuario);
            u.setSenha(senha);
            u.setUsuarioinclusao(usu);
            u.setDatainclusao(dataInclusao);

            DAOFactory.getUsuarioDAO().incluirUsuario(u);
            JOptionPane.showMessageDialog(null, "Usuario Inlcuído com Sucesso!");

            return true;
        } else {
            for (String lista1 : lista) {
                ret = ret + lista1 + "\n";
            }
            JOptionPane.showMessageDialog(null, "Favor preencher os campos: \n" + ret);
            return false;
        }
    }

    @Override
    public Boolean alterarUsuario(Integer id, String nome, String usuario, String senha, Usuario usu, Usuario usuarioinclusao, Date dataInclusao) throws Exception {
        dataAlteracao = new Date();

        ArrayList<String> lista = new ArrayList(8);
        String ret = new String();

        if (nome == null || nome.equalsIgnoreCase("")) {
            lista.add("Nome");
        }
        if (usuario == null || usuario.equalsIgnoreCase("")) {
            lista.add("Usuario");
        }
        if (senha == null || senha.equalsIgnoreCase("")) {
            lista.add("Senha");
        }

        if (lista.isEmpty()) {

            Usuario u = new Usuario();
            u.setId(id);
            u.setNome(nome);
            u.setUsuario(usuario);
            u.setSenha(senha);
            u.setUsuarioalteracao(usu);
            u.setDataalteracao(dataAlteracao);
            u.setUsuarioinclusao(usuarioinclusao);
            u.setDatainclusao(dataInclusao);

            DAOFactory.getUsuarioDAO().alterarUsuario(u);
            JOptionPane.showMessageDialog(null, "Usuario Alterado com Sucesso!");

            return true;
        } else {
            for (String lista1 : lista) {
                ret = ret + lista1 + "\n";
            }
            JOptionPane.showMessageDialog(null, "Favor preencher os campos: \n" + ret);
            return false;
        }
    }

    @Override
    public void excluirUsuario(Integer id) throws Exception {
        DAOFactory.getUsuarioDAO().excluirUsuario(getUsuario(id));
        JOptionPane.showMessageDialog(null, "Usuario Excluído com Sucesso!");
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
        ArrayList<String> lista = new ArrayList<>(2);
        String ret = new String();

        if (login == null || login.equalsIgnoreCase("")) {
            lista.add("login");
        }
        if (senha == null || senha.equalsIgnoreCase("")) {
            lista.add("senha");
        }
        if (lista.isEmpty()) {
            ArrayList<Usuario> usuarios = getUsuarios();
            for (Usuario usuario : usuarios) {
                if (usuario.getUsuario().equals(login.toUpperCase()) && usuario.getSenha().equals(senha)) {
                    return usuario;
                }
            }
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!");
        } else {
            for (String lista1 : lista) {
                ret = ret + lista1 + "\n";
            }
            JOptionPane.showMessageDialog(null, "Favor preencher os campos: \n" + ret);
        }
        return null;
    }
}

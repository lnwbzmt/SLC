package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Pessoa;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;

public interface IPessoaService {

    public Boolean incluirPessoa(String nome, String cpf, String email, Usuario usuario) throws Exception;

    public Boolean alterarPessoa(Integer id, String nome, String cpf, String email, Usuario usuario, Date dataInclusao, Usuario usuarioInclusao) throws Exception;

    public void excluirPessoa(Integer id) throws Exception;

    public ArrayList<Pessoa> getPessoas() throws Exception;

    public Pessoa getPessoa(int id) throws Exception;

    public boolean validarPessoa(String nome, String cpf) throws Exception;

}

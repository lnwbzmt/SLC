package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Pessoa;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;

public interface IPessoaService {

    public void incluirPessoa(String nome, Integer cpf, String email, Usuario usuario) throws Exception;

    public void alterarPessoa(Integer id, String nome, Integer cpf, String email, Usuario usuario) throws Exception;

    public void excluirPessoa(Integer id) throws Exception;

    public ArrayList<Pessoa> getPessoas() throws Exception;

    public Pessoa getPessoa(int id) throws Exception;

}

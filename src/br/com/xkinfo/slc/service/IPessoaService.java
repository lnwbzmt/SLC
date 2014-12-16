package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Pessoa;
import java.util.ArrayList;

public interface IPessoaService {

    public void incluirPessoa(Pessoa pessoa) throws Exception;

    public void alterarPessoa(Pessoa pessoa) throws Exception;

    public void excluirPessoa(Pessoa pessoa) throws Exception;

    public ArrayList<Pessoa> getPessoas() throws Exception;

    public ArrayList<Pessoa> getPessoas(String filtro) throws Exception;

    public Pessoa getPessoa(int id) throws Exception;

    public Pessoa getPessoa(String nome) throws Exception;


}

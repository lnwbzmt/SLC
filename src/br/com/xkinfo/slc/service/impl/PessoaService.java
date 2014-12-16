package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.PessoaDAO;
import br.com.xkinfo.slc.modelo.Pessoa;
import br.com.xkinfo.slc.service.IPessoaService;
import java.util.ArrayList;

public class PessoaService implements IPessoaService {

    PessoaDAO pessoaDAO = new PessoaDAO();

    @Override
    public void incluirPessoa(Pessoa pessoa) throws Exception {
        pessoaDAO.incluirPessoa(pessoa);
    }

    @Override
    public void alterarPessoa(Pessoa pessoa) throws Exception {
        pessoaDAO.alterarPessoa(pessoa);
    }

    @Override
    public void excluirPessoa(Pessoa pessoa) throws Exception {
        pessoaDAO.excluirPessoa(pessoa);
    }

    @Override
    public ArrayList<Pessoa> getPessoas() throws Exception {
        return pessoaDAO.getPessoas();
    }

    @Override
    public ArrayList<Pessoa> getPessoas(String filtro) throws Exception {
        return pessoaDAO.getPessoas(filtro);
    }

    @Override
    public Pessoa getPessoa(int id) throws Exception {
        return pessoaDAO.getPessoa(id);
    }

    @Override
    public Pessoa getPessoa(String nome) throws Exception {
        return pessoaDAO.getPessoa(nome);
    }

  

}

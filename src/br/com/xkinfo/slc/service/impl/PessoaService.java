package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Pessoa;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.IPessoaService;
import java.util.ArrayList;
import java.util.Date;

public class PessoaService implements IPessoaService {
    
    private Date dataInclusao;
    private Date dataAlteracao;

    @Override
    public void incluirPessoa(String nome, Integer cpf, String email, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        pessoa.setEmail(email);
        pessoa.setUsuarioinclusao(usuario);
        pessoa.setDatainclusao(dataInclusao);
        
        DAOFactory.getPessoaDAO().incluirPessoa(pessoa);
    }

    @Override
    public void alterarPessoa(Integer id, String nome, Integer cpf, String email, Usuario usuario) throws Exception {
        dataAlteracao = new Date();
        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);
        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        pessoa.setEmail(email);
        pessoa.setUsuarioalteracao(usuario);
        pessoa.setDataalteracao(dataAlteracao);
        
        DAOFactory.getPessoaDAO().alterarPessoa(pessoa);
    }

    @Override
    public void excluirPessoa(Integer id) throws Exception {
        DAOFactory.getPessoaDAO().excluirPessoa(getPessoa(id));
    }

    @Override
    public ArrayList<Pessoa> getPessoas() throws Exception {
        return DAOFactory.getPessoaDAO().getPessoas();
    }

    @Override
    public Pessoa getPessoa(int id) throws Exception {
        return DAOFactory.getPessoaDAO().getPessoa(id);
    }

}

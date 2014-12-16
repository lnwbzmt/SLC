package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.PessoaUCDAO;
import br.com.xkinfo.slc.modelo.PessoaUC;
import br.com.xkinfo.slc.service.IPessoaUCService;
import java.util.ArrayList;

public class PessoaUCService implements IPessoaUCService {

    PessoaUCDAO pessoaUCDAO = new PessoaUCDAO();

    @Override
    public void incluirPessoaUC(PessoaUC pessoaUC) throws Exception {
        pessoaUCDAO.incluirPessoaUC(pessoaUC);
    }

    @Override
    public void alterarPessoaUC(PessoaUC pessoaUC) throws Exception {
        pessoaUCDAO.alterarPessoaUC(pessoaUC);
    }

    @Override
    public void excluirPessoaUC(PessoaUC pessoaUC) throws Exception {
        pessoaUCDAO.excluirPessoaUC(pessoaUC);
    }

    @Override
    public ArrayList<PessoaUC> getPessoaUCs() throws Exception {
        return pessoaUCDAO.getPessoaUCs();
    }

    @Override
    public ArrayList<PessoaUC> getPessoaUCs(String filtro) throws Exception {
        return pessoaUCDAO.getPessoaUCs(filtro);
    }

    @Override
    public PessoaUC getPessoaUC(int id) throws Exception {
        return pessoaUCDAO.getPessoaUC(id);
    }

    @Override
    public PessoaUC getPessoaUC(String nome) throws Exception {
        return pessoaUCDAO.getPessoaUC(nome);
    }

  

}

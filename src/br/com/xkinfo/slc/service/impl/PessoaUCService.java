package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.PessoaUCDAO;
import br.com.xkinfo.slc.modelo.PessoaUc;
import br.com.xkinfo.slc.service.IPessoaUCService;
import java.util.ArrayList;

public class PessoaUCService implements IPessoaUCService {

    PessoaUCDAO pessoaUCDAO = new PessoaUCDAO();

    @Override
    public void incluirPessoaUC(PessoaUc pessoaUC) throws Exception {
        pessoaUCDAO.incluirPessoaUC(pessoaUC);
    }

    @Override
    public void alterarPessoaUC(PessoaUc pessoaUC) throws Exception {
        pessoaUCDAO.alterarPessoaUC(pessoaUC);
    }

    @Override
    public void excluirPessoaUC(PessoaUc pessoaUC) throws Exception {
        pessoaUCDAO.excluirPessoaUC(pessoaUC);
    }

    @Override
    public ArrayList<PessoaUc> getPessoaUCs() throws Exception {
        return pessoaUCDAO.getPessoaUCs();
    }

    @Override
    public ArrayList<PessoaUc> getPessoaUCs(String filtro) throws Exception {
        return pessoaUCDAO.getPessoaUCs(filtro);
    }

    @Override
    public PessoaUc getPessoaUC(int id) throws Exception {
        return pessoaUCDAO.getPessoaUC(id);
    }

    @Override
    public PessoaUc getPessoaUC(String nome) throws Exception {
        return pessoaUCDAO.getPessoaUC(nome);
    }

  

}

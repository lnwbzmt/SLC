package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.PessoaUc;
import java.util.ArrayList;

public interface IPessoaUCDAO {

    public void incluirPessoaUC(PessoaUc pessoaUC) throws Exception;

    public void alterarPessoaUC(PessoaUc pessoaUC) throws Exception;

    public void excluirPessoaUC(PessoaUc pessoaUC) throws Exception;

    public ArrayList<PessoaUc> getPessoaUCs() throws Exception;

    public ArrayList<PessoaUc> getPessoaUCs(String filtro) throws Exception;

    public PessoaUc getPessoaUC(int id) throws Exception;

    public PessoaUc getPessoaUC(String nome) throws Exception;
}

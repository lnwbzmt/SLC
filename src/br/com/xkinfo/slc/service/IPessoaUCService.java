package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.PessoaUC;
import java.util.ArrayList;

public interface IPessoaUCService {

    public void incluirPessoaUC(PessoaUC pessoaUC) throws Exception;

    public void alterarPessoaUC(PessoaUC pessoaUC) throws Exception;

    public void excluirPessoaUC(PessoaUC pessoaUC) throws Exception;

    public ArrayList<PessoaUC> getPessoaUCs() throws Exception;

    public ArrayList<PessoaUC> getPessoaUCs(String filtro) throws Exception;

    public PessoaUC getPessoaUC(int id) throws Exception;

    public PessoaUC getPessoaUC(String nome) throws Exception;
}

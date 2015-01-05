package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Pessoa;
import br.com.xkinfo.slc.modelo.PessoaUc;
import br.com.xkinfo.slc.modelo.UnidadeConsumidora;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;

public interface IPessoaUCService {

    public void incluirPessoaUC(Pessoa prop, Pessoa inquilino, UnidadeConsumidora uc, Date entrada, Date saida, Usuario usuario) throws Exception;

    public void alterarPessoaUC(Integer id, Pessoa prop, Pessoa inquilino, UnidadeConsumidora uc, Date entrada, Date saida, Usuario usuario) throws Exception;

    public void excluirPessoaUC(Integer id) throws Exception;

    public ArrayList<PessoaUc> getPessoaUCs() throws Exception;

    public PessoaUc getPessoaUC(int id) throws Exception;

}

package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.SituacaoDAO;
import br.com.xkinfo.slc.modelo.Situacao;
import br.com.xkinfo.slc.service.ISituacaoService;
import java.util.ArrayList;

public class SituacaoService implements ISituacaoService {

    SituacaoDAO situacaoDAO = new SituacaoDAO();

    @Override
    public void incluirSituacao(Situacao situacao) throws Exception {
        situacaoDAO.incluirSituacao(situacao);
    }

    @Override
    public void alterarSituacao(Situacao situacao) throws Exception {
        situacaoDAO.alterarSituacao(situacao);
    }

    @Override
    public void excluirSituacao(Situacao situacao) throws Exception {
        situacaoDAO.excluirSituacao(situacao);
    }

    @Override
    public ArrayList<Situacao> getSituacoes() throws Exception {
        return situacaoDAO.getSituacoes();
    }

    @Override
    public ArrayList<Situacao> getSituacoes(String filtro) throws Exception {
        return situacaoDAO.getSituacoes(filtro);
    }

    @Override
    public Situacao getSituacao(int id) throws Exception {
        return situacaoDAO.getSituacao(id);
    }

    @Override
    public Situacao getSituacao(String nome) throws Exception {
        return situacaoDAO.getSituacao(nome);
    }

  

}

package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Situacao;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.ISituacaoService;
import java.util.ArrayList;
import java.util.Date;

public class SituacaoService implements ISituacaoService {
    
    private Date dataInclusao;
    private Date dataAlteracao;


    @Override
    public void incluirSituacao(Integer codigo, String descricao, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        Situacao situacao = new Situacao();
        situacao.setCodigo(codigo);
        situacao.setDescricao(descricao);
        situacao.setUsuarioinclusao(usuario);
        situacao.setDatainclusao(dataInclusao);
        
        DAOFactory.getSituacaoDAO().incluirSituacao(situacao);
    }

    @Override
    public void alterarSituacao(Integer id, Integer codigo, String descricao, Usuario usuario) throws Exception {
        dataAlteracao = new Date();
        Situacao situacao = new Situacao();
        situacao.setId(id);
        situacao.setCodigo(codigo);
        situacao.setDescricao(descricao);
        situacao.setUsuarioalteracao(usuario);
        situacao.setDataalteracao(dataAlteracao);
        
        DAOFactory.getSituacaoDAO().alterarSituacao(situacao);
    }

    @Override
    public void excluirSituacao(Integer id) throws Exception {
        DAOFactory.getSituacaoDAO().excluirSituacao(getSituacao(id));
    }

    @Override
    public ArrayList<Situacao> getSituacoes() throws Exception {
        return DAOFactory.getSituacaoDAO().getSituacoes();
    }

    @Override
    public Situacao getSituacao(int id) throws Exception {
        return DAOFactory.getSituacaoDAO().getSituacao(id);
    }

}

package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.Situacao;
import java.util.ArrayList;

public interface ISituacaoDAO {

    public void incluirSituacao(Situacao situacao) throws Exception;

    public void alterarSituacao(Situacao situacao) throws Exception;

    public void excluirSituacao(Situacao situacao) throws Exception;

    public ArrayList<Situacao> getSituacoes() throws Exception;

    public Situacao getSituacao(int id) throws Exception;

}

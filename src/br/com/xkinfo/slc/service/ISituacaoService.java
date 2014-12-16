package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Situacao;
import java.util.ArrayList;

public interface ISituacaoService {

    public void incluirSituacao(Situacao situacao) throws Exception;

    public void alterarSituacao(Situacao situacao) throws Exception;

    public void excluirSituacao(Situacao situacao) throws Exception;

    public ArrayList<Situacao> getSituacoes() throws Exception;

    public ArrayList<Situacao> getSituacoes(String filtro) throws Exception;

    public Situacao getSituacao(int id) throws Exception;

    public Situacao getSituacao(String nome) throws Exception;
}

package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Situacao;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;

public interface ISituacaoService {

    public void incluirSituacao(Integer codigo, String descricao, Usuario usuario) throws Exception;

    public void alterarSituacao(Integer id, Integer codigo, String descricao, Usuario usuario) throws Exception;

    public void excluirSituacao(Integer id) throws Exception;

    public ArrayList<Situacao> getSituacoes() throws Exception;

    public Situacao getSituacao(int id) throws Exception;

}

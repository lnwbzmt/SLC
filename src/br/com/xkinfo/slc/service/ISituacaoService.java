package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Situacao;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;

public interface ISituacaoService {

    public Boolean incluirSituacao(String codigo, String descricao, Usuario usuario) throws Exception;

    public Boolean alterarSituacao(Integer id, String codigo, String descricao, Usuario usuario, Usuario usuarioInclusao, Date dataInclusao) throws Exception;

    public void excluirSituacao(Integer id) throws Exception;

    public ArrayList<Situacao> getSituacoes() throws Exception;

    public Situacao getSituacao(int id) throws Exception;

    public boolean validarSituacao(String codigo, String descricao) throws Exception;

}

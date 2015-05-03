package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.modelo.UnidadeConsumidora;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;

public interface IUnidadeConsumidoraService {

    public UnidadeConsumidora incluirUnidadeConsumidora(Condominio condominio, String numero, Usuario usuario) throws Exception;

    public void alterarUnidadeConsumidora(Integer id, Condominio condominio, String numero, Usuario usuario, Date dataInclusao, Usuario usuarioInclusao) throws Exception;

    public void excluirUnidadeConsumidora(Integer id) throws Exception;

    public ArrayList<UnidadeConsumidora> getUnidadeConsumidoras() throws Exception;

    public UnidadeConsumidora getUnidadeConsumidora(int id) throws Exception;

    public boolean validarUnidadeConsumidora(Condominio condominio, String numero) throws Exception;
}

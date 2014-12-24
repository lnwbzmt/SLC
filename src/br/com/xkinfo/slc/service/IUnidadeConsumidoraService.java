package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.modelo.UnidadeConsumidora;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;

public interface IUnidadeConsumidoraService {

    public void incluirUnidadeConsumidora(Condominio condominio, Integer numero, Usuario usuario) throws Exception;

    public void alterarUnidadeConsumidora(Integer id, Condominio condominio, Integer numero, Usuario usuario) throws Exception;

    public void excluirUnidadeConsumidora(Integer id) throws Exception;

    public ArrayList<UnidadeConsumidora> getUnidadeConsumidoras() throws Exception;

    public UnidadeConsumidora getUnidadeConsumidora(int id) throws Exception;

}

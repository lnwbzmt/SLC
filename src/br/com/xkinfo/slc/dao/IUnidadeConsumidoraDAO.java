package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.UnidadeConsumidora;
import java.util.ArrayList;

public interface IUnidadeConsumidoraDAO {

    public UnidadeConsumidora incluirUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) throws Exception;

    public void alterarUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) throws Exception;

    public void excluirUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) throws Exception;

    public ArrayList<UnidadeConsumidora> getUnidadeConsumidoras() throws Exception;

    public UnidadeConsumidora getUnidadeConsumidora(int id) throws Exception;

}

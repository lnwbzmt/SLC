package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.UnidadeConsumidora;
import java.util.ArrayList;

public interface IUnidadeConsumidoraService {

    public void incluirUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) throws Exception;

    public void alterarUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) throws Exception;

    public void excluirUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) throws Exception;

    public ArrayList<UnidadeConsumidora> getUnidadeConsumidoras() throws Exception;

    public ArrayList<UnidadeConsumidora> getUnidadeConsumidoras(String filtro) throws Exception;

    public UnidadeConsumidora getUnidadeConsumidora(int id) throws Exception;

    public UnidadeConsumidora getUnidadeConsumidora(String nome) throws Exception;
}

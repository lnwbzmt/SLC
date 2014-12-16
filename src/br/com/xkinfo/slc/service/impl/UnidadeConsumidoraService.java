package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.UnidadeConsumidoraDAO;
import br.com.xkinfo.slc.modelo.UnidadeConsumidora;
import br.com.xkinfo.slc.service.IUnidadeConsumidoraService;
import java.util.ArrayList;

public class UnidadeConsumidoraService implements IUnidadeConsumidoraService {

    UnidadeConsumidoraDAO unidadeConsumidoraDAO = new UnidadeConsumidoraDAO();

    @Override
    public void incluirUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) throws Exception {
        unidadeConsumidoraDAO.incluirUnidadeConsumidora(unidadeConsumidora);
    }

    @Override
    public void alterarUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) throws Exception {
        unidadeConsumidoraDAO.alterarUnidadeConsumidora(unidadeConsumidora);
    }

    @Override
    public void excluirUnidadeConsumidora(UnidadeConsumidora unidadeConsumidora) throws Exception {
        unidadeConsumidoraDAO.excluirUnidadeConsumidora(unidadeConsumidora);
    }

    @Override
    public ArrayList<UnidadeConsumidora> getUnidadeConsumidoras() throws Exception {
        return unidadeConsumidoraDAO.getUnidadeConsumidoras();
    }

    @Override
    public ArrayList<UnidadeConsumidora> getUnidadeConsumidoras(String filtro) throws Exception {
        return unidadeConsumidoraDAO.getUnidadeConsumidoras(filtro);
    }

    @Override
    public UnidadeConsumidora getUnidadeConsumidora(int id) throws Exception {
        return unidadeConsumidoraDAO.getUnidadeConsumidora(id);
    }

    @Override
    public UnidadeConsumidora getUnidadeConsumidora(String nome) throws Exception {
        return unidadeConsumidoraDAO.getUnidadeConsumidora(nome);
    }

  

}

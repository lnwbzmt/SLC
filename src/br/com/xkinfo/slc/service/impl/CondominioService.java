package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.CondominioDAO;
import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.service.ICondominioService;
import java.util.ArrayList;

public class CondominioService implements ICondominioService {

    CondominioDAO condominioDAO = new CondominioDAO();

    @Override
    public void incluirCondominio(Condominio condominio) throws Exception {
        condominioDAO.incluirCondominio(condominio);
    }

    @Override
    public void alterarCondominio(Condominio condominio) throws Exception {
        condominioDAO.alterarCondominio(condominio);
    }

    @Override
    public void excluirCondominio(Condominio condominio) throws Exception {
        condominioDAO.excluirCondominio(condominio);
    }

    @Override
    public ArrayList<Condominio> getCondominios() throws Exception {
        return condominioDAO.getCondominios();
    }

    @Override
    public ArrayList<Condominio> getCondominios(String filtro) throws Exception {
        return condominioDAO.getCondominios(filtro);
    }

    @Override
    public Condominio getCondominio(int id) throws Exception {
        return condominioDAO.getCondominio(id);
    }

    @Override
    public Condominio getCondominio(String nome) throws Exception {
        return condominioDAO.getCondominio(nome);
    }

  

}

package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.dao.impl.CondominioDAO;


public class DAOFactory {

    private static final ICondominioDAO condominioDAO = new CondominioDAO();

    public static ICondominioDAO getCondominioDAO() {
        return condominioDAO;
    }

}

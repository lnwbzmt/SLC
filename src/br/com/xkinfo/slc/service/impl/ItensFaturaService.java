package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.ItensFaturaDAO;
import br.com.xkinfo.slc.modelo.ItensFatura;
import br.com.xkinfo.slc.service.IItensFaturaService;
import java.util.ArrayList;

public class ItensFaturaService implements IItensFaturaService {

    ItensFaturaDAO itensFaturaDAO = new ItensFaturaDAO();

    @Override
    public void incluirItensFatura(ItensFatura itensFatura) throws Exception {
        itensFaturaDAO.incluirItensFatura(itensFatura);
    }

    @Override
    public void alterarItensFatura(ItensFatura itensFatura) throws Exception {
        itensFaturaDAO.alterarItensFatura(itensFatura);
    }

    @Override
    public void excluirItensFatura(ItensFatura itensFatura) throws Exception {
        itensFaturaDAO.excluirItensFatura(itensFatura);
    }

    @Override
    public ArrayList<ItensFatura> getItensFaturas() throws Exception {
        return itensFaturaDAO.getItensFaturas();
    }

    @Override
    public ArrayList<ItensFatura> getItensFaturas(String filtro) throws Exception {
        return itensFaturaDAO.getItensFaturas(filtro);
    }

    @Override
    public ItensFatura getItensFatura(int id) throws Exception {
        return itensFaturaDAO.getItensFatura(id);
    }

    @Override
    public ItensFatura getItensFatura(String nome) throws Exception {
        return itensFaturaDAO.getItensFatura(nome);
    }

  

}

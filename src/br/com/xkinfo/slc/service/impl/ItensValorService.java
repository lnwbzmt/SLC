package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.ItensValorDAO;
import br.com.xkinfo.slc.modelo.ItensValor;
import br.com.xkinfo.slc.service.IItensValorService;
import java.util.ArrayList;

public class ItensValorService implements IItensValorService {

    ItensValorDAO itensValorDAO = new ItensValorDAO();

    @Override
    public void incluirItensValor(ItensValor itensValor) throws Exception {
        itensValorDAO.incluirItensValor(itensValor);
    }

    @Override
    public void alterarItensValor(ItensValor itensValor) throws Exception {
        itensValorDAO.alterarItensValor(itensValor);
    }

    @Override
    public void excluirItensValor(ItensValor itensValor) throws Exception {
        itensValorDAO.excluirItensValor(itensValor);
    }

    @Override
    public ArrayList<ItensValor> getItensValores() throws Exception {
        return itensValorDAO.getItensValors();
    }

    @Override
    public ArrayList<ItensValor> getItensValores(String filtro) throws Exception {
        return itensValorDAO.getItensValors(filtro);
    }

    @Override
    public ItensValor getItensValor(int id) throws Exception {
        return itensValorDAO.getItensValor(id);
    }

    @Override
    public ItensValor getItensValor(String nome) throws Exception {
        return itensValorDAO.getItensValor(nome);
    }

  

}

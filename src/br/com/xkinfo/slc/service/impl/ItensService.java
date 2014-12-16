package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.ItensDAO;
import br.com.xkinfo.slc.modelo.Itens;
import br.com.xkinfo.slc.service.IItensService;
import java.util.ArrayList;

public class ItensService implements IItensService {

    ItensDAO itensDAO = new ItensDAO();

    @Override
    public void incluirItem(Itens itens) throws Exception {
        itensDAO.incluirItem(itens);
    }

    @Override
    public void alterarItem(Itens itens) throws Exception {
        itensDAO.alterarItem(itens);
    }

    @Override
    public void excluirItem(Itens itens) throws Exception {
        itensDAO.excluirItem(itens);
    }

    @Override
    public ArrayList<Itens> getItens() throws Exception {
        return itensDAO.getItens();
    }

    @Override
    public ArrayList<Itens> getItens(String filtro) throws Exception {
        return itensDAO.getItens(filtro);
    }

    @Override
    public Itens getItem(int id) throws Exception {
        return itensDAO.getItem(id);
    }

    @Override
    public Itens getItem(String nome) throws Exception {
        return itensDAO.getItem(nome);
    }
}

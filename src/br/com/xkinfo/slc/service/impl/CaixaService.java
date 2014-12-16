package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.CaixaDAO;
import br.com.xkinfo.slc.modelo.Caixa;
import br.com.xkinfo.slc.service.ICaixaService;
import java.util.ArrayList;

public class CaixaService implements ICaixaService {

    CaixaDAO caixaDAO = new CaixaDAO();

    @Override
    public void incluirCaixa(Caixa caixa) throws Exception {
        caixaDAO.incluirCaixa(caixa);
    }

    @Override
    public void alterarCaixa(Caixa caixa) throws Exception {
        caixaDAO.alterarCaixa(caixa);
    }

    @Override
    public void excluirCaixa(Caixa caixa) throws Exception {
        caixaDAO.excluirCaixa(caixa);
    }

    @Override
    public ArrayList<Caixa> getCaixas() throws Exception {
        return caixaDAO.getCaixas();
    }

    @Override
    public ArrayList<Caixa> getCaixas(String filtro) throws Exception {
        return caixaDAO.getCaixas(filtro);
    }

    @Override
    public Caixa getCaixa(int id) throws Exception {
        return caixaDAO.getCaixa(id);
    }

    @Override
    public Caixa getCaixa(String nome) throws Exception {
        return caixaDAO.getCaixa(nome);
    }

  

}

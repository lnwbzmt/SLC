package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.FaturaDAO;
import br.com.xkinfo.slc.modelo.Fatura;
import br.com.xkinfo.slc.service.IFaturaService;
import java.util.ArrayList;

public class FaturaService implements IFaturaService {

    FaturaDAO faturaDAO = new FaturaDAO();

    @Override
    public void incluirFatura(Fatura fatura) throws Exception {
        faturaDAO.incluirFatura(fatura);
    }

    @Override
    public void alterarFatura(Fatura fatura) throws Exception {
        faturaDAO.alterarFatura(fatura);
    }

    @Override
    public void excluirFatura(Fatura fatura) throws Exception {
        faturaDAO.excluirFatura(fatura);
    }

    @Override
    public ArrayList<Fatura> getFaturas() throws Exception {
        return faturaDAO.getFaturas();
    }

    @Override
    public ArrayList<Fatura> getFaturas(String filtro) throws Exception {
        return faturaDAO.getFaturas(filtro);
    }

    @Override
    public Fatura getFatura(int id) throws Exception {
        return faturaDAO.getFatura(id);
    }

    @Override
    public Fatura getFatura(String nome) throws Exception {
        return faturaDAO.getFatura(nome);
    }

  

}

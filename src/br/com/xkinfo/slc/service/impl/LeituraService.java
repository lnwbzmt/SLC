package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.LeituraDAO;
import br.com.xkinfo.slc.modelo.Leitura;
import br.com.xkinfo.slc.service.ILeituraService;
import java.util.ArrayList;

public class LeituraService implements ILeituraService {

    LeituraDAO leituraDAO = new LeituraDAO();

    @Override
    public void incluirLeitura(Leitura leitura) throws Exception {
        leituraDAO.incluirLeitura(leitura);
    }

    @Override
    public void alterarLeitura(Leitura leitura) throws Exception {
        leituraDAO.alterarLeitura(leitura);
    }

    @Override
    public void excluirLeitura(Leitura leitura) throws Exception {
        leituraDAO.excluirLeitura(leitura);
    }

    @Override
    public ArrayList<Leitura> getLeituras() throws Exception {
        return leituraDAO.getLeituras();
    }

    @Override
    public ArrayList<Leitura> getLeituras(String filtro) throws Exception {
        return leituraDAO.getLeituras(filtro);
    }

    @Override
    public Leitura getLeitura(int id) throws Exception {
        return leituraDAO.getLeitura(id);
    }

    @Override
    public Leitura getLeitura(String nome) throws Exception {
        return leituraDAO.getLeitura(nome);
    }

  

}

package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.HidrometroDAO;
import br.com.xkinfo.slc.modelo.Hidrometro;
import br.com.xkinfo.slc.service.IHidrometroService;
import java.util.ArrayList;

public class HidrometroService implements IHidrometroService {

    HidrometroDAO hidrometroDAO = new HidrometroDAO();

    @Override
    public void incluirHidrometro(Hidrometro hidrometro) throws Exception {
        hidrometroDAO.incluirHidrometro(hidrometro);
    }

    @Override
    public void alterarHidrometro(Hidrometro hidrometro) throws Exception {
        hidrometroDAO.alterarHidrometro(hidrometro);
    }

    @Override
    public void excluirHidrometro(Hidrometro hidrometro) throws Exception {
        hidrometroDAO.excluirHidrometro(hidrometro);
    }

    @Override
    public ArrayList<Hidrometro> getHidrometros() throws Exception {
        return hidrometroDAO.getHidrometros();
    }

    @Override
    public ArrayList<Hidrometro> getHidrometros(String filtro) throws Exception {
        return hidrometroDAO.getHidrometros(filtro);
    }

    @Override
    public Hidrometro getHidrometro(int id) throws Exception {
        return hidrometroDAO.getHidrometro(id);
    }

    @Override
    public Hidrometro getHidrometro(String nome) throws Exception {
        return hidrometroDAO.getHidrometro(nome);
    }

  

}

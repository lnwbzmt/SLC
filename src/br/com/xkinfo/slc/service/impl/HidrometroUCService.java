package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.HidrometroUCDAO;
import br.com.xkinfo.slc.modelo.HidrometroUC;
import br.com.xkinfo.slc.service.IHidrometroUCService;
import java.util.ArrayList;

public class HidrometroUCService implements IHidrometroUCService {

    HidrometroUCDAO hidrometroUCDAO = new HidrometroUCDAO();

    @Override
    public void incluirHidrometroUC(HidrometroUC hidrometroUC) throws Exception {
        hidrometroUCDAO.incluirHidrometroUC(hidrometroUC);
    }

    @Override
    public void alterarHidrometroUC(HidrometroUC hidrometroUC) throws Exception {
        hidrometroUCDAO.alterarHidrometroUC(hidrometroUC);
    }

    @Override
    public void excluirHidrometroUC(HidrometroUC hidrometroUC) throws Exception {
        hidrometroUCDAO.excluirHidrometroUC(hidrometroUC);
    }

    @Override
    public ArrayList<HidrometroUC> getHidrometroUCs() throws Exception {
        return hidrometroUCDAO.getHidrometroUCs();
    }

    @Override
    public ArrayList<HidrometroUC> getHidrometroUCs(String filtro) throws Exception {
        return hidrometroUCDAO.getHidrometroUCs(filtro);
    }

    @Override
    public HidrometroUC getHidrometroUC(int id) throws Exception {
        return hidrometroUCDAO.getHidrometroUC(id);
    }

    @Override
    public HidrometroUC getHidrometroUC(String nome) throws Exception {
        return hidrometroUCDAO.getHidrometroUC(nome);
    }

  

}

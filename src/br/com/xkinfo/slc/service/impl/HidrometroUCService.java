package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.HidrometroUCDAO;
import br.com.xkinfo.slc.modelo.HidrometroUc;
import br.com.xkinfo.slc.service.IHidrometroUCService;
import java.util.ArrayList;

public class HidrometroUCService implements IHidrometroUCService {

    HidrometroUCDAO hidrometroUCDAO = new HidrometroUCDAO();

    @Override
    public void incluirHidrometroUC(HidrometroUc hidrometroUC) throws Exception {
        hidrometroUCDAO.incluirHidrometroUC(hidrometroUC);
    }

    @Override
    public void alterarHidrometroUC(HidrometroUc hidrometroUC) throws Exception {
        hidrometroUCDAO.alterarHidrometroUC(hidrometroUC);
    }

    @Override
    public void excluirHidrometroUC(HidrometroUc hidrometroUC) throws Exception {
        hidrometroUCDAO.excluirHidrometroUC(hidrometroUC);
    }

    @Override
    public ArrayList<HidrometroUc> getHidrometroUCs() throws Exception {
        return hidrometroUCDAO.getHidrometroUCs();
    }

    @Override
    public ArrayList<HidrometroUc> getHidrometroUCs(String filtro) throws Exception {
        return hidrometroUCDAO.getHidrometroUCs(filtro);
    }

    @Override
    public HidrometroUc getHidrometroUC(int id) throws Exception {
        return hidrometroUCDAO.getHidrometroUC(id);
    }

    @Override
    public HidrometroUc getHidrometroUC(String nome) throws Exception {
        return hidrometroUCDAO.getHidrometroUC(nome);
    }

  

}

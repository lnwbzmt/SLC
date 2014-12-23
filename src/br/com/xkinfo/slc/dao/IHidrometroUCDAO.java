package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.HidrometroUc;
import java.util.ArrayList;

public interface IHidrometroUCDAO {

    public void incluirHidrometroUC(HidrometroUc hidrometroUC) throws Exception;

    public void alterarHidrometroUC(HidrometroUc hidrometroUC) throws Exception;

    public void excluirHidrometroUC(HidrometroUc hidrometroUC) throws Exception;

    public ArrayList<HidrometroUc> getHidrometroUCs() throws Exception;

    public ArrayList<HidrometroUc> getHidrometroUCs(String filtro) throws Exception;

    public HidrometroUc getHidrometroUC(int id) throws Exception;

    public HidrometroUc getHidrometroUC(String nome) throws Exception;
}

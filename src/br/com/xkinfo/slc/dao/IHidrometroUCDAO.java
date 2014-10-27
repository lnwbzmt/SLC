package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.HidrometroUC;
import java.util.ArrayList;

public interface IHidrometroUCDAO {

    public void incluirHidrometroUC(HidrometroUC hidrometroUC) throws Exception;

    public void alterarHidrometroUC(HidrometroUC hidrometroUC) throws Exception;

    public void excluirHidrometroUC(HidrometroUC hidrometroUC) throws Exception;

    public ArrayList<HidrometroUC> getHidrometroUCs() throws Exception;

    public ArrayList<HidrometroUC> getHidrometroUCs(String filtro) throws Exception;

    public HidrometroUC getHidrometroUC(int id) throws Exception;

    public HidrometroUC getHidrometroUC(String nome) throws Exception;
}

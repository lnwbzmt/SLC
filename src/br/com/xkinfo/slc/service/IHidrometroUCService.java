package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Hidrometro;
import br.com.xkinfo.slc.modelo.HidrometroUc;
import br.com.xkinfo.slc.modelo.UnidadeConsumidora;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;

public interface IHidrometroUCService {

    public void incluirHidrometroUC(UnidadeConsumidora uc, Hidrometro hidro, Date dataInstalacao, Date dataRetirada, Integer ultimaLeitura,
            Date dataUltimaLeitura, Usuario usuario) throws Exception;

    public void alterarHidrometroUC(Integer id, UnidadeConsumidora uc, Hidrometro hidro, Date dataInstalacao, Date dataRetirada, Integer ultimaLeitura,
            Date dataUltimaLeitura, Usuario usuario) throws Exception;

    public void excluirHidrometroUC(Integer id) throws Exception;

    public ArrayList<HidrometroUc> getHidrometroUCs() throws Exception;

    public HidrometroUc getHidrometroUC(int id) throws Exception;

    public boolean validarHidrometroUC(UnidadeConsumidora uc, Hidrometro hidro) throws Exception;
}

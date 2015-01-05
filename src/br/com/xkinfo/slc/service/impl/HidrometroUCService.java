package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Hidrometro;
import br.com.xkinfo.slc.modelo.HidrometroUc;
import br.com.xkinfo.slc.modelo.UnidadeConsumidora;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.IHidrometroUCService;
import java.util.ArrayList;
import java.util.Date;

public class HidrometroUCService implements IHidrometroUCService {

    private Date dataInclusao;
    private Date dataAlteracao;

    @Override
    public void incluirHidrometroUC(UnidadeConsumidora uc, Hidrometro hidro, Date dataInstalacao, Date dataRetirada, Integer ultimaLeitura,
            Date dataUltimaLeitura, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        HidrometroUc hidroUc = new HidrometroUc();
        hidroUc.setUnidadeconsumidora(uc);
        hidroUc.setHidrometro(hidro);
        hidroUc.setDatainstalacao(dataInstalacao);
        hidroUc.setDataretirada(dataRetirada);
        hidroUc.setUltimaleitura(ultimaLeitura);
        hidroUc.setDataultimaleitura(dataUltimaLeitura);
        hidroUc.setUsuarioinclusao(usuario);
        hidroUc.setDatainclusao(dataInclusao);

        DAOFactory.getHidrometroUCDAO().incluirHidrometroUC(hidroUc);
    }

    @Override
    public void alterarHidrometroUC(Integer id, UnidadeConsumidora uc, Hidrometro hidro, Date dataInstalacao, Date dataRetirada, Integer ultimaLeitura,
            Date dataUltimaLeitura, Usuario usuario) throws Exception {
        dataAlteracao = new Date();
        HidrometroUc hidroUc = new HidrometroUc();
        hidroUc.setId(id);
        hidroUc.setUnidadeconsumidora(uc);
        hidroUc.setHidrometro(hidro);
        hidroUc.setDatainstalacao(dataInstalacao);
        hidroUc.setDataretirada(dataRetirada);
        hidroUc.setUltimaleitura(ultimaLeitura);
        hidroUc.setDataultimaleitura(dataUltimaLeitura);
        hidroUc.setUsuarioalteracao(usuario);
        hidroUc.setDataalteracao(dataAlteracao);

        DAOFactory.getHidrometroUCDAO().alterarHidrometroUC(hidroUc);
    }

    @Override
    public void excluirHidrometroUC(Integer id) throws Exception {
        DAOFactory.getHidrometroUCDAO().excluirHidrometroUC(getHidrometroUC(id));
    }

    @Override
    public ArrayList<HidrometroUc> getHidrometroUCs() throws Exception {
        return DAOFactory.getHidrometroUCDAO().getHidrometroUCs();
    }

    @Override
    public HidrometroUc getHidrometroUC(int id) throws Exception {
        return DAOFactory.getHidrometroUCDAO().getHidrometroUC(id);
    }
}

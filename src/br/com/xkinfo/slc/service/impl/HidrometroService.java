package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Hidrometro;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.IHidrometroService;
import java.util.ArrayList;
import java.util.Date;

public class HidrometroService implements IHidrometroService {

    private Date dataInclusao;
    private Date dataAlteracao;

    @Override
    public void incluirHidrometro(String serie, Date dataAquisicao, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        Hidrometro hidro = new Hidrometro();
        hidro.setNrserie(serie);
        hidro.setDataaquisicao(dataAquisicao);
        hidro.setUsuarioinclusao(usuario);
        hidro.setDatainclusao(dataInclusao);
        
        DAOFactory.getHidrometroDAO().incluirHidrometro(hidro);
    }

    @Override
    public void alterarHidrometro(Integer id, String serie, Date dataAquisicao, Usuario usuario) throws Exception {
        dataAlteracao = new Date();
        Hidrometro hidro = new Hidrometro();
        hidro.setId(id);
        hidro.setNrserie(serie);
        hidro.setDataaquisicao(dataAquisicao);
        hidro.setUsuarioalteracao(usuario);
        hidro.setDataalteracao(dataAlteracao);
        
        DAOFactory.getHidrometroDAO().alterarHidrometro(hidro);
    }

    @Override
    public void excluirHidrometro(Integer id) throws Exception {
        DAOFactory.getHidrometroDAO().excluirHidrometro(getHidrometro(id));
    }

    @Override
    public ArrayList<Hidrometro> getHidrometros() throws Exception {
        return DAOFactory.getHidrometroDAO().getHidrometros();
    }

    @Override
    public ArrayList<Hidrometro> getHidrometros(String serie) throws Exception {
        return DAOFactory.getHidrometroDAO().getHidrometros(serie);
    }

    @Override
    public Hidrometro getHidrometro(int id) throws Exception {
        return DAOFactory.getHidrometroDAO().getHidrometro(id);
    }

    @Override
    public ArrayList<Hidrometro> getHidrometros(Date dataAquisicao) throws Exception {
        return DAOFactory.getHidrometroDAO().getHidrometros(dataAquisicao);
    }

}

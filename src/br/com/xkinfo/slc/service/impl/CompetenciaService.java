package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Competencia;
import br.com.xkinfo.slc.modelo.Situacao;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.ICompetenciaService;
import java.util.ArrayList;
import java.util.Date;

public class CompetenciaService implements ICompetenciaService {

    private Date dataInclusao;
    private Date dataAlterecao;

    @Override
    public void incluirCompetencia(Date competencia, Situacao situacao, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        Competencia comp = new Competencia();
        comp.setCompetencia(competencia);
        comp.setSituacao(situacao);
        comp.setUsuarioinclusao(usuario);
        comp.setDatainclusao(dataInclusao);
        DAOFactory.getCompetenciaDAO().incluirCompetencia(comp);
    }

    @Override
    public void alterarCompetencia(Integer id, Date competencia, Situacao situacao, Usuario usuario) throws Exception {
        dataAlterecao = new Date();
        Competencia comp = new Competencia();
        comp.setId(id);
        comp.setCompetencia(competencia);
        comp.setSituacao(situacao);
        comp.setUsuarioalteracao(usuario);
        comp.setDataalteracao(dataAlterecao);
        DAOFactory.getCompetenciaDAO().alterarCompetencia(comp);
    }

    @Override
    public void excluirCompetencia(Integer id) throws Exception {
        DAOFactory.getCompetenciaDAO().excluirCompetencia(getCompetencia(id));
    }

    @Override
    public ArrayList<Competencia> getCompetencias() throws Exception {
        return DAOFactory.getCompetenciaDAO().getCompetencias();
    }

    @Override
    public Competencia getCompetencia(Integer id) throws Exception {
        return DAOFactory.getCompetenciaDAO().getCompetencia(id);
    }

}

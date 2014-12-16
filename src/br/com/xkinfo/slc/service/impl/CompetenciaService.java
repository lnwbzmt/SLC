package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.CompetenciaDAO;
import br.com.xkinfo.slc.modelo.Competencia;
import br.com.xkinfo.slc.service.ICompetenciaService;
import java.util.ArrayList;

public class CompetenciaService implements ICompetenciaService {

    CompetenciaDAO competenciaDAO = new CompetenciaDAO();

    @Override
    public void incluirCompetencia(Competencia competencia) throws Exception {
        competenciaDAO.incluirCompetencia(competencia);
    }

    @Override
    public void alterarCompetencia(Competencia competencia) throws Exception {
        competenciaDAO.alterarCompetencia(competencia);
    }

    @Override
    public void excluirCompetencia(Competencia competencia) throws Exception {
        competenciaDAO.excluirCompetencia(competencia);
    }

    @Override
    public ArrayList<Competencia> getCompetencias() throws Exception {
        return competenciaDAO.getCompetencias();
    }

    @Override
    public ArrayList<Competencia> getCompetencias(String filtro) throws Exception {
        return competenciaDAO.getCompetencias(filtro);
    }

    @Override
    public Competencia getCompetencia(int id) throws Exception {
        return competenciaDAO.getCompetencia(id);
    }

    @Override
    public Competencia getCompetencia(String nome) throws Exception {
        return competenciaDAO.getCompetencia(nome);
    }

  

}

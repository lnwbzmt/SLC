package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.Competencia;
import java.util.ArrayList;
import java.util.Date;

public interface ICompetenciaDAO {

    public void incluirCompetencia(Competencia competencia) throws Exception;

    public void alterarCompetencia(Competencia competencia) throws Exception;

    public void excluirCompetencia(Competencia competencia) throws Exception;

    public ArrayList<Competencia> getCompetencias() throws Exception;

    public Competencia getCompetencia(int id) throws Exception;

}

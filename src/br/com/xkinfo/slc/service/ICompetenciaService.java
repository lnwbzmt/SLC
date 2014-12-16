package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Competencia;
import java.util.ArrayList;

public interface ICompetenciaService {

    public void incluirCompetencia(Competencia competencia) throws Exception;

    public void alterarCompetencia(Competencia competencia) throws Exception;

    public void excluirCompetencia(Competencia competencia) throws Exception;

    public ArrayList<Competencia> getCompetencias() throws Exception;

    public ArrayList<Competencia> getCompetencias(String filtro) throws Exception;

    public Competencia getCompetencia(int id) throws Exception;

    public Competencia getCompetencia(String nome) throws Exception;
}

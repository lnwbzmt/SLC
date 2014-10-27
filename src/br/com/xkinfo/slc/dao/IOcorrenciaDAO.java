package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.Ocorrencia;
import java.util.ArrayList;

public interface IOcorrenciaDAO {

    public void incluirOcorrencia(Ocorrencia ocorrencia) throws Exception;

    public void alterarOcorrencia(Ocorrencia ocorrencia) throws Exception;

    public void excluirOcorrencia(Ocorrencia ocorrencia) throws Exception;

    public ArrayList<Ocorrencia> getOcorrencias() throws Exception;

    public ArrayList<Ocorrencia> getOcorrencias(String filtro) throws Exception;

    public Ocorrencia getOcorrencia(int id) throws Exception;

    public Ocorrencia getOcorrencia(String nome) throws Exception;
}

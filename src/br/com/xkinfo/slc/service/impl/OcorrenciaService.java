package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.impl.OcorrenciaDAO;
import br.com.xkinfo.slc.modelo.Ocorrencia;
import br.com.xkinfo.slc.service.IOcorrenciaService;
import java.util.ArrayList;

public class OcorrenciaService implements IOcorrenciaService {

    OcorrenciaDAO ocorrenciaDAO = new OcorrenciaDAO();

    @Override
    public void incluirOcorrencia(Ocorrencia ocorrencia) throws Exception {
        ocorrenciaDAO.incluirOcorrencia(ocorrencia);
    }

    @Override
    public void alterarOcorrencia(Ocorrencia ocorrencia) throws Exception {
        ocorrenciaDAO.alterarOcorrencia(ocorrencia);
    }

    @Override
    public void excluirOcorrencia(Ocorrencia ocorrencia) throws Exception {
        ocorrenciaDAO.excluirOcorrencia(ocorrencia);
    }

    @Override
    public ArrayList<Ocorrencia> getOcorrencias() throws Exception {
        return ocorrenciaDAO.getOcorrencias();
    }

    @Override
    public ArrayList<Ocorrencia> getOcorrencias(String filtro) throws Exception {
        return ocorrenciaDAO.getOcorrencias(filtro);
    }

    @Override
    public Ocorrencia getOcorrencia(int id) throws Exception {
        return ocorrenciaDAO.getOcorrencia(id);
    }

    @Override
    public Ocorrencia getOcorrencia(String nome) throws Exception {
        return ocorrenciaDAO.getOcorrencia(nome);
    }

  

}

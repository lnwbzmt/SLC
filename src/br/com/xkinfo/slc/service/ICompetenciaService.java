package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Competencia;
import br.com.xkinfo.slc.modelo.Situacao;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;

public interface ICompetenciaService {

    public Boolean incluirCompetencia(Date competencia, Situacao situacao, Usuario usuario) throws Exception;

    public Boolean alterarCompetencia(Integer id, Date competencia, Situacao situacao, Usuario usuario, Usuario usuarioInclusao, Date dataInclusao) throws Exception;

    public void excluirCompetencia(Integer id) throws Exception;

    public ArrayList<Competencia> getCompetencias() throws Exception;

    public Competencia getCompetencia(Integer id) throws Exception;

    public boolean validarCompetencia(Date competencia, Situacao situacao) throws Exception;

}

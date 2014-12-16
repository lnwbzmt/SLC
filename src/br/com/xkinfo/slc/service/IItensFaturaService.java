package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.ItensFatura;
import java.util.ArrayList;

public interface IItensFaturaService {

    public void incluirItensFatura(ItensFatura itensFatura) throws Exception;

    public void alterarItensFatura(ItensFatura itensFatura) throws Exception;

    public void excluirItensFatura(ItensFatura itensFatura) throws Exception;

    public ArrayList<ItensFatura> getItensFaturas() throws Exception;

    public ArrayList<ItensFatura> getItensFaturas(String filtro) throws Exception;

    public ItensFatura getItensFatura(int id) throws Exception;

    public ItensFatura getItensFatura(String nome) throws Exception;
}

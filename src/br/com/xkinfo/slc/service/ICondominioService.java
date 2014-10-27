package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Condominio;
import java.util.ArrayList;

public interface ICondominioService {

    public void incluirCondominio(Condominio condominio) throws Exception;

    public void alterarCondominio(Condominio condominio) throws Exception;

    public void excluirCondominio(Condominio condominio) throws Exception;

    public ArrayList<Condominio> getCondominios() throws Exception;

    public ArrayList<Condominio> getCondominios(String filtro) throws Exception;

    public Condominio getCondominio(int id) throws Exception;

    public Condominio getCondominio(String nome) throws Exception;
}

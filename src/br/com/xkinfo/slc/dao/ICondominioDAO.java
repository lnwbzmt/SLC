package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.Condominio;
import java.util.ArrayList;

public interface ICondominioDAO {

    public void incluirCondominio(Condominio condominio) throws Exception;

    public void alterarCondominio(Condominio condominio) throws Exception;

    public void excluirCondominio(Condominio condominio) throws Exception;

    public ArrayList<Condominio> getCondominios() throws Exception;

    public ArrayList<Condominio> getCondominios(String nome) throws Exception;

    public Condominio getCondominio(Integer id) throws Exception;

    public Condominio getCondominioCnpj(Integer cnpj) throws Exception;
}

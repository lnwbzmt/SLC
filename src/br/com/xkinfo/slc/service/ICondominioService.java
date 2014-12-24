package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;

public interface ICondominioService {

    public void incluirCondominio(String nome, Integer cnpj,String endereco, Integer numero, String complemento, String bairro,
            String cidade, String estado, String sigla, String email, Usuario usuario) throws Exception;

    public void alterarCondominio(Integer id, String nome, Integer cnpj,String endereco, Integer numero, String complemento, String bairro,
            String cidade, String estado, String sigla, String email, Usuario usuario) throws Exception;

    public void excluirCondominio(Integer id) throws Exception;

    public ArrayList<Condominio> getCondominios() throws Exception;

    public ArrayList<Condominio> getCondominios(String nome) throws Exception;
    
    public Condominio getCondominioCnpj(Integer cnpj) throws Exception;

    public Condominio getCondominio(int id) throws Exception;

}

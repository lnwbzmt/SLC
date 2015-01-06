package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;

public interface ICondominioService {

    public void incluirCondominio(String nome, String cnpj,String endereco, String numero, String complemento, String bairro,
            String cidade, String estado, String sigla, String email, Usuario usuario) throws Exception;

    public void alterarCondominio(Integer id, String nome, String cnpj,String endereco, String numero, String complemento, String bairro,
            String cidade, String estado, String sigla, String email, Usuario usuario) throws Exception;

    public void excluirCondominio(Integer id) throws Exception;

    public ArrayList<Condominio> getCondominios() throws Exception;

    public Condominio getCondominio(Integer id) throws Exception;

}

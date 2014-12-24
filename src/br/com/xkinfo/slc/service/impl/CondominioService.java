package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.ICondominioService;
import java.util.ArrayList;
import java.util.Date;

public class CondominioService implements ICondominioService {
    
    private Date dataInclusao;
    private Date dataAlteracao;

    @Override
    public void incluirCondominio(String nome, Integer cnpj, String endereco, Integer numero, String complemento, String bairro,
            String cidade, String estado, String sigla, String email, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        Condominio cond = new Condominio();
        cond.setNome(nome);
        cond.setCnpj(cnpj);
        cond.setEndereco(endereco);
        cond.setNumero(numero);
        cond.setComplemento(complemento);
        cond.setBairro(bairro);
        cond.setCidade(cidade);
        cond.setEstado(estado);
        cond.setSigla(sigla);
        cond.setEmail(email);
        cond.setUsuarioinclusao(usuario);
        cond.setDatainclusao(dataInclusao);
        
        DAOFactory.getCondominioDAO().incluirCondominio(cond);
    }

    @Override
    public void alterarCondominio(Integer id, String nome, Integer cnpj, String endereco, Integer numero, String complemento, String bairro,
            String cidade, String estado, String sigla, String email, Usuario usuario) throws Exception {
        dataAlteracao = new Date();
        Condominio cond = new Condominio();
        cond.setId(id);
        cond.setNome(nome);
        cond.setCnpj(cnpj);
        cond.setEndereco(endereco);
        cond.setNumero(numero);
        cond.setComplemento(complemento);
        cond.setBairro(bairro);
        cond.setCidade(cidade);
        cond.setEstado(estado);
        cond.setSigla(sigla);
        cond.setEmail(email);
        cond.setUsuarioalteracao(usuario);
        cond.setDataalteracao(dataAlteracao);
                
        DAOFactory.getCondominioDAO().alterarCondominio(cond);
    }

    @Override
    public void excluirCondominio(Integer id) throws Exception {
        DAOFactory.getCondominioDAO().excluirCondominio(getCondominio(id));
    }

    @Override
    public ArrayList<Condominio> getCondominios() throws Exception {
        return DAOFactory.getCondominioDAO().getCondominios();
    }

    @Override
    public ArrayList<Condominio> getCondominios(String nome) throws Exception {
        return DAOFactory.getCondominioDAO().getCondominios(nome);
    }

    @Override
    public Condominio getCondominio(int id) throws Exception {
        return DAOFactory.getCondominioDAO().getCondominio(id);
    }

    @Override
    public Condominio getCondominioCnpj(Integer cnpj) throws Exception {
        return DAOFactory.getCondominioDAO().getCondominioCnpj(cnpj);
    }

}

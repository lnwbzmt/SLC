package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.Caixa;
import java.util.ArrayList;

public interface ICaixaDAO {

    public void incluirCaixa(Caixa caixa) throws Exception;

    public void alterarCaixa(Caixa caixa) throws Exception;

    public void excluirCaixa(Caixa caixa) throws Exception;

    public ArrayList<Caixa> getCaixas() throws Exception;

    public ArrayList<Caixa> getCaixas(String filtro) throws Exception;

    public Caixa getCaixa(int id) throws Exception;

    public Caixa getCaixa(String nome) throws Exception;
}

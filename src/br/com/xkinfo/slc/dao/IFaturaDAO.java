package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.Fatura;
import java.util.ArrayList;

public interface IFaturaDAO {

    public void incluirFatura(Fatura fatura) throws Exception;

    public void alterarFatura(Fatura fatura) throws Exception;

    public void excluirFatura(Fatura fatura) throws Exception;

    public ArrayList<Fatura> getFaturas() throws Exception;

    public ArrayList<Fatura> getFaturas(String filtro) throws Exception;

    public Fatura getFatura(int id) throws Exception;

    public Fatura getFatura(String nome) throws Exception;
}

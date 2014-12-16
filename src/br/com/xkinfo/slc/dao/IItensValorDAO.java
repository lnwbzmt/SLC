package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.ItensValor;
import java.util.ArrayList;

public interface IItensValorDAO {

    public void incluirItensValor(ItensValor itensValor) throws Exception;

    public void alterarItensValor(ItensValor itensValor) throws Exception;

    public void excluirItensValor(ItensValor itensValor) throws Exception;

    public ArrayList<ItensValor> getItensValors() throws Exception;

    public ArrayList<ItensValor> getItensValors(String filtro) throws Exception;

    public ItensValor getItensValor(int id) throws Exception;

    public ItensValor getItensValor(String nome) throws Exception;
}

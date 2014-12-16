package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.ItensValor;
import java.util.ArrayList;

public interface IItensValorService {

    public void incluirItensValor(ItensValor itensValor) throws Exception;

    public void alterarItensValor(ItensValor itensValor) throws Exception;

    public void excluirItensValor(ItensValor itensValor) throws Exception;

    public ArrayList<ItensValor> getItensValores() throws Exception;

    public ArrayList<ItensValor> getItensValores(String filtro) throws Exception;

    public ItensValor getItensValor(int id) throws Exception;

    public ItensValor getItensValor(String nome) throws Exception;
}

package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Itens;
import java.util.ArrayList;

public interface IItensService {

    public void incluirItem(Itens itens) throws Exception;

    public void alterarItem(Itens itens) throws Exception;

    public void excluirItem(Itens itens) throws Exception;

    public ArrayList<Itens> getItens() throws Exception;

    public ArrayList<Itens> getItens(String filtro) throws Exception;

    public Itens getItem(int id) throws Exception;

    public Itens getItem(String nome) throws Exception;
}

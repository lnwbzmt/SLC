package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.Leitura;
import java.util.ArrayList;

public interface ILeituraDAO {

    public void incluirLeitura(Leitura leitura) throws Exception;

    public void alterarLeitura(Leitura leitura) throws Exception;

    public void excluirLeitura(Leitura leitura) throws Exception;

    public ArrayList<Leitura> getLeituras() throws Exception;

    public ArrayList<Leitura> getLeituras(String filtro) throws Exception;

    public Leitura getLeitura(int id) throws Exception;

    public Leitura getLeitura(String nome) throws Exception;
}

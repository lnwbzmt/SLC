package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.modelo.Hidrometro;
import java.util.ArrayList;
import java.util.Date;

public interface IHidrometroDAO {

    public void incluirHidrometro(Hidrometro hidrometro) throws Exception;

    public void alterarHidrometro(Hidrometro hidrometro) throws Exception;

    public void excluirHidrometro(Hidrometro hidrometro) throws Exception;

    public ArrayList<Hidrometro> getHidrometros() throws Exception;

    public ArrayList<Hidrometro> getHidrometros(String serie) throws Exception;
    
    public ArrayList<Hidrometro> getHidrometros(Date dataAquisicao) throws Exception;

    public Hidrometro getHidrometro(int id) throws Exception;

}

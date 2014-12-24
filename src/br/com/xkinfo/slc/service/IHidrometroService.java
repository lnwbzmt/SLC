package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Hidrometro;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;

public interface IHidrometroService {

    public void incluirHidrometro(String serie, Date dataAquisicao, Usuario usuario) throws Exception;

    public void alterarHidrometro(Integer id, String serie, Date dataAquisicao, Usuario usuario) throws Exception;

    public void excluirHidrometro(Integer id) throws Exception;

    public ArrayList<Hidrometro> getHidrometros() throws Exception;

    public ArrayList<Hidrometro> getHidrometros(String serie) throws Exception;

    public ArrayList<Hidrometro> getHidrometros(Date dataAquisicao) throws Exception;

    public Hidrometro getHidrometro(int id) throws Exception;

}

package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.modelo.Hidrometro;
import br.com.xkinfo.slc.modelo.Usuario;
import java.util.ArrayList;
import java.util.Date;

public interface IHidrometroService {

    public Boolean incluirHidrometro(String serie, Date dataAquisicao, Usuario usuario) throws Exception;

    public Boolean alterarHidrometro(Integer id, String serie, Date dataAquisicao, Usuario usuario, Date dataInclusao, Usuario usuarioInclusao) throws Exception;

    public void excluirHidrometro(Integer id) throws Exception;

    public ArrayList<Hidrometro> getHidrometros() throws Exception;

    public Hidrometro getHidrometro(int id) throws Exception;

    public boolean validarHidrometro(String serie) throws Exception;
}

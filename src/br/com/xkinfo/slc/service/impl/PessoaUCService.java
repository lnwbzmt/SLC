package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Pessoa;
import br.com.xkinfo.slc.modelo.PessoaUc;
import br.com.xkinfo.slc.modelo.UnidadeConsumidora;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.IPessoaUCService;
import java.util.ArrayList;
import java.util.Date;

public class PessoaUCService implements IPessoaUCService {

    private Date dataInclusao;
    private Date dataAlteracao;

    @Override
    public void incluirPessoaUC(Pessoa prop, Pessoa inquilino, UnidadeConsumidora uc, Date entrada, Date saida, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        PessoaUc pessoaUc = new PessoaUc();
        pessoaUc.setProprietario(prop);
        pessoaUc.setInquilino(inquilino);
        pessoaUc.setUnidadeconsumidora(uc);
        pessoaUc.setDataentrada(entrada);
        pessoaUc.setDatasaida(saida);
        pessoaUc.setUsuarioinclusao(usuario);
        pessoaUc.setDatainclusao(dataInclusao);

        DAOFactory.getPessoaUCDAO().incluirPessoaUC(pessoaUc);
    }

    @Override
    public void alterarPessoaUC(Integer id, Pessoa prop, Pessoa inquilino, UnidadeConsumidora uc, Date entrada, Date saida, Usuario usuario) throws Exception {
        dataAlteracao = new Date();
        PessoaUc pessoaUc = new PessoaUc();
        pessoaUc.setId(id);
        pessoaUc.setProprietario(prop);
        pessoaUc.setInquilino(inquilino);
        pessoaUc.setUnidadeconsumidora(uc);
        pessoaUc.setDataentrada(entrada);
        pessoaUc.setDatasaida(saida);
        pessoaUc.setUsuarioalteracao(usuario);
        pessoaUc.setDataalteracao(dataAlteracao);

        DAOFactory.getPessoaUCDAO().alterarPessoaUC(pessoaUc);
    }

    @Override
    public void excluirPessoaUC(Integer id) throws Exception {
        DAOFactory.getPessoaUCDAO().excluirPessoaUC(getPessoaUC(id));
    }

    @Override
    public ArrayList<PessoaUc> getPessoaUCs() throws Exception {
        return DAOFactory.getPessoaUCDAO().getPessoaUCs();
    }

    @Override
    public PessoaUc getPessoaUC(int id) throws Exception {
        return DAOFactory.getPessoaUCDAO().getPessoaUC(id);
    }

}

package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.dao.impl.CaixaDAO;
import br.com.xkinfo.slc.dao.impl.CompetenciaDAO;
import br.com.xkinfo.slc.dao.impl.CondominioDAO;
import br.com.xkinfo.slc.dao.impl.FaturaDAO;
import br.com.xkinfo.slc.dao.impl.HidrometroDAO;
import br.com.xkinfo.slc.dao.impl.HidrometroUCDAO;
import br.com.xkinfo.slc.dao.impl.ItensDAO;
import br.com.xkinfo.slc.dao.impl.ItensFaturaDAO;
import br.com.xkinfo.slc.dao.impl.ItensValorDAO;
import br.com.xkinfo.slc.dao.impl.LeituraDAO;
import br.com.xkinfo.slc.dao.impl.OcorrenciaDAO;
import br.com.xkinfo.slc.dao.impl.PessoaDAO;
import br.com.xkinfo.slc.dao.impl.PessoaUCDAO;
import br.com.xkinfo.slc.dao.impl.SituacaoDAO;
import br.com.xkinfo.slc.dao.impl.UnidadeConsumidoraDAO;
import br.com.xkinfo.slc.dao.impl.UsuarioDAO;


public class DAOFactory {

    private static final ICaixaDAO caixaDAO = new CaixaDAO();
    private static final ICompetenciaDAO competenciaDAO = new CompetenciaDAO();
    private static final ICondominioDAO condominioDAO = new CondominioDAO();
    private static final IFaturaDAO faturaDAO = new FaturaDAO();
    private static final IHidrometroDAO hidrometroDAO = new HidrometroDAO();
    private static final IHidrometroUCDAO hidrometroUCDAO = new HidrometroUCDAO();
    private static final IItensDAO itensDAO = new ItensDAO();
    private static final IItensFaturaDAO itensFaturaDAO = new ItensFaturaDAO();
    private static final IItensValorDAO itensValorDAO = new ItensValorDAO();  
    private static final ILeituraDAO leituraDAO = new LeituraDAO();
    private static final IOcorrenciaDAO ocorrenciaDAO = new OcorrenciaDAO();
    private static final IPessoaDAO pessoaDAO = new PessoaDAO();
    private static final IPessoaUCDAO pessoaUCDAO = new PessoaUCDAO();
    private static final ISituacaoDAO situacaoDAO = new SituacaoDAO();
    private static final IUnidadeConsumidoraDAO unidadeConsumidoraDAO = new UnidadeConsumidoraDAO();
    private static final IUsuarioDAO usuarioDAO = new UsuarioDAO();

    public static ICaixaDAO getCaixaDAO() {
        return caixaDAO;
    }
    public static ICompetenciaDAO getCompetenciaDAO() {
        return competenciaDAO;
    }
    public static ICondominioDAO getCondominioDAO() {
        return condominioDAO;
    }
    public static IFaturaDAO getFaturaDAO() {
        return faturaDAO;
    }
    public static IHidrometroDAO getHidrometroDAO() {
        return hidrometroDAO;
    }
    public static IHidrometroUCDAO getHidrometroUCDAO() {
        return hidrometroUCDAO;
    }
    public static IItensDAO getItensDAO() {
        return itensDAO;
    }
    public static IItensFaturaDAO getItensFaturaDAO() {
        return itensFaturaDAO;
    }
    public static IItensValorDAO getItensValorDAO() {
        return itensValorDAO;
    }
    public static ILeituraDAO getLeituraDAO() {
        return leituraDAO;
    }
    public static IOcorrenciaDAO getOcorrenciaDAO() {
        return ocorrenciaDAO;
    }
    public static IPessoaDAO getPessoaDAO() {
        return pessoaDAO;
    }
    public static IPessoaUCDAO getPessoaUCDAO() {
        return pessoaUCDAO;
    }
    public static ISituacaoDAO getSituacaoDAO() {
        return situacaoDAO;
    }
    public static IUnidadeConsumidoraDAO getUnidadeConsumidoraDAO() {
        return unidadeConsumidoraDAO;
    }
    public static IUsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }
}

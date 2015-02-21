package br.com.xkinfo.slc.dao;

import br.com.xkinfo.slc.dao.impl.CompetenciaDAO;
import br.com.xkinfo.slc.dao.impl.CondominioDAO;
import br.com.xkinfo.slc.dao.impl.HidrometroDAO;
import br.com.xkinfo.slc.dao.impl.HidrometroUCDAO;
import br.com.xkinfo.slc.dao.impl.PessoaDAO;
import br.com.xkinfo.slc.dao.impl.PessoaUCDAO;
import br.com.xkinfo.slc.dao.impl.SituacaoDAO;
import br.com.xkinfo.slc.dao.impl.UnidadeConsumidoraDAO;
import br.com.xkinfo.slc.dao.impl.UsuarioDAO;

public class DAOFactory {

    private static final ICompetenciaDAO competenciaDAO = new CompetenciaDAO();
    private static final ICondominioDAO condominioDAO = new CondominioDAO();
    private static final IHidrometroDAO hidrometroDAO = new HidrometroDAO();
    private static final IHidrometroUCDAO hidrometroUCDAO = new HidrometroUCDAO();
    private static final IPessoaDAO pessoaDAO = new PessoaDAO();
    private static final IPessoaUCDAO pessoaUCDAO = new PessoaUCDAO();
    private static final ISituacaoDAO situacaoDAO = new SituacaoDAO();
    private static final IUnidadeConsumidoraDAO unidadeConsumidoraDAO = new UnidadeConsumidoraDAO();
    private static final IUsuarioDAO usuarioDAO = new UsuarioDAO();

    public static ICompetenciaDAO getCompetenciaDAO() {
        return competenciaDAO;
    }

    public static ICondominioDAO getCondominioDAO() {
        return condominioDAO;
    }

    public static IHidrometroDAO getHidrometroDAO() {
        return hidrometroDAO;
    }

    public static IHidrometroUCDAO getHidrometroUCDAO() {
        return hidrometroUCDAO;
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

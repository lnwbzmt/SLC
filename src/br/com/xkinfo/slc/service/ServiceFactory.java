package br.com.xkinfo.slc.service;

import br.com.xkinfo.slc.service.impl.CompetenciaService;
import br.com.xkinfo.slc.service.impl.CondominioService;
import br.com.xkinfo.slc.service.impl.HidrometroService;
import br.com.xkinfo.slc.service.impl.HidrometroUCService;
import br.com.xkinfo.slc.service.impl.PessoaService;
import br.com.xkinfo.slc.service.impl.PessoaUCService;
import br.com.xkinfo.slc.service.impl.SituacaoService;
import br.com.xkinfo.slc.service.impl.UnidadeConsumidoraService;
import br.com.xkinfo.slc.service.impl.UsuarioService;
import br.com.xkinfo.slc.service.impl.UtilService;


public class ServiceFactory {

    private static final ICompetenciaService competenciaService = new CompetenciaService();
    private static final ICondominioService condominioService = new CondominioService();
    private static final IHidrometroService hidrometroService = new HidrometroService();
    private static final IHidrometroUCService hidrometroUCService = new HidrometroUCService();
    private static final IPessoaService pessoaService = new PessoaService();
    private static final IPessoaUCService pessoaUCService = new PessoaUCService();
    private static final ISituacaoService situacaoService = new SituacaoService();
    private static final IUnidadeConsumidoraService unidadeConsumidoraService = new UnidadeConsumidoraService();
    private static final IUsuarioService usuarioService = new UsuarioService();
    private static final IUtilService utilService = new UtilService();

    public static ICompetenciaService getCompetenciaService() {
        return competenciaService;
    }
    public static ICondominioService getCondominioService() {
        return condominioService;
    }
    public static IHidrometroService getHidrometroService() {
        return hidrometroService;
    }
    public static IHidrometroUCService getHidrometroUCService() {
        return hidrometroUCService;
    }
    public static IPessoaService getPessoaService() {
        return pessoaService;
    }
    public static IPessoaUCService getPessoaUCService() {
        return pessoaUCService;
    }
    public static ISituacaoService getSituacaoService() {
        return situacaoService;
    }
    public static IUnidadeConsumidoraService getUnidadeConsumidoraService() {
        return unidadeConsumidoraService;
    }
    public static IUsuarioService getUsuarioService() {
        return usuarioService;
    }
    public static IUtilService getUtilService() {
        return utilService;
    }
   }

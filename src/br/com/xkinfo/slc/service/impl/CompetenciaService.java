package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Competencia;
import br.com.xkinfo.slc.modelo.Situacao;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.ICompetenciaService;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class CompetenciaService implements ICompetenciaService {

    private Date dataInclusao;
    private Date dataAlterecao;

    @Override
    public Boolean incluirCompetencia(Date competencia, Situacao situacao, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        Competencia comp = new Competencia();

        ArrayList<String> lista = new ArrayList(2);
        String ret = new String();

        if (competencia == null) {
            lista.add("Competência");
        }
        if (situacao == null) {
            lista.add("Situação");
        }

        if (lista.isEmpty()) {
            comp.setCompetencia(competencia);
            comp.setSituacao(situacao);
            comp.setUsuarioinclusao(usuario);
            comp.setDatainclusao(dataInclusao);
            DAOFactory.getCompetenciaDAO().incluirCompetencia(comp);
            JOptionPane.showMessageDialog(null, "Competência inlcuída com sucesso!");
            return true;
        } else {
            for (String lista1 : lista) {
                ret = ret + lista1 + "\n";
            }
            JOptionPane.showMessageDialog(null, "Favor preencher os campos: \n" + ret);
            return false;
        }
    }

    @Override
    public Boolean alterarCompetencia(Integer id, Date competencia, Situacao situacao, Usuario usuario, Usuario usuarioInclusao, Date DataInclusao) throws Exception {
        dataAlterecao = new Date();
        Competencia comp = new Competencia();

        ArrayList<String> lista = new ArrayList(2);
        String ret = new String();

        if (competencia == null) {
            lista.add("Competência");
        }
        if (situacao == null) {
            lista.add("Situação");
        }

        if (lista.isEmpty()) {
            comp.setId(id);
            comp.setCompetencia(competencia);
            comp.setSituacao(situacao);
            comp.setUsuarioalteracao(usuario);
            comp.setDataalteracao(dataAlterecao);

            DAOFactory.getCompetenciaDAO().alterarCompetencia(comp);
            JOptionPane.showMessageDialog(null, "Competência alterada com sucesso!");

            return true;
        } else {
            for (String lista1 : lista) {
                ret = ret + lista1 + "\n";
            }
            JOptionPane.showMessageDialog(null, "Favor preencher os campos: \n" + ret);
            return false;
        }
    }

    @Override
    public void excluirCompetencia(Integer id) throws Exception {
        DAOFactory.getCompetenciaDAO().excluirCompetencia(getCompetencia(id));
        JOptionPane.showMessageDialog(null, "Competência excluída com sucesso!");
    }

    @Override
    public ArrayList<Competencia> getCompetencias() throws Exception {
        return DAOFactory.getCompetenciaDAO().getCompetencias();
    }

    @Override
    public Competencia getCompetencia(Integer id) throws Exception {
        return DAOFactory.getCompetenciaDAO().getCompetencia(id);
    }

}

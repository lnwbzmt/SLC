package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Situacao;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.ISituacaoService;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class SituacaoService implements ISituacaoService {

    private Date dataInclusao;
    private Date dataAlteracao;

    @Override
    public Boolean incluirSituacao(String codigo, String descricao, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        Integer iCodigo = Integer.parseInt(codigo);
        Situacao situacao = new Situacao();
        situacao.setCodigo(iCodigo);
        situacao.setDescricao(descricao);
        situacao.setUsuarioinclusao(usuario);
        situacao.setDatainclusao(dataInclusao);
        DAOFactory.getSituacaoDAO().incluirSituacao(situacao);
        JOptionPane.showMessageDialog(null, "Situação Incluída com Sucesso!");
        return true;
    }

    @Override
    public Boolean alterarSituacao(Integer id, String codigo, String descricao, Usuario usuario, Usuario usuarioInclusao, Date dataInclusao) throws Exception {
        dataAlteracao = new Date();
        Situacao situacao = new Situacao();
        Integer iCodigo = Integer.parseInt(codigo);
        situacao.setId(id);
        situacao.setCodigo(iCodigo);
        situacao.setDescricao(descricao);
        situacao.setUsuarioalteracao(usuario);
        situacao.setDataalteracao(dataAlteracao);
        situacao.setUsuarioinclusao(usuarioInclusao);
        situacao.setDatainclusao(dataInclusao);
        DAOFactory.getSituacaoDAO().alterarSituacao(situacao);
        JOptionPane.showMessageDialog(null, "Situação Alterada com Sucesso!");
        return true;          
    }

    @Override
    public void excluirSituacao(Integer id) throws Exception {
        DAOFactory.getSituacaoDAO().excluirSituacao(getSituacao(id));
        JOptionPane.showMessageDialog(null, "Situação Excluída com Sucesso!");
    }

    @Override
    public ArrayList<Situacao> getSituacoes() throws Exception {
        return DAOFactory.getSituacaoDAO().getSituacoes();
    }

    @Override
    public Situacao getSituacao(int id) throws Exception {
        return DAOFactory.getSituacaoDAO().getSituacao(id);
    }

    @Override
    public boolean validarSituacao(String codigo, String descricao) throws Exception {
        ArrayList<String> lista = new ArrayList(2);
        String ret = new String();

        if (codigo.equalsIgnoreCase("")) {
            lista.add("Código");
        }
        if (descricao.equalsIgnoreCase("")) {
            lista.add("Descrição");
        }

        if (!lista.isEmpty()) {
            for (String lista1 : lista) {
                ret = ret + lista1 + "\n";
            }
            JOptionPane.showMessageDialog(null, "Favor preencher os campos: \n" + ret);
            return false;
        }
        return true;
    }
}

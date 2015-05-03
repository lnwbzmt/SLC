package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.modelo.UnidadeConsumidora;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.IUnidadeConsumidoraService;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class UnidadeConsumidoraService implements IUnidadeConsumidoraService {

    private Date dataInclusao;
    private Date dataAlteracao;
    private UnidadeConsumidora ret;

    @Override
    public UnidadeConsumidora incluirUnidadeConsumidora(Condominio condominio, String numero, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        UnidadeConsumidora uc = new UnidadeConsumidora();
        Integer iNumero = Integer.parseInt(numero);

        uc.setCondominio(condominio);
        uc.setNumero(iNumero);
        uc.setUsuarioinclusao(usuario);
        uc.setDatainclusao(dataInclusao);

        ret = DAOFactory.getUnidadeConsumidoraDAO().incluirUnidadeConsumidora(uc);
        JOptionPane.showMessageDialog(null, "UnidadeConsumidora Inlcuído com Sucesso!");
        return ret;
    }

    @Override
    public void alterarUnidadeConsumidora(Integer id, Condominio condominio, String numero, Usuario usuario, Date dataInclusao, Usuario usuarioInclusao) throws Exception {
        dataAlteracao = new Date();
        UnidadeConsumidora uc = new UnidadeConsumidora();

        Integer iNumero = Integer.parseInt(numero);

        uc.setId(id);
        uc.setCondominio(condominio);
        uc.setNumero(iNumero);
        uc.setUsuarioalteracao(usuario);
        uc.setDataalteracao(dataAlteracao);

        DAOFactory.getUnidadeConsumidoraDAO().alterarUnidadeConsumidora(uc);
        JOptionPane.showMessageDialog(null, "UnidadeConsumidora Alterado com Sucesso!");
    }

    @Override
    public void excluirUnidadeConsumidora(Integer id) throws Exception {
        DAOFactory.getUnidadeConsumidoraDAO().excluirUnidadeConsumidora(getUnidadeConsumidora(id));
        JOptionPane.showMessageDialog(null, "UnidadeConsumidora Excluído com Sucesso!");
    }

    @Override
    public ArrayList<UnidadeConsumidora> getUnidadeConsumidoras() throws Exception {
        return DAOFactory.getUnidadeConsumidoraDAO().getUnidadeConsumidoras();
    }

    @Override
    public UnidadeConsumidora getUnidadeConsumidora(int id) throws Exception {
        return DAOFactory.getUnidadeConsumidoraDAO().getUnidadeConsumidora(id);
    }
  @Override
    public UnidadeConsumidora getUnidadeConsumidora(String numero) throws Exception {
        return DAOFactory.getUnidadeConsumidoraDAO().getUnidadeConsumidora(numero);
    }
    @Override
    public boolean validarUnidadeConsumidora(Condominio condominio, String nome) throws Exception {
        ArrayList<String> lista = new ArrayList(2);
        String ret = new String();
        if (condominio == null) {
            lista.add("Condominio");
        }
        if (nome.equalsIgnoreCase("")) {
            lista.add("Nome");
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

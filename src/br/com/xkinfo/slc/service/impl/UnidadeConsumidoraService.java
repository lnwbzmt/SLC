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

    @Override
    public void incluirUnidadeConsumidora(Condominio condominio, Integer numero, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        UnidadeConsumidora uc = new UnidadeConsumidora();
        uc.setCondominio(condominio);
        uc.setNumero(numero);
        uc.setUsuarioinclusao(usuario);
        uc.setDatainclusao(dataInclusao);

        DAOFactory.getUnidadeConsumidoraDAO().incluirUnidadeConsumidora(uc);
        JOptionPane.showMessageDialog(null, "UnidadeConsumidora Inlcuído com Sucesso!");
    }

    @Override
    public void alterarUnidadeConsumidora(Integer id, Condominio condominio, Integer numero, Usuario usuario, Date dataInclusao, Usuario usuarioInclusao) throws Exception {
        dataAlteracao = new Date();
        UnidadeConsumidora uc = new UnidadeConsumidora();
        uc.setId(id);
        uc.setCondominio(condominio);
        uc.setNumero(numero);
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
}

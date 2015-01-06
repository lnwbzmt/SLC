package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.ICondominioService;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class CondominioService implements ICondominioService {

    private Date dataInclusao;
    private Date dataAlteracao;

    @Override
    public void incluirCondominio(String nome, Float cnpj, String endereco, Float numero, String complemento, String bairro,
            String cidade, String estado, String sigla, String email, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        Condominio cond = new Condominio();
        cond.setNome(nome);
        cond.setCnpj(cnpj);
        cond.setEndereco(endereco);
        cond.setNumero(numero);
        cond.setComplemento(complemento);
        cond.setBairro(bairro);
        cond.setCidade(cidade);
        cond.setEstado(estado);
        cond.setSigla(sigla);
        cond.setEmail(email);
        cond.setUsuarioinclusao(usuario);
        cond.setDatainclusao(dataInclusao);

        ArrayList<String> lista = new ArrayList(9);
        String ret = new String();

        if (nome == null || nome.equalsIgnoreCase("")) {
            lista.add("Nome");
        }
        if (cnpj == null) {
            lista.add("Cnpj");
        }
        if (endereco == null || endereco.equalsIgnoreCase("")) {
            lista.add("Endereço");
        }
        if (numero == null) {
            lista.add("Numero");
        }
        if (complemento == null || complemento.equalsIgnoreCase("")) {
            lista.add("Complemento");
        }
        if (bairro == null || bairro.equalsIgnoreCase("")) {
            lista.add("Bairro");
        }
        if (cidade == null || cidade.equalsIgnoreCase("")) {
            lista.add("Cidade");
        }
        if (estado == null || estado.equalsIgnoreCase("")) {
            lista.add("Estado");
        }
        if (sigla == null || sigla.equalsIgnoreCase("")) {
            lista.add("Sigla");
        }

        if (lista.isEmpty()) {
            DAOFactory.getCondominioDAO().incluirCondominio(cond);
            JOptionPane.showMessageDialog(null, "Condominio inlcuído com sucesso!");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                ret = ret + lista.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null,"Favor preencher os campos: \n" + ret);
        }
    }

    @Override
    public void alterarCondominio(Integer id, String nome, Float cnpj, String endereco, Float numero, String complemento, String bairro,
            String cidade, String estado, String sigla, String email, Usuario usuario) throws Exception {
        dataAlteracao = new Date();
        Condominio cond = new Condominio();
        cond.setId(id);
        cond.setNome(nome);
        cond.setCnpj(cnpj);
        cond.setEndereco(endereco);
        cond.setNumero(numero);
        cond.setComplemento(complemento);
        cond.setBairro(bairro);
        cond.setCidade(cidade);
        cond.setEstado(estado);
        cond.setSigla(sigla);
        cond.setEmail(email);
        cond.setUsuarioalteracao(usuario);
        cond.setDataalteracao(dataAlteracao);

        DAOFactory.getCondominioDAO().alterarCondominio(cond);
    }

    @Override
    public void excluirCondominio(Integer id) throws Exception {
        DAOFactory.getCondominioDAO().excluirCondominio(getCondominio(id));
    }

    @Override
    public ArrayList<Condominio> getCondominios() throws Exception {
        return DAOFactory.getCondominioDAO().getCondominios();
    }

    @Override
    public Condominio getCondominio(Integer id) throws Exception {
        return DAOFactory.getCondominioDAO().getCondominio(id);
    }

}

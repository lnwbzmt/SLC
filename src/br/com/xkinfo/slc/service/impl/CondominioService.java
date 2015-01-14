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
    public Boolean incluirCondominio(String nome, String cnpj, String endereco, String numero, String complemento, String bairro,
            String cidade, String estado, String sigla, String email, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        Condominio cond = new Condominio();
        
        ArrayList<String> lista = new ArrayList(8);
        String ret = new String();

        if (nome == null || nome.equalsIgnoreCase("")) {
            lista.add("Nome");
        }
        if (cnpj == null || cnpj.equalsIgnoreCase("")) {
            lista.add("CNPJ");
        }
        if (endereco == null || endereco.equalsIgnoreCase("")) {
            lista.add("Endereço");
        }
        if (numero == null || numero.equalsIgnoreCase("")) {
            lista.add("Número");
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
            Long fCnpj = Long.valueOf(cnpj);
            Float fNumero = Float.valueOf(numero);

            cond.setNome(nome);
            cond.setCnpj(fCnpj);
            cond.setEndereco(endereco);
            cond.setNumero(fNumero);
            cond.setComplemento(complemento);
            cond.setBairro(bairro);
            cond.setCidade(cidade);
            cond.setEstado(estado);
            cond.setSigla(sigla);
            cond.setEmail(email);
            cond.setUsuarioinclusao(usuario);
            cond.setDatainclusao(dataInclusao);
            DAOFactory.getCondominioDAO().incluirCondominio(cond);
            JOptionPane.showMessageDialog(null, "Condominio inlcuído com sucesso!");
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
    public Boolean alterarCondominio(Integer id, String nome, String cnpj, String endereco, String numero, String complemento, String bairro,
            String cidade, String estado, String sigla, String email, Usuario usuario, Usuario usuarioinclusao, Date dataInclusao) throws Exception {
        dataAlteracao = new Date();
        Condominio cond = new Condominio();
        
        ArrayList<String> lista = new ArrayList(8);
        String ret = new String();

        if (nome == null || nome.equalsIgnoreCase("")) {
            lista.add("Nome");
        }
        if (cnpj == null || cnpj.equalsIgnoreCase("")) {
            lista.add("CNPJ");
        }
        if (endereco == null || endereco.equalsIgnoreCase("")) {
            lista.add("Endereço");
        }
        if (numero == null || numero.equalsIgnoreCase("")) {
            lista.add("Número");
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
            Long fCnpj = Long.valueOf(cnpj);
            Float fNumero = Float.valueOf(numero);

            cond.setId(id);
            cond.setNome(nome);
            cond.setCnpj(fCnpj);
            cond.setEndereco(endereco);
            cond.setNumero(fNumero);
            cond.setComplemento(complemento);
            cond.setBairro(bairro);
            cond.setCidade(cidade);
            cond.setEstado(estado);
            cond.setSigla(sigla);
            cond.setEmail(email);
            cond.setUsuarioalteracao(usuario);
            cond.setDataalteracao(dataAlteracao);
            cond.setDatainclusao(dataInclusao);
            cond.setUsuarioinclusao(usuarioinclusao);
            
            DAOFactory.getCondominioDAO().alterarCondominio(cond);
            JOptionPane.showMessageDialog(null, "Condominio Alterado com Sucesso!");
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

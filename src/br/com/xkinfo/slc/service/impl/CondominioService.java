package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.ICondominioService;
import br.com.xkinfo.slc.service.ServiceFactory;
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

        Long fCnpj = Long.valueOf(cnpj);
        Long fNumero = Long.valueOf(numero);
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
        JOptionPane.showMessageDialog(null, "Condominio incluído com sucesso!");
        return true;
    }

    @Override
    public Boolean alterarCondominio(Integer id, String nome, String cnpj, String endereco, String numero, String complemento, String bairro,
            String cidade, String estado, String sigla, String email, Usuario usuario, Usuario usuarioinclusao, Date dataInclusao) throws Exception {
        dataAlteracao = new Date();
        Condominio cond = new Condominio();

        Long fCnpj = Long.valueOf(cnpj);
        Long fNumero = Long.valueOf(numero);
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
        JOptionPane.showMessageDialog(null, "Condominio alterado com Sucesso!");
        return true;
    }

    @Override
    public void excluirCondominio(Integer id) throws Exception {
        DAOFactory.getCondominioDAO().excluirCondominio(getCondominio(id));
        JOptionPane.showMessageDialog(null, "Condominio Excluído com Sucesso!");
    }

    @Override
    public ArrayList<Condominio> getCondominios() throws Exception {
        return DAOFactory.getCondominioDAO().getCondominios();
    }

    @Override
    public Condominio getCondominio(Integer id) throws Exception {
        return DAOFactory.getCondominioDAO().getCondominio(id);
    }

    @Override
    public boolean validarCondominio(String nome, String cnpj, String email) throws Exception {
        ArrayList<String> lista = new ArrayList(2);
        String ret = new String();
        Boolean cnpjValido;
        Boolean emailValido;

        if (nome.equalsIgnoreCase("")) {
            lista.add("Nome");
        }
        if (cnpj.equalsIgnoreCase("")) {
            lista.add("CNPJ");
        }
        emailValido = ServiceFactory.getUtilService().isEmail(email);
        cnpjValido = ServiceFactory.getUtilService().isCNPJ(cnpj.replace(".", "").replace("-", "").replace("/", ""));
        if (cnpjValido == false) {
            JOptionPane.showMessageDialog(null, "CNPJ inválido!");
        }
        if (emailValido == false) {
            JOptionPane.showMessageDialog(null, "Email inválido!");
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

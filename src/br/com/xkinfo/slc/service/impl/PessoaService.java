package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.dao.DAOFactory;
import br.com.xkinfo.slc.modelo.Pessoa;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.IPessoaService;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class PessoaService implements IPessoaService {

    private Date dataInclusao;
    private Date dataAlteracao;

    @Override
    public Boolean incluirPessoa(String nome, String cpf, String email, Usuario usuario) throws Exception {
        dataInclusao = new Date();
        Pessoa pessoa = new Pessoa();
        Long fCpf = Long.valueOf(cpf);
        pessoa.setNome(nome);
        pessoa.setCpf(fCpf);
        pessoa.setEmail(email);
        pessoa.setUsuarioinclusao(usuario);
        pessoa.setDatainclusao(dataInclusao);
        DAOFactory.getPessoaDAO().incluirPessoa(pessoa);
        JOptionPane.showMessageDialog(null, "Pessoa Inlcuído com Sucesso!");
        return true;
    }

    @Override
    public Boolean alterarPessoa(Integer id, String nome, String cpf, String email, Usuario usuario, Date dataInclusao, Usuario usuarioInclusao) throws Exception {
        dataAlteracao = new Date();
        Pessoa pessoa = new Pessoa();
        String sCpf = cpf;
        sCpf = sCpf.replaceAll("[^0-9 ]", "");
        Long fCpf = Long.valueOf(sCpf);
        pessoa.setId(id);
        pessoa.setNome(nome);
        pessoa.setCpf(fCpf);
        pessoa.setEmail(email);
        pessoa.setUsuarioalteracao(usuario);
        pessoa.setDataalteracao(dataAlteracao);
        pessoa.setUsuarioinclusao(usuarioInclusao);
        pessoa.setDatainclusao(dataInclusao);
        DAOFactory.getPessoaDAO().alterarPessoa(pessoa);
        JOptionPane.showMessageDialog(null, "Pessoa Alterado com Sucesso!");
        return true;
    }

    @Override
    public void excluirPessoa(Integer id) throws Exception {
        DAOFactory.getPessoaDAO().excluirPessoa(getPessoa(id));
        JOptionPane.showMessageDialog(null, "Pessoa Excluído com Sucesso!");
    }

    @Override
    public ArrayList<Pessoa> getPessoas() throws Exception {
        return DAOFactory.getPessoaDAO().getPessoas();
    }

    @Override
    public Pessoa getPessoa(int id) throws Exception {
        return DAOFactory.getPessoaDAO().getPessoa(id);
    }

    @Override
    public boolean validarPessoa(String nome, String cpf, String email) throws Exception {
        ArrayList<String> lista = new ArrayList(2);
        String ret = new String();
        Boolean cpfValido;
        Boolean emailValido;
        if (nome.equalsIgnoreCase("")) {
            lista.add("Nome");
        }
        if (cpf.equalsIgnoreCase("")) {
            lista.add("Hidromêtro");
        }
        emailValido = ServiceFactory.getUtilService().isEmail(email);
        cpfValido = ServiceFactory.getUtilService().isCPF(cpf.replace(".", "").replace("-", ""));
        if (cpfValido == false) {
            JOptionPane.showMessageDialog(null, "CPF inválido!");
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

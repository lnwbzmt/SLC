package br.com.xkinfo.slc.service;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public interface IUtilService {
    public String formatar(String texto, String mascara) throws Exception;
    public String formatarCPF(String cpf) throws Exception;
    public String formatarCNPJ(String cnpj) throws Exception;
    public String formatarCEP(long cep) throws Exception;
    public String formatarTelefone(String telefone) throws Exception;
    public String formatarZerosEsquerda(int numero, int tamanho) throws Exception;
    public void setComboBoxValue(JComboBox comboBox, String value) throws Exception;
    public void limpaCampos(JFrame frame) throws Exception;
    public void limpaCampos(JPanel panel) throws Exception;
    public void limpaCampos(JDialog dialog) throws Exception;
    public void desabilitaCampos(JFrame frame) throws Exception;
    public void desabilitaCampos(JPanel panel) throws Exception;
    public void desabilitaCampos(JDialog dialog) throws Exception;
    public void habilitaCampos(JFrame frame) throws Exception;
    public void habilitaCampos(JPanel panel) throws Exception;
    public void habilitaCampos(JDialog dialog) throws Exception;
    public boolean isCNPJ(String cnpj) throws Exception;
    public boolean isCPF(String cpf) throws Exception;
    public boolean isEmail(String email) throws Exception;
    public int getModulo10(String numero);
    public int getModulo11(String numero);
}

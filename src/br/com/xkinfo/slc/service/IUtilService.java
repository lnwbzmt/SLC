package br.com.xkinfo.slc.service;

import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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

    public int getModulo10(String numero) throws Exception;

    public int getModulo11(String numero) throws Exception;

    public boolean isNumero(String texto) throws Exception;

    public boolean isTemNumero(String texto) throws Exception;

    public boolean isCaracterEspecial(String texto) throws Exception;

    public JTextField errado(JTextField t) throws Exception;

    public JTextArea errado(JTextArea t) throws Exception;

    public JComboBox errado(JComboBox t) throws Exception;

    public JRadioButton errado(JRadioButton t) throws Exception;

    public JCheckBox errado(JCheckBox t) throws Exception;

    public JDateChooser errado(JDateChooser t) throws Exception;

    public JTextField certo(JTextField t) throws Exception;

    public JTextArea certo(JTextArea t) throws Exception;

    public JComboBox certo(JComboBox t) throws Exception;

    public JRadioButton certo(JRadioButton t) throws Exception;

    public JCheckBox certo(JCheckBox t) throws Exception;

    public JDateChooser certo(JDateChooser t) throws Exception;

    public boolean isData(String data) throws Exception;

    public boolean isTelefone(String telefone) throws Exception;

    public boolean isCEP(String aux) throws Exception;

    public String devolveValorExibicao(double num) throws Exception;

    public double devolverValorDouble(String texto) throws Exception;

    public String criptografar(String pwd) throws Exception;
}

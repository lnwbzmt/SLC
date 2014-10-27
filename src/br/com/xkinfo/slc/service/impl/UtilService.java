package br.com.xkinfo.slc.service.impl;

import br.com.xkinfo.slc.service.IUtilService;
import java.awt.Component;
import java.util.InputMismatchException;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UtilService implements IUtilService {

    @Override
    public String formatar(String valor, String mascara) {
        String dado = "";
        for (int i = 0; i < valor.length(); i++) {
            char c = valor.charAt(i);
            if (Character.isDigit(c)) {
                dado += c;
            }
        }
        int indMascara = mascara.length();
        int indCampo = dado.length();

        for (; indCampo > 0 && indMascara > 0;) {
            if (mascara.charAt(--indMascara) == '#') {
                indCampo--;
            }
        }
        String saida = "";
        for (; indMascara < mascara.length(); indMascara++) {
            saida += ((mascara.charAt(indMascara) == '#') ? dado.charAt(indCampo++) : mascara.charAt(indMascara));
        }
        return saida;
    }

    @Override
    public String formatarCPF(String cpf) throws Exception {
        while (cpf.length() < 11) {
            cpf = "0" + cpf;
        }
        return formatar(cpf, "###.###.###-##");
    }

    @Override
    public String formatarCNPJ(String cnpj) throws Exception {
        while (cnpj.length() < 14) {
            cnpj = "0" + cnpj;
        }
        return formatar(cnpj, "##.###.###/####-##");
    }

    @Override
    public String formatarCEP(long cep) throws Exception {
        long cep1, cep2;
        cep1 = cep / 1000;
        cep2 = cep % 1000;
        return String.format("%05d-%03d", cep1, cep2);
    }

    @Override
    public String formatarTelefone(String telefone) throws Exception {
        if (telefone.length() > 11) {
            return formatar(telefone, "(0##)#####-####");
        } else {
            return formatar(telefone, "(0##)####-####");
        }
    }

    @Override
    public String formatarZerosEsquerda(int numero, int tamanho) throws Exception {
        return String.format("%0" + String.valueOf(tamanho) + "d", numero);

    }

    @Override
    public void setComboBoxValue(JComboBox comboBox, String value) throws Exception {
        String item = "";
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = comboBox.getItemAt(i).toString();
            if (item.equals(value)) {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }

    @Override
    public void limpaCampos(JFrame frame) throws Exception {
        Component componentes[] = ((JPanel) frame.getContentPane()).getComponents();
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setText("");
            } else if (c instanceof JComboBox) {
                ((JComboBox) c).setSelectedIndex(0);
            } else if (c instanceof JRadioButton) {
                ((JRadioButton) c).setSelected(true);
            }
        }
    }

    @Override
    public void limpaCampos(JPanel panel) throws Exception {
        Component componentes[] = panel.getComponents();
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setText("");
            } else if (c instanceof JComboBox) {
                ((JComboBox) c).setSelectedIndex(0);
            } else if (c instanceof JRadioButton) {
                ((JRadioButton) c).setSelected(true);
            }
        }
    }

    @Override
    public void limpaCampos(JDialog dialog) throws Exception {
        Component componentes[] = ((JPanel) dialog.getContentPane()).getComponents();
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setText("");
            } else if (c instanceof JComboBox) {
                ((JComboBox) c).setSelectedIndex(0);
            } else if (c instanceof JRadioButton) {
                ((JRadioButton) c).setSelected(true);
            }
        }
    }

    @Override
    public void desabilitaCampos(JFrame frame) throws Exception {
        Component componentes[] = ((JPanel) frame.getContentPane()).getComponents();
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                ((JTextField) c).setEnabled(false);
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setEnabled(false);
            } else if (c instanceof JComboBox) {
                ((JComboBox) c).setEnabled(false);
            } else if (c instanceof JRadioButton) {
                ((JRadioButton) c).setEnabled(false);
            }
        }
    }

    @Override
    public void desabilitaCampos(JPanel panel) throws Exception {
        Component componentes[] = panel.getComponents();
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                ((JTextField) c).setEnabled(false);
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setEnabled(false);
            } else if (c instanceof JComboBox) {
                ((JComboBox) c).setEnabled(false);
            } else if (c instanceof JRadioButton) {
                ((JRadioButton) c).setEnabled(false);
            }
        }
    }

    @Override
    public void desabilitaCampos(JDialog dialog) throws Exception {
        Component componentes[] = ((JPanel) dialog.getContentPane()).getComponents();
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                ((JTextField) c).setEnabled(false);
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setEnabled(false);
            } else if (c instanceof JComboBox) {
                ((JComboBox) c).setEnabled(false);
            } else if (c instanceof JRadioButton) {
                ((JRadioButton) c).setEnabled(false);
            }
        }
    }

    @Override
    public void habilitaCampos(JFrame frame) throws Exception {
        Component componentes[] = ((JPanel) frame.getContentPane()).getComponents();
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                ((JTextField) c).setEnabled(true);
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setEnabled(true);
            } else if (c instanceof JComboBox) {
                ((JComboBox) c).setEnabled(true);
            } else if (c instanceof JRadioButton) {
                ((JRadioButton) c).setEnabled(true);
            }
        }
    }

    @Override
    public void habilitaCampos(JPanel panel) throws Exception {
        Component componentes[] = panel.getComponents();
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                ((JTextField) c).setEnabled(true);
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setEnabled(true);
            } else if (c instanceof JComboBox) {
                ((JComboBox) c).setEnabled(true);
            } else if (c instanceof JRadioButton) {
                ((JRadioButton) c).setEnabled(true);
            }
        }
    }

    @Override
    public void habilitaCampos(JDialog dialog) throws Exception {
        Component componentes[] = ((JPanel) dialog.getContentPane()).getComponents();
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                ((JTextField) c).setEnabled(true);
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setEnabled(true);
            } else if (c instanceof JComboBox) {
                ((JComboBox) c).setEnabled(true);
            } else if (c instanceof JRadioButton) {
                ((JRadioButton) c).setEnabled(true);
            }
        }
    }

    @Override
    public boolean isCNPJ(String cnpj) throws Exception {
        // considera-se erro CNPJ's formados por uma sequencia de numeros iguais
        if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111")
                || cnpj.equals("22222222222222") || cnpj.equals("33333333333333")
                || cnpj.equals("44444444444444") || cnpj.equals("55555555555555")
                || cnpj.equals("66666666666666") || cnpj.equals("77777777777777")
                || cnpj.equals("88888888888888") || cnpj.equals("99999999999999")
                || (cnpj.length() != 14)) {
            return (false);
        }
        char dig13, dig14;
        int sm, i, r, num, peso;
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
                num = (int) (cnpj.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }
            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }
            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (cnpj.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }
            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - r) + 48);
            }
            if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    @Override
    public boolean isCPF(String cpf) throws Exception {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (cpf.equals("00000000000") || cpf.equals("11111111111")
                || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777")
                || cpf.equals("88888888888") || cpf.equals("99999999999")
                || (cpf.length() != 11)) {
            return (false);
        }
        char dig10, dig11;
        int sm, i, r, num, peso;
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // (48 eh a posicao de '0' na tabela ASCII)
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    @Override
    public boolean isEmail(String email) throws Exception {
        return !(email.contains("@") && email.contains(".") && !email.contains("@."));
    }

    @Override
   public int getModulo10(String numero){    
        int acumulador = 0;  
        int resto = 0;  
        int dv = 0;  
        String[] numeros = new String[numero.length()+1];  
        int multiplicador = 2;  
        String aux;  
        String aux2;  
        String aux3;  
        for (int i = numero.length(); i > 0; i--) {               
            //Multiplica da direita pra esquerda, alternando os algarismos 2 e 1  
            if(multiplicador%2 == 0){  
                // pega cada numero isoladamente    
                numeros[i] = String.valueOf(Integer.valueOf(numero.substring(i-1,i))*2);  
                multiplicador = 1;  
            }else{  
                numeros[i] = String.valueOf(Integer.valueOf(numero.substring(i-1,i))*1);  
                multiplicador = 2;  
            }  
        }    
        for(int i = (numeros.length-1); i > 0; i--){  
            aux = String.valueOf(Integer.valueOf(numeros[i]));                
            if(aux.length()>1){  
                aux2 = aux.substring(0,aux.length()-1);               
                aux3 = aux.substring(aux.length()-1,aux.length());  
                numeros[i] = String.valueOf(Integer.valueOf(aux2) + Integer.valueOf(aux3));               
            }  
            else{  
                numeros[i] = aux;             
            }  
        }  
        for(int i = numeros.length; i > 0 ; i--){  
            if(numeros[i-1] != null){  
                acumulador += Integer.valueOf(numeros[i-1]);  
            }  
        }  
        resto = acumulador%10;  
        if(resto >0 ){
            dv = 10 - resto;  
        }else{
            dv=0;
        }  
        return dv;  
    }  

    @Override
    public int getModulo11(String numero) {
        //variáveis de instancia  
        int acumulador = 0;  
        int resto = 0;  
        int dv = 0;  
        String[] numeros = new String[numero.length()+1];  
        int multiplicador = 2;          
        for (int i = numero.length(); i > 0; i--) {               
            //Multiplica da direita pra esquerda, incrementando o multiplicador de 2 a 9  
            //Caso o multiplicador seja maior que 9 o mesmo recomeça em 2  
            if(multiplicador > 9){  
                // pega cada numero isoladamente    
                multiplicador = 2;  
                numeros[i] = String.valueOf(Integer.valueOf(numero.substring(i-1,i))*multiplicador);  
                multiplicador++;  
            }else{  
                numeros[i] = String.valueOf(Integer.valueOf(numero.substring(i-1,i))*multiplicador);  
                multiplicador++;  
            }  
        }    
        for(int i = numeros.length; i > 0 ; i--){  
            if(numeros[i-1] != null){  
                acumulador += Integer.valueOf(numeros[i-1]);  
            }  
        }  
        resto = acumulador%11;  
        dv = 11 - resto;    
        return dv;  
    }  
}
package br.com.xkinfo.slc.util.tableModel;

import br.com.xkinfo.slc.modelo.Pessoa;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class PessoaTableModel extends AbstractTableModel {

    private List<Pessoa> pessoas;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public PessoaTableModel() {
        try {
            pessoas = ServiceFactory.getPessoaService().getPessoas();
        } catch (Exception ex) {
            Logger.getLogger(PessoaTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return pessoas.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return pessoas.get(numLinha).getId();
            case 1:
                return pessoas.get(numLinha).getNome();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

}

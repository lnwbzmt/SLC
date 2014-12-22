package br.com.xkinfo.slc.util.tableModel;

import br.com.xkinfo.slc.modelo.PessoaUC;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class PessoaUCTableModel extends AbstractTableModel {

    private List<PessoaUC> pessoaUCs;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public PessoaUCTableModel() {
        try {
            pessoaUCs = ServiceFactory.getPessoaUCService().getPessoaUCs();
        } catch (Exception ex) {
            Logger.getLogger(PessoaUCTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return pessoaUCs.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return pessoaUCs.get(numLinha).getId();
            case 1:
                return pessoaUCs.get(numLinha).getProprietario();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<PessoaUC> getPessoaUCs() {
        return pessoaUCs;
    }

}

package br.com.xkinfo.slc.util.tableModel;

import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class CondominioTableModel extends AbstractTableModel {

    private List<Condominio> condominios;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public CondominioTableModel() {
        try {
            condominios = ServiceFactory.getCondominioService().getCondominios();
        } catch (Exception ex) {
            Logger.getLogger(CondominioTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return condominios.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return condominios.get(numLinha).getId();
            case 1:
                return condominios.get(numLinha).getNome();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Condominio> getCondominios() {
        return condominios;
    }

}

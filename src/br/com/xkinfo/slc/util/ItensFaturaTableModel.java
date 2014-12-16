package br.com.xkinfo.slc.util;

import br.com.xkinfo.slc.modelo.ItensFatura;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class ItensFaturaTableModel extends AbstractTableModel {

    private List<ItensFatura> itensFaturas;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public ItensFaturaTableModel() {
        try {
            itensFaturas = ServiceFactory.getItensFaturaService().getItensFaturas();
        } catch (Exception ex) {
            Logger.getLogger(ItensFaturaTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return itensFaturas.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return itensFaturas.get(numLinha).getId();
            case 1:
                return itensFaturas.get(numLinha).getItem();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<ItensFatura> getItensFaturas() {
        return itensFaturas;
    }

}

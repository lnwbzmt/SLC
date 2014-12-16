package br.com.xkinfo.slc.util;

import br.com.xkinfo.slc.modelo.ItensValor;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class ItensValorTableModel extends AbstractTableModel {

    private List<ItensValor> itensValores;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public ItensValorTableModel() {
        try {
            itensValores = ServiceFactory.getItensValorService().getItensValores();
        } catch (Exception ex) {
            Logger.getLogger(ItensValorTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return itensValores.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return itensValores.get(numLinha).getId();
            case 1:
                return itensValores.get(numLinha).getItem();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<ItensValor> getItensValors() {
        return itensValores;
    }

}

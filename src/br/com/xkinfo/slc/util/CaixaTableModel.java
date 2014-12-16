package br.com.xkinfo.slc.util;

import br.com.xkinfo.slc.modelo.Caixa;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class CaixaTableModel extends AbstractTableModel {

    private List<Caixa> caixas;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public CaixaTableModel() {
        try {
            caixas = ServiceFactory.getCaixaService().getCaixas();
        } catch (Exception ex) {
            Logger.getLogger(CaixaTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return caixas.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return caixas.get(numLinha).getId();
            case 1:
                return caixas.get(numLinha).getObservacao();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Caixa> getCaixas() {
        return caixas;
    }

}

package br.com.xkinfo.slc.util.tableModel;

import br.com.xkinfo.slc.modelo.UnidadeConsumidora;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class UnidadeConsumidoraTableModel extends AbstractTableModel {

    private List<UnidadeConsumidora> unidadeConsumidoras;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public UnidadeConsumidoraTableModel() {
        try {
            unidadeConsumidoras = ServiceFactory.getUnidadeConsumidoraService().getUnidadeConsumidoras();
        } catch (Exception ex) {
            Logger.getLogger(UnidadeConsumidoraTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return unidadeConsumidoras.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return unidadeConsumidoras.get(numLinha).getId();
            case 1:
                return unidadeConsumidoras.get(numLinha).getCondominio();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<UnidadeConsumidora> getUnidadeConsumidoras() {
        return unidadeConsumidoras;
    }

}

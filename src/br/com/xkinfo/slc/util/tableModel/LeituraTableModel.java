package br.com.xkinfo.slc.util.tableModel;

import br.com.xkinfo.slc.modelo.Leitura;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class LeituraTableModel extends AbstractTableModel {

    private List<Leitura> leituras;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public LeituraTableModel() {
        try {
            leituras = ServiceFactory.getLeituraService().getLeituras();
        } catch (Exception ex) {
            Logger.getLogger(LeituraTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return leituras.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return leituras.get(numLinha).getId();
            case 1:
                return leituras.get(numLinha).getOcorrencia();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Leitura> getLeituras() {
        return leituras;
    }

}

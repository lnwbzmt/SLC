package br.com.xkinfo.slc.util.tableModel;

import br.com.xkinfo.slc.modelo.Hidrometro;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class HidrometroTableModel extends AbstractTableModel {

    private List<Hidrometro> hidrometros;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public HidrometroTableModel() {
        try {
            hidrometros = ServiceFactory.getHidrometroService().getHidrometros();
        } catch (Exception ex) {
            Logger.getLogger(HidrometroTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return hidrometros.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return hidrometros.get(numLinha).getId();
            case 1:
                return hidrometros.get(numLinha).getNrserie();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Hidrometro> getHidrometros() {
        return hidrometros;
    }

}

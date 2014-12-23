package br.com.xkinfo.slc.util.tableModel;

import br.com.xkinfo.slc.modelo.HidrometroUc;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class HidrometroUCTableModel extends AbstractTableModel {

    private List<HidrometroUc> hidrometroUCs;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public HidrometroUCTableModel() {
        try {
            hidrometroUCs = ServiceFactory.getHidrometroUCService().getHidrometroUCs();
        } catch (Exception ex) {
            Logger.getLogger(HidrometroUCTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return hidrometroUCs.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return hidrometroUCs.get(numLinha).getId();
            case 1:
                return hidrometroUCs.get(numLinha).getUnidadeconsumidora();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<HidrometroUc> getHidrometroUCs() {
        return hidrometroUCs;
    }

}

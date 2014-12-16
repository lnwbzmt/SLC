package br.com.xkinfo.slc.util;

import br.com.xkinfo.slc.modelo.Itens;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class ItensTableModel extends AbstractTableModel {

    private List<Itens> condominios;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public ItensTableModel() {
        try {
            condominios = ServiceFactory.getItensService().getItens();
        } catch (Exception ex) {
            Logger.getLogger(ItensTableModel.class.getName()).log(Level.SEVERE, null, ex);
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
                return condominios.get(numLinha).getDescricao();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Itens> getItenss() {
        return condominios;
    }

}

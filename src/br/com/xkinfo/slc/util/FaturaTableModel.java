package br.com.xkinfo.slc.util;

import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class FaturaTableModel extends AbstractTableModel {

    private List<Condominio> faturas;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public FaturaTableModel() {
        try {
            faturas = ServiceFactory.getCondominioService().getCondominios();
        } catch (Exception ex) {
            Logger.getLogger(FaturaTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return faturas.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return faturas.get(numLinha).getId();
            case 1:
                return faturas.get(numLinha).getNome();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Condominio> getCondominios() {
        return faturas;
    }

}

package br.com.xkinfo.slc.util.tableModel;

import br.com.xkinfo.slc.modelo.Competencia;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class CompetenciaTableModel extends AbstractTableModel {

    private List<Competencia> competencias;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public CompetenciaTableModel() {
        try {
            competencias = ServiceFactory.getCompetenciaService().getCompetencias();
        } catch (Exception ex) {
            Logger.getLogger(CompetenciaTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return competencias.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return competencias.get(numLinha).getId();
            case 1:
                return competencias.get(numLinha).getCompetencia();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

}

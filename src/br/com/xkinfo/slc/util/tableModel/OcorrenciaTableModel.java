package br.com.xkinfo.slc.util.tableModel;

import br.com.xkinfo.slc.modelo.Ocorrencia;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class OcorrenciaTableModel extends AbstractTableModel {

    private List<Ocorrencia> ocorrencias;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public OcorrenciaTableModel() {
        try {
            ocorrencias = ServiceFactory.getOcorrenciaService().getOcorrencias();
        } catch (Exception ex) {
            Logger.getLogger(OcorrenciaTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return ocorrencias.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return ocorrencias.get(numLinha).getId();
            case 1:
                return ocorrencias.get(numLinha).getDescricao();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

}

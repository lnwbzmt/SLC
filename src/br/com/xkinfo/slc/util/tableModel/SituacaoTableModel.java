package br.com.xkinfo.slc.util.tableModel;

import br.com.xkinfo.slc.modelo.Situacao;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class SituacaoTableModel extends AbstractTableModel {

    private List<Situacao> situacoes;
    private String[] cabecalhoColunas = {"Código", "Descrição"};

    public SituacaoTableModel() {
        try {
            situacoes = ServiceFactory.getSituacaoService().getSituacoes();
        } catch (Exception ex) {
            Logger.getLogger(SituacaoTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return situacoes.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return situacoes.get(numLinha).getCodigo();
            case 1:
                return situacoes.get(numLinha).getDescricao();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Situacao> getSituacoes() {
        return situacoes;
    }

}

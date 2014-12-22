package br.com.xkinfo.slc.util.tableModel;

import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class UsuarioTableModel extends AbstractTableModel {

    private List<Usuario> usuarios;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public UsuarioTableModel() {
        try {
            usuarios = ServiceFactory.getUsuarioService().getUsuarios();
        } catch (Exception ex) {
            Logger.getLogger(UsuarioTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return usuarios.get(numLinha).getId();
            case 1:
                return usuarios.get(numLinha).getNome();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

}

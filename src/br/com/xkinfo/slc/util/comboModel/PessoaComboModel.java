package br.com.xkinfo.slc.util.comboModel;

import br.com.xkinfo.slc.modelo.Pessoa;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class PessoaComboModel extends AbstractListModel implements ComboBoxModel {
    
    private List<Pessoa> pessoas;
    private Object selectedItem;
    
    public PessoaComboModel(){  
        try {
            pessoas = ServiceFactory.getPessoaService().getPessoas() ;
        } catch (Exception ex) {
            Logger.getLogger(PessoaComboModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    public PessoaComboModel(List<Pessoa> pessoas){
        this();
        this.pessoas.addAll(pessoas);
    }
    
    @Override
    public int getSize() {
        return pessoas.size();
    }

    @Override
    public Object getElementAt(int index) {
        return pessoas.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = anItem;
        fireContentsChanged(this, -1, -1);  
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    public void changeList(List<Pessoa> newList){
        this.pessoas = newList;
        fireContentsChanged(this, 0, 0);
    }
}
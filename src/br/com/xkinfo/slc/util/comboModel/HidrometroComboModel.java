package br.com.xkinfo.slc.util.comboModel;

import br.com.xkinfo.slc.modelo.Hidrometro;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class HidrometroComboModel extends AbstractListModel implements ComboBoxModel {
    
    private List<Hidrometro> hidrometros;
    private Object selectedItem;
    
    public HidrometroComboModel(){  
        try {
            hidrometros = ServiceFactory.getHidrometroService().getHidrometros();
        } catch (Exception ex) {
            Logger.getLogger(HidrometroComboModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    public HidrometroComboModel(List<Hidrometro> hidrometros){
        this();
        this.hidrometros.addAll(hidrometros);
    }
    
    @Override
    public int getSize() {
        return hidrometros.size();
    }

    @Override
    public Object getElementAt(int index) {
        return hidrometros.get(index);
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

    public void changeList(List<Hidrometro> newList){
        this.hidrometros = newList;
        fireContentsChanged(this, 0, 0);
    }
}
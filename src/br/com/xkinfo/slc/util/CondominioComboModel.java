package br.com.xkinfo.slc.util;

import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class CondominioComboModel extends AbstractListModel implements ComboBoxModel {
    private List<Condominio> condominios;
    private Object selectedItem;
    public CondominioComboModel(){  
        try {
            condominios = ServiceFactory.getCondominioService().getCondominios();
        } catch (Exception ex) {
            Logger.getLogger(CondominioComboModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    public CondominioComboModel(List<Condominio> condominios){
        this();
        this.condominios.addAll(condominios);
    }
    @Override
    public int getSize() {
        return condominios.size();
    }

    @Override
    public Object getElementAt(int index) {
        return condominios.get(index);
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


    public void changeList(List<Condominio> newList){
        this.condominios = newList;
        fireContentsChanged(this, 0, 0);
    }
}
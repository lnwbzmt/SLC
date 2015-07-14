package br.com.xkinfo.slc.util.comboModel;

import br.com.xkinfo.slc.modelo.Situacao;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import jdk.nashorn.internal.objects.NativeArray;

public class SituacaoComboModel extends AbstractListModel implements ComboBoxModel {

    private List<Situacao> situacoes;
    private Situacao selectedItem;

    public SituacaoComboModel() {
        try {
            situacoes = ServiceFactory.getSituacaoService().getSituacoes();
        } catch (Exception ex) {
            Logger.getLogger(SituacaoComboModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public SituacaoComboModel(List<Situacao> Situacoes) {
        this();
        this.situacoes.addAll(Situacoes);
    }

    public SituacaoComboModel(int i) {
        this();
        for (Situacao situacoe : situacoes) {
            if (i == situacoe.getId())
                setSelectedItem(situacoe);
        }
    }

    @Override
    public int getSize() {
        return situacoes.size();
    }

    @Override
    public Object getElementAt(int index) {
        return situacoes.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Situacao) anItem;
        fireContentsChanged(this, -1, -1);
    }

    @Override
    public Situacao getSelectedItem() {
        return selectedItem;
    }

    public void changeList(List<Situacao> newList) {
        this.situacoes = newList;
        fireContentsChanged(this, 0, 0);
    }
}

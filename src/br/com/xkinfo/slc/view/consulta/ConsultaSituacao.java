package br.com.xkinfo.slc.view.consulta;

import br.com.xkinfo.slc.modelo.Situacao;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.util.tableModel.SituacaoTableModel;
import br.com.xkinfo.slc.view.cadastro.CadastroSituacao;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ConsultaSituacao extends javax.swing.JDialog {

    private Usuario usuarioLogado;
    private int coluna0 = 50;
    private int coluna1 = 150;
    DefaultTableCellRenderer direita;
    DefaultTableCellRenderer esquerda;
    DefaultTableCellRenderer centro;

    public ConsultaSituacao(java.awt.Frame parent, boolean modal, Usuario usuario) {
        super(parent, modal);
        centro = new DefaultTableCellRenderer();
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        usuarioLogado = usuario;
        usuarioLogado = usuario;
        initComponents();
        criarTela();
        // Lógica para manipular uma linha do JTable quando esta é selecionada    
        ListSelectionModel linhaModeloSelecao = jtSituacoes.getSelectionModel();
        linhaModeloSelecao.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Ignora o evento enquanto os valores da linha selecionada
                // estão sendo atualizados
                if (e.getValueIsAdjusting()) {
                    return;
                }
                // Verifica se existe uma linha selecionada. O
                // valor deve ser maior ou igual a 0, que é o número da linha
                if (jtSituacoes.getSelectedRow() >= 0) {
                    Integer linhaSelecionada = jtSituacoes.getSelectedRow();
                    Situacao caixaSelecionado = ((SituacaoTableModel) jtSituacoes.getModel()).getSituacoes().get(linhaSelecionada);
                    if (caixaSelecionado != null) {
                        CadastroSituacao cadastroSituacao = new CadastroSituacao(caixaSelecionado, null, true, usuarioLogado);
                        cadastroSituacao.setLocationRelativeTo(jScrollPane1.getParent());
                        cadastroSituacao.setVisible(true);
                        jtSituacoes.setModel(new SituacaoTableModel());
                    }
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtSituacoes = new javax.swing.JTable();
        bNovo = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Projetos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtSituacoes.setModel(new SituacaoTableModel());
        jtSituacoes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtSituacoes);

        bNovo.setText("Novo");
        bNovo.setMaximumSize(null);
        bNovo.setMinimumSize(null);
        bNovo.setPreferredSize(new java.awt.Dimension(75, 23));
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.setMaximumSize(null);
        bCancelar.setMinimumSize(null);
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiltro))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
        CadastroSituacao cadastroSituacao = new CadastroSituacao(null, true, usuarioLogado);
        cadastroSituacao.setLocationRelativeTo(this);
        cadastroSituacao.setVisible(true);
    }//GEN-LAST:event_bNovoActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jtSituacoes.updateUI();
        jtSituacoes.getRowHeight(0);
        jtSituacoes.setModel(new SituacaoTableModel());
        criarTela();
    }//GEN-LAST:event_formWindowActivated

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        TableRowSorter sorter = null;
        SituacaoTableModel model = (SituacaoTableModel) jtSituacoes.getModel();
        sorter = new TableRowSorter<TableModel>(model);
        jtSituacoes.setRowSorter(sorter);
        String text = txtFiltro.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void criarTela(){
        jtSituacoes.getColumnModel().getColumn(0).setPreferredWidth(coluna0);
        jtSituacoes.getColumnModel().getColumn(1).setPreferredWidth(coluna1);
        jtSituacoes.getColumnModel().getColumn(0).setCellRenderer(esquerda);
        jtSituacoes.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        ((DefaultTableCellRenderer) jtSituacoes.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtSituacoes;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}

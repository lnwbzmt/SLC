package br.com.xkinfo.slc.view.consulta;

import br.com.xkinfo.slc.modelo.Hidrometro;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.util.tableModel.HidrometroTableModel;
import br.com.xkinfo.slc.view.cadastro.CadastroHidrometro;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ConsultaHidrometro extends javax.swing.JDialog {

    private Usuario usuarioLogado;
    private int coluna0 = 50;
    private int coluna1 = 150;
    DefaultTableCellRenderer direita;
    DefaultTableCellRenderer esquerda;
    DefaultTableCellRenderer centro;
    
    TableCellRenderer tableCellRenderer = new DefaultTableCellRenderer() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        @Override
        public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof Date) {
                value = f.format(value);
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    };

    public ConsultaHidrometro(java.awt.Frame parent, boolean modal, Usuario usuario) {
        super(parent, modal);
        centro = new DefaultTableCellRenderer();
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        usuarioLogado = usuario;
        initComponents();
        criarTela();
        // Lógica para manipular uma linha do JTable quando esta é selecionada    
        ListSelectionModel linhaModeloSelecao = jtHidrometros.getSelectionModel();
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
                if (jtHidrometros.getSelectedRow() >= 0) {
                    Integer linhaSelecionada = jtHidrometros.getSelectedRow();
                    Hidrometro hidrometroSelecionado = ((HidrometroTableModel) jtHidrometros.getModel()).getHidrometros().get(linhaSelecionada);
                    if (hidrometroSelecionado != null) {
                        CadastroHidrometro cadastroHidrometro = new CadastroHidrometro(hidrometroSelecionado, null, true, usuarioLogado);
                        cadastroHidrometro.setLocationRelativeTo(jScrollPane1.getParent());
                        cadastroHidrometro.setVisible(true);
                        jtHidrometros.setModel(new HidrometroTableModel());
                    }
                }
            }

        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtHidrometros = new javax.swing.JTable();
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

        jtHidrometros.setModel(new HidrometroTableModel());
        jtHidrometros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtHidrometros);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 131, Short.MAX_VALUE)
                        .addComponent(bNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFiltro)))
                .addContainerGap())
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
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
        CadastroHidrometro cadastroHidrometro = new CadastroHidrometro(null, true, usuarioLogado);
        cadastroHidrometro.setLocationRelativeTo(this);
        cadastroHidrometro.setVisible(true);
    }//GEN-LAST:event_bNovoActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jtHidrometros.updateUI();
        jtHidrometros.getRowHeight(0);
        jtHidrometros.setModel(new HidrometroTableModel());
        criarTela();
    }//GEN-LAST:event_formWindowActivated

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        TableRowSorter sorter = null;
        HidrometroTableModel model = (HidrometroTableModel) jtHidrometros.getModel();
        sorter = new TableRowSorter<TableModel>(model);
        jtHidrometros.setRowSorter(sorter);

        String text = txtFiltro.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void criarTela(){
        jtHidrometros.getColumnModel().getColumn(0).setPreferredWidth(coluna0);
        jtHidrometros.getColumnModel().getColumn(1).setPreferredWidth(coluna1);
        jtHidrometros.getColumnModel().getColumn(0).setCellRenderer(esquerda);
        jtHidrometros.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        ((DefaultTableCellRenderer) jtHidrometros.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        jtHidrometros.getColumnModel().getColumn(1).setCellRenderer(tableCellRenderer);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtHidrometros;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}

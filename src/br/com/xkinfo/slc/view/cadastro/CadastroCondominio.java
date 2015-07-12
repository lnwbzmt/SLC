package br.com.xkinfo.slc.view.cadastro;

import br.com.xkinfo.slc.modelo.Condominio;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroCondominio extends javax.swing.JDialog {

    private Condominio condominioSelecionado;
    private Usuario usuarioLogado;

    public CadastroCondominio(java.awt.Frame parent, boolean modal, Usuario usuarioLogado) {
        super(parent, modal);
        initComponents();
        setTitle("ACAT - Associação Águas de Taquaruçu - " + usuarioLogado.getNome());
        getRootPane().setDefaultButton(bSalvar);
        bExcluir.setVisible(false);
        tfCodigo.setEnabled(false);
        tfUsuarioInclusao.setText(usuarioLogado.getNome());
    }

    public CadastroCondominio(java.awt.Frame parent, boolean modal, Usuario usuarioLogado, Condominio condominio) {
        this(parent, modal, usuarioLogado);
        condominioSelecionado = condominio;
        tfCodigo.setText(condominioSelecionado.getId().toString());
        tfNome.setText(condominioSelecionado.getNome());
        tfCnpj.setText(String.valueOf(condominioSelecionado.getCnpj()));
        tfEndereco.setText(condominioSelecionado.getEndereco());
        tfNumero.setText(String.valueOf(condominioSelecionado.getNumero()));
        tfComplemento.setText(condominioSelecionado.getComplemento());
        tfBairro.setText(condominioSelecionado.getBairro());
        tfCidade.setText(condominioSelecionado.getCidade());
        tfEstado.setText(condominioSelecionado.getEstado());
        tfSigla.setText(condominioSelecionado.getSigla());
        tfEmail.setText(condominioSelecionado.getEmail());
        tfUsuarioInclusao.setText(condominioSelecionado.getUsuarioinclusao().getNome());
        tfDataInclusao.setText(condominioSelecionado.getDatainclusao().toString());
        tfUsuarioAlteracao.setText(usuarioLogado.getNome());
        // Mostra o botão Excluir     
        bExcluir.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfCnpj = new javax.swing.JFormattedTextField();
        tfEndereco = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfComplemento = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfEstado = new javax.swing.JTextField();
        tfSigla = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfUsuarioInclusao = new javax.swing.JTextField();
        tfDataInclusao = new javax.swing.JTextField();
        tfUsuarioAlteracao = new javax.swing.JTextField();
        tfDataAlteracao = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        lblCnpj = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bSalvar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Condominios");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Condominio"));

        try {
            tfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tfUsuarioInclusao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tfUsuarioInclusao.setEnabled(false);

        tfDataInclusao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tfDataInclusao.setEnabled(false);

        tfUsuarioAlteracao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tfUsuarioAlteracao.setEnabled(false);

        tfDataAlteracao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tfDataAlteracao.setEnabled(false);

        lblNome.setText("Nome:");

        lNome.setText("Código:");

        lblCnpj.setText("CNPJ:");

        jLabel2.setText("Endereço:");

        jLabel3.setText("Número:");

        jLabel4.setText("Complemento:");

        jLabel5.setText("Bairro:");

        jLabel6.setText("Cidade:");

        jLabel7.setText("Estado:");

        jLabel8.setText("Sigla:");

        lblEmail.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Usuário Inclusão:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("Data Inclusão:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setText("Usuário Alteração:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setText("Data Alteração:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCnpj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfComplemento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tfEstado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfBairro, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfUsuarioAlteracao)
                    .addComponent(tfUsuarioInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDataAlteracao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDataInclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblCnpj))
                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfSigla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfUsuarioInclusao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataInclusao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfUsuarioAlteracao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfDataAlteracao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        bExcluir.setText("Excluir");
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalvar)
                    .addComponent(bCancelar)
                    .addComponent(bExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        try {
            String nome = tfNome.getText();
            String cnpj = tfCnpj.getText();
            String endereco = tfEndereco.getText();
            String nr = tfNumero.getText();
            String comp = tfComplemento.getText();
            String bairro = tfBairro.getText();
            String cidade = tfCidade.getText();
            String estado = tfEstado.getText();
            String sigla = tfSigla.getText();
            String email = tfEmail.getText();
            Boolean validar = ServiceFactory.getCondominioService().validarCondominio(nome, cnpj, email);
            if (validar) {
                ServiceFactory.getUtilService().certo(tfCnpj);
                ServiceFactory.getUtilService().certo(tfNome);
                ServiceFactory.getUtilService().certo(tfEmail);
                
                if (condominioSelecionado != null) {
                    Integer id = Integer.parseInt(tfCodigo.getText());
                    Usuario usuarioInclusao = condominioSelecionado.getUsuarioinclusao();
                    Date dataInclusao = condominioSelecionado.getDatainclusao();
                    try {
                        Boolean alterar = ServiceFactory.getCondominioService().alterarCondominio(id, nome, cnpj, endereco, nr, comp, bairro, cidade, estado, sigla, email, usuarioLogado, usuarioInclusao, dataInclusao);
                        if (alterar == true) {
                            condominioSelecionado = null;
                            dispose();
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(CadastroCondominio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        Boolean incluir = ServiceFactory.getCondominioService().incluirCondominio(nome, cnpj, endereco, nr, comp, bairro, cidade, estado, sigla, email, usuarioLogado);
                        if (incluir == true) {
                            dispose();
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(CadastroCondominio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else {
                lblNome.setText("<html>Nome:<font color=red>*</font> </html>");
                lblCnpj.setText("<html>CNPJ:<font color=red>*</font> </html>");
                lblEmail.setText("<html>E-mail:<font color=red>*</font> </html>");
                ServiceFactory.getUtilService().errado(tfNome);
                ServiceFactory.getUtilService().errado(tfCnpj);
                ServiceFactory.getUtilService().errado(tfEmail);      
            }
        } catch (Exception ex) {
            Logger.getLogger(CadastroCondominio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        Integer id = Integer.parseInt(tfCodigo.getText());
        if (condominioSelecionado != null) {
            try {
                ServiceFactory.getCondominioService().excluirCondominio(id);
                condominioSelecionado = null;
            } catch (Exception ex) {
                Logger.getLogger(CadastroCondominio.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
    }//GEN-LAST:event_bExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bSalvar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JFormattedTextField tfCnpj;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfDataAlteracao;
    private javax.swing.JTextField tfDataInclusao;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfSigla;
    private javax.swing.JTextField tfUsuarioAlteracao;
    private javax.swing.JTextField tfUsuarioInclusao;
    // End of variables declaration//GEN-END:variables
}

package br.com.xkinfo.slc.view.cadastro;

import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.service.ServiceFactory;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroUsuario extends javax.swing.JDialog {

    private Usuario usuarioSelecionado;
    private Usuario usuarioLogado;

    public CadastroUsuario(java.awt.Frame parent, boolean modal, Usuario usuarioLogado) {
        super(parent, modal);
        initComponents();
        setTitle("ACAT - Associação Águas de Taquaruçu - " + usuarioLogado.getNome());
        bExcluir.setVisible(false);
        this.tfCodigo.setEnabled(false);
        this.usuarioLogado = usuarioLogado;
    }

    public CadastroUsuario(java.awt.Frame parent, boolean modal, Usuario usuarioLogado, Usuario usuario) {
        this(parent, modal, usuario);
        usuarioSelecionado = usuario;
        this.usuarioLogado = usuarioLogado;
        if (usuarioSelecionado != null) {
            tfCodigo.setText(usuarioSelecionado.getId().toString());
            tfNome.setText(usuarioSelecionado.getNome());
            tfUsuario.setText(usuarioSelecionado.getUsuario());
            tfSenha.setText(usuarioSelecionado.getSenha());
            //tfNome.setText(usuario.getFatura().toString());
            // Mostra o botão Excluir     
            bExcluir.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        lblSenha = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        bSalvar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados dos Usuarios"));

        lblCodigo.setText("Código:");

        lblNome.setText("Nome:");

        lblUsuario.setText("Usuário:");

        lblSenha.setText("Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bExcluir.setText("Excluir");
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalvar)
                    .addComponent(bCancelar)
                    .addComponent(bExcluir))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Dados dos Usuários");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        try {                                        
            String nome = tfNome.getText();
            String usuario = tfUsuario.getText();
            String senha = ServiceFactory.getUtilService().criptografar(tfSenha.getText());
            try {
                Boolean validar = ServiceFactory.getUsuarioService().validarUsuario(nome, usuario, senha);
                if (validar) {
                    ServiceFactory.getUtilService().certo(tfNome);
                    ServiceFactory.getUtilService().certo(tfUsuario);
                    ServiceFactory.getUtilService().certo(tfSenha);
                    if (usuarioSelecionado != null) {
                        Integer id = Integer.parseInt(tfCodigo.getText());
                        Usuario usuarioInclusao = usuarioSelecionado.getUsuarioinclusao();
                        Date dataInclusao = usuarioSelecionado.getDatainclusao();
                        try {
                            Boolean alterar = ServiceFactory.getUsuarioService().alterarUsuario(id, nome, usuario, senha, usuarioLogado, usuarioInclusao, dataInclusao);
                            if (alterar == true) {
                                usuarioSelecionado = null;
                                dispose();
                            }
                        } catch (Exception ex) {
                            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        try {
                            
                            Boolean incluir = ServiceFactory.getUsuarioService().incluirUsuario(nome, usuario, senha, usuarioLogado);
                            if (incluir == true) {
                                usuarioSelecionado = null;
                                dispose();
                            }
                        } catch (Exception ex) {
                            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    usuarioSelecionado = null;
                    dispose();
                } else {
                    lblNome.setText("<html>Nome:<font color=red>*</font> </html>");
                    lblUsuario.setText("<html>Usuário:<font color=red>*</font> </html>");
                    lblSenha.setText("<html>Senha:<font color=red>*</font> </html>");
                    ServiceFactory.getUtilService().errado(tfNome);
                    ServiceFactory.getUtilService().errado(tfUsuario);
                    ServiceFactory.getUtilService().errado(tfSenha);
                }
            } catch (Exception ex) {
                Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        if (usuarioSelecionado != null) {
            try {
                ServiceFactory.getUsuarioService().excluirUsuario(usuarioSelecionado.getId());
                usuarioSelecionado = null;
            } catch (Exception ex) {
                Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
    }//GEN-LAST:event_bExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}

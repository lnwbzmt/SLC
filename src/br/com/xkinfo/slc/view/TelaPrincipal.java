package br.com.xkinfo.slc.view;

import br.com.xkinfo.slc.modelo.Usuario;

public class TelaPrincipal extends javax.swing.JFrame {

    private Usuario usuarioLogado;

    public TelaPrincipal(Usuario usuario) {
        usuarioLogado = usuario;
        initComponents();
        this.lUsuarioLogado.setText("Usuário Logado: " + usuarioLogado.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lUsuarioLogado = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        mn_condominio = new javax.swing.JMenuItem();
        mn_usuario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mn_consCondominio = new javax.swing.JMenuItem();
        mn_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        lUsuarioLogado.setText("Usuário: ");

        jMenu4.setText("Cadastros");

        mn_condominio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mn_condominio.setText("Condominio");
        mn_condominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_condominioActionPerformed(evt);
            }
        });
        jMenu4.add(mn_condominio);

        mn_usuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        mn_usuario.setText("Usuários");
        mn_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_usuarioActionPerformed(evt);
            }
        });
        jMenu4.add(mn_usuario);

        jMenuBar2.add(jMenu4);

        jMenu1.setText("Consulta");

        mn_consCondominio.setText("Condominio");
        mn_consCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_consCondominioActionPerformed(evt);
            }
        });
        jMenu1.add(mn_consCondominio);

        jMenuBar2.add(jMenu1);

        mn_sair.setText("Sair");
        mn_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mn_sairMouseClicked(evt);
            }
        });
        jMenuBar2.add(mn_sair);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(991, Short.MAX_VALUE)
                .addComponent(lUsuarioLogado)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lUsuarioLogado)
                .addContainerGap(402, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mn_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mn_sairMouseClicked
        this.dispose();
    }//GEN-LAST:event_mn_sairMouseClicked

    private void mn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_usuarioActionPerformed
        // Primeiro parâmetro do construtor: janela mãe, neste caso o this que representa a TelaPrincipal.java
        // Segundo parâmetro do construtor: se a JDialog vai ser modal, ou seja, bloqueia o foco da aplicação
        // na JDialog;
        //        ConsultaUsuario consultaUsuario = new ConsultaUsuario(this, true);
        //        consultaUsuario.setLocationRelativeTo(this);
        //        consultaUsuario.setVisible(true);
    }//GEN-LAST:event_mn_usuarioActionPerformed

    private void mn_condominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_condominioActionPerformed
        ConsultaCondominio consultaCondominio = new ConsultaCondominio(this, true);
        consultaCondominio.setLocationRelativeTo(this);
        consultaCondominio.setVisible(true);
    }//GEN-LAST:event_mn_condominioActionPerformed

    private void mn_consCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_consCondominioActionPerformed
        CadastroCondominio cadastroCondominio = new CadastroCondominio(this, true, usuarioLogado);
        cadastroCondominio.setLocationRelativeTo(this);
        cadastroCondominio.setVisible(true);
    }//GEN-LAST:event_mn_consCondominioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lUsuarioLogado;
    private javax.swing.JMenuItem mn_condominio;
    private javax.swing.JMenuItem mn_consCondominio;
    private javax.swing.JMenu mn_sair;
    private javax.swing.JMenuItem mn_usuario;
    // End of variables declaration//GEN-END:variables
}

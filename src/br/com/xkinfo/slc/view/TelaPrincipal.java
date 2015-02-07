package br.com.xkinfo.slc.view;

import br.com.xkinfo.slc.view.consulta.ConsultaCondominio;
import br.com.xkinfo.slc.view.cadastro.CadastroCondominio;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.view.cadastro.CadastroCompetencia;
import br.com.xkinfo.slc.view.cadastro.CadastroSituacao;
import br.com.xkinfo.slc.view.consulta.ConsultaCompetencia;
import br.com.xkinfo.slc.view.consulta.ConsultaSituacao;

public class TelaPrincipal extends javax.swing.JFrame {

    private final Usuario usuarioLogado;

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
        mCadastro = new javax.swing.JMenu();
        mn_condominio = new javax.swing.JMenuItem();
        mn_usuario = new javax.swing.JMenuItem();
        mn_Situacao = new javax.swing.JMenuItem();
        mn_competencia = new javax.swing.JMenuItem();
        mConsulta = new javax.swing.JMenu();
        mn_consCondominio = new javax.swing.JMenuItem();
        mn_consSituacao = new javax.swing.JMenuItem();
        mn_consCompetencia = new javax.swing.JMenuItem();
        mSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        lUsuarioLogado.setText("Usuário: ");

        mCadastro.setText("Cadastros");

        mn_condominio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mn_condominio.setText("Condominio");
        mn_condominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_condominioActionPerformed(evt);
            }
        });
        mCadastro.add(mn_condominio);

        mn_usuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        mn_usuario.setText("Usuários");
        mn_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_usuarioActionPerformed(evt);
            }
        });
        mCadastro.add(mn_usuario);

        mn_Situacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mn_Situacao.setText("Situação");
        mn_Situacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_SituacaoActionPerformed(evt);
            }
        });
        mCadastro.add(mn_Situacao);

        mn_competencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mn_competencia.setText("Competencia");
        mn_competencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_competenciaActionPerformed(evt);
            }
        });
        mCadastro.add(mn_competencia);

        jMenuBar2.add(mCadastro);

        mConsulta.setText("Consulta");

        mn_consCondominio.setText("Condominio");
        mn_consCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_consCondominioActionPerformed(evt);
            }
        });
        mConsulta.add(mn_consCondominio);

        mn_consSituacao.setText("Situação");
        mn_consSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_consSituacaoActionPerformed(evt);
            }
        });
        mConsulta.add(mn_consSituacao);

        mn_consCompetencia.setText("Competência");
        mn_consCompetencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_consCompetenciaActionPerformed(evt);
            }
        });
        mConsulta.add(mn_consCompetencia);

        jMenuBar2.add(mConsulta);

        mSair.setText("Sair");
        mSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSairMouseClicked(evt);
            }
        });
        jMenuBar2.add(mSair);

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

    private void mSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_mSairMouseClicked

    private void mn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_usuarioActionPerformed
        // Primeiro parâmetro do construtor: janela mãe, neste caso o this que representa a TelaPrincipal.java
        // Segundo parâmetro do construtor: se a JDialog vai ser modal, ou seja, bloqueia o foco da aplicação
        // na JDialog;
        //        ConsultaUsuario consultaUsuario = new ConsultaUsuario(this, true);
        //        consultaUsuario.setLocationRelativeTo(this);
        //        consultaUsuario.setVisible(true);
    }//GEN-LAST:event_mn_usuarioActionPerformed

    private void mn_condominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_condominioActionPerformed
        CadastroCondominio cadastroCondominio = new CadastroCondominio(this, true, usuarioLogado);
        cadastroCondominio.setLocationRelativeTo(this);
        cadastroCondominio.setVisible(true);
    }//GEN-LAST:event_mn_condominioActionPerformed

    private void mn_consCondominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_consCondominioActionPerformed
        ConsultaCondominio consultaCondominio = new ConsultaCondominio(this, true, usuarioLogado);
        consultaCondominio.setLocationRelativeTo(this);
        consultaCondominio.setVisible(true);
    }//GEN-LAST:event_mn_consCondominioActionPerformed

    private void mn_SituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_SituacaoActionPerformed
        CadastroSituacao cadastroSituacao = new CadastroSituacao(this, true, usuarioLogado);
        cadastroSituacao.setLocationRelativeTo(this);
        cadastroSituacao.setVisible(true);
    }//GEN-LAST:event_mn_SituacaoActionPerformed

    private void mn_consSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_consSituacaoActionPerformed
        ConsultaSituacao consultaSituacao = new ConsultaSituacao(this, true, usuarioLogado);
        consultaSituacao.setLocationRelativeTo(this);
        consultaSituacao.setVisible(true);
    }//GEN-LAST:event_mn_consSituacaoActionPerformed

    private void mn_competenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_competenciaActionPerformed
        CadastroCompetencia cadastroCompetencia = new CadastroCompetencia(this, true, usuarioLogado);
        cadastroCompetencia.setLocationRelativeTo(this);
        cadastroCompetencia.setVisible(true);

    }//GEN-LAST:event_mn_competenciaActionPerformed

    private void mn_consCompetenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_consCompetenciaActionPerformed
        ConsultaCompetencia consultaCompetencia = new ConsultaCompetencia(this, true, usuarioLogado);
        consultaCompetencia.setLocationRelativeTo(this);
        consultaCompetencia.setVisible(true);
    }//GEN-LAST:event_mn_consCompetenciaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lUsuarioLogado;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mConsulta;
    private javax.swing.JMenu mSair;
    private javax.swing.JMenuItem mn_Situacao;
    private javax.swing.JMenuItem mn_competencia;
    private javax.swing.JMenuItem mn_condominio;
    private javax.swing.JMenuItem mn_consCompetencia;
    private javax.swing.JMenuItem mn_consCondominio;
    private javax.swing.JMenuItem mn_consSituacao;
    private javax.swing.JMenuItem mn_usuario;
    // End of variables declaration//GEN-END:variables
}

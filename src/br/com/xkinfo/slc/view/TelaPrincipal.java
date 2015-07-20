package br.com.xkinfo.slc.view;

import br.com.xkinfo.slc.view.consulta.ConsultaCondominio;
import br.com.xkinfo.slc.view.cadastro.CadastroCondominio;
import br.com.xkinfo.slc.modelo.Usuario;
import br.com.xkinfo.slc.view.cadastro.CadastroCompetencia;
import br.com.xkinfo.slc.view.cadastro.CadastroHidrometro;
import br.com.xkinfo.slc.view.cadastro.CadastroPessoa;
import br.com.xkinfo.slc.view.cadastro.CadastroSituacao;
import br.com.xkinfo.slc.view.cadastro.CadastroUnidadeConsumidora;
import br.com.xkinfo.slc.view.cadastro.CadastroUsuario;
import br.com.xkinfo.slc.view.consulta.ConsultaCompetencia;
import br.com.xkinfo.slc.view.consulta.ConsultaHidrometro;
import br.com.xkinfo.slc.view.consulta.ConsultaPessoa;
import br.com.xkinfo.slc.view.consulta.ConsultaSituacao;
import br.com.xkinfo.slc.view.consulta.ConsultaUnidadeConsumidora;
import br.com.xkinfo.slc.view.consulta.ConsultaUsuario;

public class TelaPrincipal extends javax.swing.JFrame {

    private final Usuario usuarioLogado;

    public TelaPrincipal(Usuario usuario) {
        usuarioLogado = usuario;
        initComponents();
        setTitle("ACAT - Associação Águas de Taquaruçu - " + usuarioLogado.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        mn_condominio = new javax.swing.JMenuItem();
        mn_Situacao = new javax.swing.JMenuItem();
        mn_competencia = new javax.swing.JMenuItem();
        mn_usuario = new javax.swing.JMenuItem();
        mn_Hidrometro = new javax.swing.JMenuItem();
        mn_Pessoa = new javax.swing.JMenuItem();
        mn_UnidadeConsumidora = new javax.swing.JMenuItem();
        mConsulta = new javax.swing.JMenu();
        mn_consCompetencia = new javax.swing.JMenuItem();
        mn_consCondominio = new javax.swing.JMenuItem();
        mn_consHidrometro = new javax.swing.JMenuItem();
        mn_consPessoa = new javax.swing.JMenuItem();
        mn_consSituacao = new javax.swing.JMenuItem();
        mn_condUnidadeConsumidora = new javax.swing.JMenuItem();
        mn_consUsuario = new javax.swing.JMenuItem();
        mSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        mCadastro.setText("Cadastros");

        mn_condominio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mn_condominio.setText("Condominio");
        mn_condominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_condominioActionPerformed(evt);
            }
        });
        mCadastro.add(mn_condominio);

        mn_Situacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mn_Situacao.setText("Situação");
        mn_Situacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_SituacaoActionPerformed(evt);
            }
        });
        mCadastro.add(mn_Situacao);

        mn_competencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mn_competencia.setText("Competência");
        mn_competencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_competenciaActionPerformed(evt);
            }
        });
        mCadastro.add(mn_competencia);

        mn_usuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        mn_usuario.setText("Usuários");
        mn_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_usuarioActionPerformed(evt);
            }
        });
        mCadastro.add(mn_usuario);

        mn_Hidrometro.setText("Hidrômetros");
        mn_Hidrometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_HidrometroActionPerformed(evt);
            }
        });
        mCadastro.add(mn_Hidrometro);

        mn_Pessoa.setText("Pessoa");
        mn_Pessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_PessoaActionPerformed(evt);
            }
        });
        mCadastro.add(mn_Pessoa);

        mn_UnidadeConsumidora.setText("Unidade Consumidora");
        mn_UnidadeConsumidora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_UnidadeConsumidoraActionPerformed(evt);
            }
        });
        mCadastro.add(mn_UnidadeConsumidora);

        jMenuBar2.add(mCadastro);

        mConsulta.setText("Consulta");

        mn_consCompetencia.setText("Competência");
        mn_consCompetencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_consCompetenciaActionPerformed(evt);
            }
        });
        mConsulta.add(mn_consCompetencia);

        mn_consCondominio.setText("Condominio");
        mn_consCondominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_consCondominioActionPerformed(evt);
            }
        });
        mConsulta.add(mn_consCondominio);

        mn_consHidrometro.setText("Hidrometros");
        mn_consHidrometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_consHidrometroActionPerformed(evt);
            }
        });
        mConsulta.add(mn_consHidrometro);

        mn_consPessoa.setText("Pessoa");
        mn_consPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_consPessoaActionPerformed(evt);
            }
        });
        mConsulta.add(mn_consPessoa);

        mn_consSituacao.setText("Situação");
        mn_consSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_consSituacaoActionPerformed(evt);
            }
        });
        mConsulta.add(mn_consSituacao);

        mn_condUnidadeConsumidora.setText("Unidade Consumidora");
        mn_condUnidadeConsumidora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_condUnidadeConsumidoraActionPerformed(evt);
            }
        });
        mConsulta.add(mn_condUnidadeConsumidora);

        mn_consUsuario.setText("Usuario");
        mn_consUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_consUsuarioActionPerformed(evt);
            }
        });
        mConsulta.add(mn_consUsuario);

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
            .addGap(0, 1044, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mSairMouseClicked

    private void mn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_usuarioActionPerformed
        CadastroUsuario cadastroUsuario = new CadastroUsuario(this, true, usuarioLogado);
        cadastroUsuario.setLocationRelativeTo(this);
        cadastroUsuario.setVisible(true);
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

    private void mn_consUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_consUsuarioActionPerformed
        ConsultaUsuario consultaUsuario = new ConsultaUsuario(this, true, usuarioLogado);
        consultaUsuario.setLocationRelativeTo(this);
        consultaUsuario.setVisible(true);
    }//GEN-LAST:event_mn_consUsuarioActionPerformed

    private void mn_consHidrometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_consHidrometroActionPerformed
        ConsultaHidrometro consultaHidrometro = new ConsultaHidrometro(this, true, usuarioLogado);
        consultaHidrometro.setLocationRelativeTo(this);
        consultaHidrometro.setVisible(true);
    }//GEN-LAST:event_mn_consHidrometroActionPerformed

    private void mn_HidrometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_HidrometroActionPerformed
        CadastroHidrometro cadastroHidrometro = new CadastroHidrometro(this, true, usuarioLogado);
        cadastroHidrometro.setLocationRelativeTo(this);
        cadastroHidrometro.setVisible(true);
    }//GEN-LAST:event_mn_HidrometroActionPerformed

    private void mn_PessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_PessoaActionPerformed
        CadastroPessoa cadastroPessoa = new CadastroPessoa(this, true, usuarioLogado);
        cadastroPessoa.setLocationRelativeTo(this);
        cadastroPessoa.setVisible(true);
    }//GEN-LAST:event_mn_PessoaActionPerformed

    private void mn_consPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_consPessoaActionPerformed
        ConsultaPessoa consultaPessoa = new ConsultaPessoa(this, true, usuarioLogado);
        consultaPessoa.setLocationRelativeTo(this);
        consultaPessoa.setVisible(true);
    }//GEN-LAST:event_mn_consPessoaActionPerformed

    private void mn_UnidadeConsumidoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_UnidadeConsumidoraActionPerformed
        CadastroUnidadeConsumidora cadastroUC = new CadastroUnidadeConsumidora(this, true, usuarioLogado);
        cadastroUC.setLocationRelativeTo(this);
        cadastroUC.setVisible(true);
    }//GEN-LAST:event_mn_UnidadeConsumidoraActionPerformed

    private void mn_condUnidadeConsumidoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_condUnidadeConsumidoraActionPerformed
        ConsultaUnidadeConsumidora consultaUC = new ConsultaUnidadeConsumidora(this, true, usuarioLogado);
        consultaUC.setLocationRelativeTo(this);
        consultaUC.setVisible(true);
    }//GEN-LAST:event_mn_condUnidadeConsumidoraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mConsulta;
    private javax.swing.JMenu mSair;
    private javax.swing.JMenuItem mn_Hidrometro;
    private javax.swing.JMenuItem mn_Pessoa;
    private javax.swing.JMenuItem mn_Situacao;
    private javax.swing.JMenuItem mn_UnidadeConsumidora;
    private javax.swing.JMenuItem mn_competencia;
    private javax.swing.JMenuItem mn_condUnidadeConsumidora;
    private javax.swing.JMenuItem mn_condominio;
    private javax.swing.JMenuItem mn_consCompetencia;
    private javax.swing.JMenuItem mn_consCondominio;
    private javax.swing.JMenuItem mn_consHidrometro;
    private javax.swing.JMenuItem mn_consPessoa;
    private javax.swing.JMenuItem mn_consSituacao;
    private javax.swing.JMenuItem mn_consUsuario;
    private javax.swing.JMenuItem mn_usuario;
    // End of variables declaration//GEN-END:variables
}

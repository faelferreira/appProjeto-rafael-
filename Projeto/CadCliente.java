package Projeto;

import Classes.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.lang.NumberFormatException;
import sun.security.util.Password;

public class CadCliente extends javax.swing.JFrame {

    dbConexao conexao = new dbConexao();
    Cliente cliente = new Cliente();

    public CadCliente() {
        initComponents();
        setLocationRelativeTo(null);
        txtNivel.setText("3");
        txtEmail.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpbotoes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        rbtnPessoaFisica = new javax.swing.JRadioButton();
        rbtnPessoaJuridica = new javax.swing.JRadioButton();
        btnProsseguir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtNivel = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        lblRid = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CadastroLoginCliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(700, 430));
        setModalExclusionType(null);
        setSize(new java.awt.Dimension(1000, 1000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.setLayout(null);

        jPanel2.setMinimumSize(new java.awt.Dimension(600, 350));

        lblId.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("ID:");

        lblNivel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblNivel.setText("Nivel:");

        lblEmail.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblEmail.setText("Email:");

        lblLogin.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblLogin.setText("Login:");

        lblSenha.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblSenha.setText("Senha:");

        gpbotoes.add(rbtnPessoaFisica);
        rbtnPessoaFisica.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        rbtnPessoaFisica.setText("Pessoa Física");
        rbtnPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPessoaFisicaActionPerformed(evt);
            }
        });
        rbtnPessoaFisica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbtnPessoaFisicaKeyPressed(evt);
            }
        });

        gpbotoes.add(rbtnPessoaJuridica);
        rbtnPessoaJuridica.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        rbtnPessoaJuridica.setText("Pessoa Jurídica");
        rbtnPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPessoaJuridicaActionPerformed(evt);
            }
        });

        btnProsseguir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnProsseguir.setText("Prosseguir");
        btnProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsseguirActionPerformed(evt);
            }
        });
        btnProsseguir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnProsseguirKeyPressed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtNivel.setEnabled(false);
        txtNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNivelActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLoginKeyTyped(evt);
            }
        });

        lblRid.setText("########");

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSenhaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblId)
                        .addGap(18, 18, 18)
                        .addComponent(lblRid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSenha)
                            .addComponent(lblLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnPessoaFisica)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(btnProsseguir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rbtnPessoaJuridica)
                                        .addGap(90, 90, 90))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53))))
                            .addComponent(txtLogin)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNivel)
                    .addComponent(lblId)
                    .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnPessoaJuridica)
                    .addComponent(rbtnPessoaFisica, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProsseguir)
                    .addComponent(btnSair))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(60, 140, 580, 210);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Software");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 50, 180, 44);

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Construction");
        jLabel2.setToolTipText("");
        jLabel2.setAutoscrolls(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 90, 93, 23);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/Background 2.0.jpg"))); // NOI18N
        lblFundo.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel1.add(lblFundo);
        lblFundo.setBounds(0, 0, 730, 430);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 1, 730, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNivelActionPerformed

    private void btnProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsseguirActionPerformed
        conexao.conectar();
        try {

            String stf = "";

            if (rbtnPessoaFisica.isSelected()) {
                stf = "verdadeiro";
                Variable.perfil = 1;

            }
            if (rbtnPessoaJuridica.isSelected()) {
                stf = "falso";
                Variable.perfil = 2;
            }

            switch (stf) {
                case "verdadeiro":

                    int nivel = Integer.parseInt(txtNivel.getText());
                    cliente.setNivel(nivel);
                    String email = txtEmail.getText();
                    cliente.setEmail(email);
                    String login = txtLogin.getText();
                    cliente.setLogin(login);
                    String senha = String.valueOf(txtSenha.getPassword());
                    cliente.setSenha(senha);
                    cliente.setNivel(nivel);
                    int perfil = 1;
                    cliente.setStatus(perfil);
                    conexao.inserir(nivel, login, senha, email, perfil);
                    break;

                case "falso":
                    nivel = Integer.parseInt(txtNivel.getText());
                    cliente.setNivel(nivel);
                    email = txtEmail.getText();
                    cliente.setEmail(email);
                    login = txtLogin.getText();
                    cliente.setLogin(login);
                    senha = txtSenha.getText();
                    cliente.setSenha(senha);
                    cliente.setNivel(nivel);
                    perfil = 2;
                    cliente.setStatus(perfil);
                    conexao.inserir(nivel, login, senha, email, perfil);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Marcar a Opção de pessoa Fisica ou Juridica");

            }
            txtLogin.setText("");
            txtEmail.setText("");
            txtSenha.setText("");
            txtEmail.grabFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campos não pode ser vazio");
        } finally {
            conexao.desconectar();
            this.dispose();
        }
    }//GEN-LAST:event_btnProsseguirActionPerformed


    private void rbtnPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPessoaJuridicaActionPerformed

        btnProsseguir.grabFocus();
    }//GEN-LAST:event_rbtnPessoaJuridicaActionPerformed

    private void rbtnPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPessoaFisicaActionPerformed

        btnProsseguir.grabFocus();
    }//GEN-LAST:event_rbtnPessoaFisicaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
      
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
       
           
       
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
      
       if(txtEmail.getText().length()>= 45){
           evt.consume();
           JOptionPane.showMessageDialog(null,"Máximo 45 caractere.");
       }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyTyped
        
       if(txtLogin.getText().length()>= 20){
           evt.consume();
           JOptionPane.showMessageDialog(null,"Máximo 20 caractere.");
       }
    }//GEN-LAST:event_txtLoginKeyTyped

    private void txtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyTyped
       
       if(String.valueOf(txtSenha.getPassword()).length()>= 9){
           evt.consume();
           JOptionPane.showMessageDialog(null,"Máximo 9 digitos.");
       }
    }//GEN-LAST:event_txtSenhaKeyTyped

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLogin.grabFocus();
    }                             
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSenha.grabFocus();
    }                             
    }//GEN-LAST:event_txtLoginKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            rbtnPessoaFisica.grabFocus();
            rbtnPessoaFisica.isSelected();
    }                             
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void rbtnPessoaFisicaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtnPessoaFisicaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnProsseguir.grabFocus();
    }                             
    }//GEN-LAST:event_rbtnPessoaFisicaKeyPressed

    private void btnProsseguirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnProsseguirKeyPressed
       conexao.conectar();
        try {

            String stf = "";

            if (rbtnPessoaFisica.isSelected()) {
                stf = "verdadeiro";
                Variable.perfil = 1;

            }
            if (rbtnPessoaJuridica.isSelected()) {
                stf = "falso";
                Variable.perfil = 2;
            }

            switch (stf) {
                case "verdadeiro":

                    int nivel = Integer.parseInt(txtNivel.getText());
                    cliente.setNivel(nivel);
                    String email = txtEmail.getText();
                    cliente.setEmail(email);
                    String login = txtLogin.getText();
                    cliente.setLogin(login);
                    String senha = String.valueOf(txtSenha.getPassword());
                    cliente.setSenha(senha);
                    cliente.setNivel(nivel);
                    int perfil = 1;
                    cliente.setStatus(perfil);
                    conexao.inserir(nivel, login, senha, email, perfil);
                    break;

                case "falso":
                    nivel = Integer.parseInt(txtNivel.getText());
                    cliente.setNivel(nivel);
                    email = txtEmail.getText();
                    cliente.setEmail(email);
                    login = txtLogin.getText();
                    cliente.setLogin(login);
                    senha = txtSenha.getText();
                    cliente.setSenha(senha);
                    cliente.setNivel(nivel);
                    perfil = 2;
                    cliente.setStatus(perfil);
                    conexao.inserir(nivel, login, senha, email, perfil);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Marcar a Opção de pessoa Fisica ou Juridica");

            }
            txtLogin.setText("");
            txtEmail.setText("");
            txtSenha.setText("");
            txtEmail.grabFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campos não pode ser vazio");
        } finally {
            conexao.desconectar();
            this.dispose();
        
    }    
    }//GEN-LAST:event_btnProsseguirKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProsseguir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup gpbotoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblRid;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JRadioButton rbtnPessoaFisica;
    private javax.swing.JRadioButton rbtnPessoaJuridica;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void setSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

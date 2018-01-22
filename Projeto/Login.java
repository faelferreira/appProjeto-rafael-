package Projeto;

import java.awt.Toolkit;
import Classes.*;
import java.awt.event.KeyEvent;
import java.lang.NumberFormatException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    dbConexao conexao = new dbConexao();

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setIcon();
        lblAlterar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblAlterar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(700, 430));
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/logo.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 70, 140, 110);

        lblLogin.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Login");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(190, 210, 60, 20);

        txtLogin.setToolTipText("txtlogin");
        txtLogin.setMinimumSize(new java.awt.Dimension(20, 20));
        txtLogin.setPreferredSize(new java.awt.Dimension(20, 25));
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
        });
        getContentPane().add(txtLogin);
        txtLogin.setBounds(270, 210, 180, 25);

        lblSenha.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(190, 250, 70, 20);

        txtSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSenha.setPreferredSize(new java.awt.Dimension(20, 25));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(270, 250, 180, 20);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(330, 290, 63, 23);

        lblAlterar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAlterar.setForeground(new java.awt.Color(0, 0, 204));
        lblAlterar.setText("Alterar login e senha");
        lblAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlterarMouseClicked(evt);
            }
        });
        lblAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblAlterarKeyPressed(evt);
            }
        });
        getContentPane().add(lblAlterar);
        lblAlterar.setBounds(300, 320, 112, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/Background 2.0.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 700));
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 700));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getLabel() {
        return this.lblAlterar;
    }

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        conexao.conectar();

        try {
            Variable.usu = txtLogin.getText();
            Variable.pwd = String.valueOf(txtSenha.getPassword());

            if (conexao.check() == false) {
                boolean ver = false;
                
                if (ver == false && Variable.usu.equalsIgnoreCase("") && Variable.pwd.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(this, "Campo vazio! Informe login e senha");                
                } else if (ver == false) {
                    JOptionPane.showMessageDialog(null, "Login e senha invalidos!");
                    lblAlterar.setVisible(true);
                }
                
            } else {
                this.setVisible(false);
            }
            
            txtSenha.setText("");
            txtLogin.grabFocus();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Campo vazio! Informe login e senha");
            txtSenha.setText("");
            txtLogin.setText("");
            txtLogin.grabFocus();
            
        } finally {
            Variable.ckd = false;
            conexao.desconectar();
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
        conexao.conectar();
        try {
            Variable.usu = txtLogin.getText();
            Variable.pwd = String.valueOf(txtSenha.getPassword());
            txtSenha.setText("");
            txtLogin.setText("");
            txtLogin.grabFocus();

            if (conexao.check() == false) {
                boolean ver = false;
                if (ver == false && Variable.usu.equalsIgnoreCase("") && Variable.pwd.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(this, "Campo vazio! Informe login e senha");

                } else if (ver == false) {
                    JOptionPane.showMessageDialog(null, "Login e senha invalidos!");
                    lblAlterar.setVisible(true);
                }
            } else {
                this.setVisible(false);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Campo vazio! Informe login e senha");
            txtSenha.setText("");
            txtLogin.setText("");
            txtLogin.grabFocus();
        } finally {
            Variable.ckd = false;
            conexao.desconectar();
        }
    }//GEN-LAST:event_btnEntrarKeyPressed

    private void lblAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlterarMouseClicked
        AlterarLogin proximo = new AlterarLogin();
        proximo.setVisible(true);
        lblAlterar.setVisible(false);

    }//GEN-LAST:event_lblAlterarMouseClicked

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnEntrar.grabFocus();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSenha.grabFocus();
        }
    }//GEN-LAST:event_txtLoginKeyPressed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void lblAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblAlterarKeyPressed

    }//GEN-LAST:event_lblAlterarKeyPressed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAlterar;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}

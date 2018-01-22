/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import Classes.*;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author italo
 */
public class InserirProjeto extends javax.swing.JFrame {

    Funcionario funcionario = new Funcionario();
    Servico servico = new Servico();
    dbConexao conexao = new dbConexao();

    public InserirProjeto() {
        initComponents();
        setLocationRelativeTo(null);

        txtUrl.setEditable(false);
        cbxLista.setEditable(false);
        Variable.perfil = 0;
        consultarFuncionario();

    }

    public void consultarFuncionario() {
        funcionario.setId(0);
        conexao.conectar();
        ArrayList<String> listFun = new ArrayList();
        listFun = conexao.ListaFuncionarios();
        cbxFuncionarios.removeAllItems();
        try {
            for (int x = 0, y = 1; listFun.get(x) != ""; x++, y++) {
                if (listFun.get(x) != "" && x < 1) {
                    funcionario.setId(Integer.parseInt(listFun.get(x)));
                } else {
                    funcionario.setId(Integer.parseInt(listFun.get(x += 1)));
                }
                if (listFun.get(x) != "" && x < 1) {
                    funcionario.setNome(listFun.get(y));
                } else {
                    funcionario.setNome(listFun.get(y += 1));
                }
                cbxFuncionarios.addItem(funcionario.getId() + " - " + funcionario.getNome());
            }
        } catch (IndexOutOfBoundsException e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRd = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxFuncionarios = new javax.swing.JComboBox<>();
        cbxLista = new javax.swing.JComboBox<>();
        txtNomeArquivo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rdJuridico = new javax.swing.JRadioButton();
        rdFisico = new javax.swing.JRadioButton();
        btnSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeArquivo1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmLocalizar = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Software");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 30, 220, 60);

        jLabel9.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Construction");
        jLabel9.setMaximumSize(new java.awt.Dimension(155, 35));
        jLabel9.setMinimumSize(new java.awt.Dimension(155, 35));
        jLabel9.setPreferredSize(new java.awt.Dimension(155, 35));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(420, 80, 150, 30);

        cbxFuncionarios.setMaximumRowCount(105);
        cbxFuncionarios.setToolTipText("");
        getContentPane().add(cbxFuncionarios);
        cbxFuncionarios.setBounds(430, 230, 240, 30);

        cbxLista.setMaximumRowCount(105);
        cbxLista.setToolTipText("");
        getContentPane().add(cbxLista);
        cbxLista.setBounds(430, 170, 240, 30);
        getContentPane().add(txtNomeArquivo);
        txtNomeArquivo.setBounds(30, 290, 370, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Funcionarios");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 210, 160, 16);
        getContentPane().add(txtUrl);
        txtUrl.setBounds(30, 230, 370, 30);

        jPanel1.setBackground(new java.awt.Color(224, 227, 227));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N

        groupRd.add(rdJuridico);
        rdJuridico.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rdJuridico.setText("Pessoa Jurídica");
        rdJuridico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdJuridicoItemStateChanged(evt);
            }
        });
        rdJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdJuridicoActionPerformed(evt);
            }
        });
        jPanel1.add(rdJuridico);

        groupRd.add(rdFisico);
        rdFisico.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rdFisico.setText("Pessoa Física");
        rdFisico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdFisicoItemStateChanged(evt);
            }
        });
        jPanel1.add(rdFisico);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 120, 370, 80);

        btnSalvar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("btnsalvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(430, 290, 110, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Clientes");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 150, 90, 16);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Arquivo(*)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 210, 100, 16);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Nome do projeto(*)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 270, 160, 16);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/Background 2.0.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 690, 340);

        jLabel8.setText("jLabel2");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 200, 34, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/Background 2.0.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 340);
        getContentPane().add(txtNomeArquivo1);
        txtNomeArquivo1.setBounds(370, 170, 290, 30);

        jmArquivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jmArquivo.setText("Arquivo");
        jmArquivo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jmArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmArquivoActionPerformed(evt);
            }
        });

        jmLocalizar.setText("Localizar");
        jmLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLocalizarActionPerformed(evt);
            }
        });
        jmArquivo.add(jmLocalizar);

        jmSair.setText("Sair");
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        jmArquivo.add(jmSair);

        jMenuBar1.add(jmArquivo);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmArquivoActionPerformed

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed

        this.dispose();
    }//GEN-LAST:event_jmSairActionPerformed

    private void jmLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLocalizarActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Arquivo");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int retorno = fileChooser.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            File endereco = fileChooser.getSelectedFile();
            txtUrl.setText(endereco.getPath());
        }

    }//GEN-LAST:event_jmLocalizarActionPerformed

    private void rdJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdJuridicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdJuridicoActionPerformed

    private void rdJuridicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdJuridicoItemStateChanged
        try {
            cbxLista.removeAllItems();
            Variable.perfil = 2;
            ArrayList<String> list = new ArrayList();
            conexao.conectar();
            list = conexao.consulaClientes();
            String id = "";
            String nome = "";

            for (int i = 0, y = 1; list.get(i) != ""; i++, y++) {
                if (i > 0 && list.get(i) != "") {
                    id = list.get(i += 1);
                } else {
                    id = list.get(i);
                }
                if (y > 1 && list.get(i) != "") {

                    nome = list.get(y += 1);
                } else {
                    nome = list.get(y);
                }
                cbxLista.addItem(id + " - " + nome);
            }
            Variable.perfil = 0;
        } catch (IndexOutOfBoundsException e) {

        }
    }//GEN-LAST:event_rdJuridicoItemStateChanged

    private void rdFisicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdFisicoItemStateChanged
        try {
            cbxLista.removeAllItems();
            Variable.perfil = 1;
            ArrayList<String> list = new ArrayList();
            conexao.conectar();
            list = conexao.consulaClientes();
            String id = "";
            String nome = "";
            for (int i = 0, y = 1; list.get(i) != ""; i++, y++) {
                if (list.get(i) != "" && i < 1) {
                    id = list.get(i);
                } else if (list.get(i) != "" && i > 0) {
                    id = list.get(i += 1);
                }
                if (list.get(i) != "" && i < 1) {
                    nome = list.get(y);
                } else if (list.get(i) != "" && i > 0) {
                    nome = list.get(y += 1);
                }
                cbxLista.addItem(id + " - " + nome);
            }
            Variable.perfil = 0;
        } catch (IndexOutOfBoundsException e) {

        }
    }//GEN-LAST:event_rdFisicoItemStateChanged

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {
//___________________________________________________________________________________          
//***********************************************************************************
//******************Dados para gravar na tableba serviços****************************
//***********************************************************************************         
            String url = txtUrl.getText();
            servico.setUrl(url);
            String nomeArquivo = txtNomeArquivo.getText();
            servico.setNomeServico(nomeArquivo);
            conexao.inserirPjt(nomeArquivo, url);//metodo para gravar na tabela servico
//***********************************************************************************

//___________________________________________________________________________________          
//***********************************************************************************
//******************Dados do cliente para gravar na tableba de recionamentos*********
//***********************************************************************************
            String list = (String) cbxLista.getSelectedItem();
            String[] idC = list.split(" ", 3);
            int idCliente = Integer.parseInt(idC[0]);
            conexao.inserirRelacionamentoCliente(idCliente);
//***********************************************************************************

//___________________________________________________________________________________         
//***********************************************************************************
//**************Dados do funcionario para gravar na tableba de recionamentos*********
//***********************************************************************************
            String listF = (String) cbxFuncionarios.getSelectedItem();
            String[] idF = listF.split(" ", 3);
            int idFuncionario = Integer.parseInt(idF[0]);
            conexao.inserirRelacionamentoFuncionario(idFuncionario);
//***********************************************************************************      

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastar!");
        } finally {
            txtUrl.setText("");
            txtNomeArquivo.setText("");

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(InserirProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxFuncionarios;
    private javax.swing.JComboBox<String> cbxLista;
    private javax.swing.ButtonGroup groupRd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenuItem jmLocalizar;
    private javax.swing.JMenuItem jmSair;
    private javax.swing.JRadioButton rdFisico;
    private javax.swing.JRadioButton rdJuridico;
    private javax.swing.JTextField txtNomeArquivo;
    private javax.swing.JTextField txtNomeArquivo1;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}

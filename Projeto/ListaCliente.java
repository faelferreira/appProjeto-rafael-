/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import Classes.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fael
 */
public class ListaCliente extends javax.swing.JFrame {

    Funcionario colaborador = new Funcionario();
    Cliente cliente = new Cliente();
    dbConexao conexao = new dbConexao();

    /**
     * Creates new form ListaCliente
     */
    public ListaCliente() {
        initComponents();

    }

    public void opcao(String sql) {
        DefaultTableModel table = (DefaultTableModel) tabela.getModel();
        table.setNumRows(0);
        if (btnJuridico.isSelected() == true) {

            String sqlpj = sql;
            ArrayList<String> listaPJ = new ArrayList();
            listaPJ = conexao.consultaC(sqlpj);
            try {
                for (int i = 0, a = 1, b = 2, c = 3, d = 4; listaPJ.get(i) != ""; i += 5, a += 5, b += 5, c += 5, d += 5) {
                    String[] dadosPJ = {listaPJ.get(i), listaPJ.get(a), listaPJ.get(b), listaPJ.get(c), listaPJ.get(d)};
                    DefaultTableModel dtmLista = (DefaultTableModel) tabela.getModel();
                    dtmLista.addRow(dadosPJ);
                }
            } catch (IndexOutOfBoundsException e) {

            }
        }
        if (btnFisico.isSelected() == true) {
            String sqlpf = sql;
            ArrayList<String> listaPF = new ArrayList();
            listaPF = conexao.consultaC(sqlpf);
            try {
                for (int i = 0, a = 1, b = 2, c = 3, d = 4; listaPF.get(i) != ""; i += 5, a += 5, b += 5, c += 5, d += 5) {
                    String[] dados = {listaPF.get(i), listaPF.get(a), listaPF.get(b), listaPF.get(c), listaPF.get(d)};
                    DefaultTableModel dtmLista = (DefaultTableModel) tabela.getModel();
                    dtmLista.addRow(dados);
                }
            } catch (IndexOutOfBoundsException e) {

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupBtn = new javax.swing.ButtonGroup();
        btnBuscar = new javax.swing.JButton();
        txtColaborador = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnJuridico = new javax.swing.JRadioButton();
        btnFisico = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(930, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 80, 30));
        getContentPane().add(txtColaborador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 360, 30));
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 360, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Colaborador(*)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Cliente(*)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 120, -1));

        jPanel1.setBackground(new java.awt.Color(200, 196, 196));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N

        grupBtn.add(btnJuridico);
        btnJuridico.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnJuridico.setText("Pessoa juridica");
        btnJuridico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnJuridicoItemStateChanged(evt);
            }
        });

        grupBtn.add(btnFisico);
        btnFisico.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnFisico.setText("Pessoa fisica");
        btnFisico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnFisicoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnJuridico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addComponent(btnFisico)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJuridico)
                    .addComponent(btnFisico))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 340, 70));

        jScrollPane2.setToolTipText("");
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setAlignmentY(1.0F);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N

        tabela.setAutoCreateRowSorter(true);
        tabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabela.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Colaborador", "Cliente", "Id - Serviço", "Projeto", "Endereço do arquivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setToolTipText("");
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabela.setGridColor(new java.awt.Color(0, 0, 0));
        tabela.setRowMargin(5);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);
        tabela.getAccessibleContext().setAccessibleParent(jScrollPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 840, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/Background 2.0.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 440));

        jMenu1.setText("Arquivo");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jMenu1.add(btnSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel table = (DefaultTableModel) tabela.getModel();
        table.setNumRows(0);

        String sql = "";
        if (btnJuridico.isSelected() == true) {
             int x=1, y=0;
            if (txtColaborador.getText().equalsIgnoreCase("")) {
                if (txtCliente.getText().equalsIgnoreCase("")) {
                    y=1;
                    sql = "";
                }
                if(x==1 && y == 0 ){
                    sql = "SELECT * FROM VW_LISTA_PJ WHERE CLIENTE LIKE '" + txtCliente.getText() + "%' ";
                }
            } else if (txtCliente.getText().equalsIgnoreCase("")) {
                x=1;
                y=0;
                if (txtColaborador.getText().equalsIgnoreCase("")) {
                    y=1;
                    sql = "";
                }
                if(x==1 && y == 0 ){
                sql = "SELECT * FROM VW_LISTA_PJ WHERE COLABORADOR LIKE '" + txtColaborador.getText() + "%' ";
                }
            } else {
                sql = "SELECT * FROM VW_LISTA_PJ WHERE COLABORADOR LIKE '" + txtColaborador.getText() + "%' OR CLIENTE LIKE '" + txtCliente.getText() + "%' ";
            }
        }
        
        if (btnFisico.isSelected() == true) {
            if (txtColaborador.getText().equalsIgnoreCase("")) {
                 int x=1;
                 int y=0;
                if (txtCliente.getText().equalsIgnoreCase("")) {
                    y=1;
                    sql = "";
                }
                if(x==1 && y==0){
                   sql = "SELECT * FROM VW_LISTA_PF WHERE CLIENTE LIKE '" + txtCliente.getText() + "%' ";  
                }
            }
            else if (txtCliente.getText().equalsIgnoreCase("")){
                int x=1 ,y = 0;
                if (txtColaborador.getText().equalsIgnoreCase("")) {
                    y=1;
                    sql = "";
                }
                if(x== 1 && y==0){
                sql = "SELECT * FROM VW_LISTA_PF WHERE COLABORADOR LIKE '" + txtColaborador.getText() + "%' ";
                }
            } else {
                sql = "SELECT * FROM VW_LISTA_PF WHERE CLIENTE LIKE '" + txtCliente.getText() + "%' OR COLABORADOR LIKE '" + txtColaborador.getText() + "%' ";
            }
        }
        opcao(sql);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnJuridicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnJuridicoItemStateChanged
        String sql = "SELECT * FROM VW_LISTA_PJ";
        opcao(sql);

    }//GEN-LAST:event_btnJuridicoItemStateChanged

    private void btnFisicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnFisicoItemStateChanged
        String sql = "SELECT * FROM VW_LISTA_PF";
        opcao(sql);
    }//GEN-LAST:event_btnFisicoItemStateChanged

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        String comando = "";

        try {
            if (evt.getClickCount() == 2) {
                JTable target = (JTable) evt.getSource();
                int row = target.getSelectedRow();

                if (row != -1) {
                    comando = target.getValueAt(row, 4).toString();
                }

            }

            Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + comando);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }//GEN-LAST:event_tabelaMouseClicked

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
            java.util.logging.Logger.getLogger(ListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ListaCliente().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JRadioButton btnFisico;
    private javax.swing.JRadioButton btnJuridico;
    private javax.swing.JMenuItem btnSair;
    private javax.swing.ButtonGroup grupBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtColaborador;
    // End of variables declaration//GEN-END:variables
}

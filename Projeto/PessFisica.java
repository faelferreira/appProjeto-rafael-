/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import Classes.*;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

public class PessFisica extends javax.swing.JFrame {

    dbConexao conexao = new dbConexao();
    PessoaFisica psFisica = new PessoaFisica();
    //  SoNumeros num = new SoNumeros();
    public int CLIENTE_id;

    public PessFisica() {
        initComponents();
        /*txtDataDeNascimento.setDocument(num);
        txtTelefone.setDocument(num);
        txtCelular.setDocument(num);
        txtCep.setDocument(num);
        txtNumero.setDocument(num);*/
        setLocationRelativeTo(null);

    }

    public void teste(int v) {

        lblRid.setText(String.valueOf(CLIENTE_id));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gprbdBotoes = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        txtDataDeNascimento = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        rbdMasculino = new javax.swing.JRadioButton();
        rbdFeminino = new javax.swing.JRadioButton();
        lblRid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 430));
        getContentPane().setLayout(null);

        jPanel2.setPreferredSize(new java.awt.Dimension(530, 290));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Sexo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Data de Nascimento:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 180, -1));

        txtNome.setToolTipText("txtnome");
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 440, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Telefone:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 80, -1));

        txtTelefone.setToolTipText("txttelefone");
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 140, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Cpf:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtCpf.setToolTipText("txtcpf");
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfKeyTyped(evt);
            }
        });
        jPanel2.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 210, 20));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Celular:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 70, -1));

        txtCelular.setToolTipText("txtcelular");
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCelularKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        jPanel2.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 140, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("Cep:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtCep.setToolTipText("txtcep");
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCepKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCepKeyTyped(evt);
            }
        });
        jPanel2.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 210, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setText("ID:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 30, 14));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setText("Rua:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        txtRua.setToolTipText("txtrua");
        txtRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRuaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRuaKeyTyped(evt);
            }
        });
        jPanel2.add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 440, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setText("Numero:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 70, -1));

        txtNumero.setToolTipText("txtnumero");
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 210, -1));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setText("Bairro:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 60, -1));

        txtBairro.setToolTipText("txtbairro");
        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBairroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBairroKeyTyped(evt);
            }
        });
        jPanel2.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 140, -1));

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel14.setText("UF:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 30, -1));

        txtUf.setToolTipText("txtestado");
        txtUf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUfKeyTyped(evt);
            }
        });
        jPanel2.add(txtUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 30, -1));

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel15.setText("Cidade:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, -1));

        txtCidade.setToolTipText("txtcidade");
        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCidadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCidadeKeyTyped(evt);
            }
        });
        jPanel2.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 210, -1));

        btnCancelar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("btnvoltar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 120, -1));

        txtDataDeNascimento.setToolTipText("txtnasci");
        txtDataDeNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataDeNascimentoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDataDeNascimentoKeyTyped(evt);
            }
        });
        jPanel2.add(txtDataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 140, -1));

        btnInserir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setToolTipText("btnincluir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        btnInserir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnInserirKeyPressed(evt);
            }
        });
        jPanel2.add(btnInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 120, -1));

        gprbdBotoes.add(rbdMasculino);
        rbdMasculino.setText("Masculino");
        rbdMasculino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbdMasculino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbdMasculinoKeyPressed(evt);
            }
        });
        jPanel2.add(rbdMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        gprbdBotoes.add(rbdFeminino);
        rbdFeminino.setText("Feminino");
        rbdFeminino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(rbdFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        lblRid.setText("0");
        jPanel2.add(lblRid, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(90, 90, 540, 290);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Software");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 10, 220, 50);

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Construction");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 60, 130, 20);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/Background 2.0.jpg"))); // NOI18N
        jLabel17.setMaximumSize(new java.awt.Dimension(500, 700));
        jLabel17.setMinimumSize(new java.awt.Dimension(500, 700));
        jLabel17.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 0, 700, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        conexao.conectar();

        if (rbdMasculino.isSelected()) {
            Variable.opcao = "Masculino";
        }
        if (rbdFeminino.isSelected()) {
            Variable.opcao = "Feminino";

        }
        switch (Variable.opcao) {
            case "Masculino":
                psFisica.setSexo("Masculino");
                break;

            case "Feminino":
                psFisica.setSexo("Feminino");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Marcar a opção de sexo!");

        }

        psFisica.setSexo(Variable.opcao);
        String nome = txtNome.getText();
        psFisica.setNome(nome);
        String data = txtDataDeNascimento.getText();
        psFisica.setDataNasc(data);

        int telefone = Integer.parseInt(txtTelefone.getText());
        psFisica.setTelefone(telefone);
        long celular = Long.parseLong(txtCelular.getText());
        psFisica.setCelular(celular);
        String cpf = txtCpf.getText();
        psFisica.setCpf(cpf);
        int cep = Integer.parseInt(txtCep.getText());
        psFisica.setCep(cep);
        int id = Integer.parseInt(lblRid.getText());
        psFisica.setId(id);
        String rua = txtRua.getText();
        psFisica.setRua(rua);
        int numero = Integer.parseInt(txtNumero.getText());
        psFisica.setNumero(numero);
        String cidade = txtCidade.getText();
        psFisica.setCidade(cidade);
        String bairro = txtBairro.getText();
        psFisica.setBairro(bairro);
        String uf = txtUf.getText();
        psFisica.setUf(uf);
        try {
            conexao.gravarCliente(Variable.opcao, nome, data, telefone, celular, cpf, cep, id, rua, numero, cidade, bairro, uf);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo não pode ser vazio!");
        } finally {
            conexao.desconectar();
            this.dispose();
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Variable.cancelar = Integer.parseInt(lblRid.getText());
        try {
            conexao.conectar();
            int id = psFisica.getId();
            conexao.excluir(id);
        } catch (NumberFormatException e) {

        } finally {
            conexao.desconectar();
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        int numeroCaractere = 45;
        if (txtNome.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 45 caracteres");
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtDataDeNascimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        int numeroCaractere = 10;
        if (txtDataDeNascimento.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 10 caracteres");

        }
    }//GEN-LAST:event_txtDataDeNascimentoKeyTyped

    private void txtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

        int numeroCaractere = 10;
        if (txtTelefone.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 10 numeros.");
        }
    }//GEN-LAST:event_txtTelefoneKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
         String caracteres = "0123456789";
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }

        int numeroCaractere = 11;
        while (txtCelular.getText().length() >= numeroCaractere) {
            evt.consume();
                if(txtCelular.getText().length() >= numeroCaractere){
                    JOptionPane.showMessageDialog(null,"Numero maximo de caractere: 11 ");
                    txtCelular.setText("0");
                }
        }
          
    }//GEN-LAST:event_txtCelularKeyTyped
    
    private void txtCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyTyped
        int numeroCaractere = 11;
        if (txtCpf.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 11 numeros");
    }//GEN-LAST:event_txtCpfKeyTyped
    }
    private void txtCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyTyped
         String caracteres = "0123456789";
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }

        int numeroCaractere = 8;
        if (txtCep.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 8 numeros");
        }
    }//GEN-LAST:event_txtCepKeyTyped

    private void txtRuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuaKeyTyped
        int numeroCaractere = 45;
        if (txtRua.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 45 caracteres");
        }
    }//GEN-LAST:event_txtRuaKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
         String caracteres = "0123456789";
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        
        int numeroCaractere = 6;
        if (txtNumero.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 6 numeros");
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyTyped
        int numeroCaractere = 45;
        if (txtBairro.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 45 caracteres.");
        }
    }//GEN-LAST:event_txtBairroKeyTyped

    private void txtCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyTyped
        int numeroCaractere = 45;
        if (txtCidade.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 45 caracteres.");
        }
    }//GEN-LAST:event_txtCidadeKeyTyped

    private void txtUfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUfKeyTyped
        int numeroCaractere = 2;
        if (txtUf.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 2 caracteres.");
        }
    }//GEN-LAST:event_txtUfKeyTyped

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            rbdMasculino.grabFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void rbdMasculinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbdMasculinoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDataDeNascimento.grabFocus();
    }//GEN-LAST:event_rbdMasculinoKeyPressed
    }
    private void txtDataDeNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTelefone.grabFocus();
    }//GEN-LAST:event_txtDataDeNascimentoKeyPressed
    }
    private void txtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCelular.grabFocus();
    }//GEN-LAST:event_txtCpfKeyPressed
    }
    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCpf.grabFocus();
    }//GEN-LAST:event_txtTelefoneKeyPressed
    }
    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCep.grabFocus();
    }//GEN-LAST:event_txtCelularKeyPressed
    }
    private void txtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRua.grabFocus();
    }//GEN-LAST:event_txtCepKeyPressed
    }
    private void txtRuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNumero.grabFocus();
    }//GEN-LAST:event_txtRuaKeyPressed
    }
    private void txtNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtBairro.grabFocus();
    }//GEN-LAST:event_txtNumeroKeyPressed
    }
    private void txtBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCidade.grabFocus();
    }//GEN-LAST:event_txtBairroKeyPressed
    }
    private void txtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUf.grabFocus();
    }//GEN-LAST:event_txtCidadeKeyPressed
    }
    private void txtUfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnInserir.grabFocus();
    }//GEN-LAST:event_txtUfKeyPressed
    }
    private void btnInserirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnInserirKeyPressed
        conexao.conectar();

        if (rbdMasculino.isSelected()) {
            Variable.opcao = "Masculino";
        }
        if (rbdFeminino.isSelected()) {
            Variable.opcao = "Feminino";

        }
        switch (Variable.opcao) {
            case "Masculino":
                psFisica.setSexo("Masculino");
                break;

            case "Feminino":
                psFisica.setSexo("Feminino");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Marcar a opção de sexo!");

        }

        psFisica.setSexo(Variable.opcao);
        String nome = txtNome.getText();
        psFisica.setNome(nome);
        String data = txtDataDeNascimento.getText();
        psFisica.setDataNasc(data);

        int telefone = Integer.parseInt(txtTelefone.getText());
        psFisica.setTelefone(telefone);
        long celular = Long.parseLong(txtCelular.getText());
        psFisica.setCelular(celular);
        String cpf = txtCpf.getText();
        psFisica.setCpf(cpf);
        int cep = Integer.parseInt(txtCep.getText());
        psFisica.setCep(cep);
        int id = Integer.parseInt(lblRid.getText());
        psFisica.setId(id);
        String rua = txtRua.getText();
        psFisica.setRua(rua);
        int numero = Integer.parseInt(txtNumero.getText());
        psFisica.setNumero(numero);
        String cidade = txtCidade.getText();
        psFisica.setCidade(cidade);
        String bairro = txtBairro.getText();
        psFisica.setBairro(bairro);
        String uf = txtUf.getText();
        psFisica.setUf(uf);
        try {
            conexao.gravarCliente(Variable.opcao, nome, data, telefone, celular, cpf, cep, id, rua, numero, cidade, bairro, uf);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo não pode ser vazio!");
        } finally {
            conexao.desconectar();
            this.dispose();
        }
    }//GEN-LAST:event_btnInserirKeyPressed

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
            java.util.logging.Logger.getLogger(PessFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessFisica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInserir;
    private javax.swing.ButtonGroup gprbdBotoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblRid;
    private javax.swing.JRadioButton rbdFeminino;
    private javax.swing.JRadioButton rbdMasculino;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataDeNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}

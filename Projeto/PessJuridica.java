package Projeto;

import Classes.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class PessJuridica extends javax.swing.JFrame {

    dbConexao conexao = new dbConexao();
    Pessoa pessoa = new Pessoa();
    PessoaJuridica juridica = new PessoaJuridica();

    public int CLIENTE_id;

    public PessJuridica() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void teste(int v) {

        lblRid.setText(String.valueOf(v));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIE = new javax.swing.JTextField();
        checkInsento = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        lblRid = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(700, 430));
        getContentPane().setLayout(null);

        jLabel11.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Software ");
        jLabel11.setMaximumSize(new java.awt.Dimension(237, 68));
        jLabel11.setMinimumSize(new java.awt.Dimension(237, 68));
        jLabel11.setPreferredSize(new java.awt.Dimension(237, 68));
        jLabel11.setRequestFocusEnabled(false);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 10, 230, 50);

        jLabel13.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Construction");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(130, 60, 130, 20);

        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(520, 289));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("ID:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 10, 21, 21);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Cnpj:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 10, 40, 21);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Razão Social:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 40, 103, 21);

        txtRazaoSocial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRazaoSocial.setToolTipText("txtrs");
        txtRazaoSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRazaoSocialKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazaoSocialKeyTyped(evt);
            }
        });
        jPanel1.add(txtRazaoSocial);
        txtRazaoSocial.setBounds(180, 40, 330, 23);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Inscrição Estadual:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 70, 146, 21);

        txtIE.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtIE.setToolTipText("txtie");
        txtIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIEActionPerformed(evt);
            }
        });
        txtIE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIEKeyTyped(evt);
            }
        });
        jPanel1.add(txtIE);
        txtIE.setBounds(180, 70, 240, 23);

        checkInsento.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        checkInsento.setText("Insento");
        jPanel1.add(checkInsento);
        checkInsento.setBounds(430, 70, 81, 29);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Telefone:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 110, 70, 21);

        txtTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefone.setToolTipText("txttelefone");
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefone);
        txtTelefone.setBounds(90, 110, 200, 23);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Celular:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 110, 59, 21);

        txtCelular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCelular.setToolTipText("txtcelular");
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCelularKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        jPanel1.add(txtCelular);
        txtCelular.setBounds(380, 110, 130, 23);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Cep:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(330, 140, 34, 21);

        txtCep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCep.setToolTipText("txtcep");
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCepKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCepKeyTyped(evt);
            }
        });
        jPanel1.add(txtCep);
        txtCep.setBounds(380, 140, 130, 23);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("Bairro:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 140, 51, 21);

        txtBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBairro.setToolTipText("txtbairro");
        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBairroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBairroKeyTyped(evt);
            }
        });
        jPanel1.add(txtBairro);
        txtBairro.setBounds(90, 140, 200, 23);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setText("Rua:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 170, 34, 21);

        txtRua.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRua.setToolTipText("txtrua");
        txtRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRuaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRuaKeyTyped(evt);
            }
        });
        jPanel1.add(txtRua);
        txtRua.setBounds(90, 170, 200, 23);

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel14.setText("Numero:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(300, 170, 64, 21);

        txtNumero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumero.setToolTipText("txtnumero");
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumero);
        txtNumero.setBounds(380, 170, 130, 23);

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel15.setText("Cidade:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 200, 57, 21);

        txtCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCidade.setToolTipText("txtcidade");
        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCidadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCidadeKeyTyped(evt);
            }
        });
        jPanel1.add(txtCidade);
        txtCidade.setBounds(90, 200, 310, 23);

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel16.setText("UF:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(440, 200, 26, 21);

        txtUF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUF.setToolTipText("txtuf");
        txtUF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUFKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUFKeyTyped(evt);
            }
        });
        jPanel1.add(txtUF);
        txtUF.setBounds(470, 200, 41, 23);

        btnCancelar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("btnsair");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(300, 230, 110, 29);

        btnIncluir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setToolTipText("btnincluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        btnIncluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIncluirKeyPressed(evt);
            }
        });
        jPanel1.add(btnIncluir);
        btnIncluir.setBounds(120, 230, 110, 29);

        lblRid.setText("0");
        jPanel1.add(lblRid);
        lblRid.setBounds(80, 10, 50, 20);

        txtCnpj.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCnpj.setToolTipText("txtcnpj");
        txtCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCnpjKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCnpjKeyTyped(evt);
            }
        });
        jPanel1.add(txtCnpj);
        txtCnpj.setBounds(180, 10, 330, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 90, 540, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/Background 2.0.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(500, 700));
        jLabel2.setMinimumSize(new java.awt.Dimension(500, 700));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 390);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Constrution");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(200, 50, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        conexao.conectar();
        try {
            String insento = "";
            if (checkInsento.isSelected() == true) {
                insento = "Insento";
                juridica.setIe(insento);
            }
            if (checkInsento.isSelected() == false) {
                insento = txtIE.getText();
                juridica.setIe(insento);
            }
            String cnpj = txtCnpj.getText();
            int id = Integer.parseInt(lblRid.getText());
            juridica.setId(id);
            juridica.setCnpj(cnpj);
            String nome = txtRazaoSocial.getText();
            juridica.setNome(nome);
            int telefone = Integer.parseInt(txtTelefone.getText());
            juridica.setTelefone(telefone);
            long celular = Long.parseLong(txtCelular.getText());
            juridica.setCelular(celular);
            String bairro = txtBairro.getText();
            juridica.setBairro(bairro);
            int cep = Integer.parseInt(txtCep.getText());
            juridica.setCep(cep);
            int numero = Integer.parseInt(txtNumero.getText());
            juridica.setNumero(numero);
            String rua = txtRua.getText();
            juridica.setRua(rua);
            String cidade = txtCidade.getText();
            juridica.setCidade(cidade);
            String uf = txtUF.getText();
            juridica.setUf(uf);

            conexao.gravarClienteJd(cnpj, id, insento, cep, nome, telefone, celular, rua, numero, bairro, cidade, uf);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo invalido!");
        } finally {
            conexao.desconectar();
            this.dispose();
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void txtIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIEActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        Variable.cancelar = Integer.parseInt(lblRid.getText());
        try {
            conexao.conectar();
            int id = pessoa.getId();
            conexao.excluir(id);
        } catch (NumberFormatException e) {

        } finally {
            conexao.desconectar();
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCnpjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnpjKeyTyped
        int numeroCaractere = 15;
        if (txtCnpj.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 15 numeros");
        }
    }//GEN-LAST:event_txtCnpjKeyTyped

    private void txtRazaoSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazaoSocialKeyTyped
        int numeroCaractere = 45;
        if (txtRazaoSocial.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 45 caracteres");
        }
    }//GEN-LAST:event_txtRazaoSocialKeyTyped

    private void txtIEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIEKeyTyped
        int numeroCaractere = 15;
        if (txtIE.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 15 caracteres");
        }
    }//GEN-LAST:event_txtIEKeyTyped

    private void txtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

        int numeroCaractere = 10;
        if (txtTelefone.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 10 numeros");
        }
    }//GEN-LAST:event_txtTelefoneKeyTyped

    private void txtBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyTyped
        int numeroCaractere = 45;
        if (txtBairro.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 45 caracteres");
        }
    }//GEN-LAST:event_txtBairroKeyTyped

    private void txtRuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuaKeyTyped
        int numeroCaractere = 45;
        if (txtRua.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 45 caracteres");
        }
    }//GEN-LAST:event_txtRuaKeyTyped

    private void txtCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyTyped
        int numeroCaractere = 45;
        if (txtCidade.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 45 caracteres");
        }
    }//GEN-LAST:event_txtCidadeKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

        int numeroCaractere = 11;
        if (txtCelular.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 11 numeros.");
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

        int numeroCaractere = 8;
        if (txtCep.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 8 numeros.");
        }
    }//GEN-LAST:event_txtCepKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

        int numeroCaractere = 5;
        if (txtNumero.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 5 numeros");
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtUFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUFKeyTyped
        int numeroCaractere = 2;
        if (txtUF.getText().length() >= numeroCaractere) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maximo 2 caracteres");
        }
    }//GEN-LAST:event_txtUFKeyTyped

    private void txtCnpjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnpjKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRazaoSocial.grabFocus();
        }
    }//GEN-LAST:event_txtCnpjKeyPressed

    private void txtRazaoSocialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazaoSocialKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtIE.grabFocus();
        }
    }//GEN-LAST:event_txtRazaoSocialKeyPressed

    private void txtIEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIEKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTelefone.grabFocus();
        }
    }//GEN-LAST:event_txtIEKeyPressed

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCelular.grabFocus();
        }
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtBairro.grabFocus();
        }
    }//GEN-LAST:event_txtCelularKeyPressed

    private void txtBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCep.grabFocus();
        }
    }//GEN-LAST:event_txtBairroKeyPressed

    private void txtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRua.grabFocus();
        }
    }//GEN-LAST:event_txtCepKeyPressed

    private void txtRuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNumero.grabFocus();
        }
    }//GEN-LAST:event_txtRuaKeyPressed

    private void txtNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCidade.grabFocus();
        }
    }//GEN-LAST:event_txtNumeroKeyPressed

    private void txtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUF.grabFocus();
        }
    }//GEN-LAST:event_txtCidadeKeyPressed

    private void txtUFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnIncluir.grabFocus();
        }
    }//GEN-LAST:event_txtUFKeyPressed

    private void btnIncluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIncluirKeyPressed

        conexao.conectar();
        try {
            String insento = "";
            if (checkInsento.isSelected() == true) {
                insento = "Insento";
                juridica.setIe(insento);
            }
            if (checkInsento.isSelected() == false) {
                insento = txtIE.getText();
                juridica.setIe(insento);
            }
            String cnpj = txtCnpj.getText();
            int id = Integer.parseInt(lblRid.getText());
            juridica.setId(id);
            juridica.setCnpj(cnpj);
            String nome = txtRazaoSocial.getText();
            juridica.setNome(nome);
            int telefone = Integer.parseInt(txtTelefone.getText());
            juridica.setTelefone(telefone);
            long celular = Long.parseLong(txtCelular.getText());
            juridica.setCelular(celular);
            String bairro = txtBairro.getText();
            juridica.setBairro(bairro);
            int cep = Integer.parseInt(txtCep.getText());
            juridica.setCep(cep);
            int numero = Integer.parseInt(txtNumero.getText());
            juridica.setNumero(numero);
            String rua = txtRua.getText();
            juridica.setRua(rua);
            String cidade = txtCidade.getText();
            juridica.setCidade(cidade);
            String uf = txtUF.getText();
            juridica.setUf(uf);

            conexao.gravarClienteJd(cnpj, id, insento, cep, nome, telefone, celular, rua, numero, bairro, cidade, uf);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo invalido!");
        } finally {
            conexao.desconectar();
            this.dispose();
        }
    }//GEN-LAST:event_btnIncluirKeyPressed

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
            java.util.logging.Logger.getLogger(PessJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessJuridica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkInsento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRid;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtIE;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}

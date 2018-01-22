package Classes;

import Projeto.PessJuridica;
import Projeto.Acesso;
import Projeto.PessFisica;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class dbConexao {

    Funcionario funcionario = new Funcionario();
    Servico servico = new Servico();

    int idServico;
    final String user = "root";
    final String password = "";
    final String url = "jdbc:mysql://localhost:3306/dbprojeto";
    Connection con;

    private Statement st;
    private ResultSet rs;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public void conectar() {
        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            System.out.println("Conexão realisada com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar:\n" + e);
        }
    }

    public void desconectar() {
        try {
            st.close();
            con.close();
            System.out.println("Desconectado");
        } catch (SQLException e) {
            System.out.println("Erro ao desconectar: " + e);
        }
    }

    public boolean check() {
        try {
            rs = st.executeQuery("SELECT *FROM`colaborador` WHERE login = '" + Variable.usu + "' AND senha = '" + Variable.pwd + "'");
            if (rs.next()) {
                Variable.ckd = true;
                if (Variable.ckd) {
                    Variable.nivel = (Integer.parseInt(rs.getString("nivel")));
                    Acesso proximo = new Acesso(rs.getString("nome"));
                    proximo.setVisible(true);
                }
            } else {
                Variable.ckd = true;
                return false;
            }
            return Variable.ckd;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro no banco " + e);
        }
        return Variable.ckd;
    }

    public void inserir(int nivel, String login, String senha, String email, int status) {
        try {
            st.executeUpdate("INSERT INTO CLIENTE (NIVEL,LOGIN,SENHA,EMAIL,PERFIL_USUARIO) VALUES(" + nivel + ",'" + login + "','" + senha + "','" + email + "'," + status + ")");
            rs = st.executeQuery("select last_insert_id() as id ");//pega o ultimo id para colocar em uma variavel
            if (rs.next()) {
                int ultimoId = rs.getInt("id");
                if (Variable.perfil == 1) {
                    PessFisica pf = new PessFisica();
                    pf.CLIENTE_id = ultimoId;
                    pf.teste(ultimoId);
                    pf.setVisible(true);
                }
                if (Variable.perfil == 2) {
                    PessJuridica pj = new PessJuridica();
                    pj.CLIENTE_id = ultimoId;
                    pj.teste(ultimoId);
                    pj.setVisible(true);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuario ja cadastrado!  ");

        }
    }

    public void gravarCliente(String sexo, String nome, String data, int telefone, long celular, String cpf, int cep, int id, String rua, int numero, String cidade, String bairro, String uf) {
        try {
            st.executeUpdate("insert into pessoa_fisica(cpf,Cliente_id,nome,sexo,data_nasc,telfixo,cel,cep,rua,num,bair,uf,cid) values('" + cpf + "'," + id + ",'" + nome + "' , '" + sexo + "', '" + data + "' , " + telefone + ", " + celular + "," + cep + ", '" + rua + "' , " + numero + ", '" + bairro + "' , '" + uf + "' , '" + cidade + "')");
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cliente ja Existe!");
        }

    }

    public void gravarClienteJd(String cnpj, int id, String insento, int cep, String nome, int telefone, long celular, String rua, int numero, String bairro, String cidade, String uf) {
        try {
            st.executeUpdate("insert into pessoa_juridica_2(cnpj,Cliente_id,IE,razaoSocial,tel,cel,cep,rua,num,bair,cid,UF) values('" + cnpj + "'," + id + ",'" + insento + "','" + nome + "', " + telefone + " , " + celular + ", " + cep + ",'" + rua + "', " + numero + " , '" + bairro + "', '" + cidade + "', '" + uf + "')");
            JOptionPane.showMessageDialog(null, "Incluido com sucesso.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cliente ja Existe!");
        }

    }

    public void excluir(int id) {
        try {
            st.executeUpdate("DELETE FROM CLIENTE WHERE ID = " + Variable.cancelar + " ");
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir!");
        }

    }

    public void alterarLoginFr(String senha, String login, String email) {
        try {
            rs = st.executeQuery("select email from colaborador where email = '" + email + "' ");
            if (rs.next()) {
                st.executeUpdate("UPDATE COLABORADOR SET senha ='" + senha + "',login ='" + login + "' WHERE EMAIL ='" + email + "' ");
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                Variable.ckd = false;
            } else {
                JOptionPane.showMessageDialog(null, "Email invalido!");
                Variable.ckd = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar!");
        } finally {
            desconectar();
        }
    }

    public ArrayList consultaFun() {
        ArrayList<String> lista = new ArrayList();
        try {

            rs = st.executeQuery("SELECT ID,SENHA,LOGIN,NOME,EMAIL,CARGO,NIVEL FROM COLABORADOR WHERE CPF = '" + Variable.cpf + "'");
            while (rs.next()) {
                Variable.ckd = true;
                lista.add(rs.getString("id"));
                lista.add(rs.getString("senha"));
                lista.add(rs.getString("login"));
                lista.add(rs.getString("nome"));
                lista.add(rs.getString("email"));
                lista.add(rs.getString("cargo"));
                lista.add(rs.getString("nivel"));
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuario ja cadastrado!  ");
        } finally {
            desconectar();
        }
        return lista;
    }

    public void cadastrarFuncionario(String senha, String login, String nome, String cpf, String email, String cargo, int nivel) {
        try {
            st.executeUpdate("INSERT INTO COLABORADOR (SENHA,LOGIN,NOME,CPF,EMAIL,CARGO,NIVEL) VALUE ('" + senha + "','" + login + "','" + nome + "','" + cpf + "','" + email + "','" + cargo + "'," + nivel + ")");
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuario ja cadastrado!");
        } finally {
            desconectar();
        }
    }

    public void alterarFuncionario(String senha, String login, String nome, String cpf, String email, String cargo, int nivel) {
        try {
            st.executeUpdate("UPDATE COLABORADOR SET SENHA = '" + senha + "',LOGIN = '" + login + "',NOME = '" + nome + "',CPF = '" + cpf + "',EMAIL = '" + email + "',CARGO = '" + cargo + "',NIVEL=" + nivel + " WHERE CPF = '" + cpf + "'");
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuario ja existe!");
        } finally {
            desconectar();
        }
    }

    public ArrayList consulaClientes() {

        ArrayList<String> listClientes = new ArrayList();

        try {
            if (Variable.perfil == 1) {
                rs = st.executeQuery("SELECT CLIENTE_ID,NOME FROM PESSOA_FISICA");
                while (rs.next()) {
                    listClientes.add(rs.getString("cliente_id"));
                    listClientes.add(rs.getString("nome"));
                }
            } else if (Variable.perfil == 2) {
                rs = st.executeQuery("SELECT CLIENTE_ID,RAZAOSOCIAL FROM PESSOA_JURIDICA_2");
                while (rs.next()) {
                    listClientes.add(rs.getString("cliente_id"));
                    listClientes.add(rs.getString("razaosocial"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar cliente!");
        } finally {
            desconectar();
        }

        return listClientes;
    }

    public ArrayList ListaFuncionarios() {
        ArrayList<String> listFuncionarios = new ArrayList();
        try {
            rs = st.executeQuery("SELECT * FROM COLABORADOR");
            while (rs.next()) {
                listFuncionarios.add(rs.getString("id"));
                listFuncionarios.add(rs.getString("nome"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar funcionario!");
        } finally {
            desconectar();
        }
        return listFuncionarios;
    }

    public void inserirPjt(String nome, String url) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = new java.util.Date();
        conectar();
        try {
            st.executeUpdate("INSERT INTO SERVICOS (NOME,DATA_TERMINO,URL_ARQUIVO) VALUES('" + nome + "','" + dateFormat.format(date) + "','" + url.replaceAll("\\\\", "\\\\\\\\") + "')");
            rs = st.executeQuery("select last_insert_id() as id ");
            if (rs.next()) {
                idServico = rs.getInt("id");
            } else {
                idServico = 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar!");
        } finally {
            desconectar();
        }
    }

    public void inserirRelacionamentoCliente(int idCliente) {
        conectar();
        try {
            st.executeUpdate("INSERT INTO CLIENTE_HAS_SERVICOS(CLIENTE_ID,SERVICOS_ID) VALUES (" + idCliente + "," + idServico + ")");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar id de cliente e serviço!");
        } finally {
            desconectar();
        }
    }

    public void inserirRelacionamentoFuncionario(int idFuncionario) {
        try {
            conectar();
            st.executeUpdate("INSERT INTO SERVICOS_HAS_COLABORADOR (COLABORADOR_ID,SERVICOS_ID) VALUES(" + idFuncionario + "," + idServico + ")");
            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar id de funcionario e serviço!");
        } finally {
            desconectar();
        }
    }

    public ArrayList Consulta(String nomeColaborador, String nomeCliente) {
        ArrayList<String> consulta = new ArrayList();
        try {
            conectar();
            rs = st.executeQuery("SELECT * FROM LISTA_PF WHERE ");
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar!");
        } finally {
            desconectar();
        }

        return consulta;
    }
    
    
    public ArrayList consultaC(String sqlc){
        ArrayList <String> listaPF = new ArrayList();
        try{
            conectar();
            rs = st.executeQuery(sqlc);
            while(rs.next()){
                listaPF.add(rs.getString("colaborador"));
                listaPF.add(rs.getString("cliente"));
                listaPF.add(rs.getString("id_servico"));
                listaPF.add(rs.getString("projeto"));
                listaPF.add(rs.getString("endereco_arquivo"));
            }
        }catch(SQLException e){
    
    }finally{
            desconectar();
            }
        return listaPF;
    }
}



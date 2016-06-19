/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentcar.DAO;

/**
 *
 * @author LEONE
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import br.com.rentcar.BEANS.Cliente;
import br.com.rentcar.UTIL.JavaWebException;

public class ClienteDAOImpl implements ClienteDAO {

    private final String INSERT_QUERY = "insert into cliente_tb (cod_cliente,nom_cliente,num_cpf,telefone,email) values (?,?,?,?,?)";
    private final String SELECT_ALL_QUERY = "select * from cliente_tb";
    private final String DELETE_QUERY = "delete from cliente_tb where cod_cliente = ?";
    private final String SELECT_BY_ID_QUERY = "select * from cliente_tb where cod_cliente = ? ";
    
    public final void save(Cliente c) throws JavaWebException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement prepStmt = null;
        try {
            conn = ConnectionManager.getConexao();
            prepStmt = conn.prepareStatement(INSERT_QUERY);
            prepStmt.setInt(1, c.getId());
            prepStmt.setString(2, c.getNome());
            prepStmt.setString(3, c.getCpf());
            prepStmt.setString(4, c.getTelefone());
            prepStmt.setString(5, c.getEmail());
            prepStmt.execute();
        } catch (SQLException e) {
            String msg = "[ClienteDB][save(Cliente c)]: " + e.getMessage();
            JavaWebException ge = new JavaWebException(msg, e);
            throw ge;
        } finally {
            ConnectionManager.closeAll(conn, prepStmt, rs);
        }
    }

    
    public List<Cliente> getListaCliente() throws JavaWebException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            conn = ConnectionManager.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SELECT_ALL_QUERY);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                Cliente c = new Cliente(id, nome, cpf, telefone, email);
                listaCliente.add(c);
            }
        } catch (SQLException e) {
            String msg = "[ClienteDB][getListaCliente()]: " + e.getMessage();
            JavaWebException ge = new JavaWebException(msg, e);
            throw ge;
        } finally {
            ConnectionManager.closeAll(conn, stmt, rs);
        }
        return listaCliente;
    }
    
    public Cliente getClienteById(int id) throws JavaWebException {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        Cliente oCliente = null;
        try {
            conn = ConnectionManager.getConexao();
            prepStmt = conn.prepareStatement(SELECT_BY_ID_QUERY);
            prepStmt.setInt(1, id);
            rs = prepStmt.executeQuery();
            if (rs.next()) {
                //int cod_login = rs.getInt("cod_login");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                oCliente = new Cliente(id, nome, cpf, telefone, email);
            }
        } catch (SQLException e) {
            String msg = "[ClienteDB][getClienteById()]: " + e.getMessage();
            JavaWebException ge = new JavaWebException(msg, e);
            throw ge;
        } finally {
            ConnectionManager.closeAll(conn, prepStmt, rs);
        }
        return oCliente;
    }
}

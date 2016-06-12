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
import br.com.rentcar.BEANS.Usuario;
import br.com.rentcar.UTIL.JavaWebException;

public class UsuarioDAOImpl{

    //private final String INSERT_QUERY = "insert into login_tb (cod_login,usuario,senha) values (?,?,?)";
    //private final String SELECT_ALL_QUERY = "select * from login_tb";
    private final String SELECT_USUARIO = "select * from login_tb where usuario = ? and senha = ?";
    
    /*
    public final void save(Usuario u) throws JavaWebException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement prepStmt = null;
        
        try {
            conn = GerenciadorConexoes.getConexao();
            prepStmt = conn.prepareStatement(INSERT_QUERY);
            prepStmt.setInt(1, u.getid());
            prepStmt.setString(2, u.getusuario());
            prepStmt.setString(3, u.getsenha());
            prepStmt.execute();
        } catch (SQLException e) {
            String msg = "[UsuarioDB][save(Usuario u)]: " + e.getMessage();
            JavaWebException ge = new JavaWebException(msg, e);
            throw ge;
        } finally {
            GerenciadorConexoes.closeAll(conn, prepStmt, rs);
        }
    }
    */
    
    public Usuario getUsuario(String usuario, String senha) throws JavaWebException {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        Usuario user = new Usuario(usuario,senha);
        
        try {
            
            conn = ConnectionManager.getConexao();
            prepStmt = conn.prepareStatement(SELECT_USUARIO);
            prepStmt.setString(1, usuario);
            prepStmt.setString(2, senha);
            rs = prepStmt.executeQuery();
            if (rs.next()) { 
                
                return user;
            }
        } catch (SQLException e) {
            String msg = "[UsuarioDB][getUsuarioById()]: " + e.getMessage();
            JavaWebException ge = new JavaWebException(msg, e);
            throw ge;
        } finally {
            ConnectionManager.closeAll(conn, prepStmt, rs);
        }
        return user;
    }
}

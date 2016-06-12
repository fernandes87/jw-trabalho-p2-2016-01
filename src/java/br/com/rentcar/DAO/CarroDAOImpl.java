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
import br.com.rentcar.BEANS.Carro;
import br.com.rentcar.UTIL.JavaWebException;

public class CarroDAOImpl implements CarroDAO {

    private final String INSERT_QUERY = "insert into carro_tb (cod_carro,modelo_carro,marca_carro,ano_carro,disponivel, ar, qtde_porta, direcao_hid, valor_diaria ) values (?,?,?,?,?,?,?,?,?)";
    private final String SELECT_ALL_QUERY = "select * from carro_tb";
    private final String SELECT_BY_ID_QUERY = "select * from carro_tb where cod_carro = ? ";
    
    public final void save(Carro a) throws JavaWebException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement prepStmt = null;
        try {
            conn = ConnectionManager.getConexao();
            prepStmt = conn.prepareStatement(INSERT_QUERY);
            prepStmt.setInt(1, a.getId());
            prepStmt.setString(2, a.getModelo());
            prepStmt.setString(3, a.getMarca());
            prepStmt.setString(4, a.getAno());
            prepStmt.setString(5, a.getDisponivel());
            prepStmt.setString(6, a.getAr());
            prepStmt.setInt(7, a.getPorta());
            prepStmt.setString(8, a.getDirecao());
            prepStmt.setDouble(9, a.getValor());
            prepStmt.execute();
        } catch (SQLException e) {
            String msg = "[CarroDB][save(Carro a)]: " + e.getMessage();
            JavaWebException ge = new JavaWebException(msg, e);
            throw ge;
        } finally {
            ConnectionManager.closeAll(conn, prepStmt, rs);
        }
    }

    
    public List<Carro> getListaCarro() throws JavaWebException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Carro> listaCarro = new ArrayList<Carro>();
        try {
            conn = ConnectionManager.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SELECT_ALL_QUERY);
            while (rs.next()) {
                int id = rs.getInt("id");
                String modelo = rs.getString("modelo");
                String marca = rs.getString("marca");
                String ano = rs.getString("ano");
                String disponivel = rs.getString("disponivel");
                String ar = rs.getString("ar");
                int porta = rs.getInt("porta");
                String direcao = rs.getString("direcao");
                double valor = rs.getDouble("valor");
                Carro a = new Carro(id, modelo, marca, ano, disponivel, ar, porta, disponivel, valor);
                listaCarro.add(a);
            }
        } catch (SQLException e) {
            String msg = "[CarroDB][getListaCarro()]: " + e.getMessage();
            JavaWebException ge = new JavaWebException(msg, e);
            throw ge;
        } finally {
            ConnectionManager.closeAll(conn, stmt, rs);
        }
        return listaCarro;
    }
    
    public Carro getCarroById(int id) throws JavaWebException {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        Carro oCarro = null;
        try {
            conn = ConnectionManager.getConexao();
            prepStmt = conn.prepareStatement(SELECT_BY_ID_QUERY);
            prepStmt.setInt(1, id);
            rs = prepStmt.executeQuery();
            if (rs.next()) {
                //int id = rs.getInt("id");
                String modelo = rs.getString("modelo");
                String marca = rs.getString("marca");
                String ano = rs.getString("ano");
                String disponivel = rs.getString("disponivel");
                String ar = rs.getString("ar");
                int porta = rs.getInt("porta");
                String direcao = rs.getString("direcao");
                double valor = rs.getDouble("valor");
                oCarro = new Carro(id, modelo, marca, ano, disponivel, ar, porta, disponivel, valor);
            }
        } catch (SQLException e) {
            String msg = "[CarroDB][getCarroById()]: " + e.getMessage();
            JavaWebException ge = new JavaWebException(msg, e);
            throw ge;
        } finally {
            ConnectionManager.closeAll(conn, prepStmt, rs);
        }
        return oCarro;
    }
}

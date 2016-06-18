/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentcar.BUSINESS;

/**
 *
 * @author LEONE
 */

import br.com.rentcar.DAO.ConnectionManager;
import java.sql.*;

public class ValidateUser {
    public static boolean checkUser(String usuario,String senha) 
    {
      boolean st =false;
      Connection conn = null;
      
      try{
          conn = ConnectionManager.getConexao();
         PreparedStatement ps = conn.prepareStatement ("select * from login_tb where usuario=? and senha=?");
         ps.setString(1, usuario);
         ps.setString(2, senha);
         ResultSet rs = ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
    }
}

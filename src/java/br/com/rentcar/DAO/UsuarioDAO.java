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
import java.util.List;
import br.com.rentcar.UTIL.JavaWebException;
import br.com.rentcar.BEANS.Usuario;

public interface UsuarioDAO {

    public void save(Usuario u) throws JavaWebException;

    //public List<Usuario> getListaUsuario() throws JavaWebException;

    public Usuario getUsuarioById(int cod_login) throws JavaWebException;
}

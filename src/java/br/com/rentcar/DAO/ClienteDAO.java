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
import br.com.rentcar.BEANS.Cliente;

public interface ClienteDAO {

    public void save(Cliente c) throws JavaWebException;

    public List<Cliente> getListaCliente() throws JavaWebException;

    public Cliente getClienteById(int id) throws JavaWebException;
}

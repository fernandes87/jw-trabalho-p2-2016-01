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
import br.com.rentcar.BEANS.Carro;

public interface CarroDAO {

    public void save(Carro c) throws JavaWebException;

    public List<Carro> getListaCarro() throws JavaWebException;

    public Carro getCarroById(int id) throws JavaWebException;
}

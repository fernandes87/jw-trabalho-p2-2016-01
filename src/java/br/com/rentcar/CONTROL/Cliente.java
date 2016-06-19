/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentcar.CONTROL;

import java.util.List;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import br.com.rentcar.DAO.ClienteDAO;
import br.com.rentcar.DAO.ClienteDAOImpl;
import br.com.rentcar.UTIL.JavaWebException;

/**
 *
 * @author LEONE
 */
public class Cliente extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        String nome = request.getParameter("edtNome");
        String cpf = request.getParameter("edtCpf");
        String telefone = request.getParameter("edtTelefone");
        String email = request.getParameter("edtEmail");
        
        ClienteDAOImpl clnt = new ClienteDAOImpl();
        //clnt.save(c);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/cliente.jsp");
        dispatcher.forward(request, response);
    }
}

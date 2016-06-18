/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentcar.CONTROL;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LEONE
 */
public class Main extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String carro = request.getParameter("btCarro");
        String cliente = request.getParameter("btCliente");
        String aluguel = request.getParameter("btAluguel");
        String relatorio = request.getParameter("btRelatorio");
        
        if(carro != null && carro != " ") {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/carro.jsp");
            dispatcher.forward(request, response);
            
        }else if(cliente != null && cliente != " "){
            RequestDispatcher dispatcher = request.getRequestDispatcher("/cliente.jsp");
            dispatcher.forward(request, response);
            
        }else if(aluguel != null && aluguel != " "){
            RequestDispatcher dispatcher = request.getRequestDispatcher("/aluguel.jsp");
            dispatcher.forward(request, response);
            
        }else if(relatorio != null && relatorio != " "){
            RequestDispatcher dispatcher = request.getRequestDispatcher("/relatorio.jsp");
            dispatcher.forward(request, response);
        }
    }
}

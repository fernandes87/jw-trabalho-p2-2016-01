/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentcar.CONTROL;

import br.com.rentcar.BUSINESS.ValidateUser;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.RequestDispatcher;

/**
 *
 * @author LEONE
 */

public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String usuario = request.getParameter("edtUsuario");
        String senha = request.getParameter("edtSenha");
        
        if(ValidateUser.checkUser(usuario, senha))
         {
            //manda msg e vai para o main.jsp
             RequestDispatcher dispatcher = request.getRequestDispatcher("/main.jsp");
            dispatcher.forward(request, response);
        }
        else
        {
            //manda msg e volta para index.jsp
            String msg = "Usuario ou Senha incorreto!";
            request.setAttribute("msgErro", msg);
             RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
        }
    }
}

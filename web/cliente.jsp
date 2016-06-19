<%-- 
    Document   : cliente
    Created on : 10/06/2016, 17:47:45
    Author     : LEONE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RentCar - Cadastro de Clientes</title>
    </head>
    <body>
        <h1><center><font size="10"> RentCar, Seu Carro Já! </font></center></h1>
        <form action="Cliente" method="post">
            <strong><center><font size="5"> Cadastro de Clientes </font></center></strong><br><br><br>
            <table align="center" border="0">
                <tbody>
                    <tr>
                        <td>Nome: </td>
                        <td><input type="text" name="edtNome" size="50"/></td>
                    </tr>
                        
                    <tr>
                        <td>Cpf: </td>
                        <td><input type="text" name="edtCpf" size="20"/></td>
                    </tr>
                    
                    <tr>
                        <td>Telefone: </td>
                        <td><input type="text" name="edtTelefone" size="20"/></td>
                    </tr>
                    
                    <tr>
                        <td>E-mail: </td>
                        <td><input type="text" name="edtEmail" size="40"/></td>
                    </tr>
                    
                </tbody>
                
            </table>
            <table align="center"><br><br><br>
                <tr>
                    <td><input type ="submit" style="width:100px" value="Incluir"/></td>
                    <td><input type ="submit" style="width:100px" value="Alterar"/></td>
                    <td><input type ="submit" style="width:100px" value="Excluir"/></td>
                    <td><input type ="submit" style="width:100px" value="Voltar"/></td>
                </tr>
            </table>
        </form>    
    </body>
</html>


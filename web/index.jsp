<%-- 
    Document   : index
    Created on : 09/06/2016, 11:45:37
    Author     : LEONE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RentCar!</title>
    </head>
    <body>
        <form action ="loginUsuario" method="post">
            <strong><center><font size="10"> RentCar, Seu Carro Já! </font><center></strong><br/><br><br><br><br><br><br><br>
            <table>
                <strong><center><font size="10"> ${msgErro} </font><center></strong
                <tr alight="center">
                    <td>
                        <div align="right">
                            Usuario: <input type="text" name="edtUsuario"><br><br>
                            Senha: <input type="password" name="edtSenha"><br><br>
                            <input type ="submit" value="OK"/>
                        </div>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>

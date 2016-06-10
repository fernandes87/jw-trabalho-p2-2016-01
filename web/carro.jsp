<%-- 
    Document   : carro
    Created on : 10/06/2016, 15:25:53
    Author     : LEONE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RentCar - Cadastro de Carros</title>
    </head>
    <body>
        <h1><center><font size="10"> RentCar, Seu Carro Já! </font></center></h1>
        <form action="" method="post">
            <strong><center><font size="5"> Cadastro de Carros </font></center></strong><br><br><br>
            <table align="center" border="0">
                <tbody>
                    <tr>
                        <td>Modelo: </td>
                        <td><input type="text" name="modelo" size="40"/></td>
                    </tr>
                        
                    <tr>
                        <td>Marca: </td>
                        <td><input type="text" name="marca" size="40"/></td>
                    </tr>
                    
                    <tr>
                        <td>Ano: </td>
                        <td><input type="text" name="ano" size="10"/></td>
                    </tr>
                    
                    <tr>
                        <td>Disponível: </td>
                        <td>
                            <select name="disp">
                                <option>Sim</option>
                                <option>Não</option>
                            </select>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Ar Cond. : </td>
                        <td>
                            <select name="ar">
                                <option> - </option>
                                <option>Sim</option>
                                <option>Não</option>
                            </select>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Qtde Portas: </td>
                        <td>
                            <select name="porta">
                                <option>4</option>
                                <option>2</option>
                            </select>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Direção: </td>
                        <td>
                            <select name="dir">
                                <option>Sim</option>
                                <option>Não</option>
                            </select>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Diaria: </td>
                        <td><input type="text" name="diaria" value="0.00" size="10"/></td>
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

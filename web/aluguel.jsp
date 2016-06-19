<%-- 
    Document   : aluguel
    Created on : 10/06/2016, 17:53:08
    Author     : LEONE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RentCar - Cadastro de Reservas</title>
    </head>
    <body>
        <h1><center><font size="10"> RentCar, Seu Carro Já! </font></center></h1>
        <form action="Aluguel" method="post">
            <strong><center><font size="5"> Reserva de Carro </font></center></strong><br><br><br>
            <table align="center" border="0">
                <tbody>
                    <tr>
                        <td>Cliente: </td>
                        <td>
                            <select>
                                <option value=" ">= Selecione =</option>
                                <option value="anderson">Anderson</option>
                                <option value="bruno">Bruno</option>
                                <option value="eduardo">Eduardo</option>
                                <option value="leone">Leone</option>
                            </select>
                        </td>    
                    </tr>
                        
                    <tr>
                        <td>Carro: </td>
                        <td>
                            <select>
                                <option value=" ">= Selecione =</option>
                                <option value="audi">Audi</option>
                                <option value="mercedes">Mercedes</option>
                                <option value="saab">Saab</option>
                                <option value="volvo">Volvo</option>                                
                            </select>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Data Reserva: </td>
                        <td><input type="text" name="edtReserva" value="18/06/2016" size="20"/></td>
                    </tr>
                    
                    <tr>
                        <td>Data Devolução: </td>
                        <td><input type="text" name="edtDevolucao" value="18/07/2016" size="20"/></td>
                    </tr>
                    
                </tbody>
                
            </table>
            <table align="center"><br><br><br>
                <tr>
                    <td><input type ="submit" style="width:100px" value="Reservar"/></td>
                    <td><input type ="submit" style="width:100px" value="Alterar"/></td>
                    <td><input type ="submit" style="width:100px" value="Cancelar"/></td>
                    <td><input type ="submit" style="width:100px" value="Voltar"/></td>
                </tr>
            </table>
        </form>    
    </body>
</html>

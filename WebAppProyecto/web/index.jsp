<%-- 
    Document   : index
    Created on : Jul 25, 2017, 2:41:52 PM
    Author     : julian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>FORMULARIO 1 - Restaurante</h1>
        <form action="IngresoEquipo">
            
            <td>Nombre:</td><td><input type="text" name="nombre"><br></td>
            <td>Ubicacion:<td><input type="text" name="ubicacion"><br></td>
            <td>Descripcion:</td><td><input type="text" name="descripcion"><br></td>
            <td>Capacidad:</td><td><input type="text" name="capacidad"><br></td>
            <td>Horario:</td><td><input type="text" name="hora"><br></td>
            <td>Puntos:</td><td><input type="text" name="puntos"><br></td>
            
            <input type="submit" value="Ingresar">
        </form>
    
</html>

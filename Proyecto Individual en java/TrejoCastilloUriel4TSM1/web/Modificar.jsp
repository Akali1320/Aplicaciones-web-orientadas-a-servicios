<%-- 
    Document   : Modificar
    Created on : 26/01/2020, 04:45:34 PM
    Author     : URIEL&YAIR-PC
--%>

<%@page import="modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar</title>
        <%
            /*
            Aqui estamos mandando los datos del formulario de esta forma 
            se mandan por medio de los setters hacia la base de datos para modificarlos.
            */
            String nombre = request.getParameter("n");
            String ap = request.getParameter("a");
            String curp= request.getParameter("c");
            String rfc = request.getParameter("r");
            String ec= request.getParameter("s");
            Persona per= new Persona();
            per.setNombre(nombre);
            per.setApellidos(ap);
            per.setCurp(curp);
            per.setRfc(rfc);
            per.setEdo_civil(ec);
            per.Modificar();
         %>
    </head>
    <body>
        <h1>Datos Modificados</h1>
    </body>
</html>

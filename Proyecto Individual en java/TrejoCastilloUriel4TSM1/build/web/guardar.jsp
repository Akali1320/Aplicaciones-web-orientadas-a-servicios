<%-- 
    Document   : guardar
    Created on : 21 ene. 2020, 11:56:01
    Author     : Tecamac
--%>

<%@page import="modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        /*
        aqui estamos recibiendo los datos que estan en el formulario alta.html
        */
        String nombre=request.getParameter("nom");
        String apellidos=request.getParameter("ap");
        String curp=request.getParameter("curp");
        String rfc=request.getParameter("rfc");
        String edo_civil=request.getParameter("e");
        Persona p =new Persona();
        p.setNombre(nombre);
        p.setApellidos(apellidos);
        p.setCurp(curp);
        p.setRfc(rfc);
        p.setEdo_civil(edo_civil);
        p.guardarpersona();//llamada del metodo para gusrdar la persona
    %>
    <body>
        <h1>datos insertados</h1>
    </body>
</html>

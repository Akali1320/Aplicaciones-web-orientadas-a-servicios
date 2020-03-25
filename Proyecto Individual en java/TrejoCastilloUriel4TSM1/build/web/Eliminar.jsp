<%-- 
    Document   : Eliminar
    Created on : 27/01/2020, 08:31:51 PM
    Author     : URIEL&YAIR-PC
--%>

<%@page import="modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
      //Obtener el valor por medio de Request o responsive
      String curp=request.getParameter("txtel");
      Persona personita=new Persona();
      personita.setCurp(curp);
      personita.Eliminar();//Llamada del metodo con el objeto creado
   %>
    </head>
    <body>
        <h1>Datos Eliminados</h1>
    </body>
</html>

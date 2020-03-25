<%-- 
    Document   : buscar
    Created on : 17 ene. 2020, 11:54:22
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
   <!-- para iniciar un java dentro de un jsp--> 
   <%
      //Obtener el valor por medio de Request o responsive
      String curp=request.getParameter("txtcurp");
      Persona personita=new Persona();
      personita.setCurp(curp);
      personita.obtenerPersonaBycurp();//Llamada del metodo con el objeto creado
   %>
   <body>
       <h1>Hola <%=personita.getNombre()%></h1>
   </body>
</html>

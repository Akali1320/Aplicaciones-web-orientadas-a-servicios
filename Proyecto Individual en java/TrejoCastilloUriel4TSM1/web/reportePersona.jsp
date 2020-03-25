
<%-- 
    Document   : reporte Persona
    Created on : 18-sep-2011, 11:36:16
    Author     : Lab-CB08
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD</title>
    </head>
    <body>
        <h1>Reporte de Personas</h1>
        <table border="3">
            <thead>
                <tr>
                    <td>ID</td>
                    <td>Nombre</td>
                    <td>Apellidos</td>
                    <td>Curp</td>
                    <td>Rfc</td>
                    <td>Estado civil</td>
                    <td>Edad</td>
                </tr>
            </thead>
            <tbody><!--Esta etiqueta es para el cuerpo de la tabla-->
                <%
                   //imprimimos por medio de un for mejordo
                   for(Persona i:new Persona().obtenerPer()){
                       System.out.println(i.getCurp());
                   
                 %>
                 <tr>
                     <td><%=i.getId_persona()%></td>
                     <td><%=i.getNombre()%></td>
                     <td><%=i.getApellidos()%></td>
                     <td><%=i.getCurp()%></td>
                     <td><%=i.getRfc()%></td>
                     <td><%=i.getEdo_civil()%></td>
                     <td><%=i.obtenerEdad()%></td><!--Mando a llamar mi metodo de calcular la edad-->
                 </tr>
                 <%
                     }
                 %>
            </tbody>
        </table>
    </body>
</html

<%-- 
    Document   : Figuras
    Created on : 14 feb. 2020, 11:19:11
    Author     : Tecamac
--%>


<%@page import="primer_paquete.Rectangulo"%>
<%@page import="primer_paquete.Cuadrado"%>
<%@page import="primer_paquete.Circulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel=”stylesheet” type=”text/css” href="css/estilos.css">
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/java.js"></script>
        <script type="text/javascript" src="js/validarnum.js"></script>
        

    </head>
    <body>
        <!--Aqui estamos poniendo todos los formularios 
        y se ocultan pero usamos la libreria de javascript para validar que cuando se selcciones 
        una opción de la lista muestre solo el formulario que se selcciono-->
        
        <!--Este formulario Ya se encuentra validado con Jquery como sabemos Jqury es una libreria de la que podemos 
        sacar funciones de javascript y esta contiene una validacion para numeros-->
        <form action="Figuras.jsp" method="post">
            Escoge una figura:
            <select id="status" name="status" onChange="mostrar(this.value);">
                <option value="cuadrado">Cuadrado</option>
                <option value="rectangulo">Rectangulo</option>
                <option value="circulo">Circulo</option>
                <option value="triangulo">Triangulo</option>
            </select>
            <!--Ya se encuentran validados los capos para que solo se pueda escribir números y
            ademas esta usando jquery para que tenga un buen funcionamiento-->
        </form>
        <div id="cuadrado" class="element" style="display: none;">
            <h2>Cuadrado</h2>
            <!--Formulario de cuadrado-->
            <form action="Figuras.jsp" method="post" name="form" id="form">
                <img src="img/cuadrado.PNG" height="60" width="60">
                <p>Lado: <br>
                <input type="text" class="validar"name="lado"><p>
                    <input id="perimetro" type="checkbox" name="p"><label>PERIMETRO</label>
                    <input id="area" type="checkbox" name="a"><label>ÁREA</label>
                    <br>
                    <input type="submit" name="btn" value="calcular"/>
            </form>
        </div>

        <div id="rectangulo" class="element" style="display: none;">
            <h2>Rectangulo</h2>
            <!--Formulario de rectangulo-->
            <form action="Figuras.jsp" method="post">
                <img src="img/Rectangulo.PNG" height="60" width="90">
                <p>Base:<br>
                <input type="text" class="validar" name="base"><p>
                <p>Altura:<br>
                <input type="text"  class="validar"name="altura"><p>
                    <input type="checkbox" name="pe"><label>PERIMETRO</label>
                    <input type="checkbox" name="ar"><label>ÁREA</label>
                    <br>
                    <input type="submit" name="btnrec" value="calcular"/>
            </form>
        </div>
        <div id="circulo" class="element" style="display: none;">
            <h2>Circulo</h2>
            <!--Formulario de circulo-->
            <form action="Figuras.jsp" method="post">
                <img src="img/circulo.PNG" height="65" width="70">
                <p>Radio:<br>
                <input type="text" class="validar" name="radio" onkeypress=""><p>
                    <input type="checkbox" name="p"><label>PERIMETRO</label>
                    <input type="checkbox" name="a"><label>ÁREA</label>
                    <br>
                    <input type="submit" name="cir" value="calcular"/>
            </form>
        </div>
        <div id="triangulo" class="element" style="display: none;">
            <h2>Triangulo</h2>
            <!--Formulario de triangulo-->
            <form action="Figuras.jsp" method="post">
                <img src="img/triangulo.PNG" height="60" width="60">
                <p>Base:<br>
                <input type="text" class="validar" name="base" onkeypress=""><p>
                <p>Altura:<br>
                <input type="text" class="validar" name="altura" onkeypress=""><p>
                <p>Lado:<br>
                <input type="text" class="validar" name="lado"><p>
                    <input type="checkbox" name="p"><label>PERIMETRO</label>
                    <input type="checkbox" name="a"><label>ÁREA</label>
                    <br>
                    <input type="submit" name="tri" value="calcular"/>
            </form>
        </div>
        <!--Este div es el que contiene el procedimiento de calculo y se ejecutaran cada vez que el el checkbox sea seleccionado-->
        <div id="calcua" name="status">
            <%
                if (request.getParameter("btn") != null) {
                    int lado = Integer.parseInt(request.getParameter("lado"));
                    Cuadrado cua = new Cuadrado(lado);
                    cua.obtenrArea();
                    cua.obtenerPerimetro();

                    if (request.getParameter("a") != null) {
            %>
            <h1>El área es: <%=cua.obtenrArea()%></h1>
            <%
                }
                if (request.getParameter("p") != null) {
            %>
            <h1>El perimetro es: <%=cua.obtenerPerimetro()%></h1>
            <%
                    }
                }
            %>

        </div>
            <!--Metodo para calcular el circulo-->
        <div id="circ" name="status">
            <%
                if (request.getParameter("cir") != null) {
                    int radio = Integer.parseInt(request.getParameter("radio"));
                    Circulo c = new Circulo(radio);
                    c.obtenrArea();
                    c.obtenerPerimetro();
                    if (request.getParameter("a") != null) {
            %>
            <h1>El área es: <%=c.obtenrArea()%></h1>
            <%
                }
                if (request.getParameter("p") != null) {
            %>
            <h1>El perimetro es: <%=c.obtenerPerimetro()%></h1>
            <%
                    }
                }
            %>

        </div>
            <!--Metodo para calcular el rectangulo-->
             <div id="calrec" name="status">
            <%
                if (request.getParameter("btnrec") != null) {
                    double base = Double.parseDouble(request.getParameter("base"));
                    double altura = Double.parseDouble(request.getParameter("altura"));
                    Rectangulo rec = new Rectangulo(base, altura);
                    rec.obtenrArea();
                    rec.obtenerPerimetro();
                    if (request.getParameter("ar") != null) {
            %>
            <h1>El área es: <%=rec.obtenrArea()%></h1>
            <%
                }
                if (request.getParameter("pe") != null) {
            %>
            <h1>El perimetro es: <%=rec.obtenerPerimetro()%></h1>
            <%
                    }
                }
            %>

        </div>
            <!--Metodo para calcular el triangulo-->
             <div id="caltri" name="status">
            <%
                if (request.getParameter("tri") != null) {
                    double base = Double.parseDouble(request.getParameter("base"));
                    double altura = Double.parseDouble(request.getParameter("altura"));
                    Rectangulo rec = new Rectangulo(base, altura);
                    rec.obtenrArea();
                    rec.obtenerPerimetro();
                    if (request.getParameter("a") != null) {
            %>
            <h1>El área es: <%=rec.obtenrArea()%></h1>
            <%
                }
                if (request.getParameter("p") != null) {
            %>
            <h1>El perimetro es: <%=rec.obtenerPerimetro()%></h1>
            <%
                    }
                }
            %>

        </div>
    </body>


</html>
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import primer_paquete.Rectangulo;
import primer_paquete.Cuadrado;
import primer_paquete.Circulo;

public final class Figuras_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/java.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/validarnum.js\"></script>\n");
      out.write("        <link rel=”stylesheet” type=”text/css” href=\"css/estilos.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--Aqui estamos poniendo todos los formularios \n");
      out.write("        y se ocultan pero usamos la libreria de javascript para validar que cuando se selcciones \n");
      out.write("        una opción de la lista muestre solo el formulario que se selcciono-->\n");
      out.write("        \n");
      out.write("        <!--Este formulario Ya se encuentra validado con Jquery como sabemos Jqury es una libreria de la que podemos \n");
      out.write("        sacar funciones de javascript y esta contiene una validacion para numeros-->\n");
      out.write("        <form action=\"Figuras.jsp\" method=\"post\">\n");
      out.write("            Escoge una figura:\n");
      out.write("            <select id=\"status\" name=\"status\" onChange=\"mostrar(this.value);\">\n");
      out.write("                <option value=\"cuadrado\">Cuadrado</option>\n");
      out.write("                <option value=\"rectangulo\">Rectangulo</option>\n");
      out.write("                <option value=\"circulo\">Circulo</option>\n");
      out.write("                <option value=\"triangulo\">Triangulo</option>\n");
      out.write("            </select>\n");
      out.write("            <!--Ya se encuentran validados los capos para que solo se pueda escribir números y\n");
      out.write("            ademas esta usando jquery para que tenga un buen funcionamiento-->\n");
      out.write("        </form>\n");
      out.write("        <div id=\"cuadrado\" class=\"element\" style=\"display: none;\">\n");
      out.write("            <h2>Cuadrado</h2>\n");
      out.write("            <!--Formulario de cuadrado-->\n");
      out.write("            <form action=\"Figuras.jsp\" method=\"post\" name=\"form\" id=\"form\">\n");
      out.write("                <img src=\"img/cuadrado.PNG\" height=\"60\" width=\"60\">\n");
      out.write("                <p>Lado: <br>\n");
      out.write("                <input type=\"text\" class=\"validar\"name=\"lado\"><p>\n");
      out.write("                    <input id=\"perimetro\" type=\"checkbox\" name=\"p\"><label>PERIMETRO</label>\n");
      out.write("                    <input id=\"area\" type=\"checkbox\" name=\"a\"><label>ÁREA</label>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"submit\" name=\"btn\" value=\"calcular\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"rectangulo\" class=\"element\" style=\"display: none;\">\n");
      out.write("            <h2>Rectangulo</h2>\n");
      out.write("            <!--Formulario de rectangulo-->\n");
      out.write("            <form action=\"Figuras.jsp\" method=\"post\">\n");
      out.write("                <img src=\"img/Rectangulo.PNG\" height=\"60\" width=\"90\">\n");
      out.write("                <p>Base:<br>\n");
      out.write("                <input type=\"text\" class=\"validar\" name=\"base\"><p>\n");
      out.write("                <p>Altura:<br>\n");
      out.write("                <input type=\"text\"  class=\"validar\"name=\"altura\"><p>\n");
      out.write("                    <input type=\"checkbox\" name=\"pe\"><label>PERIMETRO</label>\n");
      out.write("                    <input type=\"checkbox\" name=\"ar\"><label>ÁREA</label>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"submit\" name=\"btnrec\" value=\"calcular\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"circulo\" class=\"element\" style=\"display: none;\">\n");
      out.write("            <h2>Circulo</h2>\n");
      out.write("            <!--Formulario de circulo-->\n");
      out.write("            <form action=\"Figuras.jsp\" method=\"post\">\n");
      out.write("                <img src=\"img/circulo.PNG\" height=\"65\" width=\"70\">\n");
      out.write("                <p>Radio:<br>\n");
      out.write("                <input type=\"text\" class=\"validar\" name=\"radio\" onkeypress=\"\"><p>\n");
      out.write("                    <input type=\"checkbox\" name=\"p\"><label>PERIMETRO</label>\n");
      out.write("                    <input type=\"checkbox\" name=\"a\"><label>ÁREA</label>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"submit\" name=\"cir\" value=\"calcular\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"triangulo\" class=\"element\" style=\"display: none;\">\n");
      out.write("            <h2>Triangulo</h2>\n");
      out.write("            <!--Formulario de triangulo-->\n");
      out.write("            <form action=\"Figuras.jsp\" method=\"post\">\n");
      out.write("                <img src=\"img/triangulo.PNG\" height=\"60\" width=\"60\">\n");
      out.write("                <p>Base:<br>\n");
      out.write("                <input type=\"text\" class=\"validar\" name=\"base\" onkeypress=\"\"><p>\n");
      out.write("                <p>Altura:<br>\n");
      out.write("                <input type=\"text\" class=\"validar\" name=\"altura\" onkeypress=\"\"><p>\n");
      out.write("                <p>Lado:<br>\n");
      out.write("                <input type=\"text\" class=\"validar\" name=\"lado\"><p>\n");
      out.write("                    <input type=\"checkbox\" name=\"p\"><label>PERIMETRO</label>\n");
      out.write("                    <input type=\"checkbox\" name=\"a\"><label>ÁREA</label>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"submit\" name=\"tri\" value=\"calcular\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"calcua\" name=\"status\">\n");
      out.write("            ");

                if (request.getParameter("btn") != null) {
                    int lado = Integer.parseInt(request.getParameter("lado"));
                    Cuadrado cua = new Cuadrado(lado);
                    cua.obtenrArea();
                    cua.obtenerPerimetro();

                    if (request.getParameter("a") != null) {
            
      out.write("\n");
      out.write("            <h1>El área es: ");
      out.print(cua.obtenrArea());
      out.write("</h1>\n");
      out.write("            ");

                }
                if (request.getParameter("p") != null) {
            
      out.write("\n");
      out.write("            <h1>El perimetro es: ");
      out.print(cua.obtenerPerimetro());
      out.write("</h1>\n");
      out.write("            ");

                    }
                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"circ\" name=\"status\">\n");
      out.write("            ");

                if (request.getParameter("cir") != null) {
                    int radio = Integer.parseInt(request.getParameter("radio"));
                    Circulo c = new Circulo(radio);
                    c.obtenrArea();
                    c.obtenerPerimetro();
                    if (request.getParameter("a") != null) {
            
      out.write("\n");
      out.write("            <h1>El área es: ");
      out.print(c.obtenrArea());
      out.write("</h1>\n");
      out.write("            ");

                }
                if (request.getParameter("p") != null) {
            
      out.write("\n");
      out.write("            <h1>El perimetro es: ");
      out.print(c.obtenerPerimetro());
      out.write("</h1>\n");
      out.write("            ");

                    }
                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("             <div id=\"calrec\" name=\"status\">\n");
      out.write("            ");

                if (request.getParameter("btnrec") != null) {
                    double base = Double.parseDouble(request.getParameter("base"));
                    double altura = Double.parseDouble(request.getParameter("altura"));
                    Rectangulo rec = new Rectangulo(base, altura);
                    rec.obtenrArea();
                    rec.obtenerPerimetro();
                    if (request.getParameter("ar") != null) {
            
      out.write("\n");
      out.write("            <h1>El área es: ");
      out.print(rec.obtenrArea());
      out.write("</h1>\n");
      out.write("            ");

                }
                if (request.getParameter("pe") != null) {
            
      out.write("\n");
      out.write("            <h1>El perimetro es: ");
      out.print(rec.obtenerPerimetro());
      out.write("</h1>\n");
      out.write("            ");

                    }
                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("             <div id=\"caltri\" name=\"status\">\n");
      out.write("            ");

                if (request.getParameter("tri") != null) {
                    double base = Double.parseDouble(request.getParameter("base"));
                    double altura = Double.parseDouble(request.getParameter("altura"));
                    Rectangulo rec = new Rectangulo(base, altura);
                    rec.obtenrArea();
                    rec.obtenerPerimetro();
                    if (request.getParameter("a") != null) {
            
      out.write("\n");
      out.write("            <h1>El área es: ");
      out.print(rec.obtenrArea());
      out.write("</h1>\n");
      out.write("            ");

                }
                if (request.getParameter("p") != null) {
            
      out.write("\n");
      out.write("            <h1>El perimetro es: ");
      out.print(rec.obtenerPerimetro());
      out.write("</h1>\n");
      out.write("            ");

                    }
                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

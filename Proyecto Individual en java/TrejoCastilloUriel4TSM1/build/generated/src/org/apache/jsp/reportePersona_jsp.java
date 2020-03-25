package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import modelo.Persona;

public final class reportePersona_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CRUD</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Reporte de Personas</h1>\n");
      out.write("        <table border=\"3\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <td>ID</td>\n");
      out.write("                    <td>Nombre</td>\n");
      out.write("                    <td>Apellidos</td>\n");
      out.write("                    <td>Curp</td>\n");
      out.write("                    <td>Rfc</td>\n");
      out.write("                    <td>Estado civil</td>\n");
      out.write("                    <td>Edad</td>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody><!--Esta etiqueta es para el cuerpo de la tabla-->\n");
      out.write("                ");

                   //imprimimos por medio de un for mejordo
                   for(Persona i:new Persona().obtenerPer()){
                       System.out.println(i.getCurp());
                   
                 
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                     <td>");
      out.print(i.getId_persona());
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(i.getNombre());
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(i.getApellidos());
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(i.getCurp());
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(i.getRfc());
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(i.getEdo_civil());
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(i.obtenerEdad());
      out.write("</td><!--Mando a llamar mi metodo de calcular la edad-->\n");
      out.write("                 </tr>\n");
      out.write("                 ");

                     }
                 
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html\n");
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

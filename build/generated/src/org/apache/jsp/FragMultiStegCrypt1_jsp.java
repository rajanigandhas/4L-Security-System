package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class FragMultiStegCrypt1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        div.transbox {\n");
      out.write("  width: 500px;\n");
      out.write("  height: 230px;\n");
      out.write("  background-color: #ffffff;\n");
      out.write("  border: 0px solid black;\n");
      out.write("  opacity: 0.5;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("<body background=\"i9.jpg\">\n");
      out.write("        \n");
      out.write(" <br /><br /><br /><br /><br/><br/><br/><br/><br/><br/><br/><br/><br/>  \n");
      out.write(" <center>\n");
      out.write("\n");
      out.write(" <div class=\"transbox\">\n");
      out.write("    <h3>\n");

    out.print("Selected Files For Steganography:");
 
      out.write("\n");
      out.write("  <br /><br />\n");
      out.write(" ");

 String img = request.getParameter("imFile");
 String txt = request.getParameter("txtFile");
 
 out.print("Image file name is " + img );
 
      out.write("\n");
      out.write(" <br/><br/><br/>\n");
      out.write(" ");
 
 out.print("Text file name is " + txt );
 
      out.write("\n");
      out.write(" <br/><br/><br/>\n");
      out.write(" ");

 //Boolean b = ramPackage.FragMultiStegCrypt1.hide(txt, img); 
 Boolean b = ramPackage.FragMultiStegCrypt1.hide("D:\\Data\\"+txt, "D:\\Data\\"+ img); 
 out.print("Result is " + b );
 
      out.write("\n");
      out.write(" </div>\n");
      out.write("</h3>\n");
      out.write("</center>\n");
      out.write("</body>\n");
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

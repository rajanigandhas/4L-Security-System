package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reveal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("               <style> \n");
      out.write(" \n");
      out.write(" body{ \n");
      out.write(" background-repeat: no-repeat; \n");
      out.write(" } \n");
      out.write(" \n");
      out.write(" .div1{ \n");
      out.write(" Font-size: 30px; \n");
      out.write(" color: white; \n");
      out.write(" } \n");
      out.write("  \n");
      out.write("  \n");
      out.write(" .div2 { \n");
      out.write("   width: 400px; \n");
      out.write("   height: 350px;   \n");
      out.write("   padding: 10px; \n");
      out.write(" border-radius: 20px; \n");
      out.write("   border: 5px solid white; \n");
      out.write("   box-sizing: border-box; \n");
      out.write("  \n");
      out.write(" } \n");
      out.write("  \n");
      out.write(" .block { \n");
      out.write("   display: block; \n");
      out.write("   width: 60%; \n");
      out.write(" border-radius: 10px; \n");
      out.write("   border: none; \n");
      out.write("   background-color: white; \n");
      out.write("   color: black; \n");
      out.write("   padding: 10px 10px; \n");
      out.write("  font-size: 16px; \n");
      out.write("   cursor: pointer; \n");
      out.write("   text-align: center; \n");
      out.write(" \n");
      out.write(" }  \n");
      out.write("       \n");
      out.write("\n");
      out.write(" </style> \n");
      out.write("    </head>\n");
      out.write("    <body background=\"i9.jpg\"> \n");
      out.write(" <form id=\"form\" action=\"FragMultiStegCrypt2.jsp\" method=\"post\" name=\"signform\" > \n");
      out.write(" <center> \n");
      out.write(" <div class=\"div1\"> \n");
      out.write("        <br><br><br> \n");
      out.write("        <p><b>Choose Your File For Further Process </b></p> \n");
      out.write("        <br><div class=\"div2\">  \n");
      out.write("     \n");
      out.write("        <p><b>Select Image File: <b><br><br> \n");
      out.write(" \n");
      out.write("        <input type=\"file\" id=\"MyFiles\" name=\"imFile\"></p> \n");
      out.write("\n");
      out.write("        <input type=\"submit\" name=\"loginbtn\" value=\"Reveal Message\"></td>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("  </center>\n");
      out.write(" </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Main Page</title>\n");
      out.write("        <style>\n");
      out.write("             body{\n");
      out.write("\tbackground-image:url('i10.jpg');\n");
      out.write("\tcolor:white;\n");
      out.write("\t}\n");
      out.write("        \n");
      out.write("        .button {\n");
      out.write("                height:10%;\n");
      out.write("                width: 30%;\n");
      out.write("                background-color: white;\n");
      out.write("                border: none;\n");
      out.write("                color: black;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border-radius:4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 15px;\n");
      out.write("                }\n");
      out.write("        \n");
      out.write("         .div2 { \n");
      out.write("             width: 400px; \n");
      out.write("             height: 350px;   \n");
      out.write("             padding: 10px; \n");
      out.write("             border-radius: 20px; \n");
      out.write("             border: 5px solid white; \n");
      out.write("             box-sizing: border-box; \n");
      out.write("             } \n");
      out.write("        </style>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <br><br><br>\n");
      out.write("        <h1> 4L Security </h1>\n");
      out.write("        \n");
      out.write("         <form id=\"form\" action=\"mainPageJSP.jsp\" method=\"post\" name=\"signform\" >   \n");
      out.write("             <br><br><br>\n");
      out.write("                         <br><div class=\"div2\">  \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                             <h2><b>Select Process:</b></h2>\n");
      out.write("                        <br>\n");
      out.write("                        <h2> <input type=\"radio\" name=\"process\" value=\"Hide\" />Hide</h2>\n");
      out.write("\t\t\t\n");
      out.write("                        \n");
      out.write("                        <h2><input type=\"radio\" name=\"process\" value=\"Reveal\" />Reveal</h2>\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("                        <button type=\"submit\" class=\"button\">Process</button>                        \n");
      out.write("         </form>\n");
      out.write("        \n");
      out.write("    </center>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("h2 {\n");
      out.write("  font-size: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("      .button {\n");
      out.write("\theight:5%;\n");
      out.write("        background-color: #191970;\n");
      out.write("        border: none;\n");
      out.write("        color: white;\n");
      out.write("        padding: 14px 20px;\n");
      out.write("       margin: 8px 0;\n");
      out.write("       border-radius:4px;\n");
      out.write("        cursor: pointer;\n");
      out.write("      font-size: 15px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("body{\n");
      out.write("\tbackground-image:url('i1.jpg');\n");
      out.write("\tcolor:white;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("input[type=text], select {\n");
      out.write("  width: 30%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=password], select {\n");
      out.write("  width: 30%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("\n");
      out.write("  height: 6%;\n");
      out.write("  background-color:#191970;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #6a5acd ;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <br><br><br><br>\n");
      out.write("       <center> <h1>  LOGIN WINDOW </h1> \n");
      out.write("        \t<br><br><br><br><br><br>\n");
      out.write("        \n");
      out.write("        <form id=\"form\" action=\"LoginDb.jsp\" method=\"post\" name=\"signform\" >      \n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><b>User Name</b></td>\n");
      out.write("                <td><input style=\"margin-left: 30px\" type=\"text\" placeholder=\"Enter Username\" name=\"username\" size=\"30\"></td>    \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td><b>Password</b></td>\n");
      out.write("                <td><input style=\"margin-left: 30px\" type=\"password\" placeholder=\"Enter Password\" name=\"password\" size=\"30\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \t<br><br><br><br>        \n");
      out.write("            \n");
      out.write("        <tr>\n");
      out.write("            <td><input type=\"submit\" name=\"loginbtn\" value=\"Login\"></td>\n");
      out.write("            <td ><a href=\"http://localhost:8080/Security4L/signup.jsp\" class=\"button\">Sign Up</a></td>\n");
      out.write("        </tr>\n");
      out.write("        </form>\n");
      out.write("        </center>\n");
      out.write("\n");
      out.write("        \n");
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

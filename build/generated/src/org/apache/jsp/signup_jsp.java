package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <style>\n");
      out.write("\n");
      out.write("      \n");
      out.write("  body{\n");
      out.write("  background-image:url('i16.jpg');\n");
      out.write("  color:white;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .under{\n");
      out.write("      text-decoration: underline white;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h2{\n");
      out.write("    font-size: 25px;\n");
      out.write("       }\n");
      out.write("\n");
      out.write("input[type=text], select {\n");
      out.write("  width: 250%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=password], select {\n");
      out.write("  width: 50%;\n");
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
      out.write("  height: 5%;\n");
      out.write("  background-color:#191970;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #6a5acd ;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button{\n");
      out.write("\n");
      out.write("      height: 4%;\n");
      out.write("      background-color: #191970;\n");
      out.write("      color: white;\n");
      out.write("      padding: 14px 20px;\n");
      out.write("      margin: 8px 0;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 4px;\n");
      out.write("      curser: pointer;\n");
      out.write("      font-size: 13px;\n");
      out.write("      \n");
      out.write("    }\n");
      out.write("\n");
      out.write("  table.a{\n");
      out.write("      table-layout: fixed;\n");
      out.write("      width: 25%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("  p.ex1{\n");
      out.write("      width: 800px;\n");
      out.write("      margin: auto;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("    function matchPass(){\n");
      out.write("        var pw1 = document.getElementById(\"password\");\n");
      out.write("        var pw2 = document.getElementById(\"newpass\");\n");
      out.write("        if(pw1!=pw2){\n");
      out.write("            alert (\"Password didn't match\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <br>    \n");
      out.write("\n");
      out.write("  <center> <h1><p class=\"under\">CREATE NEW ACCOUNT</p> </h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("             <table class=\"a\">    \n");
      out.write("        \n");
      out.write("        <form id=\"form\" action=\"signupDb.jsp\" method=\"post\" name=\"signform\" >   \n");
      out.write("            \n");
      out.write("            <table>\n");
      out.write("             <tr>\n");
      out.write("                <td><b><h2>Name</h2></b></td>\n");
      out.write("                <td><input style=\"margin-left: 5px\" type=\"text\" name=\"name\" placeholder=\"Enter Name\" size=\"20\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td><b><h2>Address</h2></b></td>\n");
      out.write("                <td><input style=\"margin-left: 5px\" type=\"text\" name=\"address\"placeholder=\"Enter address\" size=\"20\"> </td>\n");
      out.write("            </tr>  \n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td><b><h2>Contact</h2></b></td>\n");
      out.write("                <td><input style=\"margin-left: 5px\" type=\"text\" name=\"contact\" placeholder=\"Enter contact no.\" size=\"20\"> </td>\n");
      out.write("            </tr>  \n");
      out.write("             \n");
      out.write("            <tr>\n");
      out.write("                <td><b><h2>DOB</h2></b></td>\n");
      out.write("                <td><input style=\"margin-left: 5px\" type=\"text\" name=\"dob\" placeholder=\"Enter Date of Birth\" size=\"20\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td><b><h2>Aadhar No</h2></b></td>\n");
      out.write("                <td><input style=\"margin-left: 5px\" type=\"text\" name=\"aadhar\" placeholder=\"Enter adhar no\" size=\"20\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td><b><h2>Email</h2></b></td>\n");
      out.write("                <td><input style=\"margin-left: 5px\" type=\"text\" name=\"email\" placeholder=\"Enter Email\" size=\"20\"></td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            <br><br><br>\n");
      out.write("            <h1><p class=\"under\">SET PASSWORD</p> </h1>\n");
      out.write("            <table>\n");
      out.write("            <tr>\n");
      out.write("                 \n");
      out.write("                <td><b><h2>Username</h2></b></td>\n");
      out.write("                <td><input style=\"margin-left: 5px\" type=\"text\" name=\"username\" placeholder=\"Enter username\" size=\"20\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td><b><h2>Password</h2></b></td>\n");
      out.write("                <td><input  style=\"margin-left: 5px\" type=\"text\" name=\"password\" placeholder=\"Enter password\" size=\"20\"></td>\n");
      out.write("            </tr>\n");
      out.write("                       \n");
      out.write("            <tr>\n");
      out.write("                <td><b><h2>Confirm Password</h2></b></td>\n");
      out.write("                <td><input style=\"margin-left: 5px\" type=\"text\" name=\"newpass\" placeholder=\"Re-write password\" size=\"20\">   </td>\n");
      out.write("            </tr>\n");
      out.write("             \n");
      out.write("            <br>\n");
      out.write("             \n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td><a href=\"http://localhost:8080/Security4L/mainPage.jsp\" class=\"button\" onclick=\"matchPass()\">Save</a></td>\n");
      out.write("                 <td><a href=\"http://localhost:8080/Security4L/Login.jsp\"class=\"button\">Cancel</a></td>\n");
      out.write("            </tr>  \n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        </center>\n");
      out.write("    \n");
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

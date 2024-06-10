<%@page language="java" import="java.sql.*"%>
<%@page import="java.io.*"%>
<%

try
{
        ResultSet rs =null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
        Statement stmt=con.createStatement();
    
        String name=request.getParameter("name");
        String address=request.getParameter("address");
        String contact=request.getParameter("contact");
        String dob=request.getParameter("dob");
        String aadhar=request.getParameter("aadhar");
        String email=request.getParameter("email");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        stmt.executeUpdate("insert into login values('"+name+"','"+address+"','"+contact+"','"+dob+"','"+aadhar+"','"+email+"','"+username+"','"+password+"')");
        
        response.sendRedirect("index.html");
        
    con.close();
    stmt.close(); 
}
 
catch(ClassNotFoundException e)
{
    out.println(e.getMessage());
} %>

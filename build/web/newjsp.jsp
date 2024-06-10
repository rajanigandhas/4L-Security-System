<%@page language="java" import="java.sql.*"%>
<%@page import="java.io.*"%>
<%

try
{
        ResultSet rs =null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
        Statement stmt=con.createStatement();
    
        String uname=request.getParameter("uname");
        String pswd=request.getParameter("pswd");
        stmt.executeUpdate("insert into login values('"+uname+"','"+pswd+"')");
        
        response.sendRedirect("index.html");
        
    con.close();
    stmt.close(); 
}
 
catch(ClassNotFoundException e)
{
    out.println(e.getMessage());
} %>

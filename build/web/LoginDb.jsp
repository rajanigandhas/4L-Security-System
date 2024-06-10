
<%@page language="java" import="java.sql.*"%>
<%@page import="java.io.*"%>
<%

try
{
        ResultSet rs =null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
        Statement stmt=con.createStatement();
    
        String uname=request.getParameter("username");
        String pswd=request.getParameter("password");
        //stmt.executeUpdate("insert into login values('"+uname+"','"+pswd+"')");
        
        //int res = 0;
        rs = stmt.executeQuery("Select * from login where username = '"+ uname +"' and password = '"+ pswd +"' ");
        
        if( ! rs.next())
        {
            out.print("Invalid User, Dont have a permission !!! ");
        }
        else
        {
            response.sendRedirect("mainPage.jsp");
        }
    con.close();
    stmt.close(); 
}
 
catch(ClassNotFoundException e)
{
    out.println(e.getMessage());
} %>

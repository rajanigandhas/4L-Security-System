
<%@page language="java" import="java.sql.*"%>
<%@page import="java.io.*"%>
<%

    
        String result=request.getParameter("process");
        
        if( result.equals("Hide"))
        {
            response.sendRedirect("hide.jsp");
        }
        else
        {
            response.sendRedirect("reveal.jsp");
        }
     %>

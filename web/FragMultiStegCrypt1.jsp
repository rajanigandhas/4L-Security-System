<%@page language="java" import="java.sql.*"%>
<%@page import="java.io.*"%>
<html>
    <style>
        div.transbox {
  width: 500px;
  height: 250px;
  background-color: #ffffff;
  border: 0px solid black;
  opacity: 0.5;
}
    </style>
    
<body background="i9.jpg">
        
 <br /><br /><br /><br /><br/><br/><br/><br/><br/><br/><br/><br/><br/>  
 <center>

 <div class="transbox">
    <h3>
        <br/>
<%
    out.print("SELECTED FILE FOR STEGANOGRAPHY:");
 %>
  <br /><br />
 <%
 String img = request.getParameter("imFile");
 String txt = request.getParameter("txtFile");
 
 out.print("Image file name is " + img );
 %>
 <br/><br/>
 <% 
 out.print("Text file name is " + txt );
 %>
 <br/><br/><br/>
 <%
 //Boolean b = ramPackage.FragMultiStegCrypt1.hide(txt, img); 
 Boolean b = ramPackage.FragMultiStegCrypt1.hide("D:\\Data\\"+txt, "D:\\Data\\"+ img); 
 out.print("Is Hide Get Successful?  " + b );
 %>
 </div>
</h3>
</center>
</body>
</html>
<%@page language="java" import="java.sql.*"%>
<%@page import="java.io.*"%>
<html>
    <style>
        div.transbox {
  width: 500px;
  height: 230px;
  background-color: #ffffff;
  border: 0px solid black;
  opacity: 0.5;
}
    </style>
<body background="i9.jpg">
<center> 
    <h3>  
 <br /><br /><br /><br /><br/><br/><br/><br/><br/><br/><br/><br/><br/>
 <div class="transbox">
     <br/><br/>
<%
    out.print("SELECTED FILE FOR REVEAL: ");
 %>
  <br /><br />
 <%
 String img = request.getParameter("imFile");
 out.print("Image file name is " + img );
 %>
 <br/><br/><br/>
 <%
   //Boolean b = ramPackage.FragMultiStegCrypt1.reveal("GuitarMsg.png");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  b = true;
   Boolean b = ramPackage.FragMultiStegCrypt1.reveal("D:\\Data\\"+img);
   //Boolean b = ramPackage.FragMultiStegCrypt1.reveal("D:\\"+"GuitarMsg.png");   successfully on d:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                b = true;
  //String s = ramPackage.NewEmpty.show();                                      Successfully called static method of another class from ramPackage.
 out.print("Is Reveal Get Successful?  " + b );
 %>

 </div>
    </h3>   
</center>
</body>
</html>
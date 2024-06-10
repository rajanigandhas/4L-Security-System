<%-- 
    Document   : hide
    Created on : 13 May, 2022, 2:30:16 PM
    Author     : rbsal
--%>
<%@page import="ramPackage.NewEmpty"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Hide Page </title>
        <style> 
 
 body{ 
 background-repeat: no-repeat; 
 } 
 
 .div1{ 
 Font-size: 30px; 
 color: white; 
 } 
  
  
 .div2 { 
   width: 400px; 
   height: 350px;   
   padding: 10px; 
 border-radius: 20px; 
   border: 5px solid white; 
   box-sizing: border-box; 
  
 } 
  
 .block { 
   display: block; 
   width: 60%; 
 border-radius: 10px; 
   border: none; 
   background-color: white; 
   color: black; 
   padding: 10px 10px; 
  font-size: 16px; 
   cursor: pointer; 
   text-align: center; 
 
 }   
       

 </style> 
    </head>

    <body background="i9.jpg"> 
   
  <form id="form" action="FragMultiStegCrypt1.jsp" method="post" name="signform" > 
 <center> 
 <div class="div1"> 
        <br><br><br> 
        <p><b>Choose Your File For Further Process </b></p> 
        <br><div class="div2">  
     
        <p><b>Select Image File: <b><br><br> 
 
        <input type="file" id="MyFiles" name="imFile"></p> 

        <p><b>Select Text File: <b><br><br> 
            <input type="file" id="MyFiles" name="txtFile"></p> 
            <br>
         
        <input type="submit" name="loginbtn" value="Hide Message"></td>
     
    </div>
  </center>
 </form> 
 </body> 

</html>

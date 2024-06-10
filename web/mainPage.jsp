<%-- 
    Document   : mainPage
    Created on : 13 May, 2022, 1:26:15 PM
    Author     : rbsal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
        <style>
             body{
	background-image:url('i10.jpg');
	color:white;
	}
        
        .button {
                height:10%;
                width: 30%;
                background-color: white;
                border: none;
                color: black;
                padding: 10px 20px;
                margin: 8px 0;
                border-radius:4px;
                cursor: pointer;
                font-size: 15px;
                }
        
         .div2 { 
             width: 400px; 
             height: 350px;   
             padding: 10px; 
             border-radius: 20px;
             border: 5px solid white; 
             box-sizing: border-box; 
             } 
        </style>
       
    </head>
    <body>
    <center>
        <br><br><br>
        <h1> 4L Security </h1>
        
         <form id="form" action="mainPageJSP.jsp" method="post" name="signform" >   
             <br><br><br>
                         <br><div class="div2">  
                        
                        
                             <h2><b>Select Process:</b></h2>
                        <br>
                        <h2> <input type="radio" name="process" value="Hide" />Hide</h2>
			
                        
                        <h2><input type="radio" name="process" value="Reveal" />Reveal</h2>			
                        <br/><br/>
                        <button type="submit" class="button">Process</button>                        
         </form>
        
    </center>
    </body>
</html>

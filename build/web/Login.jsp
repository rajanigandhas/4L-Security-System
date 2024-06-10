<%-- 
    Document   : Login
    Created on : 13 May, 2022, 11:36:13 AM
    Author     : rbsal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <style>
h2 {
  font-size: 25px;
}

      .button {
	height:5%;
        background-color: #191970;
        border: none;
        color: white;
        padding: 14px 20px;
       margin: 8px 0;
       border-radius:4px;
        cursor: pointer;
      font-size: 15px;
      }



body{
	background-image:url('i1.jpg');
	color:white;
	}

input[type=text], select {
  width: 30%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=password], select {
  width: 30%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}


input[type=submit] {

  height: 6%;
  background-color:#191970;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size: 15px;
}

input[type=submit]:hover {
  background-color: #6a5acd ;
}

</style>

    </head>
    <body>
        
        <br><br><br><br>
       <center> <h1>  LOGIN WINDOW </h1> 
        	<br><br><br><br><br><br>
        
        <form id="form" action="LoginDb.jsp" method="post" name="signform" >      

            <tr>
                <td><b>User Name</b></td>
                <td><input style="margin-left: 30px" type="text" placeholder="Enter Username" name="username" size="30"></td>    
            </tr>
            
            <br><br>
            
            <tr>
                <td><b>Password</b></td>
                <td><input style="margin-left: 30px" type="password" placeholder="Enter Password" name="password" size="30"></td>
            </tr>
            	<br><br><br><br>        
            
        <tr>
            <td><input type="submit" name="loginbtn" value="Login"></td>
            <td ><a href="http://localhost:8080/Security4L/signup.jsp" class="button">Sign Up</a></td>
        </tr>
        </form>
        </center>

        
    </body>
</html>

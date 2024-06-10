<%-- 
    Document   : signup
    Created on : 13 May, 2022, 12:47:24 PM
    Author     : rbsal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <style>

      
  body{
  background-image:url('i16.jpg');
  color:white;
  }

  .under{
      text-decoration: underline white;

    }

    h2{
    font-size: 25px;
       }

input[type=text], select {
  width: 250%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=password], select {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}


input[type=submit] {

  height: 5%;
  background-color:#191970;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #6a5acd ;
}

.button{

      height: 4%;
      background-color: #191970;
      color: white;
      padding: 14px 20px;
      margin: 8px 0;
      border: none;
      border-radius: 4px;
      curser: pointer;
      font-size: 13px;
      
    }

  table.a{
      table-layout: fixed;
      width: 25%;
    }

  p.ex1{
      width: 800px;
      margin: auto;
    }


  


</style>
<script>
    
    function matchPass(){
        var pw1 = document.getElementById("password");
        var pw2 = document.getElementById("newpass");
        if(pw1!=pw2){
            alert ("Password didn't match");
        }
    }
</script>


    </head>
    <body>
         <br>    

  <center> <h1><p class="under">CREATE NEW ACCOUNT</p> </h1>


             <table class="a">    
        
        <form id="form" action="signupDb.jsp" method="post" name="signform" >   
            
            <table>
             <tr>
                <td><b><h2>Name</h2></b></td>
                <td><input style="margin-left: 5px" type="text" name="name" placeholder="Enter Name" size="20"></td>
            </tr>
            
            <tr>
                <td><b><h2>Address</h2></b></td>
                <td><input style="margin-left: 5px" type="text" name="address"placeholder="Enter address" size="20"> </td>
            </tr>  
            
            <tr>
                <td><b><h2>Contact</h2></b></td>
                <td><input style="margin-left: 5px" type="text" name="contact" placeholder="Enter contact no." size="20"> </td>
            </tr>  
             
            <tr>
                <td><b><h2>DOB</h2></b></td>
                <td><input style="margin-left: 5px" type="text" name="dob" placeholder="Enter Date of Birth" size="20"></td>
            </tr>
            
            <tr>
                <td><b><h2>Aadhar No</h2></b></td>
                <td><input style="margin-left: 5px" type="text" name="aadhar" placeholder="Enter adhar no" size="20"></td>
            </tr>
            
            <tr>
                <td><b><h2>Email</h2></b></td>
                <td><input style="margin-left: 5px" type="text" name="email" placeholder="Enter Email" size="20"></td>
            </tr>
            </table>
            
            <br><br><br>
            <h1><p class="under">SET PASSWORD</p> </h1>
            <table>
            <tr>
                 
                <td><b><h2>Username</h2></b></td>
                <td><input style="margin-left: 5px" type="text" name="username" placeholder="Enter username" size="20"></td>
            </tr>
            
            <tr>
                <td><b><h2>Password</h2></b></td>
                <td><input  style="margin-left: 5px" type="password" name="password" placeholder="Enter password" size="20"></td>
            </tr>
                       
            <tr>
                <td><b><h2>Confirm Password</h2></b></td>
                <td><input style="margin-left: 5px" type="password" name="newpass" placeholder="Re-write password" size="20">   </td>
            </tr>
             
            <br>
             
            <tr>
                
                <td><a href="http://localhost:8080/Security4L/mainPage.jsp" class="button">Save</a></td>
                 <td><a href="http://localhost:8080/Security4L/Login.jsp"class="button">Cancel</a></td>
            </tr>  
            </table>
        
        </form>
        </center>
    
    </body>
</html>

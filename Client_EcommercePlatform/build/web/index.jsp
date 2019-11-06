<%-- 
    Document   : index
    Created on : Oct 26, 2019, 7:05:10 PM
    Author     : TEAM AWESOME

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="min-height: 100%;">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/client.css" rel="stylesheet" type="text/css"/>
        <title>Login Page</title>
    </head>
    <style>
    .center {
        margin: auto;
        width: 30%;
    }
    body {
        background-image: url("https://images.unsplash.com/photo-1556557598-84d97035e37c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1450&q=80");
        background-position:center;
        background-repeat: no-repeat;
        background-size: cover;
        position:relative;
    }
    </style>
    <body  style="min-height: 100%;">
        
        <div style="min-width: 400px" align="center" >
            <img src="https://i.imgur.com/wuxurP0.png" alt="logo">
        </div>      
        <br>
        <br>
        <br>
        
        <div class="center" style="min-width: 400px; background-color:white; opacity: 0.8; padding: 10px; " >
            <form action="LoginServlet" method="POST" onsubmit="return loginFunc()">
                <ul class="form-style-1">
                <h1>Login</h1>
                 <li>
                     <label>Email <span class="required">*</span></label>
                     <input type="email" name="email" id="email" class="field-long" />
                 </li>
                 <li>
                     <label>Password <span class="required">*</span></label>
                     <input type="password" name="password" id="password" class="field-long" />
                 </li>
                 <br>
                  <li>
                     <input type="submit" value="LOGIN" />
                 </li>  
                  <li>
                      <a href="${pageContext.request.contextPath}/Register.jsp">Haven't sign up yet?</a>
                 </li>              
                </ul>
            </form>
        </div>
    </body>
    
    <script type="text/javascript">
        
        function loginFunc() {
            var email = document.getElementById('email').value;
            var password = document.getElementById("password").value;
            if(!email){
                alert("Email cannot be empty");
                return false;
            }
            if(!password){
                alert("Password cannot be empty");
                return false;
            }
        }
        
    </script>
    
</html>


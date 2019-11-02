<%-- 
    Document   : index
    Created on : Oct 26, 2019, 7:05:10 PM
    Author     : TEAM AWESOME

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/client.css" rel="stylesheet" type="text/css"/>
        <title>Login Page</title>
    </head>
    <body>
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


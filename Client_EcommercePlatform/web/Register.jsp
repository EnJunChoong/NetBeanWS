<%-- 
    Document   : register
    Created on : Oct 26, 2019, 7:05:25 PM
    Author     : TEAM AWESOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="min-height:100%">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/client.css" rel="stylesheet" type="text/css"/>
        <title>Register Page</title>
        
        <style>
            .center {
                margin: auto;
                width: 80%;
            }
            body {
            background-image: url("https://images.unsplash.com/photo-1518112166137-85f9979a43aa?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2134&q=80");
            background-position:center;
            background-repeat: no-repeat;
            background-size: cover;
            position:relative;
            }
        </style>
    </head>
    <body>    
        
        <br>
        <br>
        <br>
        <div class="center" style="width:400px;text-align:left;background-color:white; opacity: 0.8;">
        <form action="RegisterServlet" method="POST" onsubmit="return regFunc()">
             <ul class="form-style-1">
                <h1>Register</h1>
<!--                <li>
                    <label>Customer ID <span class="required">*</span></label>
                    <input type="text" name="id" id="id" class="field-long" />
                </li>-->
                <li>
                    <label>Customer Name <span class="required">*</span></label>
                    <input type="text" name="name" id="name" class="field-long" />
                </li>
<!--                <li>
                    <label>Discount Code <span class="required">*</span></label>
                    <select name="discountCode" class="field-select"> 
                        <option value="H">H</option>
                        <option value="M">M</option>
                        <option value="L">L</option>
                        <option value="N">N</option>
                    </select>
                </li>-->
                <li>
                    <label>Zip Code <span class="required">*</span></label>
                    <input type="text" name="zip" id="zip" class="field-long">
<!--                        <option value="10095">10095</option>
                        <option value="10096">10096</option>
                        <option value="12347">12347</option>
                        <option value="48124">48124</option>
                        <option value="48128">48128</option>
                        <option value="85638">85638</option>
                        <option value="94043">94043</option>
                        <option value="94401">94401</option>
                        <option value="95035">95035</option>
                        <option value="95051">95051</option>
                        <option value="95117">95117</option>
                    </select>-->
                </li>
                <li>
                    <label>Address Line 1 </label>
                    <input type="text" name="address1" id="address1" class="field-long" />
                </li>
                <li>
                    <label>Address Line 2 </label>
                    <input type="text" name="address2" id="address2" class="field-long" />
                </li>
                <li>
                    <label>City </label>
                    <input type="text" name="city" id="city" class="field-long" />
                </li>
                <li>
                    <label>State </label>
                    <input type="text" name="state" id="state" class="field-long" />
                </li>
                <li>
                    <label>Phone No. </label>
                    <input type="text" name="phone" id="phone" class="field-long" />
                </li>
<!--                <li>
                    <label>Fax No. </label>
                    <input type="text" name="fax" id="fax" class="field-long" />
                </li>-->
                <li>
                    <label>Email <span class="required">*</span></label>
                    <input type="email" name="email" id="email" class="field-long" />
                </li>
<!--                <li>
                    <label>Credit Limit <span class="required">*</span></label>
                    <input type="number" min="0" name="creditLimit" id="creditLimit" class="field-long" />
                </li>-->
                <li>
                    <label>Password <span class="required">*</span></label>
                    <input type="password" name="password" id="password" class="field-long" />
                </li>
                <br>
                <li>
                    <input type="submit" value="REGISTER">     
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/index.jsp">Back to Login</a> 
                </li>               
             </ul>  
        </form>
        </div>
    </body>
    
    <script type="text/javascript">
        
        function regFunc() {
            var id = document.getElementById('id').value;
            var name = document.getElementById('name').value;
            var email = document.getElementById('email').value;
            var credit = document.getElementById('creditLimit').value;
            var password = document.getElementById("password").value;
            if(!id){
                alert("Customer ID cannot be empty");
                return false;
            }
            if(!name){
                alert("Customer Name cannot be empty");
                return false;
            }
            if(!email){
                alert("Email cannot be empty");
                return false;
            }
            if(!credit){
                alert("Credit Limit cannot be empty");
                return false;
            }
            if(!password){
                alert("Password cannot be empty");
                return false;
            }
        }
        
    </script>
</html>

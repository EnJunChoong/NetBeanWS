<%-- 
    Document   : HomePage
    Created on : 30 Oct, 2019, 10:59:36 PM
    Author     : TEAM AWESOME
--%>

<%@page import="java.util.jar.Attributes.Name"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="min-height:100%">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Homepage</title>
        <style>
        .center {
            margin: auto;
            width: 80%;
        }

        body {
            background-image: url("https://images.unsplash.com/photo-1555680202-c86f0e12f086?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80");
            background-position:center;
            background-repeat: no-repeat;
            background-size: cover;
            position:relative;
        }
/*        .no-background {
            background-image: url("images/blank.jpg");
        }*/
        </style>
    </head>
    <body>
        <br>
        <br>
        <h1 style="color:white">Homepage</h1>
        <form class="form-inline" action = "ProfileInfoServlet">
            <label style="color:white;" for ="Profile"> Welcome <%= request.getAttribute("Name") %></label>
            <input type="submit" value="ProfileInfo"/>
        </form>
        <br>
        <br>
        
        <div  style="width:400px;text-align:left;background-color:white; opacity: 0.8;">
            <h2  style="text-align:center">Product Catalog</h2>
            <form class="center" style="align-content:center;" action = "HardwareServlet">
                <input style="width:100%; height:50px;align-content:center;font-size:14pt;" type="submit" value="Hardware"/>
                <br>
            </form>
                <br>
            <form class="center" style="align-content:center;" action = "SoftwareServlet">
                <input style="width:100%; height:50px;align-content:center;font-size:14pt;" type="submit" value="Software"/>
                <br>
            </form>
                <br>
             <form class="center" style="align-content:center;" action = "FirmwareServlet">
                <input style="width:100%; height:50px;align-content:center;font-size:14pt;" type="submit" value="Firmware"/>
                <br>
            </form>
                <br>
        </div>
    </body>
</html>

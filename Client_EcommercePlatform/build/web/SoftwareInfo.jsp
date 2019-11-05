<%-- 
    Document   : SoftwareInfo
    Created on : Nov 5, 2019, 10:59:14 AM
    Author     : TEAM AWESOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="min-height:100%">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Info</title>
    </head>
        <style>
            .center {
                margin: auto;
                width: 80%;
            }

            body {
                background-image: url("https://images.unsplash.com/photo-1484417894907-623942c8ee29?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2089&q=80");
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
        <h1 style="color:white">Software Product</h1>
        <div  style="width:400px;text-align:left;background-color:white; opacity: 0.8;">
            
        <br>
        <br>
        <table class="center" style="width:90%" border="1">
<!--            <thead>
                <tr>
                    <th style="width:90%" border="0">Profile Info</th>
                </tr>
            </thead>-->
            <tbody>
                <tr>
                    <td>NAME</td>
                    <td><%= request.getAttribute("Name") %></td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td><%= request.getAttribute("Price") %></td>
                </tr>
                <tr>
                    <td>Quantity</td>
                    <td><%= request.getAttribute("Quantity") %></td>
                </tr>
                <tr>
                    <td>Availability</td>
                    <td>
                        <%= request.getAttribute("Availability") %>
                    </td>
                </tr>
            </tbody>
        </table>
        <br>
        <br>
                    
    </body>
</html>


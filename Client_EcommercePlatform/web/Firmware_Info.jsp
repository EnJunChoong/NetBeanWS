<%-- 
    Document   : Firmware_Info
    Created on : Nov 6, 2019, 2:37:43 AM
    Author     : Team Awesome
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="min-height:100%">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Firmware Catalog</title>
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
    
    
    
    <body>
        <br>
        <br>
        <h1 style="color:white">Firmware Product</h1>
        <div  style="width:400px;text-align:left;background-color:white; opacity: 0.8;">
            
        <br>
        <br>
        <table class="center" style="width:90%" border="1">
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Availability</th>
                </tr>
            </thead>
            <tbody>
                   <%= request.getAttribute("string") %>
            </tbody>
        </table>
        <br>
        <br>
                    
    </body>
</html>

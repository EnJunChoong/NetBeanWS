<%-- 
    Document   : ProfileInfo
    Created on : 2 Nov, 2019, 3:08:36 PM
    Author     : TEAM AWESOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Info</title>
    </head>
    <body>
        <h1>Profile Info</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Profile Info</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>NAME:</td>
                    <td><%= request.getAttribute("Name") %></td>
                </tr>
                <tr>
                    <td>EMAIL</td>
                    <td><%= request.getAttribute("Email") %></td>
                </tr>
                <tr>
                    <td>PHONE</td>
                    <td><%= request.getAttribute("Phone") %></td>
                </tr>
                <tr>
                    <td>ADDRESS</td>
                    <td>
                        <%= request.getAttribute("Add1") %><br>
                        <%= request.getAttribute("Add2") %><br>
                        <%= request.getAttribute("Zip") %>, <%= request.getAttribute("City") %><br>
                        <%= request.getAttribute("State") %>
                    </td>
                </tr>
            </tbody>
        </table>

    </body>
</html>

<%-- 
    Document   : HomePage
    Created on : 30 Oct, 2019, 10:59:36 PM
    Author     : TEAM AWESOME
--%>

<%@page import="java.util.jar.Attributes.Name"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Homepage</h1>
        <p id='successMsg' style='color: green; font-size: larger;'> Welcome <%= request.getAttribute("Name") %></p>"
        <form action = "ProfileInfoServlet">
            <input type="submit" value="ProfileInfo"/>
        </form>
        
        <h3>Product Catalog</h3>
        <form action = "HardwareServlet">
            <input type="submit" value="Hardware"/>
        </form>
        <form action = "SoftwareServlet">
            <input type="submit" value="Software"/>
        </form>
        <form action = "FirmwareServlet">
            <input type="submit" value="Firmware"/>
        </form>
    </body>
</html>

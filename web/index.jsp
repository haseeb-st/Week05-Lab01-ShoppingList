<%-- 
    Document   : index
    Created on : Oct 10, 2017, 2:06:37 PM
    Author     : 687159
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 05 - Lab 01</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form action="shoppingList" method="GET">
            Username: <input type="text" name="user"> <input type="submit" value="Register Name" name="reg">
        </form>
        ${errorMessage}
    </body>
</html>

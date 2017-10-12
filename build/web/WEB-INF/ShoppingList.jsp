<%-- 
    Document   : ShoppingList
    Created on : Oct 10, 2017, 2:11:31 PM
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
        
        Hello, <c:out value="${uname}"></c:out> <a href="<c:url value='/index.jsp'/>">Log Out</a> 
        <br>
        <br>
        <h2>List</h2>
        
        <form action="shoppingList" method="POST">
        Add Item: <input type="text" name="item"> <input type="submit" value="Add" name="addList"> 
        <c:forEach items = "${itemArray}" var="Item">
        <br>
        <input type="radio" name="option">${uitem}
        <br>
        </c:forEach>
        </form>
        
        ${listMessage}
    </body>
</html>

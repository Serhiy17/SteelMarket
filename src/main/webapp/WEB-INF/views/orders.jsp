<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri= "http://www.springframework.org/tags/form" prefix="sf" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Orders</title>
</head>
<body>
<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>choose profile</option>
        <c:forEach var="profile" items="${profiles }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>

<c:forEach var="ordersRun" items="${orderses }">
    ${orderRun }

    <c:forEach var="ord" items="${ordersRun.profile }">
        ${ing.length }${ing.price }
    </c:forEach>
    <br>
</c:forEach>


</body>
</html>

<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

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
        <option>Арматура</option>
        <c:forEach var="profile" items="${profilesRebar }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Рівнополичковий кутник</option>
        <c:forEach var="profile" items="${profilesLProfileEquilateral }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Нерівнополичковий кутник</option>
        <c:forEach var="profile" items="${profilesLProfileNonEquilateral }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Двутавр додаткової серії (Д)</option>
        <c:forEach var="profile" items="${profilesIBeamAdded }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Двутавр з ухилом поличок</option>
        <c:forEach var="profile" items="${profilesIBeamAngle }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Двутавр колонний (К)</option>
        <c:forEach var="profile" items="${profilesIBeamCol }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Двутавр нормальний (Б)</option>
        <c:forEach var="profile" items="${profilesIBeamNorm }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Двутавр широкополичковий (Ш)</option>
        <c:forEach var="profile" items="${profilesIBeamWide }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Тавр колонний (КТ)</option>
        <c:forEach var="profile" items="${profilesTBeamCol }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Тавр (ШТ)</option>
        <c:forEach var="profile" items="${profilesTBeamWide }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Труби квадратні</option>
        <c:forEach var="profile" items="${profilesSquarePipe }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>
    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Труби прямокутні</option>
        <c:forEach var="profile" items="${profilesRectangularPipe }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Труби круглі</option>
        <c:forEach var="profile" items="${profilesCirclePipe }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>
    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Швелер з ухилом поличок</option>
        <c:forEach var="profile" items="${profilesChanelAngle }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Швелер гнутий</option>
        <c:forEach var="profile" items="${profilesChanelBend }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>
<br><br>

<sf:form modelAttribute="orders" action="newOrders" method="post">

    <sf:input path="length"/>

    <select name = "choosenProfile">
        <option>Швелер з паралельними гранями поличок</option>
        <c:forEach var="profile" items="${profilesChanelParalel }">
            <option value= "${profile.id }">${profile.dimensions}</option>
        </c:forEach>
    </select>

    <button>in basket</button>

</sf:form>

<c:forEach var="ordersRun" items="${orderses }">
    ${ordersRun }

    <c:forEach var="ord" items="${ordersRun.profile }">
        ${ord.length }${ord.price }
    </c:forEach>
    <br>
</c:forEach>


</body>
</html>

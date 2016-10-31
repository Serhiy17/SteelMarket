<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>
<body>

<sec:authentication property="name"/>

<div style="text-align: center; margin-top: 20%">

    <sec:authorize access="hasRole('ROLE_ADMIN')">
    <a href="profileForAdmin">металічні профілі адмін</a><br>
    </sec:authorize>

    <a href="home">Гловна</a>
    <a href="registration">регістрація</a>
    <a href="delivery">доставка</a>
    <a href="contacts">контакти</a>
    <a href="aboutUs">про нас</a><br>
    <a href="profileForCastomer">металічні профілі</a><br>
    <a href="delivery">доставка</a><br>
    <a href="contacts">контакти</a><br>
    <a href="aboutUs">про нас</a><br>
    <a href="orders">замовити</a><br>

    <sec:authorize access="!isAuthenticated()">
        <a href="loginpage">SignUP</a>
    </sec:authorize>

    <sf:form action="logout" method="post">
        <button>SignOUT</button>
    </sf:form>


</div>




</body>
</html>
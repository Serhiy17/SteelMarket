<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<div class="body"></div>
<div class="grad"></div>
<div class="header3">

    <sec:authorize access="hasRole('ROLE_ADMIN')">
        <a href="profileForAdmin">металічні профілі адмін</a><br>
        <a href="orders">замовити</a><br>
    </sec:authorize>

    <sec:authorize access="hasRole('ROLE_USER')">
        <a href="orders">замовити</a><br>
    </sec:authorize>


    <sec:authorize access="!isAuthenticated()">

        <a href="registration">Реєстрація</a>
    </sec:authorize>

</div>

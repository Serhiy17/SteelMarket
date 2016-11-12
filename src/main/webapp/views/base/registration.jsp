<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

    <div class="body"></div>
    <div class="grad"></div>
    <div class="header1">
        <div>Your<span>Registration</span></div>
    </div>
    <br>
    <div class="login">
        <sf:form modelAttribute="person" action="newPerson" method="post">
            <input type="text" placeholder="name" name="username" id="name"/><br>
            <sf:input type="text" placeholder="surname" path="surName" id="name"/><br>
            <sf:input type="email" placeholder="email" path="email" id="name"/><br>
            <sf:input type="phone" placeholder="phone" path="phone" id="name"/><br>
            <sf:input type="password" placeholder="password" path="password" id="name"/><br>
            <button class = "button">Registration</button>
        </sf:form>
    </div>

<%--    ${person.getOriginUsername()}

    <br>
    <img src="${person.pathImage}" height="100px" width="200px">--%>

    <sf:form action="./saveImage?${_csrf.parameterName}=${_csrf.token}"
               method="post" enctype="multipart/form-data">
        <input type="file" name="image">
        <button>save image</button>
    </sf:form>


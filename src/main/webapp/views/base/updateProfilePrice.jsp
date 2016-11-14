<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="body"></div>
<div class="grad"></div>
<div class="header1">
    <div>Add<span> Profile</span></div>
</div>
<br>
<div class="login">
    <sf:form action="saveUpdateProfile/${profileForUpdatePrice.id}" method="post">
        <input type="text" placeholder="dimensions" value="${profileForUpdatePrice.dimensions}" name="newDimensions" id="name"/><br>
        <input type="text" placeholder="price" value="${profileForUpdatePrice.price}" name="newPrice" id="name"/><br>
        <button class = "button">Change</button>
    </sf:form>
</div>
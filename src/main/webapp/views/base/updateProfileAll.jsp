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
        <sf:form action="saveUpdateProfile/${profileForUpdate.id}" method="post">
            <sf:input type="text" placeholder="type" value="${profileForUpdate.typeOfProfile}" path="newTypeOfProfile" id="name"/><br>
            <sf:input type="text" placeholder="dimensions" value="${profileForUpdate.dimensions}" path="newDimensions" id="name"/><br>
            <sf:input type="text" placeholder="weight" value="${profileForUpdate.weight}" path="newWeight" id="name"/><br>
            <sf:input type="text" placeholder="length"  value="${profileForUpdate.length}" path="newLength" id="name"/><br>
            <sf:input type="text" placeholder="price" value="${profileForUpdate.price}" path="newPrice" id="name"/><br>
            <sf:input type="text" placeholder="gost" value="${profileForUpdate.gost}" path="newGost" id="name"/><br>
            <sf:button class = "button">Change</sf:button>
        </sf:form>
    </div>




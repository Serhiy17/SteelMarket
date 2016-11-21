    <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


    <div class="body"></div>
    <div class="grad"></div>
    <div class="header1">
        <div>Update<span> Profile</span></div>
    </div>
    <br>
    <div class="login">
        <sf:form action="saveUpdateProfile/${profileForUpdate.id}" method="post">
            <input type="text" placeholder="type" value="${profileForUpdate.typeOfProfile}" name="newTypeOfProfile" id="name"/><br>
            <input type="text" placeholder="dimensions" value="${profileForUpdate.dimensions}" name="newDimensions" id="name"/><br>
            <input type="text" placeholder="weight" value="${profileForUpdate.weight}" name="newWeight" id="name"/><br>
            <input type="text" placeholder="length"  value="${profileForUpdate.length}" name="newLength" id="name"/><br>
            <input type="text" placeholder="price" value="${profileForUpdate.price}" name="newPrice" id="name"/><br>
            <input type="text" placeholder="gost" value="${profileForUpdate.gost}" name="newGost" id="name"/><br>
            <button class = "button">Update</button>
        </sf:form>
    </div>




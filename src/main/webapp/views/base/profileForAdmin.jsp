<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>PROFILE</title>
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
</head>
<body>
    <div style="text-align: center; margin-top: 10%">

        <sf:form class="pure-form pure-form-aligned" action="newProfile" method = "post">
            <fieldset>
                <div class="pure-control-group">
                    <label for="typeOfProfile">Type Of Profile</label>
                    <input name="typeOfProfile" id="typeOfProfile" type="text" placeholder="typeOfProfile">
                </div>

                <div class="pure-control-group">
                    <label for="dimensions">Dimensions</label>
                    <input name="dimensions" id="dimensions" type="text" placeholder="dimensions">
                </div>

                <div class="pure-control-group">
                    <label for="weight">Weight By One Meter</label>
                    <input name="weight" id="weight" type="text" placeholder="weight">
                </div>

                <div class="pure-control-group">
                    <label for="length">Length</label>
                    <input name="length" id="length" type="text" placeholder="length">
                </div>

                <div class="pure-control-group">
                    <label for="price">Price In UAH By Meter</label>
                    <input name="price" id="price" type="text" placeholder="price">
                </div>

                <div class="pure-control-group">
                    <label for="gost">GOST</label>
                    <input name="gost" id="gost" type="text" placeholder="gost">
                </div>

                <div class="pure-controls">
                    <button type="save" class="pure-button pure-button-primary">SAVE</button>
                </div>
            </fieldset>
        </sf:form>--%>

        <div class="body"></div>
        <div class="grad"></div>
        <div class="header1">
            <div>Add<span> Profile</span></div>
        </div>
        <br>
        <div class="login">
            <sf:form action="newProfile" method="post">
                <input type="text" placeholder="type" name="typeOfProfile" id="name"/><br>
                <input type="text" placeholder="dimensions" name="dimensions" id="name"/><br>
                <input type="text" placeholder="weight" name="weight" id="name"/><br>
                <input type="text" placeholder="length" name="length" id="name"/><br>
                <input type="text" placeholder="price" name="price" id="name"/><br>
                <input type="text" placeholder="gost" name="gost" id="name"/><br>
                <button class = "button">Add</button>
            </sf:form>
        </div>

        <div class="login"; style="text-align: center; margin-top: 30px">

            <c:forEach var="prof" items="${profiles}">
                ${prof.typeOfProfile} ${prof.dimensions} ${prof.price}
                <a href="del/${prof.id}">delete</a>
                <a href="updateAll/${prof.id}">update</a>
                <a href="updatePrice/${prof.id}">change price</a>
                <br>
            </c:forEach>
        </div>

<%--    </div>
</body>
</html>--%>

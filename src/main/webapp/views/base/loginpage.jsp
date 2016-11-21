<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<div class="body"></div>
<div class="grad"></div>
<div class="header1">
    <div>Please<span> Enter</span></div>
</div>
<br>
<div class="login">
    <sf:form action="loginprocesing" method="post">
        <input type="text" placeholder="name" name="username"><br>
        <input type="password" placeholder="password" name="password"><br>
        <button  class = "button">Enter</button>
    </sf:form>
</div>

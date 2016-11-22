<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<div class="header">

        <div class = "button1"><a href="home"> ГОЛОВНА </a></div>
        <div class = "button1"><a href="profileForUser"> ПРОФІЛІ </a></div>
        <div class = "button1"><a href="delivery"> ДОСТАВКА </a></div>
        <div class = "button1"><a href="aboutUs"> ПРО НАС </a></div>
        <div class = "button1"><a href="contacts"> КОНТАКТИ </a></div>
        <div class = "button1"><a href="loginpage"> УВІЙТИ </a></div>
        <div class = "button1">
                <sf:form action="logout" method="post">
                        <button class = "button2">ВИЙТИ</button>
                </sf:form>
        </div>

</div>
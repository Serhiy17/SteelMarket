<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<div class="header">
    <span>
        <a href="home">ГОЛОВНА</a>
        <a href="profileForUser">ПРОФІЛІ</a>
        <a href="delivery">ДОСТАВКА</a>
        <a href="aboutUs">ПРО НАС</a>
        <a href="contacts">КОНТАКТИ</a>
        <a href="loginpage">УВІЙТИ</a>
        <sf:form action="logout" method="post">
            <button>ВИЙТИ</button>
        </sf:form>
    </span>
</div>
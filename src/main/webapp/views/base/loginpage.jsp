<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <%--<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>--%>
    <link type="text/css" rel="stylesheet" href="/resources/css/loginpage.css">
</head>
<body>

<%--<sf:form action="loginprocesing" method="post">
    <input name="username">
    <input name="password">
    <button>sign in</button>
</sf:form>--%>

<%--<div class="login">
    <h2 class="active"> sign in </h2>

    <h2 class="nonactive"> sign up </h2>
    <sf:form action="loginpage" method="post">



        <input type="text" class="text" name="username">
        <span>username</span>

        <br>

        <br>

        <input type="password" class="text" name="password">
        <span>password</span>
        <br>

        <button class="signin">
            Sign In
        </button>

        <hr>

        <a href="#">Forgot Password?</a>
    </sf:form>

</div>--%>

<div class="body"></div>
<div class="grad"></div>
<div class="header">
    <div>Site<span>Random</span></div>
</div>
<br>
<div class="login">
    <sf:form action="loginprocesing" method="post">
        <input type="text" placeholder="username" name="username"><br>
        <input type="password" placeholder="password" name="password"><br>
        <button >Увійти</button>
    </sf:form>
</div>


</body>
</html>
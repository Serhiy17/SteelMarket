<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
    <link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">

    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
    <link type="text/css" rel="stylesheet" href="/resources/css/registration.css">
</head>
<body>

    <div class="testbox" style="text-align: center;" <%--margin-top: 10%"--%>>
        <h1>Registration</h1>
        <sf:form modelAttribute="person" action="newPerson" method = "post">

            <label id="icon" for="name"><i class="icon-user "></i></label>
            <input name="username" type="text" name="name" id="name" placeholder="username" />
            <label id="icon" for="name"><i class="icon-user "></i></label>
            <sf:input path="surName" type="text" name="name" id="name" placeholder="surname" />
            <label id="icon" for="name"><i class="icon-envelope"></i></label>
            <sf:input path="email" type="text" name="name" id="name" placeholder="email" />
            <label id="icon" for="name"><i class="icon-phone"></i></label>
            <sf:input path="phone" type="text" name="name" id="name" placeholder="phone" />
            <label id="icon" for="name"><i class="icon-shield"></i></label>
            <sf:input path="password" type="password" name="name" id="name" placeholder="password" />

            <button class="button">Register</button>

        </sf:form>
    </div>

    ${person.getOriginUsername()}

    <br>
    <img src="${person.pathImage}" height="100px" width="200px">

    <sf:form action="./saveImage?${_csrf.parameterName}=${_csrf.token}"
               method="post" enctype="multipart/form-data">
        <input type="file" name="image">
        <button>save image</button>
    </sf:form>

</body>
</html>

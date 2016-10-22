<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
    <link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="/resources/css/registration.css">
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
</head>
<body>
    <div style="text-align: center; margin-top: 10%">
        <sf:form modelAttribute="person" action="newPerson" method = "post">

            <label id="icon" for="name"><i class="icon-user "></i></label>
            <sf:input path="name" type="text" name="name" id="name" placeholder="name" /><br>
            <label id="icon" for="name"><i class="icon-user "></i></label>
            <sf:input path="surName" type="text" name="name" id="name" placeholder="surname" /><br>
            <label id="icon" for="name"><i class="icon-envelope"></i></label>
            <sf:input path="email" type="text" name="name" id="name" placeholder="email" /><br>
            <label id="icon" for="name"><i class="icon-shield"></i></label>
            <sf:input path="phone" type="password" name="name" id="name" placeholder="phone" /><br>
            <label id="icon" for="name"><i class="icon-shield"></i></label>
            <sf:input path="password" type="password" name="name" id="name" placeholder="password" /><br>

           <%-- <div style="text-align: center;">
                <button class="button">Register</button>
            </div>--%>

            <div class="pure-controls">
                <button type="save" class="pure-button pure-button-primary">Register</button>
            </div>

        </sf:form>


    </div>
</body>
</html>

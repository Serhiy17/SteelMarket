<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="css/header.css">
    <link rel="stylesheet" type="text/css" href="css/loginpage.css">
    <link rel="stylesheet" type="text/css" href="css/registration.css">
    <link rel="stylesheet" type="text/css" href="css/profileForAdmin.css">
    <link rel="stylesheet" type="text/css" href="css/profileForUser.css">
    <link rel="stylesheet" type="text/css" href="css/profileForUpdatePrice.css">
    <link rel="stylesheet" type="text/css" href="css/profileForUpdate.css">

</head>
<body>

    <div><tiles:insertAttribute name="header"/></div>
    <div><tiles:insertAttribute name="body"/></div>
    <div><tiles:insertAttribute name="footer"/></div>

</body>
</html>
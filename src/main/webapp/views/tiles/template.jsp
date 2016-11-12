<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <link rel="header" href="/resources/css/header.css">

    <spring:url value="/resources/css/header.css" var="headerCss"/>
    <link rel="header" type="text/css" href="${headerCss}">


</head>
<body>

    <div><tiles:insertAttribute name="header"/></div>
    <div><tiles:insertAttribute name="body"/></div>
    <div><tiles:insertAttribute name="footer"/></div>

</body>
</html>
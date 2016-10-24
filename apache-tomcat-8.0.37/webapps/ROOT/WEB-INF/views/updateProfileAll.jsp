<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Update Profile</title>
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
</head>
<body>

<div style="text-align: center; margin-top: 10%">

    <form class="pure-form pure-form-aligned" action="saveUpdateProfile/${profileForUpdate.id}" method = "post">
        <fieldset>
            <div class="pure-control-group">
                <label for="typeOfProfile">Type Of Profile</label>
                <input name="newTypeOfProfile" value="${profileForUpdate.typeOfProfile}"
                       id="typeOfProfile" type="text" placeholder="typeOfProfile">
            </div>

            <div class="pure-control-group">
                <label for="dimensions">Dimensions</label>
                <input name="newDimensions" value="${profileForUpdate.dimensions}"
                       id="dimensions" type="text" placeholder="dimensions">
            </div>

            <div class="pure-control-group">
                <label for="weight">Weight By One Meter</label>
                <input name="newWeight" value="${profileForUpdate.weight}"
                       id="weight" type="text" placeholder="weight">
            </div>

            <div class="pure-control-group">
                <label for="length">Length</label>
                <input name="newLength" value="${profileForUpdate.length}"
                       id="length" type="text" placeholder="length">
            </div>

            <div class="pure-control-group">
                <label for="price">Price In UAH By Meter</label>
                <input name="newPrice" value="${profileForUpdate.price}"
                       id="price" type="text" placeholder="price">
            </div>

            <div class="pure-control-group">
                <label for="gost">GOST</label>
                <input name="newGost" value="${profileForUpdate.gost}"
                       id="gost" type="text" placeholder="gost">
            </div>

            <div class="pure-controls">
                <button type="save" class="pure-button pure-button-primary">UPDATE</button>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>

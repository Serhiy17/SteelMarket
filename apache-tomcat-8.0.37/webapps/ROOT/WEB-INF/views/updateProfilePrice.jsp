<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Update Profile Price</title>
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
</head>
<body>

<div style="text-align: center; margin-top: 10%">

    <form class="pure-form pure-form-aligned" action="saveUpdateProfilePrice/${profileForUpdatePrice.id}" method = "post">
        <fieldset>

            <div class="pure-control-group">
                <label for="dimensions">Dimensions</label>
                <input name="newDimensions" value="${profileForUpdatePrice.dimensions}"
                       id="dimensions" type="text" placeholder="dimensions">
            </div>

            <div class="pure-control-group">
                <label for="price">Price In UAH By Meter</label>
                <input name="newPrice" value="${profileForUpdatePrice.price}"
                       id="price" type="text" placeholder="price">
            </div>

            <div class="pure-controls">
                <button type="save" class="pure-button pure-button-primary">UPDATE</button>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Serhiy
  Date: 19.10.2016
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PROFILE</title>
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
</head>
<body>
    <div style="text-align: center; margin-top: 20%">

        <form class="pure-form pure-form-aligned" action="newProfile" method = "post">
            <fieldset>
                <div class="pure-control-group">
                    <label for="typeOfProfile">Type Of Profile</label>
                    <input id="typeOfProfile" type="text" placeholder="typeOfProfile">
                </div>

                <div class="pure-control-group">
                    <label for="dimensions">Dimensions</label>
                    <input id="dimensions" type="text" placeholder="dimensions">
                </div>

                <div class="pure-control-group">
                    <label for="weight">Weight By One Meter</label>
                    <input id="weight" type="text" placeholder="weight">
                </div>

                <div class="pure-control-group">
                    <label for="length">Length</label>
                    <input id="length" type="text" placeholder="length">
                </div>

                <div class="pure-control-group">
                    <label for="price">Price In UAH By One Meter</label>
                    <input id="price" type="text" placeholder="price">
                </div>

                <div class="pure-control-group">
                    <label for="gost">GOST</label>
                    <input id="gost" type="text" placeholder="gost">
                </div>

                <div class="pure-controls">
                    <button type="save" class="pure-button pure-button-primary">SAVE</button>
                </div>
            </fieldset>
        </form>

    </div>
</body>
</html>

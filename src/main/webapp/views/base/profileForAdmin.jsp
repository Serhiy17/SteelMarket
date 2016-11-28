<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

        <div class="body"></div>
        <div class="grad"></div>
        <div class="header1">
            <div>Add<span> Profile</span></div>
        </div>
        <br>
        <div class="login">
            <sf:form action="newProfile" method="post">

                <sf:errors path = "typeOfProfile"/>
                <sf:errors path = "dimensions"/>
                <sf:errors path = "weight"/>
                <sf:errors path = "length"/>
                <sf:errors path = "gost"/>

                <input type="text" placeholder="type" name="typeOfProfile" id="name"/><br>
                <input type="text" placeholder="dimensions" name="dimensions" id="name"/><br>
                <input type="text" placeholder="weight" name="weight" id="name"/><br>
                <input type="text" placeholder="length" name="length" id="name"/><br>
                <input type="text" placeholder="price" name="price" id="name"/><br>
                <input type="text" placeholder="gost" name="gost" id="name"/><br>
                <button class = "button">Add</button>
            </sf:form>
        </div>

        <div class="login"; style="text-align: center; margin-top: 30px">

            <c:forEach var="prof" items="${profiles}">
                ${prof.typeOfProfile} ${prof.dimensions} ${prof.price}
                <a href="del/${prof.id}">delete</a>
                <a href="updateAll/${prof.id}">update</a>
                <a href="updatePrice/${prof.id}">change price</a>
                <br>
            </c:forEach>
        </div>

<%--    </div>
</body>
</html>--%>

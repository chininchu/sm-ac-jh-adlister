<%@ page import="com.codeup.adlister.models.Ad" %>
<%@ page import="com.codeup.adlister.dao.Ads" %><%--
  Created by IntelliJ IDEA.
  User: andrewchu
  Date: 5/31/23
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Ad</title>
</head>
<body>


<form action="/editAd" method="post">


    <label for="title">Title:</label>
    <input value="${singleAd.title}" type="text" id="title" name="title" required><br><br>

    <label for="description">Description:</label>
    <input value="${singleAd.description}" type="text" id="description" name="description" required><br><br>

    <button>Submit</button>


    <input name="id" type="hidden" value="${singleAd.id}">
</form>


</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: savannamccauley
  Date: 6/1/23
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:if test="${not empty sessionScope.registrationErrorMessage}">
    <script>
        alert("${sessionScope.registrationErrorMessage}");
    </script>
    <% session.removeAttribute("registrationErrorMessage"); %>
</c:if>

<c:if test="${not empty sessionScope.createAddWithoutTitle}">
    <script>
        alert("${sessionScope.createAddWithoutTitle}");
    </script>
    <% session.removeAttribute("createAddWithoutTitle"); %>
</c:if>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>

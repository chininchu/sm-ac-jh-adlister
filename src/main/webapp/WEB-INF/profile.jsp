<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile"/>
    </jsp:include>
    <link rel="stylesheet" href="/CSS/main.css">


</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>

<div class="container">
    <h1>Welcome, ${sessionScope.user.username}!</h1>
    <br>
    <h2>Here are all of YOUR posted ads:</h2>

    <div class="ads-container">
        <c:forEach var="ad" items="${ads}">
            <div class="ad">
                <h3 class="ad-title">${ad.title}</h3>


                <p class="ad-description">${ad.description}</p>


            </div>
        </c:forEach>
</div>
    <form method="post" action="delete">
        <button type="submit">Delete Your Profile</button>
    </form>
    </div>

<%--    <form method="post" action="/profile">--%>
<%--        <button type="submit">Delete</button>--%>
<%--        <input type="hidden" name="delete-id" value="${ad.id}">--%>

<%--        <input type="hidden" name="delete-title" value="${ad.title}">--%>

<%--        <input type="hidden" name="delete-description" alue="${ad.description}">--%>

<%--    </form>--%>

</div>

</body>
</html>

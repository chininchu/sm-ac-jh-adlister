<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
    <style>
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
        }

        .ad-title {
            color: gray;
            font-size: 24px;
            text-decoration: underline;
            margin-bottom: 10px;
        }

        .ad-description {
            font-style: italic;
            font-size: 16px;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Welcome, ${sessionScope.user.username}!</h1>
    <br>
    <h2>Here are all of YOUR posted ads:</h2>

    <c:forEach var="ad" items="${ads}">
        <h3 class="ad-title">${ad.title}</h3>
        <p class="ad-description">${ad.description}</p>
    </c:forEach>
</div>
</body>
</html>

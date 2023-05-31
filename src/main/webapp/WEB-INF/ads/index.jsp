<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>

<div class="container">
    <h1>Here Are all the ads!</h1>

    <c:forEach var="ad" items="${ads}">
        <%--        <div class="col-md-6">--%>
        <%--            <h2>${ad.title}</h2>--%>
        <%--            <a href="index.jsp?id=${ad.id}">Edit</a>--%>

        <%--            <p>${ad.description}</p>--%>
        <%--            <a href="index.jsp?id=${ad.id}">Edit</a>--%>

        <%--        &lt;%&ndash;            This dynamically renders the edit button&ndash;%&gt;--%>

        <%--        </div>--%>

        <form action="/editAd" method="get">

            <div class="col-md-6">
                <h2>${ad.title}</h2>
<%--                <button type="hidden" value="${ad.id}">Edit</button>--%>
                <p>${ad.description}</p>
                <button type="hidden" value="${ad.id}">Edit</button>
            </div>
        </form>


        <%--        <table>--%>
        <%--            <tr>--%>
        <%--                <th>ID</th>--%>
        <%--                <th>title</th>--%>
        <%--                <th>description</th>--%>
        <%--            </tr>--%>
        <%--            <c:forEach items="${ads}" var="ad">--%>
        <%--                <tr>--%>
        <%--                    <td>${ad.id}</td>--%>
        <%--                    <td>${ad.title}</td>--%>
        <%--                    <td>${ad.description}</td>--%>

        <%--                    <td>--%>
        <%--                        <a href="index.jsp?id=${ad.id}">Edit</a>--%>
        <%--                    </td>--%>
        <%--                </tr>--%>


        <%--                <form action="/ads" method="post">--%>
        <%--                    <input type="hidden" name="id" value="${ad.id}" />--%>
        <%--                    <label for="title">title:</label>--%>
        <%--                    <input type="text" name="title" value="${ad.title}" /><br />--%>
        <%--                    <input type="submit" value="Save" />--%>
        <%--                </form>--%>

        <%--            </c:forEach>--%>
        <%--        </table>--%>


    </c:forEach>
</div>

</body>
</html>

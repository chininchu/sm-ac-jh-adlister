<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads"/>
    </jsp:include>
    <link rel="stylesheet" href="/CSS/main.css">
    <style>
        h1 {
            text-decoration: blue;
        }
    </style>

</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>

<div class="container">
    <h1>List of all Ads: </h1>

    <c:forEach var="ad" items="${ads}">


        <form action="/editAd" method="get">
            <div class="container">
                <div class="col-md-6">
                    <h2> ${ad.title}</h2>
                    <input name="title" type="hidden" value="${ad.title}">


                    <p>${ad.description}</p>

                    <input name="description" type="hidden" value="${ad.description}">

                    <button>Edit</button>
                    <input name="id" type="hidden" value="${ad.id}">


                </div>
            </div>
        </form>


        <form action="/deleteAd" method="get">
            <!-- Input field for Advertisement ID -->

            <button>Delete</button>

            <input name="id" type="hidden" value="${ad.id}">

            <input name="title" type="hidden" value="${ad.title}">

            <input name="description" type="hidden" value="${ad.description}">


        </form>


    </c:forEach>

    <%--    <form action="/deleteAd" method="get">--%>
    <%--        <!-- Input field for Advertisement ID -->--%>

    <%--        <button>Delete</button>--%>

    <%--        <input name="id" type="hidden" value="${Ad.id}">--%>

    <%--        <input name="title" type="hidden" value="${Ad.title}">--%>

    <%--        <input name="description" type="hidden" value="${Ad.description}">--%>


    <%--    </form>--%>
</div>

</body>
</html>

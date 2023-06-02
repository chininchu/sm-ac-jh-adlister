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

        .ads-container {
            width: 100%;
            overflow-x: auto;
            white-space: nowrap;
            padding-bottom: 20px;
        }

        .ad-column {
            display: inline-block;
            vertical-align: top;
            white-space: normal;
            width: 300px;
            margin-right: 20px;
        }

        .ad-bubble {
            background-color: #f1f1f1;
            border-radius: 10px;
            padding: 20px;
            margin-bottom: 20px;
        }

        .ad-title {
            font-size: 24px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .ad-description {
            font-size: 16px;
            margin-bottom: 10px;
        }

        .ad-actions {
            margin-top: 10px;
        }
    </style>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>

<div class="container">
    <h1>List of all Ads:</h1>

    <div class="ads-container">
        <c:forEach var="ad" items="${ads}">
            <div class="ad-column">
                <div class="ad-bubble">
                    <h2 class="ad-title">${ad.title}</h2>
                    <p class="ad-description">${ad.description}</p>
                    <div class="ad-actions">
                        <form action="/editAd" method="get">
                            <input name="title" type="hidden" value="${ad.title}">
                            <input name="description" type="hidden" value="${ad.description}">
                            <input name="id" type="hidden" value="${ad.id}">
                            <button>Edit</button>
                        </form>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
=======
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


        <form action="/deleteAd" method="post">
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
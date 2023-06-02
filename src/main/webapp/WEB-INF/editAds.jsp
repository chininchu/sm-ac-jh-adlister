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
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <title class="container-head">Edit Ad</title>
    <style>
        .container-head{
        .container-head{
            color: #262626;
            overflow: hidden;
            border-right: .10em solid #f7f6f6;
            white-space: nowrap;
            margin: 0 auto;
            letter-spacing: .4rem;
            animation: demo-typewriter 4s steps(30, end), demo-cursor 1s step-end infinite;
        }
        @keyframes demo-typewriter {
            from {
                width: 0;
            }
            to {
                width: 100%;
            }
        }

        @keyframes demo-cursor {
            from, to {
                border-color: transparent;
            }
            50% {
                border-color: #FF8D8D;
            }
        }

        }
    </style>
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

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
    <link rel="stylesheet" href="/CSS/main.css">
<style>
    body{
        background-image: url("https://c8.alamy.com/comp/2H62BD4/retro-newspaper-goods-and-services-old-advertising-banners-vintage-newspaper-ads-vector-illustration-set-newspaper-shops-advertisement-2H62BD4.jpg");
    }
    .container-head{
        color: #262626;
        overflow: hidden;
        border-right: .10em solid #f7f6f6;
        white-space: nowrap;
        margin: 0 auto;
        letter-spacing: .4rem;
        animation: demo-typewriter 5s steps(30, end), demo-cursor 1s step-end infinite;
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

    h1{
        font-size: 60px;
        font-weight: bold;
        text-align: center;
        color: #3d2c23;
    }
</style>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container-head">
        <h1>WELCOME TO THE ADLISTER!</h1>
        <h1>WELCOME TO THE ADLISTER!</h1>
        <h1>WELCOME TO THE ADLISTER!</h1>
        <h1>WELCOME TO THE ADLISTER!</h1>
        <h1>WELCOME TO THE ADLISTER!</h1>
        <h1>WELCOME TO THE ADLISTER!</h1>
        <h1>WELCOME TO THE ADLISTER!</h1>
        <h1>WELCOME TO THE ADLISTER!</h1>
    </div>
</body>
</html>

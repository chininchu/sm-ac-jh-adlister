<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Create a new Ad" />
    </jsp:include>
</head>
<body>
<%@ include file="/WEB-INF/partials/message.jsp" %>

    <div class="container">
        <h1>Create a new Ad</h1>
        <form action="/ads/create" method="post">
            <div class="form-group">
                <label for="title">Title</label>
                <input id="title" name="title" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="description">Description</label>
                <textarea id="description" name="description" class="form-control" type="text"></textarea>
            </div>
            <div class="form-group">
                <label for="category">Category</label>
                <select name="category" id="category">
                    <option>Art</option>
                    <option>Automobiles</option>
                    <option>Aviation</option>
                    <option>Bicycles</option>
                    <option>Boat</option>
                    <option>CD/DVD/VHS</option>
                    <option>Books & Magazines</option>
                    <option>Cell Phones</option>
                    <option>Clothing</option>
                    <option>Collectibles</option>
                    <option>Computers</option>
                    <option>Electronics</option>
                    <option>Farm & Garden</option>
                    <option>Furniture</option>
                    <option>Health & Beauty</option>
                    <option>Heavy Equipment</option>
                    <option>Jewelry</option>
                    <option>Musical Instruments</option>
                    <option>Pets</option>
                    <option>Sporting Goods</option>
                    <option>Tools</option>
                    <option>Toys & Games</option>
                    <option>Trailers</option>
                    <option>Video Games</option>
                </select>
            </div>
            <input type="submit" class="btn btn-block btn-primary">
        </form>
    </div>
</body>
</html>

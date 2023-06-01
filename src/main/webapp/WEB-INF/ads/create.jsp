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
            <fieldset>
                <legend>Select applicable categories</legend>
                <div>
                    <input name="Category" id="Art" value="Art" type="checkbox">
                    <label for="Art">Art</label>
                </div>
                <div>
                    <input name="Category" id="Automobiles" value="Automobiles" type="checkbox">
                    <label for="Automobiles">Automobiles</label>
                </div>
                <div>
                    <input name="Category" id="Aviation" value="Aviation" type="checkbox">
                    <label for="Aviation">Aviation</label>
                </div>
                <div>
                    <input name="Category" id="Bicycles" value="Bicycles" type="checkbox">
                    <label for="Bicycles">Bicycles</label>
                </div>
                <div>
                    <input name="Category" id="Boat" value="Boat" type="checkbox">
                    <label for="Boat">Boat</label>
                </div>
                <div>
                    <input name="Category" id="Books & Magazines" value="Books & Magazines" type="checkbox">
                    <label for="Books & Magazines">Books & Magazines</label>
                </div>
                <div>
                    <input name="Category" id="CD/DVD/VHS" value="CD/DVD/VHS" type="checkbox">
                    <label for="CD/DVD/VHS">CD/DVD/VHS</label>
                </div>
                <div>
                    <input name="Category" id="Cell Phones" value="Cell Phones" type="checkbox">
                    <label for="Cell Phones">Cell Phones</label>
                </div>
                <div>
                    <input name="Category" id="Clothing" value="Clothing" type="checkbox">
                    <label for="Clothing">Clothing</label>
                </div>
                <div>
                    <input name="Category" id="Collectibles" value="Collectibles" type="checkbox">
                    <label for="Collectibles">Collectibles</label>
                </div>
                <div>
                    <input name="Category" id="Computers" value="Computers" type="checkbox">
                    <label for="Computers">Computers</label>
                </div>
                <div>
                    <input name="Category" id="Electronics" value=Electronics" type="checkbox">
                    <label for="Electronics">Electronics</label>
                </div>
                <div>
                    <input name="Category" id="Farm & Garden" value="Farm & Garden" type="checkbox">
                    <label for="Farm & Garden">Farm & Garden</label>
                </div>
                <div>
                    <input name="Category" id="Furniture" value="Furniture" type="checkbox">
                    <label for="Furniture">Furniture</label>
                </div>
                <div>
                    <input name="Category" id="Health & Beauty" value="Health & Beauty" type="checkbox">
                    <label for="Health & Beauty">Health & Beauty</label>
                </div>
                <div>
                    <input name="Category" id="Heavy Equipment" value="Heavy Equipment" type="checkbox">
                    <label for="Heavy Equipment">Heavy Equipment</label>
                </div>
                <div>
                    <input name="Category" id="Jewelry" value="Jewelry" type="checkbox">
                    <label for="Jewelry">Jewelry</label>
                </div>
                <div>
                    <input name="Category" id="Musical Instruments" value="Musical Instruments" type="checkbox">
                    <label for="Musical Instruments">Musical Instruments</label>
                </div>
                <div>
                    <input name="Category" id="Pets" value="Pets" type="checkbox">
                    <label for="Pets">Pets</label>
                </div>
                <div>
                    <input name="Category" id="Sporting Goods" value="Sporting Goods" type="checkbox">
                    <label for="Sporting Goods">Sporting Goods</label>
                </div>
                <div>
                    <input name="Category" id="Tools" value="Tools" type="checkbox">
                    <label for="Tools">Tools</label>
                </div>
                <div>
                    <input name="Category" id="Toys & Games" value="Toys & Games" type="checkbox">
                    <label for="Toys & Games">Toys & Games</label>
                </div>
                <div>
                    <input name="Category" id="Trailers" value="Trailers" type="checkbox">
                    <label for="Trailers">Trailers</label>
                </div>
                <div>
                    <input name="Category" id="Video Games" value="Video Games" type="checkbox">
                    <label for="Video Games">Video Games</label>
                </div>
            </fieldset>
            <input type="submit" class="btn btn-block btn-primary">
        </form>
    </div>
</body>
</html>

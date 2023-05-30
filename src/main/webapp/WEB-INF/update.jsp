<%--
  Created by IntelliJ IDEA.
  User: savannamccauley
  Date: 5/30/23
  Time: 12:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Page</title>
</head>
<body>
<h1>Update Page</h1>
<form action="/update" method="POST">
    <label for="username">Enter Current Username:</label>
    <input type="text" id="username" name="username" required><br><br>

    <label for="usernameNew">Enter Your New Username:</label>
    <input type="text" id="usernameNew" name="usernameNew" required><br><br>

    <label for="password">Enter new password:</label>
    <input type="password" id="password" name="password" required><br><br>

    <label for="email">Enter new email:</label>
    <input type="text" id="email" name="email" required><br><br>

    <input type="submit" value="Save Changes">
</form>

</body>
</html>

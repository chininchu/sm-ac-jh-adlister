<%--
  Created by IntelliJ IDEA.
  User: savannamccauley
  Date: 5/30/23
  Time: 12:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        .form-container {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            width: 80%; /* Adjust the width of the form container */
            margin: 0 auto; /* Center the form container horizontally */
        }

        h1 {
            color: #333;
            text-align: center;
            margin-bottom: 30px;
        }

        form {
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 10px;
            color: #555;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%; /* Adjust the width of the input fields */
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
            transition: border-color 0.3s ease;
        }

        input[type="text"]:focus,
        input[type="password"]:focus {
            border-color: #4CAF50;
        }

        input[type="submit"] {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h1>Update Profile Information</h1>
    <form action="/update" method="POST">
        <label for="username">Enter Current Username:</label>
        <input type="text" id="username" name="username" required>

        <label for="usernameNew">Enter Your New Username:</label>
        <input type="text" id="usernameNew" name="usernameNew" required>

        <label for="password">Enter new password:</label>
        <input type="password" id="password" name="password" required>

        <label for="email">Enter new email:</label>
        <input type="text" id="email" name="email" required>

        <input type="submit" value="Save Changes">
    </form>
</div>
</body>
</html>


<style>
    body{
        background-image: url("https://c8.alamy.com/comp/2H62BD4/retro-newspaper-goods-and-services-old-advertising-banners-vintage-newspaper-ads-vector-illustration-set-newspaper-shops-advertisement-2H62BD4.jpg");
    }
    /* Navbar styling */
.navbar {
    background-color: #ab968a;
    padding: 10px 20px;

}

.navbar-brand {
    color: #342814;
    font-size: 24px;
    font-weight: bold;
    text-decoration: none;
}

.navbar-menu {
    list-style: none;
    margin: 0;
    padding: 0;
}

.navbar-menu li {
    display: inline-block;
    margin-right: 10px;
}

.navbar-menu li a {
    color: #d8d4c7;
    font-size: 16px;
    text-decoration: none;
    transition: color 0.3s ease;
}

.navbar-menu li a:hover {
    color: #ffc107;
}
</style>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads">Adlister</a>
        </div>
        <ul class="nav navbar-nav navbar-right navbar-menu">
            <% if (request.getSession().getAttribute("user") != null) { %>
            <li><a href="/update">Update Profile</a></li>
            <li><a href="/ads/create">Create a New Ad</a></li>
            <li><a href="/ads">View a List of All Ads</a></li>
            <li><a href="/profile">Profile</a></li>
            <li><a href="/logout">Logout</a></li>

            <% } else { %>
            <li><a href="/login">Login</a></li>
            <li><a href="/register">Register</a></li>
            <% } %>
        </ul>
    </div>
</nav>


<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads">Adlister</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
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
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import com.codeup.adlister.util.Password;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="UpdateProfileServlet", urlPatterns = "/update")
public class UpdateProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/update.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String usernameNew = req.getParameter("usernameNew");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        User user = DaoFactory.getUsersDao().findByUsername(username);


        boolean inputHasErrors = username.isEmpty()
                || usernameNew.isEmpty()
                || password.isEmpty()
                || email.isEmpty();

        String hash = Password.hash(password);



        if (inputHasErrors) {
            resp.sendRedirect("/update");
            return;
        }

        user.setUsername(usernameNew);
        user.setPassword(hash);
        user.setEmail(email);
        DaoFactory.getUsersDao().update(user);



        resp.sendRedirect("/login");

//request to DAO
        //
    }

}

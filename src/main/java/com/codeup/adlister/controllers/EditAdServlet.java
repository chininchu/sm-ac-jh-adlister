package com.codeup.adlister.controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "EditAdServlet", urlPatterns = "/editAd")

public class EditAdServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Servlet logic for handling GET requests
//        request.getRequestDispatcher("");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Servlet logic for handling POST requests
        String name = request.getParameter("name");
        response.getWriter().println("Hello, " + name + "!");
    }


}

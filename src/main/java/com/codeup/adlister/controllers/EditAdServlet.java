package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.Ads;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.ListAdsDao;
import com.codeup.adlister.dao.MySQLAdsDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "EditAdServlet", urlPatterns = "/editAd")

public class EditAdServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Servlet logic for handling GET requests
        request.getRequestDispatcher("/WEB-INF/editAds.jsp").forward(request, response);











    }

//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        // Servlet logic for handling POST requests
//        String name = request.getParameter("name");
//        response.getWriter().println("Hello, " + name + "!");
//    }
//
//

}
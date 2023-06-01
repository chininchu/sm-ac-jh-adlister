package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.Ads;
import com.codeup.adlister.dao.DaoFactory;

import com.codeup.adlister.dao.MySQLAdsDao;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "EditAdServlet", urlPatterns = "/editAd")

public class EditAdServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Servlet logic intakes the Ad Id when the user clicks the edit button on the index.jsp page

        Ad singleAd = DaoFactory.getAdsDao().singleAd(Long.parseLong(request.getParameter("id")));

        request.setAttribute("singleAd", singleAd);

        request.getRequestDispatcher("/WEB-INF/editAds.jsp").forward(request, response);


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // User a getParameter method to store values that the user has modified


        User user = (User) request.getSession().getAttribute("user");

        Long adId = Long.parseLong(request.getParameter("id"));

        Long userId = user.getId();


        String title = request.getParameter("title");

        String description = request.getParameter("description");

        // Parameters are stored in an Ad Object

        Ad modifiedAd = new Ad(adId, userId, title, description);

        // Utilized DaoFactory so that we can use the Insert method to add the new values

        DaoFactory.getAdsDao().editAd(modifiedAd);

        // User is redirected back to the Index Servlet

        response.sendRedirect("/ads");


    }


}
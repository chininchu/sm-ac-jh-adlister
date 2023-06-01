package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.Ads;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.ListAdsDao;
import com.codeup.adlister.dao.MySQLAdsDao;
import com.codeup.adlister.models.Ad;

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


//        String adTitle = request.getParameter("title");
//
//
//        System.out.println(adTitle);
//        String adDescription = request.getParameter("description");
//        System.out.println(adDescription);









    }

//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        // Servlet logic for handling POST requests
//        String name = request.getParameter("name");
//        response.getWriter().println("Hello, " + name + "!");
//    }
//
//

}
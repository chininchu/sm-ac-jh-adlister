package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteAdServlet", urlPatterns = "/deleteAd")
public class DeleteAdServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

                // Ad ad =
                // DaoFactory.getAdsDao().adsByUserId(req.getSession().getAttribute("user"))
                //
                // req.setAttribute("Ad", ad);

                // We will set the Sessions attribute so that we can gain access to the userId

                // User user = (User) req.getSession().getAttribute("user");

                // Ad delAd = DaoFactory.getAdsDao().singleAd();

                // req.setAttribute();

                // We will then use the getParameter method to grab all the other fields for the
                // Ads Object

                // long userId = user.getId();
                //
                // long adId = Long.parseLong(req.getParameter("id"));
                //
                // String title = req.getParameter("title");
                //
                // String description = req.getParameter("description");
                //
                // // Use a method from a Dao Factory to call a method that will delete an
                // instance of the add
                //
                // Ad ad = new Ad(userId, adId, title, description);
                //
                // DaoFactory.getAdsDao().deleteAd(ad);
                System.out.println("delete servlet do get");
                //
                //
                //
                //
                req.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(req, resp);

        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

                // We will set the Sessions attribute so that we can gain access to the userId

                User user = (User) req.getSession().getAttribute("user");

                // Ad delAd = DaoFactory.getAdsDao().singleAd();

                // req.setAttribute();

                // We will then use the getParameter method to grab all the other fields for the
                // Ads Object

                long userId = user.getId();

                long adId = Long.parseLong(req.getParameter("id"));

                String title = req.getParameter("title");

                String description = req.getParameter("description");

                // Use a method from a Dao Factory to call a method that will delete an instance
                // of the add. The order of the parameter matters.

                Ad ad = new Ad(adId, userId, title, description);

                DaoFactory.getAdsDao().deleteAd(ad);
                System.out.println("delete servlet do post");

                resp.sendRedirect("/ads");

        }
}

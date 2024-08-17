package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.Ad_Category;
import com.codeup.adlister.models.Category;
import com.codeup.adlister.models.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
            // add a return statement to exit out of the entire method.
            return;
        }

        request.getRequestDispatcher("/WEB-INF/ads/create.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User loggedInUser = (User) request.getSession().getAttribute("user");
        String title = request.getParameter("title");
        String description = request.getParameter("description");

        if (title.isEmpty()) {
            String createAddWithoutTitle = "No title";
            request.getSession().setAttribute("createAddWithoutTitle", createAddWithoutTitle);
            response.getWriter().print("<script>alert('No title inputted'); window.location.href='/ads';</script>");
            response.sendRedirect("/ads/create");

            return;
        }

        Ad ad = new Ad(loggedInUser.getId(), title, description);

        String[] category = request.getParameterValues("Category");
        // sets the ad id to a long
        Long num = DaoFactory.getAdsDao().insert(ad);

        // used to iterate the through the categories in the array
        for (String x : category) {
            Ad_Category adCategory = new Ad_Category(
                    num,
                    DaoFactory.getCategoriesDao().getCategoryId(x));

            // inserts each new row of ad category
            DaoFactory.getAd_CategoriesDao().insert(adCategory);
        }
        response.sendRedirect("/ads");
    }

}

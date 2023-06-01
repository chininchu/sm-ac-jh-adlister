package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.Ad_Category;
import com.codeup.adlister.models.Category;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
            // add a return statement to exit out of the entire method.
            return;
        }

        request.getRequestDispatcher("/WEB-INF/ads/create.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User loggedInUser = (User) request.getSession().getAttribute("user");
        Ad ad = new Ad(
            loggedInUser.getId(),
            request.getParameter("title"),
            request.getParameter("description")
        );
        String[] category = request.getParameterValues("Category");
        System.out.println(Arrays.toString(category));
        //sets the ad id to a long
        Long num = DaoFactory.getAdsDao().insert(ad);

        //used to iterate the through the categories in the array
        for (String x : category){
        Ad_Category adCategory = new Ad_Category(
                num,
                DaoFactory.getCategoriesDao().getCategoryId(x)
        );

        //inserts each new row of ad category
        DaoFactory.getAd_CategoriesDao().insert(adCategory);
        }
        response.sendRedirect("/ads");
    }

}

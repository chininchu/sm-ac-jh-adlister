package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.Ad_Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "controllers.AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("ads", DaoFactory.getAdsDao().all());
//
//        Map<Long, List<Ad_Category>> adCategoryMap = new HashMap<>();
//        List<Ad> ads = DaoFactory.getAdsDao().all();
//        for (Ad ad : ads){
//            List<Ad_Category> adCategories = DaoFactory.getAd_CategoriesDao().getByAdId(ad.getId());
//            adCategoryMap.put(ad.getId(), adCategories);
//        }
//        System.out.println(adCategoryMap);
//        request.setAttribute("ad_categories", adCategoryMap);
        request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);


    }


}

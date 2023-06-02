package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.sql.SQLException;
import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
    List<Ad> adsByUserId(long userId);

    void deleteAd(Ad ad);


    // Retrieves a single Ad for a user so that they know what is being edited on the jsp page

    Ad singleAd(long id);


    // Edits a single Ad

    void editAd(Ad ad);







}

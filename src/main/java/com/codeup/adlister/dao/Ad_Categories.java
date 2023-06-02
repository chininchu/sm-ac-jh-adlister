package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad_Category;

import java.util.List;

public interface Ad_Categories {
    List<Ad_Category> all();
    void insert(Ad_Category adCategory);

    String getByAdId(long id);
}

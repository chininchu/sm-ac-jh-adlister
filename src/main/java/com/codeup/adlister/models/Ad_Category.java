package com.codeup.adlister.models;

public class Ad_Category {
    private long Ad_Id;
    private int Category_Id;

    public Ad_Category(){
    }

    public Ad_Category(long ad_Id, int category_Id) {
        Ad_Id = ad_Id;
        Category_Id = category_Id;
    }

    public long getAd_Id() {
        return Ad_Id;
    }

    public void setAd_Id(int ad_Id) {
        Ad_Id = ad_Id;
    }

    public int getCategory_Id() {
        return Category_Id;
    }

    public void setCategory_Id(int category_Id) {
        Category_Id = category_Id;
    }
}

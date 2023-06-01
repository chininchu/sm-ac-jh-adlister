package com.codeup.adlister.dao;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;
    private static Ad_Categories ad_CategoriesDao;
    private static Categories categoriesDao;
    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }
    public static Ad_Categories getAd_CategoriesDao(){
        if (ad_CategoriesDao == null){
            ad_CategoriesDao = new MySQLAd_CategoriesDao(config);
        }
        return ad_CategoriesDao;
    }
    public static Categories getCategoriesDao(){
        if (categoriesDao == null){
            categoriesDao = new MySQLCatgoriesDao(config);
        }
        return categoriesDao;
    }
}

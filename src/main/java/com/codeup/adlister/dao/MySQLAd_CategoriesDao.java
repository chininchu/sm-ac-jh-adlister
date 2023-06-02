package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad_Category;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAd_CategoriesDao implements Ad_Categories {
    private Connection connection = null;

    public MySQLAd_CategoriesDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getURL(),
                    config.getUSER(),
                    config.getPASSWORD()
            );
        } catch (SQLException e){
            throw new RuntimeException("Failed to connect to the database", e);
        }
    }
    @Override
    public List<Ad_Category> all() {
        PreparedStatement stmt = null;
        try{
        stmt = connection.prepareStatement("SELECT * FROM categories");
        ResultSet rs = stmt.executeQuery();
            return createCategoriesFromResults(rs);
        } catch (SQLException e){
            throw new RuntimeException("Failed to query categories");
        }

    }

    @Override
    public void insert(Ad_Category adCategory) {
        try{
            String insertQuery = "INSERT INTO ad_categories(ad_id, category_id) VALUES(?, ?)";
            PreparedStatement stmt = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            stmt.setLong(1, adCategory.getAd_Id());
            stmt.setInt(2, adCategory.getCategory_Id());
            stmt.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException("Failed to add new add category", e);
        }
    }

    @Override
    public List<Ad_Category> getByAdId(long id) {
        PreparedStatement stmt = null;
        try{
            String query = "SELECT ad_id FROM ad_categories WHERE ad_id LIKE ?";
            String searchWithWildcards = "%" + id + "%";
            stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, searchWithWildcards);

            ResultSet rs = stmt.executeQuery();
            List<Ad_Category> adCategories = new ArrayList<>();
            while (rs.next()){
                adCategories.add(new Ad_Category(
                    id,
                    rs.getInt("category_id")
                ));
            }
            return adCategories;
        } catch (SQLException e){
            throw new RuntimeException("Failed to receive and");
        }
    }


    private Ad_Category extractCategory(ResultSet rs) throws SQLException {
        return new Ad_Category(
                rs.getInt("ad_id"),
                rs.getInt("category_id")
        );
    }

    private List<Ad_Category> createCategoriesFromResults(ResultSet rs) throws SQLException {
        List<Ad_Category> categories = new ArrayList<>();
        while (rs.next()){
            categories.add(extractCategory(rs));
        }
        return categories;
    }

}

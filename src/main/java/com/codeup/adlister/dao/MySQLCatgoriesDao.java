package com.codeup.adlister.dao;

import com.codeup.adlister.models.Category;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLCatgoriesDao implements Categories{
    private Connection connection = null;

    public MySQLCatgoriesDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getURL(),
                    config.getUSER(),
                    config.getPASSWORD()
            );
        } catch (SQLException e){
            throw new RuntimeException("Error connecting to the database");
        }
    }
    @Override
    public List<Category> all() {
            PreparedStatement stmt = null;
        try {
        stmt = connection.prepareStatement("SELECT * FROM categories");
        ResultSet rs = stmt.executeQuery();
        return createAdsFromResults(rs);
        } catch (SQLException e){
            throw new RuntimeException("Failed to retrieve catgories", e);
        }
    }

    @Override
    public int getCategoryId(String x) {
        PreparedStatement statement = null;
        try{
            String sql = "SELECT id FROM categories WHERE category_name LIKE ?";
            String searchWithWildcards = "%" + x + "%";
            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, searchWithWildcards);

            ResultSet rs = statement.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e ){
            throw new RuntimeException("Failed to get the category id", e);
        }
    }

    @Override
    public String getCategoryName(int x) {
        PreparedStatement stmt = null;
        try{
            String sql = "SELECT category_name FROM categories WHERE id = ?";
            stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, x);
            ResultSet rs = stmt.executeQuery();

            rs.next();
            return rs.getString("category_name");
        } catch (SQLException e){
            throw new RuntimeException("Failed to get the name", e);
        }
    }


    private Category extractCategory(ResultSet rs) throws SQLException{
        return new Category(
                rs.getLong("id"),
                rs.getString("category_name")
        );
    }

    private List<Category> createAdsFromResults(ResultSet rs) throws SQLException{
        List<Category> categories = new ArrayList<>();
        while (rs.next()){
            categories.add(extractCategory(rs));
        }
        return categories;
    }
}

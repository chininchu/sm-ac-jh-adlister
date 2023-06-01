package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getURL(),
                    config.getUSER(),
                    config.getPASSWORD()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public List<Ad> all() {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM ads");
            ResultSet rs = stmt.executeQuery();
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            String insertQuery = "INSERT INTO ads(user_id, title, description) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            stmt.setLong(1, ad.getUserId());
            stmt.setString(2, ad.getTitle());
            stmt.setString(3, ad.getDescription());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }


    // This method will retrieve a single Ad so that the user is able to view what they are editing


    public Ad singleAd(long id) {


        try {

            // Create and execute the SQL query
            PreparedStatement stmt = null;
            stmt = connection.prepareStatement("SELECT * FROM ads  WHERE id = ? LIMIT 1");
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            // Retrieve the data from the row

            rs.next();

            Ad singleAd = extractAd(rs);


            // Returns a single instance

            return singleAd;


        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving an ad.", e);
        }


    }


    @Override
    public void editAd(Ad ad) {


        try {

            // Create and execute the SQL query
            PreparedStatement stmt = null;
            stmt = connection.prepareStatement("UPDATE ads SET title = ?, description = ? WHERE id = ? LIMIT 1");
            stmt.setString(1, ad.getTitle());
            stmt.setString(2, ad.getDescription());
            stmt.setLong(3, ad.getId());


            stmt.executeUpdate();


        } catch (Exception e) {
            throw new RuntimeException("Error retrieving an ad.", e);
        }


    }


}





package com.codeup.adlister.dao;

import com.codeup.adlister.config.Config;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {
    private Connection connection;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getURL(),
                    config.getUSER(),
                    config.getPASSWORD());
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        String query = "SELECT * FROM users WHERE username = ? LIMIT 1";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, username);
            return extractUser(stmt.executeQuery());
        } catch (SQLException e) {
            throw new RuntimeException("Error finding a user by username", e);
        }
    }

    @Override
    public void update(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE users SET username = ?, password = ?, email = ? WHERE id = ?");
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.setLong(4, user.getId());

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error updating new user", e);
        }

    }

    @Override
    public Long insert(User user) {
        String query = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating new user", e);
        }
    }

    public void deleteAds(long adId) throws SQLException {
        try {
            String deleteQuery = "DELETE FROM ads WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(deleteQuery, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, String.valueOf(adId));
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting ad.", e);
        }
    }

    public void delete(long userId) {
        try {
            String deleteQuery = "DELETE FROM users WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(deleteQuery);
            stmt.setLong(1, userId);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting user.", e);
        }
    }

    @Override
    public void edit(User user) {

    }

    private User extractUser(ResultSet rs) throws SQLException {
        if (!rs.next()) {
            return null;
        }
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password"));
    }

}

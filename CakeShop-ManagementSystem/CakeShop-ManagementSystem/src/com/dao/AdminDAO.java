package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.DBConnection.DatabaseConnection;

public class AdminDAO {
    public boolean authenticate(String username, String password) {
        String query = "SELECT * FROM admin WHERE username = ? AND password = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("SQL Exception occurred while authenticating admin: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected exception occurred while authenticating admin: " + e.getMessage());
        }
        return false;
    }
}

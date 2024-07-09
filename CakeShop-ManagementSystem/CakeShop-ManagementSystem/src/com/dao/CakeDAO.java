package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.CakeShopManagement.Cake;
import com.DBConnection.DatabaseConnection;

public class CakeDAO {
    public void addCake(Cake cake) {
        String query = "INSERT INTO cakes (name, price, quantity) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, cake.getName());
            pstmt.setDouble(2, cake.getPrice());
            pstmt.setInt(3, cake.getQuantity());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public List<Cake> getAllCakes() {
//        List<Cake> cakes = new ArrayList<>();
//        String query = "SELECT * FROM cakes";
//        try (Connection conn = DatabaseConnection.getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(query)) {
//            while (rs.next()) {
//                cakes.add(new Cake(rs.getInt("ID"), rs.getString("name"), rs.getDouble("price"), rs.getInt("Quantity")));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return cakes;
//    }
    
    public List<Cake> getAllCakes() {
        List<Cake> cakes = new ArrayList<>();
        String query = "SELECT * FROM cakes";
        
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                // Assuming the column names are 'ID', 'name', 'price', and 'Quantity'
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("Quantity");
                
                cakes.add(new Cake(id, name, price, quantity));
            }
            
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
        
        return cakes;
    }

    public void updateCake(Cake cake) {
        String query = "UPDATE cakes SET name = ?, price = ?, quantity = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, cake.getName());
            pstmt.setDouble(2, cake.getPrice());
            pstmt.setInt(3, cake.getQuantity());
            pstmt.setInt(4, cake.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCake(int id) {
        String query = "DELETE FROM cakes WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


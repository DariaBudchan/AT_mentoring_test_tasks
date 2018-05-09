package com.epam.app.Chief.DAO;

import java.sql.*;

/**
 * Author: Daria Budchan, May, 2018
 */

public class DBStream {
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:src/main/resources/sample.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void write(String data){
        String sql = "INSERT INTO datastream (data) VALUES (?)";
        try  (Connection conn = this.connect();
              PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, data);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void read() {
        String sql = "SELECT data FROM datastream ORDER BY id LIMIT 1";
        try  (Connection conn = this.connect();
              Statement stmt  = conn.createStatement();
              ResultSet rs    = stmt.executeQuery(sql)){
            while (rs.next()) {
                System.out.println(rs.getString("data"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

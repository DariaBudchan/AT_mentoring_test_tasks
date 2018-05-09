package com.epam.app.Chief.DAO;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

/**
 * Author: Daria Budchan, May, 2018
 */

public class CreateDB {
    private static String driverName = "org.sqlite.JDBC";
    private static String connectionString = "jdbc:sqlite:src/main/resources/sample.db";

    public void run() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            System.out.println("Can't get class. No driver found");
            e.printStackTrace();
            return;
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString);
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            statement.executeUpdate("create table if not exists `datastream` " +
                    "(`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , " +
                    "`data` text)");
        } catch (SQLException e) {
            System.out.println("Can't get connection. Incorrect URL");
            e.printStackTrace();
            return;
        }
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Can't close connection");
            e.printStackTrace();
            return;
        }
    }
    public static void main(String[] args) {
        CreateDB app = new CreateDB();
        app.run();
    }
}
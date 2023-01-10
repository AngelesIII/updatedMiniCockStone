package main.database;

import java.sql.Connection;
import java.sql.DriverManager;


public class config {

    private Connection conn;
    public Connection getConnection() { 

        try {
            
            String driver = "com.mysql.cj.jdbc.Driver";
            String dbURL = "jdbc:mysql://127.0.0.1:3306/ae-test";
            String user = "test-devs";
            String password = "1)BhC2s4wUbo]X.5";

            Class.forName(driver);
            conn = DriverManager.getConnection(dbURL, user, password);

            // System.out.println("connected");

            return conn;

        } catch (Exception e) {
        }

        return null;
    }

    
}

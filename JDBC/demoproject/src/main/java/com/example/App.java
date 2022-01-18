package com.example;

// 1 Step import the package
// 2 Step Open the connection
// 3 Step Execute the Query
// 4 Step Process the results
// 5 Step (Data Process)
// 6 Step close the connection

import java.sql.*;

public class App {
    private static String db_url = "jdbc:mysql://localhost/test";
    private static String user = "root";
    private static String pass = "12345";

    private static String query = "select * from testdb";
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(db_url, user, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()) {
            System.out.println("ID : " + rs.getInt("id"));
            System.out.println("Name : " + rs.getString("name"));
        }

        con.close();
    }
}

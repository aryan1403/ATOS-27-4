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

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(db_url, user, pass);
        /*
         * PreparedStatement ps =
         * con.prepareStatement("insert into testdb values (?, ?, ?)");
         * ps.setInt(1, 12);
         * ps.setString(2, "aryanmeow");
         * ps.setInt(3, 15);
         * 
         * ps.executeUpdate();
         */

        ResultSet rs = con.createStatement()
                .executeQuery("select * from testdb full join participants on testdb.name=participants.name");

        while (rs.next()) {
            System.out.println(rs.getString("name"));
        } 

        con.close();
    }
}

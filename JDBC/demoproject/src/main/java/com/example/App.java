package com.example;

// 1 Step import the package
// 2 Step Open the connection
// 3 Step Execute the Query
// 4 Step Process the results
// 5 Step (Data Process)
// 6 Step close the connection

/* private static String db_url = "jdbc:mysql://localhost/test";
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
     

    ResultSet rs = con.createStatement()
            .executeQuery("select * from testdb full join participants on testdb.name=participants.name");

    while (rs.next()) {
        System.out.println(rs.getString("name"));
    } 

    con.close();
} */
// import java.sql.*;

public class App {
    public static int add(int a, int b) {
        return (a+b);
    }
    // Result should be positive
    // if negative mul with -1; 1)
    public static int sub(int a, int b) {
        int result = a - b;
        if(result < 0) {
            return (result * -1);
        }
        return result;
    }
    public static int mul(int a, int b) {
        return (a * b);
    }
    public static Object divide(int a, int b) {
        if(b == 0) {
            return null;
        } else {
            return (a / b);
        }
    }
    public static void main(String[] args) {
        Test.TestCase1();
        Test.TestCase2();
        Test.TestCase3();
        Test.TestCase4();
    }
}

class Test {
    public static void TestCase1() {
        if(App.add(3, 5) == 8) {
            System.out.println("TestCase1 Passed!");
        } else {
            System.out.println("TestCase1 Failed!\n");
        }
    }
    public static void TestCase2() {
        // If result is positive then test case will pass 
        if(App.sub(3, 5) > 0) {
            System.out.println("TestCase2 Passed!");
        } else {
            System.out.println("TestCase2 Failed!\n");
        }
    }
    public static void TestCase3() {
        if(App.mul(3, 5) == 15) {
            System.out.println("TestCase3 Passed!");
        } else {
            System.out.println("TestCase3 Failed!\n");
        }
    }
    public static void TestCase4() {
        if(App.divide(3, 0) == null) {
            System.out.println("TestCase4 Passed!");
        } else {
            System.out.println("TestCase4 Failed!");
        }
    }

}

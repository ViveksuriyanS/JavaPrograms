package com.version.java7;

import java.sql.*;

public class JDBCTryWithResource {
    public static void main(String[] args) {
        try (// --------------try-with-resources begin-------------//
             // Creating connection
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
             // Creating statement
             Statement st = con.createStatement();
             // Executing Sql query
             ResultSet rst = st.executeQuery("select * from employee");

        ) {
            while (rst.next()) {
                System.out.println(rst.getInt(1) + "\t" + rst.getString(2) + "\t" + rst.getString(3) + "\t" + rst.getInt(4));
            }
        } catch (
                SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}

// By having Connection, ResultSet and Statement in Try()
// We don't have to close it in finally
// Once try block is done executed, jvm will close resources that are in try() automatically
package com.version.java7;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class JDBC_CachedRowSet {
    public static void main(String[] args) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from employee");

        ) {
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.populate(rs);
            while (crs.next()) {
                System.out.println(crs.getInt(1) + "\t" + crs.getString(2) + "\t" + crs.getString(3) + "\t" + crs.getInt(4));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

// CachedRowSet stores data in memory and can perform operations on its own, without connecting to DB

// It is also called as DisconnectedRowSet
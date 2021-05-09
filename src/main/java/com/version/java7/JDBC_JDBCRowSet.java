package com.version.java7;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class JDBC_JDBCRowSet {
    public static void main(String[] args) {
        try (
                JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();
        ) {
            jrs.setUrl("jdbc:mysql://localhost:3306/Employee");
            jrs.setUsername("root");
            jrs.setPassword("");
            jrs.setCommand("select * from employee");
            jrs.execute();

            while (jrs.next()) {
                //System.out.println(jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getString(3) + "\t" + jrs.getInt(4));
            }

            jrs.absolute(3); // selects particular row
            // Printing 3rd row before update
            System.out.println(jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getString(3) + "\t" + jrs.getInt(4));
            jrs.updateString(3, "Vivek Suriyan");

            jrs.updateRow(); // Commit
            // Printing 3rd row after update
            System.out.println(jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getString(3) + "\t" + jrs.getInt(4));



        } catch (Exception throwable) {
            throwable.printStackTrace();
        }
    }
}

// CachedRowSet stores data in memory and can perform operations on its own, without connecting to DB

// It is also called as DisconnectedRowSet
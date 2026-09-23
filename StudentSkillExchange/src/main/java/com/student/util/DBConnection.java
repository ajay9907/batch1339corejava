package com.student.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            con = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/student_skill_exchange",
                    "root",
                    "root"
            );

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }

        return con;
    }
}
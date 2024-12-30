package com.yzj.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/qimodb";
        String username = "root";
        String password = "MySQL@DXXY";

        Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
    }
}

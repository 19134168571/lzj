package com.yzj.test;

import java.sql.*;

public class SelectTest {
    public static void main(String[] args) throws ClassNotFoundException {
//        异常处理语法
        ResultSet resultSet = null;
        Statement statement = null;
        Connection conn = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/qimodb";
            conn = DriverManager.getConnection(url, "root", "MySQL@DXXY");
            System.out.println(conn);

            String sql = "select * from students";
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String xingbie = resultSet.getString("xingbie");

                Date ruxue = resultSet.getDate("ruxue");
                System.out.println(id + " " + name + " " + xingbie + " " + ruxue);
            }
        } catch (Exception e) {
            System.out.println("出异常啦");
        } finally {


            try {
                if (resultSet != null) resultSet.close();

            } catch (SQLException e) {
                System.out.println("关闭失败");
            }

            try {
                if (resultSet != null) statement.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                if (resultSet != null) conn.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
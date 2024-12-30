package com.yzj.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/qimodb";
            String username = "root";
            String password = "MySQL@DXXY";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println(conn);
            String sql = "update students set name=?,xingbie=? where id=?";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "小红");
            preparedStatement.setString(2, "女");
            preparedStatement.setInt(3, 9);
            preparedStatement.executeUpdate();
            int i = preparedStatement.executeUpdate();
            if (i > 0) System.out.println("修改成功");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null)
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();


                }
            if (preparedStatement != null)
                try {
                    preparedStatement.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

    }
}

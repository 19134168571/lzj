package com.yzj.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteTest {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/qimodb";
            String username = "root";
            String password = "MySQL@DXXY";
            conn = DriverManager.getConnection(url, username, password);
            String sql = "delete from students where id = ?";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, 8);
            int i = preparedStatement.executeUpdate();
            if (i > 0) System.out.println("删除成功");


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (conn!=null)
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            if (preparedStatement!=null)
                try {
                    preparedStatement.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }
}

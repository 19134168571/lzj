package com.yzj.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/qimodb?useUnicode=true&characterEncoding=UTF-8";
        Connection conn = DriverManager.getConnection(url,"root","MySQL@DXXY");
        System.out.println(conn);
        String sql="insert into students(name,xingbie,ruxue) value(?,?,?)";
        java.sql.PreparedStatement ps=conn.prepareStatement(sql);
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,"小爽");
        preparedStatement.setString(2,"男");
        preparedStatement.setString(3,"2005-09-09");
        int i = preparedStatement.executeUpdate();
        if (i>0){
            System.out.println("添加成功");
        }

    }
}

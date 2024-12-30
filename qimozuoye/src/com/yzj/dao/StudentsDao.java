package com.yzj.dao;

import com.yzj.domain.Students;
import com.yzj.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentsDao {
    public ArrayList<Students> getAllStudents() {

        try {
            Connection connection = DBUtils.getConnection();
            String sql = "select * from students";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Students> Students = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String xingbie = resultSet.getString("xingbie");
                String ruxue = resultSet.getString("ruxue");
                 Students students = new Students();
                students.setId(id);
                students.setName(name);
                students.setXingbie(xingbie);
                students.setRuxue(ruxue);
                System.out.println(students);
                Students.add(students);

            }
      return Students;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }





    //byid
    public Students getStudentsById(int id) {
        try{
            Connection connection = DBUtils.getConnection();
            String sql = "select * from students where id=?";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Students students = new Students();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String xingbie = resultSet.getString("xingbie");
                String ruxue = resultSet.getString("ruxue");
                students.setId(id);
                students.setName(name);
                students.setRuxue(ruxue);
                return students;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }








    //delete
    public boolean deleteStudents(int id) {
        try {
            Connection connection = DBUtils.getConnection();
            String sql = "delete from students where id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }









    //edit
    public boolean editStudents(Students students) {
        try {
            Connection connection = DBUtils.getConnection();
            String sql = "update students set name=?,xingbie=?,ruxue=? where id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, students.getName());
            preparedStatement.setString(2, students.getXingbie());
            preparedStatement.setString(3, students.getRuxue());
            preparedStatement.setInt(4, students.getId());
            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }











    //add方法
    public boolean addStudent(Students students) {
        try {
            Connection connection = DBUtils.getConnection();
            String sql = "insert into students(name,xingbie,ruxue) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, students.getName());
            preparedStatement.setString(2, students.getXingbie());
            preparedStatement.setString(3, students.getRuxue());
            int i = preparedStatement.executeUpdate();
            if (i > 0) return true;
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean addStudents(Students students) {
        return false;
    }
}

package com.yzj.test;

import com.yzj.dao.StudentsDao;
import com.yzj.domain.Students;
import com.yzj.utils.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JDBCTest {
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        StudentsDao userStudentsDao = new StudentsDao();
//        Students students = new Students();
//        students.setId(5);
//        students.setName("王二");
//        students.setXingbie("男");
//        students.setRuxue("2019-10-01");
//        Boolean res = userStudentsDao.add(students);
//        System.out.println(res);
//    }
//
//}
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = DBUtils.getConnection();
        StudentsDao userStudentsDao = new StudentsDao();
        List<Students> students = userStudentsDao.getAllStudents();


    }
}










    //byid
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Connection connection = DBUtils.getConnection();
//        StudentsDao userStudentsDao = new StudentsDao();
//        Students students = userStudentsDao.getStudentsById(1);
//        System.out.println(students);
//
//        System.out.println("Id；"+ students.getId() + ", Name: " + students.getName() + ", xingbie: "+ students.getXingbie() + ", ruxue: "+ students.getRuxue());
//    }
//}












        //delete
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//
//    Connection connection = DBUtils.getConnection();
//    StudentsDao studentsDao = new StudentsDao();
//    boolean res = studentsDao.deleteStudents(5);
//    System.out.println(res);
//}
//}









        //edit
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        StudentsDao studentsDao = new StudentsDao();
//        Students students = new Students();
//        students.setId(5);
//        students.setName("王二");
//        students.setXingbie("男");
//        students.setRuxue("2019-10-01");
//        Boolean res = studentsDao.editStudents(students);
//        System.out.println(res);
//    }
//}



//   public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        StudentsDao studentsDao = new StudentsDao();
//        Students students = new Students();
//        students.setId(5);
//        students.setName("李四");
//        students.setXingbie("男");
//        students.setRuxue("2018-09-01");
//        boolean res = studentsDao.add(students);
//        System.out.println(res);
//
//
//    }
//}

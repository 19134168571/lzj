package com.yzj.servlet;

import com.yzj.dao.StudentsDao;
import com.yzj.domain.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/students")
public class GetAllStudentsServlet extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentsDao studentsDao = new StudentsDao();
        ArrayList<Students> students = studentsDao.getAllStudents();
        System.out.println(students.size());
        req.setAttribute("students",students);
        req.getRequestDispatcher("studentslist.jsp").forward(req,resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

package com.yzj.servlet;

import com.yzj.dao.StudentsDao;
import com.yzj.domain.Students;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addstudents")
public class AddstudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String name = req.getParameter("name");
        String xingbie = req.getParameter("xingbie");
        String ruxue = req.getParameter("ruxue");
        try {
            Students students = new Students();
            students.setName(name);
            students.setXingbie(xingbie);
            students.setRuxue(ruxue);

            System.out.println(students);

            StudentsDao studentsDao = new StudentsDao();
            boolean result = studentsDao.addStudents(students);

            if (result) {
                req.getRequestDispatcher("qimozuoye/studentslist");

            } else {
                resp.sendRedirect("/qimozuoye/addstudents.jsp");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        @Override
        protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            this.doGet(req, resp);
        }
    }



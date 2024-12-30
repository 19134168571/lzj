package com.yzj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 这里只是一个示例，实际应用中需要从数据库中验证用户信息
        if ("yzj666".equals(username) && "123456".equals(password)) {
            resp.sendRedirect("login.jsp");
        } else {
            resp.sendRedirect("login.jsp?error=1");
        }
    }
}

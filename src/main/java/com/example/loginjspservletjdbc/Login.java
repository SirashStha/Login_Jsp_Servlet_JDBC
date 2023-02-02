package com.example.loginjspservletjdbc;

import com.example.loginjspservletjdbc.dao.LoginDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {

    LoginDao dao = new LoginDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        PrintWriter out = response.getWriter();
        try {
            if(dao.check(uname,pass))
            {
                HttpSession session = request.getSession();
                session.setAttribute("uname",uname);
                response.sendRedirect("welcome.jsp");
            }
            else
            {
                response.sendRedirect("index.jsp");
            }
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

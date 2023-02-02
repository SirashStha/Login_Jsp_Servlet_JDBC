package com.example.loginjspservletjdbc;

import com.example.loginjspservletjdbc.dao.InsertDao;
import com.example.loginjspservletjdbc.model.InsertData;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Insert", value = "/Insert")
public class Insert extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String usrname = request.getParameter("usrname");
        String pswrd = request.getParameter("pswrd");

        InsertDao idao = new InsertDao();
        InsertData i = new InsertData();

        if(usrname == "" || pswrd =="")
        {
            response.sendRedirect("Error.jsp");
        }
        else {
            try {
                i = idao.insertData(usrname,pswrd);
            }
            catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            catch (SQLException e) {
                throw new RuntimeException(e);
            }

            RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
            rd.forward(request,response);
        }

    }
}

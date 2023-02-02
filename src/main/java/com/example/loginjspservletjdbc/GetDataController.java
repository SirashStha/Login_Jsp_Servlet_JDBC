package com.example.loginjspservletjdbc;

import com.example.loginjspservletjdbc.dao.GetDataDao;
import com.example.loginjspservletjdbc.model.GetData;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "getData", value = "/getData")
public class GetDataController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        GetDataDao gdd = new GetDataDao();
        GetData gd = null;
        try {
            gd = gdd.fetchData(id);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        request.setAttribute("data",gd);

        RequestDispatcher rd = request.getRequestDispatcher("showdata.jsp");
        rd.forward(request,response);

    }
}

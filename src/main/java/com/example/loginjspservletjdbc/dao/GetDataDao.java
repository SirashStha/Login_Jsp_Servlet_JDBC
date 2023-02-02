package com.example.loginjspservletjdbc.dao;

import com.example.loginjspservletjdbc.model.GetData;

import java.sql.*;

public class GetDataDao {
    public GetData fetchData(int id) throws ClassNotFoundException, SQLException {
        GetData gd = new GetData();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","admin");
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from employees where id="+id);
        if (rs.next())
        {
            gd.setId(rs.getInt("id"));
            gd.setFname(rs.getString("first_name"));
            gd.setLname(rs.getString("last_name"));
            gd.setDepart(rs.getString("department"));
            gd.setEmail(rs.getString("email"));
            gd.setSalary(rs.getDouble("salary"));
        }

        return gd;
    }
}

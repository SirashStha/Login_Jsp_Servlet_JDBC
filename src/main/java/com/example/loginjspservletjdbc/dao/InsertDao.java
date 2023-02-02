package com.example.loginjspservletjdbc.dao;

import com.example.loginjspservletjdbc.model.InsertData;

import java.sql.*;

public class InsertDao {
    public InsertData insertData(String usrname, String pswrd) throws ClassNotFoundException, SQLException {
        InsertData i = new InsertData();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","admin");
        Statement st = con.createStatement();
        st.execute("insert  into login values ('"+usrname+"','"+pswrd+"');");




        return i;
    }
}

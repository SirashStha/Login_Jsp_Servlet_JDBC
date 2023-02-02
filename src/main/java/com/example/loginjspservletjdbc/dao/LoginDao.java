package com.example.loginjspservletjdbc.dao;

import java.sql.*;

public class LoginDao {
    String sql = "select * from login where uname=? and pass=?";
    String url = "jdbc:mysql://localhost:3306/demo";
    String username = "root";
    String password = "admin";
    public boolean check(String uname, String pass) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1,uname);
        st.setString(2,pass);
        ResultSet rs = st.executeQuery();
        return rs.next();
    }
}

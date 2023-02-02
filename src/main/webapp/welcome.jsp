<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

        <%
            response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //HTTP 1.1

            response.setHeader("Pragma", "no-cache"); //HTTP 1.0

            response.setHeader("Expires", "0"); //Proxy Server

            response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");

            if(session.getAttribute("uname") == null)
            {
                response.sendRedirect("index.jsp");
            }

        %>

        Welcome ${uname}
        <br/><br/>
        Enter ID number to view data from Table Employees
        <form action="getData" >
            ID: <input type="text" name="id">
            <input type="submit" name="Get">
        </form>

        <a href="aboutus.jsp">About Us</a>
        <a href="videos.jsp">Videos</a>
        <br/><br/>
        <form action="Logout">
            <input type="submit" value="Logout">
        </form>
</body>
</html>

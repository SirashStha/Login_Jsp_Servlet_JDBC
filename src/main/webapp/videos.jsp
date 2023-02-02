<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Videos</title>
</head>
<body>
    <%
        response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //HTTP 1.1

        response.setHeader("Pragma", "no-cache"); //HTTP 1.0

        response.setHeader("Expires", "0"); //Proxy Server

        if(session.getAttribute("uname") == null)
        {
            response.sendRedirect("index.jsp");
        }
    %>
    <iframe width="560" height="315" src="https://www.youtube.com/embed/MSOQqweOg-g" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

</body>
</html>

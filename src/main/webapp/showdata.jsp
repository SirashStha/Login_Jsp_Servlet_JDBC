<%@ page import="com.example.loginjspservletjdbc.model.GetData" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/25/2022
  Time: 10:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Showing Data</title>
</head>
<body>
  <%
      GetData gd1 = (GetData) request.getAttribute("data");
      out.print(gd1);
  %>

</body>
</html>

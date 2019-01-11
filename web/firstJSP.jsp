<%--
  Created by IntelliJ IDEA.
  User: gareevaa
  Date: 02/01/2019
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Банк Брю</title>
</head>
<body>
<h1> Тестируем JSP </h1>
<p>

    <%@ page import= "testPackage.TestPackage2" %>

<% TestPackage2 testPackage2 = new TestPackage2();%>

<%= testPackage2.getInfo()%>
    <% String name = request.getParameter("name");%>
    <%="Hello, " + name%>

</p>
</body>
</html>

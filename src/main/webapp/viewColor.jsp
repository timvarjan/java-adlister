<%--<p>the color is ${param.color}</p>--%>
<%--<div style="background-color: ${param.color}; width: 1500px; height: 1500px;"></div>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Color</title>
</head>
<body style="background-color: <%= request.getParameter("color") %>;">
<h1>The color is: <%= request.getParameter("color") %></h1>
</body>
</html>
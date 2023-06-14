<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <%@ include file="partials/head.jsp" %>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>

<form method="POST" action="login.jsp">
    <div class="container-sm">
        <div class="mb-3">
            <label for="inputUsername" class="form-label">Username</label>
            <input type="text" class="form-control" id="inputUsername" name="inputUsername" value="admin">
        </div>
        <div class="mb-3">
            <label for="inputPassword" class="form-label">Password</label>
            <input type="password" class="form-control" id="inputPassword" name="inputPassword" value="password">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
        <c:if test="${param.inputUsername.equals('admin') && param.inputPassword.equals('password')}">
            <% response.sendRedirect("profile.jsp"); %>
            <%--            <meta http-equiv="refresh" content="0; url='http://localhost:8080/profile.jsp'">--%>
        </c:if>
    </div>
</form>

</body>
</html>

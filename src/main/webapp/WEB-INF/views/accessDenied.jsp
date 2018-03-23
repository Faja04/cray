<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: RFREIER
  Date: 22.03.2018
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>AccessDenied page</title>
</head>
<body>
<div class="generic-container">
    <div class="authbar">
        <span>Dear <strong>${loggedinuser}</strong>, You are not authorized to access this page.</span> <span
            class="floatRight"><a href="<c:url value="/logout" />">Logout</a></span>
    </div>
</div>
</body>
</html>

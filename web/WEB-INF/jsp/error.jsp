<%--
  Created by IntelliJ IDEA.
  User: Barbarossa
  Date: 11.11.2017
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Error!</title>
</head>
<body>
    <c:out value="${requestScope.error}"/>
</body>
</html>

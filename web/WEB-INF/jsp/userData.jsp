<%--
  Created by IntelliJ IDEA.
  User: Barbarossa
  Date: 10.11.2017
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>User data</title>
</head>
<body>
    <c:if test="${requestScope.user!=null}">
    <table border="1">
        <c:forEach items="${requestScope.user}" var="currentUser">
            <tr>
                <td><c:out value="${requestScope.currentUser.name}"/></td>
                <td><c:out value="${requestScope.currentUser.surname}"/></td>
                <td><c:out value="${requestScope.currentUser.phoneNumber}"/></td>
                <td><c:out value="${requestScope.currentUser.eMail}"/></td>
            </tr>
        </c:forEach>

    </table>
    </c:if>
    <p>No such user!</p>
</body>
</html>

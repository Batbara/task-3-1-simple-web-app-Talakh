<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>User data</title>
</head>
<style>
    #button {
        margin-left: 10%;
    }
    #info{
        margin-left: 9%;
    }
</style>
<body>
    <c:choose>
        <c:when test="${requestScope.users eq null}">
            <h5 id="info">No such user!</h5>
        </c:when>
        <c:otherwise>
            <table border="1">
                <tr>
                    <th>Name</th>
                    <th>Surname</th>
                    <th>Phone number</th>
                    <th>E-mail</th>
                </tr>
                <c:forEach items="${requestScope.users}" var="currentUser">
                    <tr>
                        <td><c:out value="${currentUser.name}"/></td>
                        <td><c:out value="${currentUser.surname}"/></td>
                        <td><c:out value="${currentUser.phoneNumber}"/></td>
                        <td><c:out value="${currentUser.eMail}"/></td>
                    </tr>
                </c:forEach>

            </table>
        </c:otherwise>
    </c:choose>
    <form action="../../index.jsp">
        <p id="button"> <input type="submit" value="Go back" /></p>
    </form>
</body>
</html>

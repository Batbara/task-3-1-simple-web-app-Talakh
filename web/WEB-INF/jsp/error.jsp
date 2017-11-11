<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Error!</title>

    </head>
    <style>
        #button {
            margin-left: 1%;
        }
    </style>
    <body>
        <h4>Error occurred!</h4>
        <c:out value="${requestScope.error}"/>
        <form action="../../index.jsp">
            <p id="button"> <input type="submit" value="Go back" /></p>
        </form>
    </body>
</html>

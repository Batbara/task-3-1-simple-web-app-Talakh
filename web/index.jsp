<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
  <head>
    <title>JWD Task 3.2 by Barbara Talakh</title>
  </head>
  <style>
    #button {
      margin-left: 4%;
    }
  </style>
  <body>
  <form action="Controller" method="get">
    <input type="hidden" name="command" value="FIND_USER">
    Name:<br>
    <input type="text" name="name" value=""><br>
    Surname:<br>
    <input type="text" name="surname" value=""><br>
    <p id="button"><input type="submit" value="Send"></p>
  </form>
  </body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/2
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form action="/update" method="post">
    id:<input type="text" name="id" value="${user.id}" readonly />
    name:<input type="text" name="name" value="${user.name}" />
    password:<input type="text" name="password" value="${user.password}" />
    age:<input type="text" name="age" value="${user.age}" />
    <input type="submit" value="submit" />
</form>
</body>
</html>
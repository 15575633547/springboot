<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/2
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>用户列表</h2>
<a href="${pageContext.request.contextPath}/toAdd">添加</a>
<table border="1">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>password</td>
        <td>age</td>
        <td>operate</td>
    </tr>
    <c:forEach items="${users}" var="s" varStatus="st">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.password}</td>
            <td>${s.age}</td>
            <td>
                <a href="${pageContext.request.contextPath}/delete?id=${s.id}">删除</a>
                <a href="${pageContext.request.contextPath}/toUpdate?id=${s.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>

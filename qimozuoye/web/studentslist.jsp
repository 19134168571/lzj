<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title class="center">学生列表</title>
    <link rel="stylesheet" href="https://cdn.staticfile.net/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.net/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.net/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <style>
    .center{
        text-align: center;
    }
</style>

</head>
<body>
<h1 class="center">学生列表</h1>
<a href="/qimozuoye/addstudents.jsp">添加学生</a>
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>性别</th>
        <th>入学</th>

    </tr>
    </thead>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.xingbie}</td>
            <td>${student.ruxue}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>

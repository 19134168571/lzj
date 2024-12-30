<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加学生</title>
    <style>
    table {
        border-collapse: collapse;
        width: 100%;
    }
    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
    }
    th{
    background-color: #f2f2f2;
    }
    </style>
</head>
<body>
    <h1>添加学生</h1>
    <form action="addstudents" method="post">
        <label for="name">姓名:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="xingbie">性别:</label>
        <input type="xingbie" id="xingbie" name="xingbie" required><br><br>

        <label for="ruxue">入学：</label>
        <input type="date" id="ruxue" name="ruxue" required><br><br>

        <button type="submit">添加</button>
    </form>
</body>
</html>
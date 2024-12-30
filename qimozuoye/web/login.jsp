<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
    <style>
        body {
            background-color: #f0f8ff;
            font-family: Arial, sans-serif;
        }
        .login-container {
            width: 300px;
            margin: 100px auto;
            padding: 20px;
            border: 1px solid #007bff;
            border-radius: 5px;
            background-color: #ffffff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }
        h2 {
            text-align: center;
            color: #007bff;
        }
        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #007bff; /* 蓝色边框 */
            border-radius: 5px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff; /* 蓝色按钮 */
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0056b3; /* 深蓝色悬停效果 */
        }
        .options {
            text-align: center;
            margin-top: 10px;
        }
        .options a {
            color: #007bff; /* 蓝色链接 */
            text-decoration: none;
        }
        .options a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>学生成绩管理系统</h2>
        <h2>登录</h2>
        <form action="2.html" method="post">
            <div>
                <label for="username">用户名:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div>
                <label for="password">密码:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div>
                <input type="checkbox" id="rememberMe" name="rememberMe">
                <label for="rememberMe">记住我</label>
            </div>
            <div>
                <input type="submit" value="登录">
            </div>
        </form>
        <div class="options">
            <a href="forgotPassword.jsp">忘记密码?</a> |
            <a href="otherLoginOptions.jsp">其他方式登录</a>
        </div>
    </div>
</body>
</html>
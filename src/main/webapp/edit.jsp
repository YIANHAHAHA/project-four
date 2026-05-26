<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>编辑学生信息</title>
    <style>
        div{margin: 10px 0;}
    </style>
</head>
<body>
    <h2>修改学生信息</h2>
    <form action="edit" method="post">
        <!-- 隐藏域传递ID，不可修改 -->
        <input type="hidden" name="id" value="${stu.id}">
        <div>
            姓名：<input type="text" name="name" value="${stu.name}" required>
        </div>
        <div>
            年龄：<input type="number" name="age" value="${stu.age}" required min="1">
        </div>
        <div>
            专业：<input type="text" name="major" value="${stu.major}" required>
        </div>
        <div>
            <input type="submit" value="确认修改">
            <a href="list">返回列表</a>
        </div>
    </form>
</body>
</html>
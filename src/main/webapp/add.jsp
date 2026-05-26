<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>新增学生</title>
    <style>
        div{margin: 10px 0;}
    </style>
</head>
<body>
    <h2>添加学生信息</h2>
    <form action="add" method="post">
        <div>
            姓名：<input type="text" name="name" required>
        </div>
        <div>
            年龄：<input type="number" name="age" required min="1">
        </div>
        <div>
            专业：<input type="text" name="major" required>
        </div>
        <div>
            <input type="submit" value="提交保存">
            <a href="list">返回列表</a>
        </div>
    </form>
</body>
</html>
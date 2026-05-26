<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生信息列表</title>
    <style>
        table{border-collapse: collapse; margin: 10px 0;}
        th,td{border:1px solid #333; padding: 5px 15px; text-align: center;}
        a{text-decoration: none; margin: 0 5px;}
    </style>
</head>
<body>
    <h2>学生信息管理系统</h2>
    <a href="add.jsp">➕ 新增学生</a>
    <table>
        <tr>
            <th>编号ID</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>专业</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="stu">
            <tr>
                <td>${stu.id}</td>
                <td>${stu.name}</td>
                <td>${stu.age}</td>
                <td>${stu.major}</td>
                <td>
                    <a href="edit?id=${stu.id}">编辑</a>
                    <a href="delete?id=${stu.id}" onclick="return confirm('确定删除该学生？')">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
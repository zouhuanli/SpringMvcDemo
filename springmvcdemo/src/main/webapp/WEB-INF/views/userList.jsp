<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>User List</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

</head>
<body>
<div class="container">
    <c:if test="${!empty userList}">
        <table class="table table-bordered table-striped">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>phone</th>
            </tr>
            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>${user.uid}</td>
                    <td>${user.uname}</td>
                    <td>${user.phone}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>
</body>
</html>

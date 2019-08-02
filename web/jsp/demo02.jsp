<%--
  Created by IntelliJ IDEA.
  User: 梁思禹
  Date: 2019/8/2
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Action的访问</title>
</head>
<body>
<a href="${pageContext.request.contextPath}\userFind.action">查询</a>
<a href="${pageContext.request.contextPath}\userDelete.action">删除</a>
<a href="${pageContext.request.contextPath}\userUpdate.action">修改</a>
<a href="${pageContext.request.contextPath}\userSave.action">保存</a>
</body>
</html>

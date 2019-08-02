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
<h3>通过method方法</h3>
<a href="${pageContext.request.contextPath}\userFind.action">查找</a>
<a href="${pageContext.request.contextPath}\userDelete.action">删除</a>
<a href="${pageContext.request.contextPath}\userUpdate.action">修改</a>
<a href="${pageContext.request.contextPath}\userSave.action">保存</a>
<h3>通过通配符，find和update有BUG</h3>
<a href="${pageContext.request.contextPath}\user_find.action">查询</a>
<a href="${pageContext.request.contextPath}\user_delete.action">删除</a>
<a href="${pageContext.request.contextPath}\user_update.action">修改</a>
<a href="${pageContext.request.contextPath}\user_save.action">保存</a>
<h3>通过动态方法访问，find和update有BUG</h3>
<a href="${pageContext.request.contextPath}\user!find.action">查找</a>
<a href="${pageContext.request.contextPath}\user!delete.action">删除</a>
<a href="${pageContext.request.contextPath}\user!update.action">修改</a>
<a href="${pageContext.request.contextPath}\user!save.action">保存</a>
</body>
</html>

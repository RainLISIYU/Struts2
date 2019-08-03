<%--
  Created by IntelliJ IDEA.
  User: 梁思禹
  Date: 2019/8/3
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Struts2访问Servlet的API</title>
</head>
<body>
<h2>方式一：完全解耦合的方式</h2><br/>
<form action="/request1.action" method="post">
    姓名：<input type="text" name="name"/>
    密码：<input type="password" name="password"/>
    <input type="submit" value="登陆"/>
</form>
<h2>方式二：原生的方式</h2><br/>
<form action="/request2.action" method="post">
    姓名：<input type="text" name="name"/>
    密码：<input type="password" name="password"/>
    <input type="submit" value="登陆"/>
</form>
<h2>方式三：接口注入的方式</h2><br/>
<form action="/request3.action" method="post">
    姓名：<input type="text" name="name"/>
    密码：<input type="password" name="password"/>
    <input type="submit" value="登陆"/>
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 梁思禹
  Date: 2019/8/3
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Struts2的数据封装</title>
</head>
<body>
<h3>方式一：属性驱动-提供set方法</h3>
<s:fielderror/>
<form action="/userAction1.action" method="post">
    名字：<input type="text" name="name"/><br/>
    密码：<input type="password" name="password"/><br/>
    年龄：<input type="text" name="age"/><br/>
    生日：<input type="date" name="birthday"/><br/>
    薪水：<input type="text" name="salary"/><br/>
    <input type="submit" value="提交"/><br/>
</form>
<h3>方式二：在页面中提供表达式</h3>
<form action="/userAction2.action" method="post">
    名字：<input type="text" name="user.name"/><br/>
    密码：<input type="password" name="user.password"/><br/>
    年龄：<input type="text" name="user.age"/><br/>
    生日：<input type="date" name="user.birthday"/><br/>
    薪水：<input type="text" name="user.salary"/><br/>
    <input type="submit" value="提交"/><br/>
</form>
<h3>方式三：采用模型驱动方式</h3>
<form action="/userAction3.action" method="post">
    名字：<input type="text" name="name"/><br/>
    密码：<input type="password" name="password"/><br/>
    年龄：<input type="text" name="age"/><br/>
    生日：<input type="date" name="birthday"/><br/>
    薪水：<input type="text" name="salary"/><br/>
    <input type="submit" value="提交"/><br/>
</form>
</body>
</html>

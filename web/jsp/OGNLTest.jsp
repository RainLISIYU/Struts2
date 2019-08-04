<%--
  Created by IntelliJ IDEA.
  User: 梁思禹
  Date: 2019/8/4
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>测试OGNL</title>
</head>
<body>
<h3>调用方法</h3>
<s:property value="'sdfdsf'.length()"/>
<h3>调用静态方法，需要设置常量开启静态方法</h3>
<s:property value="@java.lang.Math@random()"/>
</body>
</html>

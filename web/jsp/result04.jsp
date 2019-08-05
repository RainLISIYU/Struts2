<%--
  Created by IntelliJ IDEA.
  User: 梁思禹
  Date: 2019/8/4
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:debug>
    12
</s:debug>
<%--获取值栈中push的数据--%>
<s:property value="name"/>
<s:property value="user.name"/>
<%--获取值栈中set的list对象--%>
<s:property value="list[0].name"/>
<s:property value="list[1].name"/>
<%--获取Context中的对象--%>
<s:property value="#request.name"/>
<s:property value="#session.name"/>
<s:property value="#application.name"/>
<%--EL也可以获取值栈中的数据--%>
<s:property value="name"/>
</body>
</html>

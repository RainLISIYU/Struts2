<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 梁思禹
  Date: 2019/8/5
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>#号的用法</h3>
<%
    request.setAttribute("name", "张三");
%>
<s:property value="#requset.name"/>
<h3>构建list集合</h3>
<s:iterator var="i" value="{'aa','bb','cc'}">
    <s:property value="i"/>--<s:property value="#i"/>
</s:iterator>
<h3>构建MAP集合</h3>
<s:iterator var="entry" value="#{'bb':'dsf'}">
    <%--可以获得数据--%>
    <s:property value="key"/>--<s:property value="value"/>
    <%--获取不到数据，？？？--%>
    <s:property value="entry.key"/>--<s:property value="entry.value"/>
</s:iterator>
<br/>
<s:radio list="#{'1':'男', '2':'女'}" name="sex2" label="性别"/>
<h3>%号的用法，强制解析为OGNL</h3>
姓名：<s:textfield name="name" value="%{#request.name}"/>
</body>
</html>

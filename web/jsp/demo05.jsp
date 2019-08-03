<%--
  Created by IntelliJ IDEA.
  User: 梁思禹
  Date: 2019/8/3
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Struts2的复杂类型数据的封装</title>
</head>
<body>
<h3>封装List集合中</h3>
<%--
    s:form 不会产生中文乱码
    form   会产生中文乱码
--%>
<s:form action="/productAction1.action" methond="post">
    名称：<input type="text" name="products[0].name"/><br/>
    价格：<input type="text" name="products[0].price"/><br/>
    名称：<input type="text" name="products[1].name"/><br/>
    价格：<input type="text" name="products[1].price"/><br/>
    名称：<input type="text" name="products[2].name"/><br/>
    价格：<input type="text" name="products[2].price"/><br/>
    <input type="submit" value="提交"/>
</s:form>
<h3>封装集合中</h3>
<s:form action="/productAction2.action" methond="post">
    名称：<input type="text" name="map['one'].name"/><br/>
    价格：<input type="text" name="map['one'].price"/><br/>
    名称：<input type="text" name="map['two'].name"/><br/>
    价格：<input type="text" name="map['two'].price"/><br/>
    名称：<input type="text" name="map['three'].name"/><br/>
    价格：<input type="text" name="map['three'].price"/><br/>
    <input type="submit" value="提交"/>
</s:form>
</body>
</html>

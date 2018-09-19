<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/19 0019
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>struts2 datatag</title>
</head>
<body>
<s:bean name="cap.bean.User" id="u">
    <s:param name="id" value="20"/>
    <s:param name="username" value="'cap'"/>
    <s:param name="password" value="'cap'"/>
</s:bean>
    <!--使用push标签将Stack Context中的u实例放入ValueStack栈顶 -->
<s:push value="#u">
    <s:property value="id"/> <br/>
    <s:property value="username"/> <br/>
    <s:property value="password"/> <br/>
</s:push>
</body>
</html>

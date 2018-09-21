<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/21 0021
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:url value="index.jsp" var="url">
    <s:param name="username">zch</s:param>
</s:url>
<s:a href="%{url}">s:url和s:a的用法</s:a>
</body>
</html>

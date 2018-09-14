<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/14 0014
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p style="color:red">访问ValueStack中的对象属性</p>
<s:property value="user.username"/>
<p style="color:#ff444b">applicationz中的值</p>
<s:property value="#application.msg"/>
<p style="color:#ff3126">会话属性中的帐号：</p>
<s:property value="#session.msg"/>
<p style="color:#ff0a33">request中的值</p>
<s:property value="#request.msg"/>
<p style="color:#76ffb0">访问参数</p>
<s:property value="#parameters.msg"/>
<p style="color:#79b8ff">attr中的信息</p>
<s:property value="#attr.msg" />
</body>
</html>

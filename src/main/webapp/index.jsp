<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<body>

<form action="${pageContext.request.contextPath}/login" method="post">
    用户名:<input type="text" name="uname"><br/>
    密&nbsp;&nbsp;码:<input type="password" name="upwd">
    <input type="submit" value="登陆">
</form>
</body>
</html>

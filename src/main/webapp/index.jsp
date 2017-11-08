<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="register.action" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    确认密码:<input type="password" name="repeatPassword"><br>
    姓名:<input type="text" name="name"><br>
    <input type="submit" value="注册">
    <input type="reset" value="重置">
    <s:fielderror/>
</form>
</body>
</html>

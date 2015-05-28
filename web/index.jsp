<%--
  Created by IntelliJ IDEA.
  User: shxz130
  Date: 2015/5/28
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>checkedCode</title>
  </head>
  <body>
    <form action="/loginService" method="post">
        <input type="text" name="checkCode">
        <img src="/CheckCode.jpg"><a href="index.jsp">看不清，换一张</a>
        <input type="submit" value="提交">
    </form>

  </body>
</html>

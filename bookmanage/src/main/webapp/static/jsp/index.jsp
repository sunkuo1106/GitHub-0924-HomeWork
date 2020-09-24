<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/9/24
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>图书管理系统</title>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<center>
    <form action="/login" method="post">
    <table border="1" style="width: 300px;height: 100px;">
        <tr>
            <td colspan="2" style="font-weight: bolder;font-size: 24px;">登录图书管理系统</td>
        </tr>
        <tr>
            <td style="background-color: #DDA0DC;font-weight: bolder;">用户名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td style="background-color: #DDA0DC;font-weight: bolder;">密码:</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <input type="submit" value="登录">
            </td>
        </tr>
        <c:if test="${flag==false}">
            <tr>
                <td colspan="2">
                    <span style="color: red">用户名或者密码错误!</span>
                </td>
            </tr>
        </c:if>
    </table>
    </form>
</center>
</body>
</html>

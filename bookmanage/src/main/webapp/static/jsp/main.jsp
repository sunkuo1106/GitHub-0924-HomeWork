<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/9/24
  Time: 19:57
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
    <c:if test="${user.usertype==0}">
        <h2>普通用户欢迎您!</h2>
    </c:if>
    <c:if test="${user.usertype==1}">
        <h2>图书系统管理员欢迎您!</h2>
    </c:if>
    <table border="1" style="width: 800px;height: 300px;">
        <tr align="center">
            <td colspan="8" style="height:80px;font-size: 30px;font-weight: bolder;background-color: #FFFECB">图书详细信息列表</td>
        </tr>
        <tr align="center">
            <td>书名</td>
            <td>作者</td>
            <td>出版社</td>
            <td>出版日期</td>
            <td>页数</td>
            <td>价格</td>
            <td>内容摘要</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${PageInfo.list}" var="item">
            <tr class="bian">
                <td>${item.name}</td>
                <td>${item.author}</td>
                <td>${item.publish}</td>
                <td><fmt:formatDate pattern="yyyy-MM-dd" value="${item.publishdate}" type="both"/></td>
                <td>${item.page}</td>
                <td>${item.price}</td>
                <td>${item.content}</td>
                <td align="center">
                    <a href="/updateBook?id=${item.id}">修改</a>&nbsp;&nbsp;
                    <a href="javascript:void(0)" onclick="del(${item.id})">删除</a>
                </td>
            </tr>
        </c:forEach>
        <tr>
           <td colspan="8" align="center">
               <input type="button" value="新增图书" onclick="addBook()">
               <a href="GetAllServlet?pageNum=${PageInfo.firstPage}">首页</a>
               <c:if test="${PageInfo.hasPreviousPage}">
                   <a href="GetAllServlet?pageNum=${PageInfo.prePage}">上一页</a>
               </c:if>
               <c:if test="${PageInfo.hasNextPage}">
                   <a href="GetAllServlet?pageNum=${PageInfo.nextPage}">下一页</a>
               </c:if>
               <a href="GetAllServlet?pageNum=${PageInfo.lastPage}">末页</a>
               <span>第${PageInfo.pageNum}页/共${PageInfo.pages}页</span>
           </td>
        </tr>
    </table>
</center>
<script type="text/javascript">
    $(".bian:even").css("background-color","#DDA0DC");
    function del(id) {
        if(confirm("是否要删除该条数据")){
            location.href="/delBook?id="+id;
        }
    }
    function addBook() {
        location.href="/static/jsp/add.jsp";
    }
</script>
</body>
</html>

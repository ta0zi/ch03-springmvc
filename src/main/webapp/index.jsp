<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">


</head>
<body>
<div align="center">
<img class="logo" src="images\logo.png" />
<table>

    <tr>
        <td><a href="addStudent.jsp">注册学生</a></td>
    </tr>
    <tr>
        <td><a href="listStudent.jsp">浏览学生</a></td>
    </tr>
</table>
</div>
</body>
</html>



<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: test
  Date: 17/08/2023
  Time: 2:57 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="albuml" action="/hienthi" >
<form:input path="albumName"></form:input>
<form:input path="singe"></form:input>
<form:input path="song"></form:input>
<form:checkboxes path="category" items="${category}"></form:checkboxes>
    <form:input type="file" path="videoAlbum"/>
    <div>
        <input type="submit" value="upload">
    </div>
</form:form>
</body>
</html>

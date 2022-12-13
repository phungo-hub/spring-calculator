<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Calculator</h1>
<form action="calculate" method="get">
    <input type="text" name="value1">
    <input type="text" name="value2">
    <input type="submit" name="operator" value="+">
    <input type="submit" name="operator" value="-">
    <input type="submit" name="operator" value="x">
    <input type="submit" name="operator" value="/">
</form>
<c:if test="${requestScope.result != null}">
    <h3>${result}</h3>
</c:if>
</body>
</html>
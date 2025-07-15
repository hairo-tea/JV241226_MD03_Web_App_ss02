<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty error}">
    <h1>Error: ${error}</h1>
</c:if>
<c:if test="${not empty result}">
<h1> ${number1} ${operator} ${number2} = ${result}</h1>
</c:if>
<a href="/">Quay lại </a>
</body>
</html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Máy tính đơn giản</h1>
<form action="/calculate" method="post">
    <label>Số thứ nhất</label><br>
    <input type="number" name="number1" required><br>
    <label>Phép tính</label><br>
    <select name ="operator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select><br>
    <label>Số thứ hai</label><br>
    <input type="number" name="number2" required><br>
    <button type="submit">Tính toán</button>
</form>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Thêm sản phẩm mới</h2>
<form method="post" action="${pageContext.request.contextPath}/ex4/add">
    <label>Tên sản phẩm </label><br>
    <input type="text" name="name" required><br>
    <lable> Mô tả sản phẩm</lable>
    <br>
    <input type="text" name="description" required><br>
    <label> Giá sản phẩm </label>
    <br>
    <input type="number" step="0.01" name="price" required><br>
    <label> Đường dẫn Ảnh (URL) </label>
    <br>
    <input type="text" name="image" required><br>
    <button type="submit">Thêm sản phẩm</button>
</form>
</body>
</html>

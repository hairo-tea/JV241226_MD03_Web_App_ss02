<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sách sản phẩm</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styleForEx4.css">
</head>
<body>
<div class="container">
    <a href="${pageContext.request.contextPath}/ex4/add">
        <button class="add-product-btn">Thêm mới sản phẩm </button>
    </a>

    <h1>Danh sách sản phẩm</h1>

    <table class="product-table">
        <thead>
        <tr>
            <th>STT</th>
            <th>NAME</th>
            <th>DESC</th>
            <th>PRICE</th>
            <th>IMAGE</th>
            <th>ACTIONS</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items="${products}" varStatus="status">
        <tr>
            <td class="stt">${status.index+1}</td>
            <td class="product-name">${product.name}</td>
            <td class="product-desc">${product.description}</td>
            <td class="price">${product.price}</td>
            <td>
                <img class="product-image" src="${product.image}" alt="${product.name}">
            </td>
            <td class="actions">
                <a href="/ex4/delete/${product.id}" class="delete-btn" onclick="return confirm('Bạn có chắc muốn xóa sản phẩm này không?')">🗑️</a>
            </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

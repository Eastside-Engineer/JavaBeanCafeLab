<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Bean Cafe</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>

<legend align="right">Product List</legend>
<table style="width: 100%">
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Quantity</th>
			<th>Price</th>
		</tr>
		<c:forEach var="product" items="${ items }">
			<tr>
				<td align= "center">${ product.name }</td>
				<td align="center">${ product.description }</td>
				<td align="center">${ product.quantity }</td>
				<td align="center">${ product.price }</td>
			</tr>
		</c:forEach>
	

	<form action="/list">
		<p>
			<button>Add</button>
		</p>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Bean Cafe</title>
</head>
<body>
<table style="width: 100%">
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Quantity</th>
			<th>Price</th>
		</tr>
		<c:forEach var="products" items="${ items }">
			<tr>
				<td align= "center">${ products.name }</td>
				<td align="center">${ products.description }</td>
				<td align="center">${ products.quantity }</td>
				<td align="center">${ products.price }</td>
			</tr>
		</c:forEach>
	</table>

	<form action="/javaBean-register">
		<p>
			<button>Register</button>
		</p>
	</form>
</body>
</html>
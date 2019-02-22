<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="/style.css" />
<meta charset="UTF-8">
<title>Java Bean Cafe</title>

</head>
<body>
<p>Hello, ${ customer.firstName }</p>
<p>You like your java beans with a ${ customer.javaTaste } roast! </p>
<p>Helping the environment? ${ customer.cup }</p>

<table style="width: 100%">
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Quantity</th>
			<th>Price</th>
		</tr>
		<c:forEach var="anything" items="${ items }">
			<tr>
				<td align= "center">${ anything.name }</td>
				<td align="center">${ anything.description }</td>
				<td align="center">${ anything.quantity }</td>
				<td align="center">${ anything.price }</td>
			</tr>
		</c:forEach>
	</table>

	<form action="/javaBean-addItems">
		<p>
			<button>Add</button>
		</p>
	</form>
</body>
</html>
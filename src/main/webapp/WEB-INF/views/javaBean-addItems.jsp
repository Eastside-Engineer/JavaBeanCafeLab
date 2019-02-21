<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Bean Cafe</title>
</head>
<body>

		<fieldset>
			<legend align="right">Product List</legend>
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
				<p>
				<input type="radio" name="javaTaste" value="Light" value="Medium" value="Hard">Light<br> 
				<input type="radio" name="javaTaste" value="Medium" value="Hard"> Medium<br>
				<input type="radio" name="javaTaste" value="Hard"> Hard <br>
			</p>
			Did you bring your own cup?
			<p>
			 <input type="radio" name="cup" value="HellYeah">
				HellYEAH<br> <input type="radio" name="cup"
					value="SorryNotSorry"> SorryNotSorry<br>
			</p>
		</fieldset>

	<form action="/javaBean-list-items">
		<p>
			<button>Add</button>
		</p>
	</form>
</body>
</html>
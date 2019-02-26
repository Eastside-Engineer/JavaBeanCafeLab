<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Bean Cafe</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
<div class="container">
<legend align="right">Product List</legend>
<table class="table table striped">
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
				</table>
		
	 <form method="post">
            <input type="hidden" name="id" value="${ item.id }" />
            <div class="form-group">
                <label for="name">Item</label>
                <input class="form-control" id="name" name="name" value="${ item.name }" required min="2" autocomplete="off">
            </div>
            <div class="form-group">
                <label for="description">Price</label>
                <input class="form-control" id="price" name="price" value="${ item.price }" required min="3">
            </div>
            <div class="form-group">
                <label for="category">Category</label>
                <input class="form-control" id="category" name="category" value="${ item.category }" required>
            </div>
            <div class="form-group">
                <label for="description">Description</label>
                <input class="form-control" id="description" name="description" value="${ item.description }" required min="3">
            </div>
            <button type="submit" class="btn btn-dark">Submit</button>
            <a href="/admin/menu" class="btn btn-outline-dark">Cancel</a>
        </form>

	<form action="/">
		<p>
			<button>Add</button>
		</p>
	</form>
	</div>
</body>
</html>
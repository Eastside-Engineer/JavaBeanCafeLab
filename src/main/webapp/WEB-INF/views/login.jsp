<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Beans Cafe</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
<link rel="stylesheet" href="/style.css"/>
</head>
<body>
<div class="container">
<h1> Welcome! </h1>
<h3> Please login </h3>

<form action= "/products" method="post">
	<p>
			<label for="username">Username:</label> <input type="text"
				id="username" name="username" />
		</p>
		<p>
			<label for="password">Password:</label> <input type="password"
				name="password" id="password" />
		</p>
		

<button>Login</button>
</form>


</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Beans Cafe</title>
 <link rel="stylesheet" href="/style.css" />
</head>
<body>

<h1> Welcome! </h1>
<h3> Please login </h3>

<form action= "/itemsAdd" method="post">
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



</body>
</html>
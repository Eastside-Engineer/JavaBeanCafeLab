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
<h1>Login</h1>
	
	<form action="/Login" method="post">
		<p>
			<label for="email">Email:</label> <input id="email" name="email" value="${ param.email }" required minlength="2" />
		</p>		<p>
			<label for="password">Password:</label> <input id="password" type="password" name="password" required minlength="2" />
		</p>
		<p>
			<button>Submit</button>
		</p>
	</form>
	
	<!-- or
	
	<p>
		<a href="https://github.com/login/oauth/authorize?client_id=383160a51b5489293747">Sign in with GitHub</a>
	</p>
	 -->
	<p>
		Don't have an account yet? <a href="/signup">Sign up here</a>.
	</p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<!-- Custom CSS goes below Bootstrap CSS -->
<title>Java Bean Cafe</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
<link rel="stylesheet" href="/style.css" />
</head>

<body>
<div class="container">
	<h1>Please fill the Form to register!</h1>

	<form action="/confirmed" method="post">
		<p>
			<label for="firstName">First Name:</label> <input type="text"
				id="firstName" name="firstName" />
		</p>
		<p>
			<label for="lastName">Last Name:</label> <input type="text"
				name="lastName" id="lastname" />
		</p>
		<p> 
			<label for="email">Email:</label> <input type="email" name="email"
				id="email" />
		</p>

		<p>
			<label for="password">Password:</label> <input type="password"
				name="password" id="password"/>
		</p>
		
		<p>
			<label for="phoneNumber">Phone Number:</label> <input type="number"
				name="phoneNumber" id="phoneNumber" />
		</p>
		
		<fieldset>
			<legend align="left">This is how you like it!</legend>
			Java Roast
			<p>
				<input type="radio" name="javaTaste" value="Light" value="Medium"value="Dark"> Light<br>
				<input type="radio" name="javaTaste" value="Medium" value="Dark"> Medium<br>
				<input type="radio" name="javaTaste" value="Dark"> Dark<br>
			</p>
			Did you bring your own cup?
			<p>
			 <input type="radio" name="cup" value="HellYeah"> HellYEAH<br>
			 <input type="radio" name="cup" value="SorryNotSorry"> SorryNotSorry<br>
			</p>
		</fieldset>


		<p>
			<button>Submit</button>
		</p>
	</form>
	</div>
</body>
</html>
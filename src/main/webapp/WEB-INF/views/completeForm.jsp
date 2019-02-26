<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<!-- Custom CSS goes below Bootstrap CSS -->
<meta charset="UTF-8">
<title>Java Bean Cafe</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
<div class="container">
<p>Hello, ${ customer.firstName }</p>
<p>You like your java beans with a ${ customer.javaTaste } roast! </p>
<p>Helping the environment? ${ customer.cup }</p>

<a href="/">Home</a>
	</div>
</body>
</html>
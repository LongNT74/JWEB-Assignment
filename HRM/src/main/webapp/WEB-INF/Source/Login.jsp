<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	<script src="https://kit.fontawesome.com/db62dd06f6.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="components/style.css">
<title>Login</title>
</head>
<body>
	<div class="main position-absolute top-50 start-50 translate-middle" style="border-radius: 3%;">
		<form method="POST" action="login">
			<div class="title">
				<h2 style="margin: 10px 0 20px 25%;">Member Login</h2>
			</div>
			<div class="form">
				<c:if test="${message != null}">
					<h3 class="error-text" style="color: red;">
						<c:out value="${message}" />
					</h3>
				</c:if>
				<div class="input-group flex-nowrap" style="padding-bottom: 20px">
					<span class="input-group-text" id="addon-wrapping"><i class="fa-solid fa-user"></i></span>
					<input type="text" class="form-control" placeholder="Username" aria-label="Username" name="username" maxlength="50" aria-describedby="addon-wrapping">
				</div>
				<div class="input-group flex-nowrap " style="padding-bottom: 20px">
					<span class="input-group-text" id="addon-wrapping"><i class="fa-solid fa-lock"></i></span>
					<input type="password" class="form-control" placeholder="Password" aria-label="Username" name="pass" maxlength="50" aria-describedby="addon-wrapping">
				</div>
				<button type="submit" class="btn btn-primary" id="button">Login</button>
				<a href="#" style="margin: 10px 0 20px 35%;">Forgot password?</a>
			</div>
		</form>
	</div>
	<script src="components/script.js" type="text/javascript"></script>
</body>
</html>
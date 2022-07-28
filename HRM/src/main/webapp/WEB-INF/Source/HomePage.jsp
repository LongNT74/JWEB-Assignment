<!DOCTYPE html>
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
<link rel="stylesheet" href="components/HomePageStyle.css">
<title>Document</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<nav class="bg-light col-12">
				<div class="menu">
					<span class="navbar-brand"><i
						class="fa-solid fa-people-group"></i> Employee</span>
					<div class="info">
						<a href="">Welcome, ${sessionScope.loginUser}</a> <a href="login"><i
							class="fa-solid fa-right-from-bracket me-2"></i>Logout</a>
					</div>
				</div>
			</nav>
		</div>
		<div class="row main">
			<div class="col-2 bg-light sidebar">

				<div class="row item">
					<a href="#"><i class="fa-solid fa-gauge"></i>
						DashBoard</a>
				</div>

				<button class="dropdown-btn">
					<i class="fa-solid fa-chart-column"></i> Employee manager <i
						class="fa fa-caret-down"></i>
				</button>

				<div class="dropdown-container">
					<a href="home" class="item-dropdown"><i
						class="fa-solid fa-list"></i> &nbsp Employee List</a> <a
						href="HomePage.jsp" class="item-dropdown"><i
						class="fa-solid fa-plus"></i> &nbsp Add Employee</a>

				</div>
			</div>
			<div class="col-10">
				<div class="container">
					<h1>Add Employee</h1>
					<hr class="dropdown-divider">
					<div class="card">
						<form action="add" method="POST">
							<div class="form">
								<c:if test="${alert != null}">
									<h4 style="color: blue">
										<c:out value="${alert}" />
									</h4>
								</c:if>
								<div class="form-group">
									<label><b>First Name</b></label> <input type="text"
										class="form-control" id="fname" name="fname"
										placeholder="first name" required maxlength="50">
								</div>
								<div class="form-group">
									<label><b>Last Name</b></label> <input type="text"
										class="form-control" id="lname" name="lname"
										placeholder="last name" required maxlength="50">
								</div>
								<div class="form-group">
									<label><b>Phone number</b></label> <input type="number"
										class="form-control" id="phone" name="phone"
										placeholder="phone number" required maxlength="50">
								</div>
								<div class="form-group">
									<label><b>Date of birth</b></label> <input type="date"
										class="form-control" id="date" name="date" required>

								</div>
								<div class="form-group">
									<label><b>Gender</b></label><br> <input type="radio"
										id="male" name="gender" value="1" checked> <label>Male</label>
									<input type="radio" id="female" name="gender" value="0">
									<label>Female</label>
								</div>
								<div class="form-group">
									<label><b>Account</b></label> <input type="text"
										class="form-control" id="account" name="account"
										placeholder="Account" required maxlength="50">
								</div>
								<div class="form-group">
									<label><b>Email</b></label> <input type="email"
										class="form-control" id="email" name="email"
										placeholder="Email" required maxlength="50">
								</div>
								<div class="form-group">
									<label><b>Password</b></label> <input type="password"
										class="form-control" id="password" name="password"
										placeholder="Password" required maxlength="100">
								</div>
								<div class="form-group">
									<label><b>Address</b></label>
									<textarea class="form-control" id="address" name="address"
										required></textarea>
								</div>
								<div class="form-group">
									<label><b>Status</b></label><br> <input type="checkbox"
										id="status" name="status" value="1"> <label
										for="status"><b>Active</b></label>
								</div>
								<div class="form-group">
									<label><b>Department</b></label><br> <select name="dept"
										id="cars" style="width: 100%">
										<option value="AI">AI</option>
										<option value="QA">QA</option>
										<option value="BA">BA</option>
										<option value="TA">TA</option>
									</select>
								</div>
								<div class="form-group">
									<label><b>Remark</b></label>
									<textarea class="form-control" id="remark" name="remark"
										required></textarea>
								</div>
								<div class="form-group">
									<button type="button" class="btn btn-primary"
										onclick="ValidateEditPage()">
										<i class="fa-solid fa-backward"></i> Back
									</button>
									<button type="button" class="btn btn-warning" onclick="reset()">
										<i class="fa-solid fa-arrow-rotate-right"></i> Reset
									</button>
									<button type="submit" class="btn btn-success">
										<i class="fa-solid fa-plus"></i> Add
									</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="components/script.js" type="text/javascript"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
</body>
</html>
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
						class="fa-solid fa-list"></i> &nbsp Employee List</a> <a href="add"
						class="item-dropdown"><i class="fa-solid fa-plus"></i> &nbsp
						Add Employee</a>

				</div>
			</div>
			<div class="col-10">
				<div class="container">
					<h1>Employee list</h1>
					<hr class="dropdown-divider">
					<div class="card view-content">
						<form action="home" method="post">
							<div class="card-header d-flex justify-content-end">
								<div class="input-group mb-3">
									<div class="input-group-prepend">
										<span class="input-group-text" id="basic-addon1"><i
											class="fa-solid fa-magnifying-glass"></i>.</span>
									</div>
									<input type="text" class="form-control"
										placeholder="User search" aria-label="Username"
										aria-describedby="basic-addon1" name="search">
								</div>
								<div class="input-group mb-3">
									<div class="input-group-prepend">
										<label class="input-group-text" for="inputGroupSelect01"><i class="fa-solid fa-filter"></i> Filter
											by</label>
									</div>
									<select class="custom-select" id="inputGroupSelect01"
										name="filter">
										<option value="" selected>All</option>
										<option value="fName">Name</option>
										<option value="dob">Date of birth</option>
										<option value="address">Address</option>
										<option value="phone">Phone number</option>
										<option value="deptName">Department</option>
									</select>

								</div>
								<div class="input-group mb-3">
									<button type="Submit" class="btn btn-primary">Search</button>
								</div>
							</div>
						</form>
						<div class="test"></div>
						<table class="table table-striped table-hover table-bordered">
							<thead>
								<tr>
									<th scope="col">ID</th>
									<th scope="col">Name</th>
									<th scope="col">Date of Birth</th>
									<th scope="col">Address</th>
									<th scope="col">Phone number</th>
									<th scope="col">Department</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="e" items="${listEmp}">
									<tr>
										<th scope="row">${e.empId}</th>
										<td>${e.lName} ${e.fName}</td>
										<td>${e.dob}</td>
										<td>${e.address}</td>
										<td>${e.phone}</td>
										<td>${e.deptName}</td>
										<td><a href="" data-toggle="modal"
											data-target="#modalEmployee${e.empId}"><i class="fa-solid fa-eye"></i> View</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<nav aria-label="..." class="page">
							<ul class="pagination">
								<li class="page-item disabled"><a class="page-link"
									href="#" tabindex="-1">Previous</a></li>
								<li class="page-item"><a class="page-link" href="#">1</a></li>
								<li class="page-item active"><a class="page-link" href="#">2
										<span class="sr-only">(current)</span>
								</a></li>
								<li class="page-item"><a class="page-link" href="#">3</a></li>
								<li class="page-item"><a class="page-link" href="#">Next</a>
								</li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	<!-- Modal -->
	<c:forEach var="e" items="${listEmp}">
		<div class="modal fade" id="modalEmployee${e.empId}" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalScrollableTitle" aria-hidden="true">
			<div class="modal-dialog modal-dialog-scrollable" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalScrollableTitle">Employee Detail</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<label><b>First Name:</b> ${e.fName}</label><br>
						<label><b>Last Name:</b> ${e.lName}</label><br>
						<c:if test="${e.gender == 1}">
							<label><b>Gender:</b> Male</label><br>
						</c:if>
						<c:if test="${e.gender == 0}">
							<label><b>Gender:</b> Female</label><br>
						</c:if>
						<label><b>Date of birth:</b> ${e.dob}</label><br>
						<label><b>Phone:</b> ${e.phone}</label><br>
						<label><b>Address:</b> ${e.address}</label><br>
						<label><b>Department:</b> ${e.deptName}</label><br>
						<label><b>Remark:</b> ${e.remark}</label>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>
	<!-- end modal -->
	<script src="components/jquery-3.3.1.min.js"></script>
	<script src="components/script.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>

</body>
</html>
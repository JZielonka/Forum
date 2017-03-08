<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/security/tags"prefix="security"%>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">rotten tomatoes</a>
			</div>
			<ul class="nav navbar-nav">
			
				<li><a href='<spring:url value="/index.html"/>'>Index</a></li>
				
				<security:authorize access="hasRole('ROLE_USER')">
					<li><a href='<spring:url value="/forum.html"/>'>Forum</a></li>
				</security:authorize>

				<security:authorize access="hasRole('ROLE_ADMIN')">

					<li><a href='<spring:url value="/users.html"/>'>List of
							Users</a></li>

				</security:authorize>
				<security:authorize access="isAnonymous()">

					<li><a href='<spring:url value="/register.html"/>'>Register</a></li>
					<li><a href='<spring:url value="/login.html"/>'>Login</a></li>

				</security:authorize>

				<security:authorize access="hasRole('ROLE_USER')">

					<li><a href='<spring:url value="/user-detail.html"/>'>My
							Account</a></li>
					<li><a href='<spring:url value="/logout"/>'>Logout</a></li>
					</security:authorize>
				
			
				



			

			</ul>
		</div>
	</nav>
</body>
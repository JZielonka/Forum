<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="pl">
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<tiles:insertAttribute name="header" />

<style>
.container
{
 border-radius: 25px;
 
    padding: 20px; 
   
}
.footer {

  position: absolute;
  bottom: 0;
  width: 100%;
 color: white;
  height: 60px;
  background-color: black;
  text-align:center;
}

</style>
</head>

<body>

	<div class="container">
		<tiles:insertAttribute name="body" />
	</div>





	<div class="footer">
		<tiles:insertAttribute name="footer" />
	</div>





</html>
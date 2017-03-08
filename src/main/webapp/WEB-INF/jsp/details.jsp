<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" 
	prefix="security"%>




<div class="container">

	<h2>${user.name}</h2>
	<p>Please add some informations, about yourself</p>
	<table class="table table-striped table-inverse">
		<thead class="thead-default">
			<tr>
				<th>Real name</th>
				<th>my city</th>
				<th>register Date</th>
			

			</tr>
		</thead>

		<tr>

			<td>${user.info.realName}</td>
			<td>${user.info.fromWhere}</td>
			<td>${user.registerDate}</td>
			
		</tr>
	</table>




	
</div>




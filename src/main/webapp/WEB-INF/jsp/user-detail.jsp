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
				<th>register Date</th>
				<th>My city</th>
				<th>Real name</th>
				<th>company</th>
				<th>E mail</th>
			</tr>
		</thead>

		<tr>

			<td>${user.info.realName}</td>
			<td>${user.registerDate}</td>
			<td>${user.info.fromWhere}</td>
			<td>${user.info.realName}</td>
			<td>${user.info.company}</td>
			<td>${user.info.email}</td>
		</tr>
	</table>





</div>




<!-- Trigger the modal with a button -->
<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
	data-target="#myModal">Info for Administrator</button>

<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">This text is visible only for user
					named ${user.name}, and adminnistrator of this page</h4>
			</div>
			<div class="modal-body">

				<form:form commandName="info">
				
				My real name:
					<form:input path="realName" placeholder="${user.info.realName}" />

					<br>
				
				My company:
					<form:input path="company" placeholder="${user.info.company}" />
					<br>
				My City:
					<form:input path="fromWhere" placeholder="${user.info.fromWhere}" />
					<br>
				My email:
					<form:input path="email" placeholder="${user.info.email}" />

					<br>
					<button type="submit" class="btn btn-info">Apply</button>





				</form:form>


			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>

	</div>
</div>

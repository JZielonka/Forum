<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<table class="table table-sm table-inverse">

	<tbody>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>
				<a href ='<spring:url value="/users/${user.id}.html"/>' ></a>
				${user.id}
				${user.name}
				<td><a href="users/delete/${user.id}.html">	<button type="submit" class="btn btn-danger btn-xs" >delete</button></a></td>
						
				</td>




			</tr>
		</c:forEach>
	</tbody>
</table>

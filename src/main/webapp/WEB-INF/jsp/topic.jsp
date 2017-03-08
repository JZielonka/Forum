<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<style>
.container {
	border-radius: 25px;
	padding: 20px;
}
</style>



<div class="container">
	<table class="table table-bordered">

		<tr class="bg-success">
			<th >#</th>
			<th><a href="/users/${topic.user.id}.html">${topic.user.name}</a></th>
			<th>${topic.text}</th>
			<th>${topic.topicDate}</th>
		</tr>

		<c:forEach items="${topic.reply}" var="reply">
			<tbody>
				<tr class="table-active">
					<td>${reply.id}</td>
				<th><a href="/users/${reply.user.id}.html">${reply.user.name}</a></th>
					<td>${reply.text}</td>
					<td>${reply.date}</td>
					
				</tr>
		</c:forEach>

		</tbody>
	</table>

</div>



<form:form commandName="reply" method="POST">



	<form:textarea rows="20" cols="100" path="text" />


	<input type="submit" value="Submit" />
</form:form>
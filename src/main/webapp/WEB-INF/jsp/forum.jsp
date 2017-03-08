<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<style>
.container {
	border-radius: 25px;
	padding: 20px;
}
</style>


<div class="container">
	<h2 >List of Topics</h2>
	<p>Please do not hesitate, Discuss with us :)</p>
	<table class="table table-bordered">
		<tbody>
			<tr class="bg-success">
				<th>#</th>
				<th>Topic Author</th>
				<th>Topic</th>
				<th>Topic date</th>
				<th>Replies:</th>
			</tr>
			

		</tbody>
		<c:forEach items="${topics}" var="topic">
			<tr>
				<td>${topic.id}</td>
				<td><a href="/users/${topic.user.id}.html">${topic.user.name}</a></td>
				<td><a href="/forum/${topic.id}.html">${topic.name}</a></td>
				<td>${topic.topicDate}</td>
				<td>${replies}</td>
			</tr>
		</c:forEach>
		</tbody>
		
	</table>
</div>














<br>
<a href='<spring:url value="/newTopic"/>' class="btn btn-info">New
	Topic</a>
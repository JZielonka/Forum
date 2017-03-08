<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<style>
.container
{

 border-radius: 25px;
  
    padding: 20px; 

}

.input
{
margin-top: 40px;
margin-bottom: 40px;
}

</style>


<div class="container">
  <h2>${user.name}</h2>
  <p>This is place where you can create your own topic! Wohooo! </p>

	
<form:form commandName="topic" method="POST">

	<div class= "input">
	<form:input path="name" placeholder="topic title:" />

	</div>


	<form:textarea path="text"class="form-control" rows="3" placeholder="topic text:)" />
	

	
	 <button type="submit"  class="btn btn-info">Add Topic</button>
</form:form>


</div>
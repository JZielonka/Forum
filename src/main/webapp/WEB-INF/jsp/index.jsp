<%@ taglib uri="http://www.springframework.org/security/tags" 
	prefix="security"%>
	
	
	<security:authorize access="isAnonymous()" >
	
Welcome to my page. Please register to get fully authorised.

</security:authorize>

<security:authorize access="hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')" >


<br>

Well, some statstics:
 ;)
 
 <br>
 number of users: ${users}
 
 <br>
  number of topics: ${topics}

</security:authorize>


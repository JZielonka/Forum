<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container">


<form:form commandName="user" method="POST" class="form-horizontal" >


	<c:if test="${param.registered eq true}">
   		 <div class="form-group">
          <label class="col-md-4 control-label" for="name"></label>  
          <div class="col-md-4">
          	 You have been registered. <a href="login.html" >Click</a> to log in!
    
          </div>
   	</div>
   		
   		
   		</c:if>

        <!-- Form Name -->
        <legend>Register</legend>

        <!-- Text input-->
        <div class="form-group">
          <label class="col-md-4 control-label" for="name"> Name</label>  
          <div class="col-md-4">
          <input id="name" name="name" type="text" placeholder="your name" class="form-control input-md" >
    
          </div>
        </div>

   	

       

        <!-- Password input-->
        <div class="form-group">
          <label class="col-md-4 control-label" for="password">Password </label>
          <div class="col-md-4">
            <input id="password" name="password" type="password" placeholder="Password " class="form-control input-md">
          
          </div>
          
          
          
        </div>

    
    
   

          <label class="col-md-4 control-label" for="save"></label>
         
         
            <button id="save" name="save" class="btn btn-success">Save</button>
            
            
              </form:form>
            <button id="" name="cancel" class="btn btn-danger">Cancel</button>
            
          </div>
          
    

     
      
        

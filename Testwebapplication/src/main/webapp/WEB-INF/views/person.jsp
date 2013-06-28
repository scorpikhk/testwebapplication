<!DOCTYPE html>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
    <head>
       
        <meta charset="utf-8">
        <title>Test application</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="resources/css/bootstrap.css" rel="stylesheet">
        <link href="resources/css/bootstrap-responsive.css" rel="stylesheet">
        <link href ="http://twitter.github.com/bootstrap/assets/css/bootstrap.css" rel="stylesheet"> 

    </head>
    <body>
        <div class="container">  
            <div class="row">  
                <div class="span8">  
                    <ul class="nav nav-pills">  
                        <li class="active"><a href="#">Home</a></li>     
                        <li><a href="#">Login</a></li>  
                        <li><a  href="#">My scores </a></li>   
                        <li><a  href="#">Test 3 </a></li>      
                    </ul>  
                </div>  
            </div>  





            <h3>Test application with boostrap</h3>




<!--            <button type="submit" class="btn btn-primary" >Test button</button>
            <button type="submit" class="btn btn-success" >Test button</button>
            <button type="submit" class="btn btn-danger" >Test button</button>
            <button type="submit" class="btn btn-info" >Test button</button>
            <button type="submit" class="btn btn-inverse" >Test button</button>-->

            
            <h4>Test form</h4>
            </div> 
        
        <form:form action="add" commandName="person">
            
           <table>
    <tr>
        <td><form:label path="firstname">First name</form:label></td>
        <td><form:input path="firstname" /></td>
    </tr>
    <tr>
        <td><form:label path="lastname">Last name</form:label></td>
        <td><form:input path="lastname" /></td>
    </tr>
  
    <tr>
        <td colspan="2">
            <input class="btn btn-primary" type="submit" value="Add Employee"/>
        </td>
    </tr>
</table>   
            
            
        </form:form>
        
     
                       
                       
                       
                       
   
    
    


    </body>
</html>

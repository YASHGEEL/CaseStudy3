<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
         <table width = "300px" border = "1" cellspacing="2" style="border: solid;">
            <thead>
                <tr>
                	<th>Id</th>
                    <th>Name</th>
                    <th>Location</th>
                    <th>Domain</th>
                    
                </tr>
            </thead>
            <tbody>
              
               <form:form action="update" method="post"  modelAttribute="trainee">
  					<tr>
						
						<td><label>${trainee.id}</label>
					
						<td><label>${trainee.name}</label>
					
						<td><label>${trainee.location}</label>
						
					
					
						<td><label>${trainee.domain}</label>
						
						</tr>
  						
  					</form:form>
				
            </tbody>
        </table>  
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
                    <th>Update</th>
                    
                </tr>
            </thead>
            <tbody>
               <c:forEach items="${arrayList}" var="trainee">
               <form:form action="update" method="post"  modelAttribute="trainee">
  					<tr>
						
						<td><form:input path="id" size="30" value="${trainee.id}"  /></td>
						
				
						
						<td><form:input path="name" size="30" value="${trainee.name}"/></td>
						
					
						
						<td><form:input path="location" size="30" value="${trainee.location}"  /></td>
						
					
						<td><form:input path="domain" size="30" value="${trainee.domain}"  /></td>
						
					
					<td><input type="submit" value="update" /></td>
						</tr>	
  					</form:form>
				</c:forEach>
            </tbody>
        </table>           
      
        
</body>
</html>
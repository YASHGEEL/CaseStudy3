<%@page import="com.cg.payroll.beans.Trainee"%>
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

hello ${trainee.id}
	   
<table width = "300px" border = "1" cellspacing="2" style="border: solid;">
	 			<tr>
                	<th>Id</th>
                    <th>Name</th>
                    <th>Location</th>
                    <th>Domain</th>
                    <th>Update</th>
                    
                </tr>
 
 
<form:form action="updateAssociate" method="post"  modelAttribute="trainee">
			
				<tr>
					<td><label>${trainee.id}</label>
					
				
					<td><label>${trainee.name}</label>
					
			
					<td><form:input path="domain"  type="text"  /></td>
					
				
					<td><form:input path="location"  type="text"/></td>
				
				
					<td><input type="submit" value="updateAssociate" /></td>
				</tr>
			</form:form>
			</table>
</body>
</html>
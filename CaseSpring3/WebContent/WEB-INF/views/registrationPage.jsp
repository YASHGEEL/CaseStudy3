<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Registration</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Enroll Associate Details Here</h2>
		<table width = "300px" border = "1" cellspacing="2" style="border: solid;">
		
			<form:form action="registerAssociate" method="post"  modelAttribute="trainee">
			
				<tr>
					<td>Name:</td>
					<td><form:input path="name" size="30" /></td>
					<td><form:errors path="name" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Domain:</td>
					<td><form:input path="domain" size="30" /></td>
					<td><form:errors path="domain" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Location:</td>
					<td><form:input path="location" size="30" /></td>
					<td><form:errors path="location" cssClass="error" /></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</form:form>
		</table>
	</div>
</body>
</html>
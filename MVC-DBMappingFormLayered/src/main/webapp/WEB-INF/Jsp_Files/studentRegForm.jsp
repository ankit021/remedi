<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student registration form..!</title>
</head>
<body>
	
	<form:form action="displayForm.ds" method="POST" modelAttribute="student">
		
		${msg}
		
		<table border="2" height="300" width="500" >
			<tr>
				<td>Student id:</td>
				<td><form:input path="sId" /></td>
			</tr>

			<tr>
				<td>Student Name:</td>
				<td><form:input path="sName" /></td>
			</tr>

			<tr>
				<td>Student email:</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td> Gender:</td>
				<td><form:radiobuttons path="gender" items="${gender}" />
			</tr>

			<tr>
				<td>Qualifications details:</td>
				<td><form:select path="qualification" items="${qualification}"  /></td>
			</tr>
			
			<tr>
				<td>Courses details:</td>
				<td><form:select path="courses" items="${courses}" multiple="true" /></td>
			</tr>
			
			<tr>
				<td>Timings details:</td>
				<td><form:checkboxes path="timings" items="${timings}" />
			</tr>
			
		</table>


			<input type="submit" value="Register" />

			<input type="reset" value="Reset"><br>
			
				${review}


	</form:form>
</body>
</html>
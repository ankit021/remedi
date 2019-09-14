<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Search</title>
</head>
<body>
	<form action="displaybook.ds" method="post" >

		bookCode: <input type="text" name="bid"> 
		<input type="submit" value="search">
			
			<%-- ${book} --%>
	
		<table border="1" >
			<tr>
				<th>bId</th>
				<th>bName</th>
				<th>bAuthor</th>
				<th>bPrice</th>
				<th>bQty</th>
			</tr>	
				<c:forEach var="b" items="${books}">
					<tr>
						<td>${b.BId}</td>
						<td>${b.BName}</td>
						<td>${b.BAuthor}</td>
						<td>${b.BPrice}</td>
						<td>${b.BQty}</td>
					</tr>
				</c:forEach>
		</table>
	</form>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Book List</h3>
	<table border=1>
		<c:forEach var="b" items="${requestScope.book_list}">

			<tr>
				<td>${b.name}</td>
				<td>${b.author}</td>
				<td>${b.price}</td>
				<td>${b.category}</td>
				<td>${b.quantity}</td>
				
				<td><a href="<spring:url value='/book/update?bid=${b.id}'/>">Update</a></td>
				<td><a href="<spring:url value='/book/delete?bid=${b.id}'/>">Delete</a></td>

			</tr>
		</c:forEach>
	</table>
	

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <sf:form method="post" modelAttribute="book">
        <table style="background-color: cyan; margin: auto;">
           	<tr>
				<td>Your Assigned Ref ID (R)</td>
				<td><sf:input  path="id" readonly="true"/></td>
			</tr>
			<tr>
				<td>Enter User Name</td>
				<td><sf:input  path="name" /></td>
			</tr>
			<tr>
				<td>Enter Author</td>
				<td><sf:input  path="author" /></td>
			</tr>
			<tr>
				<td>Enter Price</td>
				<td><sf:input  path="price" /></td>
			</tr>
			<tr>
				<td>Enter Category</td>
				<td><sf:input  path="category" /></td>
			</tr>
			<tr>
				<td>Enter Quantity</td>
				<td><sf:input  path="quantity" /></td>
			</tr>


    </sf:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/spring-web-security/authenticateUser" method="POST">
	<p>
	User Name : <input type="text" name="username"/>
	</p>
	
	<p>
	Password  : <input type="text" name="password"/>
	</p>
	<p>
	<input type="submit" value="Login"/>
	</p>

</form:form>
</body>
</html>
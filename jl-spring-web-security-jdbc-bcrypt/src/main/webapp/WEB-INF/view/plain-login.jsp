<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/authenticateUser" method="POST">
	<c:if test="${param.error != null}">
		<i> Sorry! wrong credentials!!</i>
	</c:if>
	<c:if test="${param.logout != null}">
		<i> You have been logged out!!</i>
	</c:if>

	<p>
	User Name : <input type="text" name="username"/>
	</p>
	
	<p>
	Password  : <input type="text" name="password"/>
	</p>
	<p>
	<input type="submit" value="Login"/>
	</p>
	
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

</form>
</body>
</html>
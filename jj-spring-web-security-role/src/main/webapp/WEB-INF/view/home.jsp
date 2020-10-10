<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
	<p>
    	<b>Good Job</b>
    </p>
	<p>
		User: <security:authentication property="principal.username"/>
    	<br><br>
    	Role: <security:authentication property="principal.authorities"/>
    </p>
    
    <p>
    	<a href="/spring-web-security-role/leaders">Leadership Meeting</a>
    	(Only for Managers)
    </p>
    
    <form:form action="/spring-web-security-role/logout" method="POST">
    	<input type="submit" value="Logout">
    </form:form>
</body>
</html>
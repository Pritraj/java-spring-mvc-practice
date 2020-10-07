<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
	<p>
    <b>Good Job Pritam</b>
    </p>
    
    <form:form action="/spring-web-security-csrf/logout" method="POST">
    	<input type="submit" value="Logout">
    </form:form>
</body>
</html>
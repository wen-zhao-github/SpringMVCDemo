<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
The student is confirmed:<br/>
Name: ${student.firstName} ${student.lastName} <br/>
Country: ${student.country}<br/>
Favorite Language${student.favoriteLanguage }<br/>
Operating Systems:
	<ul>
		<c:forEach var="tempOS" items="${student.operatingSystems}">
			<li>tempOS</li>
		</c:forEach>
	</ul>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
        First Name: <form:input path="firstName" />
		<br /><br />
        Last Name:<form:input path="lastName" />
		<br /><br />
		<form:select path = "country">
		 	<form:options items = "${student.countryOptions}"/>	
		</form:select>
		<br /><br />
		Favorite Language: 
		 <form:radiobuttons path="favoriteLanguage"  items = "${student.favoriteLanguageOptions}"/> 
		 <br /><br />
		Operating System:
		Windows <form:checkbox path = "operatingSystems" value = "Windows"/>
		Linux <form:checkbox path = "operatingSystems" value = "Linux"/>
		IOS <form:checkbox path = "operatingSystems" value = "IOS"/>
		<br /><br />
		<input type="submit" value = "Submit"/>
	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration Form</title>
<style>
.error{color:red}
</style>
</head>
<body>
    Please fill up following form, * are required.<br /><br />
	<form:form action="processForm" modelAttribute="customer">
        First Name : <form:input path="firstName" />
		<br /><br />
        Last Name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass = "error"/>
		<br /><br />
		Free Pass:<form:input path = "freePasses"/>
		<form:errors path = "freePasses" cssClass = "error"/>
		<br /><br />
		Postal Code: <form:input path = "postalCode"/>
		<form:errors path = "postalCode" cssClass = "error"/>
		<br /><br />
		Course Code: <form:input path = "courseCode"/>
		<form:errors path = "courseCode" cssClass = "error"/><br /><br />
		<input type="submit" value="Submit" /><br /><br />
		

	</form:form>

</body>
</html>
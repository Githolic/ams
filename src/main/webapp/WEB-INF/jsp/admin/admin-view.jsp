<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Home</title>
</head>
<body>
<h2>Welcome back, <em>${authenticatedUser.firstname} ${authenticatedUser.lastname }</em></h2>

<table border="1">
<tr><th>Department Name</th><th>Number of Programs</th><th>Operation</th></tr>
<c:forEach items="${departments}" var="department">
<tr>
  <td><a href="departmentView.html?id=${department.id}">${department.departmentname}</a></td>
  <td>${department.programs.size()}</td>
  <td><a href="departmentEdit.html?id=${department.id}">Edit</a></td>
</tr>
</c:forEach>
</table>

<p><a href="addDepartment.html">Add Department</a></p>
<p><a href="<c:url value='/logout.html' />">Logout</a></p>

</body>
</html>
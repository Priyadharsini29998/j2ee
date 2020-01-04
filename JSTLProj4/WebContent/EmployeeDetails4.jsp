<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
		<h2>Employee Details</h2>

		<table>
			<tr>
				<td>Id:</td>
				<td><c:out value="${employee.id}"></c:out></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><c:out value="${employee.name}"></c:out></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><input type="radio" name="rdoGender" id="rdoMale">
					<label for="rdoMale">Male</label> <input type="radio"
					name="rdoGender" id="rdoFemale"> <label for="rdoFemale">Female</label></td>
					
			</tr>
			<tr>
				<td>Date Of Birth:</td>
				<td><input type="text" name="dob"> <br></td>
			</tr>
			<tr>
				<td>Fulltime Employee</td>
				<td><input type="checkbox" name="chkBox" checked> <br></td>
			</tr>
			</table>
			</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
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
				<td><input type="checkbox" name="chkBox"> <br></td>
			</tr>
			<tr>
				<td>Department :</td>
				<td><select name="department">
						<option value="IT">Information Technology</option>
						<option value="CS">Computer Science</option>
						<option value="CT">Computer Technology</option>
				</select></td>
			</tr>
			<tr>
				<td>Salary :</td>
				<td><input type="text" name="txtSal"></td>
			</tr>
			<tr colspan="2">
			<td >
				<input type="submit" value="Submit">
				<td>
			</tr>

		</table>

	</form>
</body>
</html>
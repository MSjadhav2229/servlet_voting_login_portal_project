<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Register" method="post">
	
	<table>

		<tr>
			<td>UserName</td>
			<td><input type="text" name="uname"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td>Email ID</td>
			<td><input type="email" name="email"></td>
		</tr>
		<tr>
			<td>Phone</td>
			<td><input type="text" name="phone" pattern="[789][0-9]{9}"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="REGISTER"></td>
		</tr>




	</table>
	</form>
</body>
</html>
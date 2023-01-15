<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%
Class.forName("com.mysql.jdbc.Driver");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The View Of Database Table</title>
</head>
<body BGCOLOR="cyan">

	<%
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
	Statement statement = connection.createStatement();
	ResultSet resultset = statement.executeQuery("select * from userdb.candidate");
	%>
	<TABLE BORDER="1">
		<TR>
			<TH>ID</TH>
			<TH>Name</TH>
			<TH>vote</TH>

		</TR>
		<%
		while (resultset.next()) {
		%>
		<TR>
			<TD><%=resultset.getInt(1)%></td>
			<TD><%=resultset.getString(2)%></TD>
			<TD><%=resultset.getInt(3)%></TD>

		</TR>
		<%
		}
		%>
	</TABLE>
</body>
</html>
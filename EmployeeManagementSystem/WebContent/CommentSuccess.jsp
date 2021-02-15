<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CommentsSuccess</title>
<style>
h1{
text-align:center;
text-shadow: 2px 2px 2px #2ecc71;
}
.click
{
	background:#2ecc71;
	display:block;
	margin:20px auto;
	text-align:center;
	border:2px solid black;
	padding:14px 25px;
	color:white;
	border-radius:24px;
	transition:0.25s;
	cursor:pointer;
}

.click:hover
{
	background:black;
}
</style>
</head>
<body>
<h1>Submitted Succeessfully</h1>
<input class="click" type="button" value="Home" onclick="location.href='EmployeeHome.jsp'">
</body>
</html>
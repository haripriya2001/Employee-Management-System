<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DISPLAY COMMENTS</title>
<link rel="stylesheet" href="style.css">
<style>
input[type="button"]
{
        background:none;
	display:block;
	margin:20px auto;
	text-align:center;
	border:2px solid #2ecc71;
	padding:14px 25px;
	color:white;
	border-radius:24px;
	transition:0.25s;
	cursor:pointer;
}
input[type="button"]:hover
{
background:#2ecc71;
}
</style>
</head>
<body>
	<form class="form" action="DisplayAllComments" >
		<input type="button" value="Department Comments" onclick="location.href='DepartmentComments.jsp'">
		<input class="click" type="submit" value="All Comments"> 
		<input type="button" value="Home" onclick='location.href="AdminHome.jsp"'>
	</form>
</body>
</html>

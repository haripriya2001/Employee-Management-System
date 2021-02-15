<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN HOME</title>
<style>
body
{
        margin:0;
        padding:0;
	font-family:sans-serif;
	background-color:#F0FFF0;
}

div
{
	padding:100px 200px 100px 200px;
}
.link 
{
        width:300px;
	font-weight:bold;
	text-transform:uppercase;
	text-decoration:none;
	text-align:center;
	background-size:50px;
	background:black;
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
.link:hover
{
	background:#2ecc71;
}
</style>
</head>
<body>
	<div>
		<a class="link" href="AdminHome.jsp">Home</a>
		<a  class="link"href="UserDetails.jsp">Employee</a>
		<a class="link" href="DepartmentDetails.jsp">Department</a>
		<a class="link" href="RegulationDetails.jsp">Regulation</a>
		<a  class="link"href="Logout.jsp">Logout</a>
	</div>
</body>
</html>

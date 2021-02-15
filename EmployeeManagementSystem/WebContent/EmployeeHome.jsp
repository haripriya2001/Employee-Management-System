<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EMPLOYEE HOME</title>
<link rel="stylesheet" href="style.css">
<style>
.form
{
	width:300px;
	padding:40px;
	position:absolute;
	top:50%;
	left:50%;
	transform:translate(-50%,-40%);
	background:#191919;
	text-align:center;
	border-radius:24px;
}
.form h1
{
	color:white;
}

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
	<h1 style="text-align:center; color:black; text-shadow:2px 2px 4px #4CAF50;" >Welcome Back!!</h1>

	<%
		String uname=(String)session.getAttribute("userId");
		session.setAttribute("userId",uname);
	%>
	<form class="form" action="DisplayUserDetails" >
			<input class="click" type="submit" value="My Details" >
			<input type="button" value="Regulation" onclick="location.href='UserRegulation.jsp'">
			<input type="button" value="Logout" onclick="location.href='Logout.jsp'">
	</form>
</body>
</html>

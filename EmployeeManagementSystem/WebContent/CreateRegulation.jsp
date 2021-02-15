<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CREATE REGULATION</title>
<style>
body
{
        margin:0;
        padding:0;
	font-family:sans-serif;
	background:#F0FFF0;
}
.form
{
	width:500px;
	padding:40px;
	position:absolute;
	top:50%;
	left:50%;
	transform:translate(-50%,-30%);
	background:#191919;
	text-align:center;
	border-radius:24px;
}
.form h1
{
	color:white;
}

.input
{
	background:none;
	display:block;
	margin:20px auto;
	text-align:center;
	border:2px solid #3498db;
	padding:14px 10px;
	width:250px;
	color:white;
	transition:0.25s;
}
.input:focus
{
	width:280px;
	border-color:#2ecc71;
}
.click
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

.click:hover
{
	background:#2ecc71;
}
h3
{
	color:red;
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
input[type="button"]
{
	background:#2ecc71;
}
</style>
</head>
<body>
	<form class="form" action="CreateRegulation" method="post" >
		    <h1 style="text-align:center ">Create Regulation</h1>
		    <h3>Regulation Id:</h3>
		     <input class="input" type="text" name="Regulation_Id" >
		     <h3>Regulation Type:</h3>
		     <input class="input" type="text" name="Regulation_Type" >
		     <h3>Regulation Details:</h3>
		     <textarea class="input"  name="Regulation_Details" > </textarea>
		     <h3>Creation Date:</h3>
		     <input class="input" type="text" name="Creation_Date" >
		     <h3>Department Id:</h3>
		     <input class="input" type="text" name="Department_Id" >
		     <input  class="click" type="submit" value="ADD" >
	             <input type="button" value="Home" onclick='location.href="AdminHome.jsp"'>
	</form>
</body>
</html>

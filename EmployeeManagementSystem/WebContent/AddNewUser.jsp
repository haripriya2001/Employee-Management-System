<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
<link rel="stylesheet" href="style.css">

<style>
body{
        margin:0;
        padding:0;
	font-family:sans-serif;
	background-color:#F0FFF0;
}
.form
{
	width:600px;
	padding:40px;
	position:absolute;
	top:50%;
	left:50%;
	transform:translate(-50%,-30%);
	background:#191919;
	text-align:center;
	border-radius:24px;
}
.form h1{
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
	border-radius:24px;
	transition:0.25s;
}
.input:focus
{
	width:400px;
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

input[type="button"]{
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
<form class="form" action="AddUser" method="post" >
		<h1 style="text-align:center">Add New Employee Details</h1>
      		<input class="input" type="text" name="Employee_Id" placeholder="Employee_Id">
      		 <input class="input" type="text" name="First_Name" placeholder="First Name">
      		 <input class="input" type="text" name="Last_Name" placeholder="Last Name">
      		 <input class="input" type="text" name="DOB" placeholder="yyyy-mm-dd">
      		 <input class="input" type="text" name="Email_Id" placeholder="Email Id">
      		 <input class="input" type="text" name="Dept_Id" placeholder="Department_Id">
      		 <input class="input"  type="text" name="user_Id" placeholder="set Employee_Id as user_Id">
      		 <input class="input" type="password" name="password" placeholder="Set Password">
      		 <input class="input" type="text" name="Role" value="employee" readonly>
      		 <input  class="click" type="submit" value="ADD" >
		 <input type="button" value="Home" onclick='location.href="AdminHome.jsp"'>
 </form>

</body>
</html>

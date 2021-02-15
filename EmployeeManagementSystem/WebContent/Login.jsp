<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
 	<form class="form" action="login_servlet" method="post">
      	<h1>Login</h1>
      	<input class="input" type="text" name="userId" placeholder="Enter UserId" >
      	<input class="input" type="password" name="passWord" placeholder="Enter Password"  > 
      	<span style="color:red;"> ${error}</span>
      	<input class="click" type="submit" value="Login">
     </form>

</body>
</html>
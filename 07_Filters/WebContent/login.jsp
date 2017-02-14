<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
<h1>Please login:</h1>
<form action="LoginServlet" method="POST">
Login: <input type="text" name="username">
<br>
Password: <input type="text" name="password">
<br>
<input type = "submit" value = "Zaloguj!">
</form>
<a href="admin.jsp">Admin Panel</a>
</body>
</html>